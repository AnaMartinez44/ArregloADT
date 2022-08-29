/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Ana
 */
public class ArregloEjecutable {

    public static void main(String[] args) {
     ArregloADT arregloA=new ArregloADT();
        arregloA.setLista("gato1",0);
        arregloA.setLista("gato2",1);
        arregloA.setLista("gato3",2);
        arregloA.setLista("gato4",3);
        arregloA.setLista("gato5",4);
        arregloA.setLista("gato6",5);
        System.out.println("el tamano del arregloA es "+arregloA.tamaño());
 
   for(int i=0;i<6;i++){
      arregloA.leer(i);
   } 
        System.out.println("la casilla 1 es "+arregloA.getLista(0));
    arregloA.clean();
        for(int i=0;i<6;i++){
             arregloA.setLista("holamundo",0);
      arregloA.leer(i);
   } 
    }
    }
  
