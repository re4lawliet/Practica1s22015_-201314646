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
//------------------------------------lista en el eje vertical de las Y------------------------------------------
public class ListaY {
       
    NodoOrtogonal primero;//nodoOrtogonal primero sima
    NodoOrtogonal ultimo; //nodo ortogonal ultimo abajo
    
    //constructor 1 
    public ListaY (){
        primero=null;//apunta a null
        ultimo =null;// apunta a null 
    }
    //METODO DE INSERTAR: alfrente enmedio y al final
    public void Insertar (NodoOrtogonal inserta){
        
        if (!esVacia()){//si la lista no esta vacia (porlomenos tiene un nodo)
        //HACE 3 VERIFICACIONES:
            if (inserta.y < primero.y){//si el de insercion es menor q el de la sima llamar a:
             
                InsertarFrente(inserta);//llama a insertar alfrente
             
            }else if (inserta.y > ultimo.y){//si el de insertar es mayor q el de la sima
                
                InsertarFinal(inserta);//llama a insertar alfinal
            }else if (inserta.y == ultimo.x){
                System.out.println ("no hace nada");
                //InsertarFinal(inserta);
            }else if (inserta.y == primero.x){
                System.out.println ("no hace nada");   
                //InsertarFinal(inserta);
            }else{// Sino se Cumple ninguna insercion al medio
                
               InsertarMedio(inserta);//llama a insertar medio
                
            }
            
        }else{//de lo contrario si esta vacia tonces se crea un nodo nuevo
            primero =ultimo= inserta;//inicio y fin apuntan al primer nodo q vamos a crear cn el primer const
        }
        
    }
    
    //para Agragar Arriba del eje Y
    public void InsertarFrente(NodoOrtogonal insertar){
        
        primero.arriba=insertar; //el primero apunta arriba y agrega el objeto inserta
        insertar.abajo=primero;  // el objeto nuevo Nodo Inserta apunta abajo a primero
        primero = primero.arriba;//primero es igual a primero apunta arriba para cambiar de cabezera
        
        
    }
    
    //para Agregar Abajo del Eje Y
    public void InsertarFinal(NodoOrtogonal insertar){
        
        ultimo.abajo=insertar;//el ultimo apunta abajo y agrega el objeto nodo inseta
        insertar.arriba = ultimo;//inserta apunta arriba y pone como ultimo
        ultimo = ultimo.abajo;//ultimo es igual a ultimo apunta hacia abajo.
        
    }
    
    //
    public void InsertarMedio(NodoOrtogonal insertar){
        /*
        NodoOrtogonal temporal1;//creamos variables Temporales
        NodoOrtogonal temporal2;//---------
        
        temporal1 = primero;//temporal1 es igual a primero
        
        while (temporal1.y < insertar.y){ //recorre la lista vertical comparando si temporal es menor q el q se inserta
            temporal1 = temporal1.abajo; //para ir seleccionando nodo por nodo
        }
        //al salir del ciclo queda un nodo seleccionado
        temporal2 = temporal1.arriba; //el temporal 2 es igual al nodo de arriba del temporal1
        
        temporal2.abajo = insertar; //temporal2 puntero abajo apunta a el inserta q es el nodo insertado
        temporal1.arriba = insertar;//temporal1 puntero arriba apunta a el inserta q es l nodo insertado
        insertar.abajo = temporal1;//ya agregado el nodo el inserta apuntador abajo apunta al temporal1
        insertar.arriba = temporal2;//y el inserta apuntador arriba apunta al temporal2 
        
        */
        
//esto para dejar los enlaces dobles
    }
    
    public void Recorrer (){
        
        if (!esVacia()){
            NodoOrtogonal temporal1 = primero;
        
        while (temporal1!=null){
         
            System.out.println(" y= "+temporal1.y+" dato: "+temporal1.dato);
            temporal1 = temporal1.abajo;
        }
        }else{
            System.out.print("No hay nada");
        }
        
        
    }
    
    
    //VER SI LA LISTA ESTA VACIA
    public boolean esVacia(){
        
       return primero==null; //si inicio es nulo retorna verdadero SIno Falso
    }
    
}
