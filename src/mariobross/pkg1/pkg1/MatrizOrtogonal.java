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

//aqui se declara la Matriz Ortogonal
public class MatrizOrtogonal {
    
    Cabezeras c; //Tiene Una lista de Cabezera
    Laterales l; //y Tiene una LIsta de laterales :v
    
    public static int Yinicial;
    public static int Xinicial;
    
    public MatrizOrtogonal(){
        c=new Cabezeras();
        l=new Laterales();
        
    }
    
    //METODO DE INSERTAR MUY IMPORTANTE
    public void Insertar(int x, int y, objeto obj){
        
        NodoOrtogonal insert=new NodoOrtogonal(obj,x,y);
        
        //validar si la cabezera no existe
        if (c.Existe(x)==false){
            System.out.println("No existe la Cabezera Tonces la Creamos");
            c.Insertar(new NodoCabezera(x),1);
        }
        //validar si la lateral no existe
        if (l.Existe(y)==false){
           System.out.println("No existe la Cabezera Tonces la Creamos");
            l.Insertar(new NodoLateral(y),1);
        }
        
        NodoCabezera cabezeraTemporal;//crea cabezera temporal
        NodoLateral lateralTemporal;  //crea lateral temporal
        
        cabezeraTemporal=c.Busqueda(x);//cabezera temporal = c.busqueda x que es el nodo cabezera q encontro y retorno
        lateralTemporal=l.Busqueda(y);//lateral temporal = l.busqueda y que es el nodo lateral q encontro y retorno
        
        cabezeraTemporal.columna.Insertar(insert);//el temporal inserta el nodo ortogonal en la listaX que es atributo del nodoCabezera que es la columna
        lateralTemporal.filas.Insertar(insert);//el temporal inserta el nodo ortogonal en la listaY que es atributo del nodoLateral que es la fila
        
        System.out.println("inserto: "+insert.dato+"en:("+x+","+y+")");
        
    }
    
    //MEtodo De LLENAR 
    public void Llenar (int x, int y){
        this.Xinicial=x;
        this.Yinicial=y;
        objeto o;
        /*
        o=new objeto("cielo",3);
        Insertar(0,0,o);
        o=new objeto("cielo",4);
        Insertar(0,0,o);
        o=new objeto("cielo",5);
        Insertar(0,0,o);
        */
        
        for (int i=0;i<y;i++){
            
            for (int j=0;j<x;j++){
                
                
                o=new objeto("cielo",0);
                Insertar(j,i,o);
                //o++;
                
            }
            
        }
        
        
    }
    
    public void InsertarFila(){
        int x=Xinicial;
        
        
        objeto o1;
        
        for (int i=0;i<x;i++){
            
            o1=new objeto("Mario",2);
            Insertar2(i,Yinicial,o1);
            System.out.print("----------------------------------|"+ClasePruevas.matriz.l.ultimo.filas.ultimo.dato.id);
        }
        Yinicial=Yinicial+1;
        
    }
    
     public void InsertarColumna(){
        
        int y=Yinicial;
        
        objeto o;
       
       for (int i=0;i<y;i++){
            
            o=new objeto("Bandera",1);
            Insertar2(Xinicial,i,o);
            System.out.print("----------------------------------|"+ClasePruevas.matriz.c.ultimo.columna.ultimo.dato.id);
        }
        
        Xinicial=Xinicial+1;
    }
    
    public void Insertar2(int x, int y, objeto obj){
        
        NodoOrtogonal insert=new NodoOrtogonal(obj,x,y);
        
        //validar si la cabezera no existe
        if (c.Existe(x)==false){
            System.out.println("No existe la Cabezera Tonces la Creamos");
            c.Insertar(new NodoCabezera(x),0);
        }
        //validar si la lateral no existe
        if (l.Existe(y)==false){
           System.out.println("No existe la Cabezera Tonces la Creamos");
            l.Insertar(new NodoLateral(y),0);
        }
        
        NodoCabezera cabezeraTemporal;//crea cabezera temporal
        NodoLateral lateralTemporal;  //crea lateral temporal
        
        cabezeraTemporal=c.Busqueda(x);//cabezera temporal = c.busqueda x que es el nodo cabezera q encontro y retorno
        lateralTemporal=l.Busqueda(y);//lateral temporal = l.busqueda y que es el nodo lateral q encontro y retorno
        
        cabezeraTemporal.columna.Insertar(insert);//el temporal inserta el nodo ortogonal en la listaX que es atributo del nodoCabezera que es la columna
        lateralTemporal.filas.Insertar(insert);//el temporal inserta el nodo ortogonal en la listaY que es atributo del nodoLateral que es la fila
        
        System.out.println("inserto: "+insert.dato.id+"en:("+x+","+y+")");
        
    }
    
        
        
    
}
