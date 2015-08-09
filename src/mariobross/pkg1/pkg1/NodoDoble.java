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
public class NodoDoble {
    
    objeto dato; //objeto q resive la lista
    NodoDoble siguiente; //puntero Siguiente
    NodoDoble anterior;  //puntero anterior
    
    
    
    //Constructor cuando no hay ningun nodo
    
    public NodoDoble (objeto o){
    
    //llamar al otro constructor
    this(o,null,null);
    
    }
    
    
    //Constructor cuando ya hay nodos
    public NodoDoble (objeto o, NodoDoble s, NodoDoble a){
    
        dato=o;//dato es el objeto
        siguiente=s;// punteros siguiente enviados 
        anterior=a; // puntero anterior enviados 
}
    
    
}
