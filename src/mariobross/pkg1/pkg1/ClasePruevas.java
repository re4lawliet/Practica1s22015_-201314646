/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariobross.pkg1.pkg1;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class ClasePruevas {
 
    public static MatrizOrtogonal matriz = new MatrizOrtogonal();
    public MatrizOrtogonal matriz2;
    
    public static ArrayList <String> LineasGrafico= new ArrayList <String> ();
    
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
    
    
    
    
public static void graficar(){
try {

//path del dot.exe,por lo general es la misma, pero depende de donde hayas instalado el paquete de Graphviz

String dotPath = "dot";

//path del archivo creado con el codigo del graphviz que queremos

String fileInputPath = "/home/carlos/Documentos/Graphviz/GraficarListaDoble.dot";

//path de salida del grafo, es decir el path de la imagen que vamos a crear con graphviz

String fileOutputPath = "/home/carlos/Documentos/Graphviz/ListaDoble.jpg";

//tipo de imagen de salida, en este caso es jpg

String tParam = "-Tjpg";

String tOParam = "-o";

//concatenamos nuestras direcciones. Lo que hice es crear un vector, para poder editar las direcciones de entrada y salida, usando las variables antes inicializadas

//recordemos el comando en la consola de windows: C:\Archivos de programa\Graphviz 2.21\bin\dot.exe -Tjpg grafo1.txt -o grafo1.jpg Esto es lo que concatenamos en el vector siguiente:

String[] cmd = new String[5];
cmd[0] = dotPath;
cmd[1] = tParam;
cmd[2] = fileInputPath;
cmd[3] = tOParam;
cmd[4] = fileOutputPath;

//Invocamos nuestra clase 

Runtime rt = Runtime.getRuntime();

//Ahora ejecutamos como lo hacemos en consola

rt.exec( cmd );

//Grafica Generada

} catch (Exception ex) {
ex.printStackTrace();
}  finally {
}
}

public static void graficarMatriz(){
    try {

//path del dot.exe,por lo general es la misma, pero depende de donde hayas instalado el paquete de Graphviz

String dotPath = "dot";

//path del archivo creado con el codigo del graphviz que queremos

String fileInputPath = "/home/carlos/Documentos/Graphviz/GraficarMatrizOrtogonal.dot";

//path de salida del grafo, es decir el path de la imagen que vamos a crear con graphviz

String fileOutputPath = "/home/carlos/Documentos/Graphviz/MatrizOrtogonal.jpg";

//tipo de imagen de salida, en este caso es jpg

String tParam = "-Tjpg";

String tOParam = "-o";

//concatenamos nuestras direcciones. Lo que hice es crear un vector, para poder editar las direcciones de entrada y salida, usando las variables antes inicializadas

//recordemos el comando en la consola de windows: C:\Archivos de programa\Graphviz 2.21\bin\dot.exe -Tjpg grafo1.txt -o grafo1.jpg Esto es lo que concatenamos en el vector siguiente:

String[] cmd = new String[5];
cmd[0] = dotPath;
cmd[1] = tParam;
cmd[2] = fileInputPath;
cmd[3] = tOParam;
cmd[4] = fileOutputPath;

//Invocamos nuestra clase 

Runtime rt = Runtime.getRuntime();

//Ahora ejecutamos como lo hacemos en consola

rt.exec( cmd );

//Grafica Generada

} catch (Exception ex) {
ex.printStackTrace();
}  finally {
}
}

public static void ExcribirArchivo (){
    
    FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            //ESCRIBE EL FICHERO EN EL DIRECTORIO
            fichero = new FileWriter("/home/carlos/Documentos/Graphviz/GraficarListaDoble.dot");
            pw = new PrintWriter(fichero);
            //--------------------------------------------------------------------------------------
            
            //Pinta lo Que deseamos en el Fichero---------------------------------------------------
            
            pw.println("digraph G {");//cabezera del Graphviz
            
            pw.println ("rankdir=LR;");//pone la Direccion de Izquierda a Derecha
            pw.println ("node [shape=record,width=.1,height=.1];");//pone el cuadro q simula el nodo
          
            for (int i=0; i< LineasGrafico.size(); i++){
                
                pw.println(""+LineasGrafico.get(i).toString());
                System.out.println(""+LineasGrafico.get(i));
            }
            
            pw.println("}"); //Fin del GraphViz 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    
}

public static void EscribirArchivoMatriz(){
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            //ESCRIBE EL FICHERO EN EL DIRECTORIO
            fichero = new FileWriter("/home/carlos/Documentos/Graphviz/GraficarMatrizOrtogonal.dot");
            pw = new PrintWriter(fichero);
            //--------------------------------------------------------------------------------------
            
            //Pinta lo Que deseamos en el Fichero---------------------------------------------------
            
            pw.println("digraph G {");//cabezera del Graphviz
            
            pw.println ("rankdir=LR;");//pone la Direccion de Izquierda a Derecha
            pw.println ("node [shape=record,width=.1,height=.1];");//pone el cuadro q simula el nodo
          
            for (int i=0; i< ventanalol.Lineas.size(); i++){
                
                pw.println(""+ventanalol.Lineas.get(i).toString());
                System.out.println(""+ventanalol.Lineas.get(i));
            }
            
            pw.println("}"); //Fin del GraphViz 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }   
}




    
}
