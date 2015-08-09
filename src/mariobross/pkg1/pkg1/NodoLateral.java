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

//----------------------------NODOS Laterales-----------------------------|
//lista en los nodos laterales
public class NodoLateral {
    
    public int y; //su cordenada en x
    
    public NodoLateral siguiente;//apuntador siguiente
    public NodoLateral anterior;//apuntador anterior
    ListaX filas;
    
    public NodoLateral (int y){
        this.y=y;
        filas = new ListaX ();
        siguiente= null;
        anterior= null;
        
    }
 }
