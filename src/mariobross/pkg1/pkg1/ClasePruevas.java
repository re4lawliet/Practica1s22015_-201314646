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
public class ClasePruevas {
 
    public static MatrizOrtogonal matriz = new MatrizOrtogonal();
    public MatrizOrtogonal matriz2;
    
    public ClasePruevas () {
    
        
}
    
    //resive para crear la matris
    public static void CrearMatriz(int x, int y){
        
        matriz.Llenar(x,y);      
        }
    
     
    
    public static int buscarej(){
        
        
        //----------------------------'''''''''//jugar cone esto
       // int dato=matriz.l.primero.filas.primero.abajo.derecha.derecha.abajo.dato.id;
        
        //System.out.println("El RESULTADO DE LA BUSQUEDA ES: "+dato);
        
        try {
        int contador=0;    
        if (!matriz.l.esVacia()){
        NodoLateral temporal1 = matriz.l.primero;
            
            
        while (temporal1.filas.primero!=null){
         
            
            NodoOrtogonal temporal2=temporal1.filas.primero;
            
        while (temporal2!=null){
          
            System.out.print("-("+temporal2.x+","+temporal2.y+")");
            temporal2 = temporal2.derecha;
            
        }
            
            
            System.out.println("-fila--"+temporal1.filas.primero.y);
            contador=contador+1;
            
            //System.out.println(" y= "+temporal1.x+" dato: Sin Dato");
            temporal1 = temporal1.siguiente;
        }
        }else{
            System.out.print("No hay nada");
        }
        //Captura cualquier Exepcion
        }catch (Exception e) {
          System.out.println("exepcion");
        }
        
        
            return 0;
        }
        
    
    public void llenarNull(){
        
        
        
    }
    
    
    //No se toca
    public static int buscarej2(){
        
       int dato=matriz.l.primero.filas.ultimo.dato.id;//le puse id
       // System.out.println("El RESULTADO DE LA BUSQUEDA ES: "+dato);
            
            
            if (!matriz.c.esVacia()){
            NodoCabezera temporal1 = matriz.c.primero;
            
            
        while (temporal1.columna.primero!=null){
         
            
            NodoOrtogonal temporal2=temporal1.columna.primero;
            
        while (temporal2!=null){
          
            System.out.print("-"+temporal2.dato);
            temporal2 = temporal2.abajo;
        }
            
            
            System.out.println(""+temporal1.columna.primero.dato);
            //System.out.println(" y= "+temporal1.x+" dato: Sin Dato");
            temporal1 = temporal1.siguiente;
        }
        }else{
            System.out.print("No hay nada");
        
            
            
        }
        
        
        
            return dato;
        }   
    
}
