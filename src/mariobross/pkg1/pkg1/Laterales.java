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
//listas de Cabezeras--------------------------------
//hacer la lista de cabezeras. con sus respectidos nodos

public class Laterales {
 
    NodoLateral primero;
    NodoLateral ultimo;
    
    public Laterales (){
        primero=null;//apunta a null
        ultimo =null;// apunta a null 
    }
    //METODO DE INSERTAR: alfrente enmedio y al final
    public void Insertar (NodoLateral insertar,int n){
        
        if (!esVacia()){//si la lista no esta vacia (porlomenos tiene un nodo)
        //HACE 3 VERIFICACIONES:
            if (insertar.y < primero.y){//si el de insercion es menor q el de la sima llamar a:
             
                InsertarFrente(insertar);//llama a insertar alfrente
             
            }else if (insertar.y > ultimo.y){//si el de insertar es mayor q el de la sima
                if (n==0){
                }
                InsertarFinal(insertar);//llama a insertar alfinal
            }else if (insertar.y == ultimo.y){  
                if (n==0){
                }
                System.out.println ("no hace nada");
                InsertarFinal(insertar);
            }else if (insertar.y == primero.y){
                System.out.println ("no hace nada");
                InsertarFinal(insertar);
            }else{// Sino se Cumple ninguna insercion al medio
                
                InsertarMedio(insertar);//llama a insertar medio
                
            }
            
        }else{//de lo contrario si esta vacia tonces se crea un nodo nuevo
            primero =ultimo= insertar;//inicio y fin apuntan al primer nodo q vamos a crear cn el primer const
        }
        
    }
    
    //para Agragar Arriba del eje Y
    public void InsertarFrente(NodoLateral insertar){
        
        primero.anterior=insertar; //el primero apunta arriba y agrega el objeto inserta
        insertar.siguiente=primero;  // el objeto nuevo Nodo Inserta apunta abajo a primero
        primero = primero.anterior;//primero es igual a primero apunta arriba para cambiar de cabezera
    }
    
    //para Agregar Abajo del Eje Y
    public void InsertarFinal(NodoLateral insertar){
        
        ultimo.siguiente=insertar;//el ultimo apunta abajo y agrega el objeto nodo inseta
        insertar.anterior = ultimo;//inserta apunta arriba y pone como ultimo
        ultimo = ultimo.siguiente;//ultimo es igual a ultimo apunta hacia abajo.
        
    }
    
    //
    public void InsertarMedio(NodoLateral insertar){

        /*
        NodoLateral temporal1;//creamos variables Temporales
        NodoLateral temporal2;//---------
        
        temporal1 = primero;//temporal1 es igual a primero
        
        while (temporal1.y < insertar.y){ //recorre la lista vertical comparando si temporal es menor q el q se inserta
            temporal1 =temporal1.siguiente; //para ir seleccionando nodo por nodo
        }
        //al salir del ciclo queda un nodo seleccionado
        temporal2 = temporal1.anterior; //el temporal 2 es igual al nodo de arriba del temporal1
        
        temporal2.siguiente = insertar; //temporal2 puntero abajo apunta a el inserta q es el nodo insertado
        temporal1.anterior = insertar;//temporal1 puntero arriba apunta a el inserta q es l nodo insertado
        insertar.siguiente = temporal1;//ya agregado el nodo el inserta apuntador abajo apunta al temporal1
        insertar.anterior = temporal2;//y el inserta apuntador arriba apunta al temporal2 
       */
//esto para dejar los enlaces dobles
    }
    
    public void Recorrer (){
        
        if (!esVacia()){
            NodoLateral temporal1 = primero;
        
        while (temporal1!=null){
         
            System.out.println(" y= "+temporal1.y+" dato: Sin Dato");
            temporal1 = temporal1.siguiente;
        }
        }else{
            System.out.print("No hay nada");
        }
        
        
    }
    
    
    //VER SI LA LISTA ESTA VACIA
    public boolean esVacia(){
        
       return primero==null; //si inicio es nulo retorna verdadero SIno Falso
    }
    
    
        //---------FUNCIONES DE LAS LISTAS Laterales
    
    //Funcion Booleano
    boolean Existe (int y){
        boolean lol=true;
        
        if (esVacia()){
        System.out.println("Lista Vacia");
        lol=false;
        }else{
        NodoLateral temporal1;
        temporal1=primero;
        while (temporal1!=null){
        if(temporal1.y==y){
        System.out.println("existe :D");
        lol= true;
        }else 
        if (temporal1.siguiente==null){
        System.out.println("No se encontro :/");
        lol=false;
        }
        temporal1 = temporal1.siguiente;
        }
            
        }
        
        return lol;   
    }
    
    NodoLateral Busqueda (int y){
        
        if (Existe(y)){
            NodoLateral temporal1;
            temporal1=primero;
            while (temporal1.y!=y){
                temporal1 = temporal1.siguiente;
                System.out.println("retornado");
                
            }
        return temporal1;    
        }else{
           System.out.println ("no Existe");
           return (new NodoLateral (-1) );
        }
        
}

    }