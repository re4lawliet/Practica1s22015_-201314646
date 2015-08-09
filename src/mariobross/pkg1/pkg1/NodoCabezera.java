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
//----------------------------NODOS CABEZERA-----------------------------|
//lista en los nodos cabezera 
public class NodoCabezera {
    
    public int x; //su cordenada en x
    
    public NodoCabezera siguiente;//apuntador siguiente
    public NodoCabezera anterior;//apuntador anterior
    ListaY columna;
    
    public NodoCabezera (int x){
        this.x=x;
        columna = new ListaY ();
        siguiente= null;
        anterior= null;
        
    }
    
}
