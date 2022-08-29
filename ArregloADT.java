/*

/**
 *
 * @author Ana
 */
import java.util.ArrayList;

public class ArregloADT {
   
private ArrayList lista = new ArrayList();
   
    public ArregloADT() {
        this.lista=lista;
        
    }
  
    public int tamaño(){
      return lista.size();
    }
    
    public void clean(){
     lista.clear();
    }
    public void leer(int casillaLeer){
        System.out.println(lista.get(casillaLeer));
    }
    

    public Object getLista(int nCasilla) {
        return lista.get(nCasilla);
    }

    public void setLista(String nuevoValor,int posicion) {
        lista.add(posicion, nuevoValor);
    }
        } 

