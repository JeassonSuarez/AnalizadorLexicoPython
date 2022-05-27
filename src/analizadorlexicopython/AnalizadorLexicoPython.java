/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadorlexicopython;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author estudiantes
 */
public class AnalizadorLexicoPython {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String[]> lista = new ArrayList<String[]>();
        String[] keywords = {"False","None","True","and","as","assert","async","await","break","class","continue","def","del","elif","except","finally","for","from","global","if","import","in","is","lambda","nonlocal","not","or","pass","raise","return","try","while","with","yield"};
        String[] sEspeciales = {"[","]","(",")","{","}",",",".",":",";","#","  "};
        String[] oConcatenacion = {"+","or","and","not"};
        String[] oLogicos = {">",">=","<","<=","==","!="};
        String[] oAritmeticos = {"+","-","*","/","%","//","**"};
        String[] oBitToBit = {"|","^","&","<<",">>","~"};
        String[] oAsignacion = {"=","+=","-=","*=","/=","%=","//=","**=","|=","^=","&=","<<=",">>="};
        lista.add(keywords);
        lista.add(sEspeciales);
        lista.add(oConcatenacion);
        lista.add(oLogicos);
        lista.add(oAritmeticos);
        lista.add(oBitToBit);
        lista.add(oAsignacion);
        // TODO code application logic here
        
        Scanner n = new Scanner(System.in);
        String datos = "";
        
        System.out.print("Por favor ingrese el codigo:");
        datos = n.nextLine();
        
        //System.out.println(""+datos);
        String[] codigo = datos.split(" ");
        
        ArrayList<String> pErroneas = new ArrayList<String>();
        
        
        System.out.println("\n\n------TOKENS VALIDOS------");
        for (String e : codigo) {
            if (Arrays.asList(lista.get(0)).contains(e)) {
                System.out.println("Keyword: "+e);
            }else if (Arrays.asList(lista.get(1)).contains(e)) {
                System.out.println("Simbolo Especial: "+e);
            }else if (Arrays.asList(lista.get(2)).contains(e)) {
                System.out.println("Operador de Concatenacion: "+e);
            }else if (Arrays.asList(lista.get(3)).contains(e)) {
                System.out.println("Operador Logico: "+e);
            }else if (Arrays.asList(lista.get(4)).contains(e)) {
                System.out.println("Operador Aritmetico: "+e);
            }else if (Arrays.asList(lista.get(5)).contains(e)) {
                System.out.println("Operador Bit a Bit: "+e);
            }else if (Arrays.asList(lista.get(6)).contains(e)) {
                System.out.println("Operador de Asignacion: "+e);
            }else{
                pErroneas.add(e);
            }               
        }  
        
        System.out.println("\n");
        System.out.println("------COMANDOS INVALIDOS------");
        for (String e : pErroneas) {
            System.out.println("El comando '"+e+"' no es valido, no se encuentra entre los TOKENS");
        }
    }
}
