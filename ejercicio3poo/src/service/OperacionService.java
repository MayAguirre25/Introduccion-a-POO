/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Entidad.Operaciones;
import java.util.Scanner;

/**
 *
 * @author aguir
 */
public class OperacionService {
    
    public Operaciones CrearOperacion(){
        Scanner read=new Scanner (System.in);
        Operaciones objetoOperaciones =new Operaciones();
        System.out.println("Ingrese el numero 1");
        objetoOperaciones.setN1(read.nextInt());
        System.out.println("Ingrese el numero 2");
        objetoOperaciones.setN2(read.nextInt());
       
        return objetoOperaciones;
        
    }
    public int Suma(Operaciones objetoOperaciones){
       
        int a=objetoOperaciones.getN1();
         int b=objetoOperaciones.getN2();
      int c=a+b;
        
        return c;
        
    }
     public int Resta(Operaciones objetoOperaciones){
       
        int a=objetoOperaciones.getN1();
         int b=objetoOperaciones.getN2();
         
      int c=a-b;
        
        return c;
        
    }
    
}
