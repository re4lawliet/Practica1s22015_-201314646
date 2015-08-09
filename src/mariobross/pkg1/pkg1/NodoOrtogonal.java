/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariobross.pkg1.pkg1;

/**
 *
 * @author carlos
 */

//------------------------------------clase del nodo Ortogonal-----------------------------
public class NodoOrtogonal {
    
    public objeto dato;//objeto que tiene
    public int x;      //cordenada en x
    public int y;      //cordenada en y
    
    NodoOrtogonal arriba;//Apuntador arriba
    NodoOrtogonal abajo;//Apuntador abajo
    NodoOrtogonal derecha;//Apuntador Derecha
    NodoOrtogonal izquierda;//apuntador Izquierda
    
    //constructor con Parametros del Nodo
    public NodoOrtogonal (objeto o,int corx, int cory){
        //setear atributos------
        this.dato = o;
        this.x=corx;
        this.y=cory;
        
        arriba=null;
        abajo=null;
        izquierda=null;
        derecha=null;
        
    }
    
}
