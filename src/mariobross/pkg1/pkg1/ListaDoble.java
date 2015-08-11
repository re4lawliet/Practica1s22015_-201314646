/*
 * To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariobross.pkg1.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author carlos
 */
public class ListaDoble {
    
    public NodoDoble inicio; //nodo iniciall
    public NodoDoble fin;    //nodo final
    
    //OTRAS VARIABLES------------------------------1
    public static int temporal1;
    public static String temporal1nombre;
    
    //---------------------------------------------1
    //constructor por defecto
    public ListaDoble (){
        inicio = null; //inicio nulo
        fin = null;    //final nulo 
    }
    
    //metodo para saber si la lista esta vacia
    public boolean esVacia(){ 
       return inicio==null; //si inicio es nulo retorna verdadero SIno Falso
       
    }
    
    //metodo para agregar nodos al Final
    /**
    1-si la lista no esta vacia 
    * fin = nuevo NodoDoble(objeto,nulo,fin) //siguiente va ser a nulo xq esta alfinal (su sig apunta a nulo)
    * //puntero anterior a fin xq hay uno antes
    * apuntar fin de anterior de siguiente a fin
    2-sino 
    * Inicio = Fin = nuevo NodoDoble (elemento) //para agregar desde 0
    */
    public void AgregarAlFinal (objeto o){
        
        
        if (!esVacia()){ //si la lista no esta vacia (porlomenos tiene un nodo)
        //crear un nuevo nodo y asignar a Fin
            fin = new NodoDoble (o,null,fin); 
            //se usa el 2do xq si tiene un nodo (Objeto, siguiente=null, Anterior=finde la lista)
            fin.anterior.siguiente = fin; //fin de anterior de siguiente va apuntar a fin
            /*
            //Grafico-----------------------------
            String linea = ""+temporal1nombre+"->"+o.nombre+";"+o.nombre+"->"+temporal1nombre+";";//apuntar de uno a otro
            ClasePruevas.LineasGrafico.add(linea);
   
            temporal1=o.id;
            temporal1nombre=o.nombre;
            */
         }else{ //de lo contrario si esta vacia tonces se crea un nodo nuevo
            inicio = fin = new NodoDoble (o); //inicio y fin apuntan al primer nodo q vamos a crear cn el primer const
            //cuando no hay nodos
            
            /*
           //Grafico----------------------------------------
            String linea= ""+o.nombre+";";
            ClasePruevas.LineasGrafico.add(linea);
            
            temporal1=o.id;
            temporal1nombre=o.nombre;
            //----------------------------------------------
            */
        } 
            
    }
    
    //MEtodo Para Agregar Nodos al Final
    //¨*solo se invierte todo y fin -)cambia a  inicio 
    public void AgregarAlInicio (objeto o){
    
        if (!esVacia()){ //si la lista no esta vacia (porlomenos tiene un nodo)
        //
            inicio = new NodoDoble (o,inicio,null); 
            //se usa el 2do xq si tiene un nodo (Objeto, siguiente=inicio, Anterior=nulo)
            inicio.siguiente.anterior = inicio; //inicio de siguiente de anterior va apuntar a inicio
  
         }else{ //de lo contrario si esta vacia tonces se crea un nodo nuevo
            inicio = fin = new NodoDoble (o); //inicio y fin apuntan al primer nodo q vamos a crear cn el primer const
            //cuando no hay nodos
        } 
            
    }
    
    //Metodo Para Mostrar La Lista
    //*tiene 2 enlaces se puede recorrer de inicio a fin Y de Fin a inicio
    // METODO DE INICIO A FIN:::::
    public void MostrarListaInicioFin (){
        
        if (!esVacia()){ //si no esta vacia porlomenos tiene un nodo
            String datos="<-a-s->";
            NodoDoble auxiliar=inicio; //crea nodoDoble auxiliar y apunta al inicio
            
            while (auxiliar!=null){//mientras auxiliar sea diferente de nulo, Mostrara los datos
            datos = datos + "["+auxiliar.dato.nombre+"]<-a-s->"; //mostrar de esta forma
            
           
            
            auxiliar = auxiliar.siguiente; //auxiliar vaser = a auxiliar de siguiente
                 
             }
            JOptionPane.showMessageDialog(null, datos,"Lista Vacia",JOptionPane.INFORMATION_MESSAGE);
        }
         
        
    }
    
    // METODO DE FIN A INICIO:::::
    public void MostrarListaFinInicio (){
        if (!esVacia()){ //si no esta vacia porlomenos tiene un nodo
            String datos="<-a-s->";
            NodoDoble auxiliar=fin; //crea nodoDoble auxiliar y apunta al final
            
            while (auxiliar!=null){//mientras auxiliar sea diferente de nulo, Mostrara los datos
            datos = datos + "["+auxiliar.dato.nombre+"]<-a-s->"; //mostrar de esta forma
            auxiliar = auxiliar.anterior; //auxiliar va a recorrer a anterior
            
            
            }
            
            JOptionPane.showMessageDialog(null, datos,"Mostrando De Fin a fin",JOptionPane.INFORMATION_MESSAGE);
            
        }else {
            JOptionPane.showMessageDialog(null, null,"ESta Vacia Mula",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public NodoDoble Busqueda (String p){
        
        NodoDoble auxiliar=inicio;
        NodoDoble auxiliarFinal = null;
        objeto retorno = null;
         if (!esVacia()){ //si no esta vacia porlomenos tiene un nodo
             //crea nodoDoble auxiliar y apunta al final
            
            while (auxiliar!=null){//mientras auxiliar sea diferente de nulo, Mostrara los datos
           
                if (auxiliar.dato.nombre.equals(p)){
                    auxiliarFinal=auxiliar;
                    retorno=auxiliarFinal.dato;
                }
                
                auxiliar = auxiliar.siguiente; //auxiliar va a recorrer a anterior
            }
            
            
        }else {
            JOptionPane.showMessageDialog(null, null,"ESta Vacia Mula",JOptionPane.INFORMATION_MESSAGE);
        }
        return auxiliarFinal;
    }
    
    //cusqueda REtornando el Objeto
    public objeto Busqueda2 (String p){
        
        NodoDoble auxiliar=inicio;
        NodoDoble auxiliarFinal = null;
        objeto retorno = null;
         if (!esVacia()){ //si no esta vacia porlomenos tiene un nodo
             //crea nodoDoble auxiliar y apunta al final
            
            while (auxiliar!=null){//mientras auxiliar sea diferente de nulo, Mostrara los datos
           
                if (auxiliar.dato.nombre.equals(p)){
                    auxiliarFinal=auxiliar;
                    retorno=auxiliarFinal.dato;
                }
                
                auxiliar = auxiliar.siguiente; //auxiliar va a recorrer a anterior
            }
            
            
        }else {
            JOptionPane.showMessageDialog(null, null,"ESta Vacia Mula",JOptionPane.INFORMATION_MESSAGE);
        }
        return retorno;
    }
    
    //Busqueda Retornando el Nodo
    public NodoDoble buscarEnLista(Object destino)
  //  destino: dato que se busca en la lista.
  {
    NodoDoble indice;
    for (indice = inicio; indice != null; indice = indice.siguiente)
      if (indice.dato.equals(destino))
      return indice;      
    return null;
  }
    
    public void EliminarObjeto (objeto entrada){
        
        //Cola
        
    NodoDoble actual, anterior;  
    boolean encontrado;

    actual = inicio;
    anterior = null;
    
    encontrado = false;
    // Bucle de búsqueda 
    while ((actual!= null) && !actual.dato.equals(entrada))
    {
      if (!actual.dato.equals(entrada))
      { 
        anterior = actual;
        actual = actual.siguiente;
      }
    }
       
    if (actual != null)  
    {
      // Se distingue entre que el nodo sea el cabecera 
      // o del resto de la lista
      if (actual == inicio)
      {
        inicio = actual.siguiente;
      }
      else
      {
        anterior.siguiente = actual.siguiente;
      }
      actual = null; 
        
    }
    }
    
     public void EliminarObjeto2 (objeto entrada){
        
    NodoDoble actual, siguiente;  
    boolean encontrado;

    actual = fin;
    siguiente = null;
    
    encontrado = false;
    // Bucle de búsqueda 
    while ((actual!= null) && !actual.dato.equals(entrada))
    {
      if (!actual.dato.equals(entrada))
      { 
        siguiente = actual;
        actual = actual.anterior;
      }
    }
       
    if (actual != null)  
    {
      // Se distingue entre que el nodo sea el cabecera 
      // o del resto de la lista
      if (actual == fin)
      {
        fin = actual.anterior;
      }
      else
      {
        siguiente.anterior = actual.anterior;
      }
      actual = null; 
        
    }
    }
    
    

     
     public void EliminarBicho (NodoDoble n){
         
         //Pila--------
         
     if (inicio!= null){
     NodoDoble aux = inicio;
     NodoDoble ant = null;
     while (aux != null){
     if (aux.equals(n) ){
     if (ant == null){
     inicio = inicio.siguiente;
     aux.siguiente=null;
     aux= inicio;                           
     }else {
    //ant.setSiguiente(aux.getSiguiente());
         //.anterior para la cola
     ant.siguiente=aux.siguiente;
     aux.siguiente=null;
     aux = ant.siguiente;
     }                                             
     }else{
     ant = aux;
     aux = aux.siguiente;
     
     }
     }
     }
         
     }
    
     public void Graficar (){
            if (!esVacia()){ //si no esta vacia porlomenos tiene un nodo
            String datos="<-a-s->";
            NodoDoble auxiliar=inicio; //crea nodoDoble auxiliar y apunta al inicio
            
            
            
            while (auxiliar!=null){//mientras auxiliar sea diferente de nulo, Mostrara los datos
            datos = datos + "["+auxiliar.dato.nombre+"]<-a-s->"; //mostrar de esta forma
            
            if (auxiliar.siguiente!=null){
            String linea =""+auxiliar.dato.nombre+auxiliar.dato.id+"->"+auxiliar.siguiente.dato.nombre+auxiliar.siguiente.dato.id+";"+auxiliar.siguiente.dato.nombre+auxiliar.siguiente.dato.id+"->"+auxiliar.dato.nombre+auxiliar.dato.id+";";
            ClasePruevas.LineasGrafico.add(linea);
            }else{           
             System.out.println("es el ultimo");
             String linea =""+auxiliar.dato.nombre+auxiliar.dato.id+"->"+"null"+";"+"null"+"->"+auxiliar.dato.nombre+auxiliar.dato.id+";";
            ClasePruevas.LineasGrafico.add(linea);
            }
            
            
            auxiliar = auxiliar.siguiente; //auxiliar vaser = a auxiliar de siguiente
                 
             }
            
        }else{
                JOptionPane.showMessageDialog(null,"Lista Vacia Graficara Nada :v");
            }
                
     }
     
}
