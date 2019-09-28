/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso7;

import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author jonac
 */
public class ProbDesincripter {
    
    public ProbDesincripter(){        
    }
    
    public void getKey(String pText, String pKey , ArrayList<tuple> pLetras, ArrayList<tuple> pNumeros){
        fillTupleNumber(pNumeros);//llenar las tuplas con la base
        fillTupleLetter(pLetras);
        
        ArrayList<String> abcdarioTemp=new ArrayList<>(Globals.getLETRAS());
        //1.generar del 0 al 8 para las letras
        //2.generar del 0 al 25 para los numeros
        //2.1|1.1 en caso de alguna retornar un valor ponerla en 100%
        Random rand = new Random();
        int cantLeters;
        String randomLeter;
        boolean cambiarNum=true;
        //attempt las letras
        int numberIndex=0,letterIndex;
        for(String number:Globals.getNUMEROS()){
            cantLeters=rand.nextInt(24);
            cantLeters++;
            tuple numeroTemporal=pNumeros.get(numberIndex);            
            while(cantLeters>0){
                randomLeter=popLetter(abcdarioTemp);
                letterIndex=Globals.getLETRAS().indexOf(randomLeter);
                pKey= pKey.substring(0, Globals.getPOSLETRA())+randomLeter+pKey.substring(Globals.getPOSLETRA()+1);//primero la letra
                if(cambiarNum){
                    pKey= pKey.substring(0, Globals.getPOSNUM())+randomLeter+pKey.substring(Globals.getPOSNUM()+1);//segundo el numero
                    cambiarNum=false;
                }
                tuple letraTemporal=pLetras.get(letterIndex);
                Globals.plusATTEMPT();//recordar, cada una de estas es un intento
                if(Aes.decrypt(pText, pKey)==null){
                    numeroTemporal.setProbability(numeroTemporal.getProbability()-Globals.getPERCENTNUMBERGROW());//Reducir el porcentaje de que sea la respuesta en num
                    letraTemporal.setProbability(letraTemporal.getProbability()-Globals.getPERCENTLETERGROW());//lo mismo para las letras
                }else{
                    numeroTemporal.setProbability(Globals.getMAXPERCENT());
                    letraTemporal.setProbability(Globals.getMAXPERCENT());
                    break;//si ya esta en 100 no hace falta probar mas
                    //ponerlos en 100 and break;
                }
                cantLeters--;
            }
            numberIndex++;
            cambiarNum=true;
            abcdarioTemp=new ArrayList<>(Globals.getLETRAS());//copia, no referencia
        }
       /* pLetras.forEach((tupla) -> {
            tupla.print();
        });
        pNumeros.forEach((tupla) -> {
            tupla.print();
        });*/
    }
    
    public String popLetter(ArrayList<String> letras){
        Random rand = new Random();
        int randomLetter= rand.nextInt(letras.size());
        String chosenLetter= letras.get(randomLetter);
        letras.remove(randomLetter);
        return chosenLetter;
    }
    
    public void fillTupleLetter(ArrayList<tuple> pLetras){ //al inicio todas tienen la misma probabilidad
        Globals.getLETRAS().forEach((letra) -> {
            pLetras.add(new tuple(letra, Globals.getMAXPERCENT()));
        });
    }
    
    public void fillTupleNumber(ArrayList<tuple> pNumeros){//por eso las llenamos de 100, aunmentara segun sea el caso
        for(String numero:Globals.getNUMEROS()){
            pNumeros.add(new tuple(numero, Globals.getMAXPERCENT()));
        }
    }
    
    public void getTops(ArrayList<tuple> pLetras, ArrayList<tuple>  pNumbers, int pSizeNumbers, int pSizeLeters){
        int maxProb=0;
        tuple auxTuple= new tuple("0", 0);
        ArrayList<tuple> chosenLetters=new ArrayList<>();
        int maxChosen=7;
        while(maxChosen>0){
            for(int index=0;index<pLetras.size();index++)
                if(pLetras.get(index).getProbability()>maxProb){
                    auxTuple=pLetras.get(index);
                    maxProb=pLetras.get(index).getProbability();
                }
            maxProb=0;
            chosenLetters.add(new tuple(auxTuple.getValue(), auxTuple.getProbability()));
            pLetras.remove(auxTuple);
            maxChosen--;       
        }
        
        maxChosen=3;
        ArrayList<tuple> chosenNumbers=new ArrayList<>();
        while(maxChosen>0){
            for(int index=0;index<pNumbers.size();index++)
                if(pNumbers.get(index).getProbability()>maxProb){
                    auxTuple=pNumbers.get(index);
                    maxProb=pNumbers.get(index).getProbability();
                }
            maxProb=0;
            chosenNumbers.add(new tuple(auxTuple.getValue(), auxTuple.getProbability()));
            pNumbers.remove(auxTuple);
            maxChosen--;       
        }
        pLetras=chosenLetters;
        pNumbers=chosenNumbers;
    }  
    
    
    
    }

