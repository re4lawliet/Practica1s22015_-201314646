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
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
 
import javax.swing.*;
public class ventanalol extends JFrame {
    private JLabel label1,label2;
    JButton boton1;
    JButton Mostrar=new JButton();
    
    JButton Sacar = new JButton("Sacar");
    
    JButton nullo=new JButton(" ");
    
    
    JButton insertarFila = new JButton("Insertar Fila");
    JButton insertarColumna=new JButton ("Insertar Columna");
    
    
    public ListaDoble ListaObjetos3= new ListaDoble(); 
    
        
    public ventanalol() {
        setLayout(null);
        
        label1=new JLabel("Lista De Objetos: ");
        label1.setBounds(25,0,300,50);
        add(label1);
        label2=new JLabel("Objeto A Sacar:");
        label2.setBounds(850,10,300,50);;
        add(label2);
        
        //Coton de Prueba para SAcar
         Sacar.setBounds(1000, 80, 100, 50);
         add(Sacar);
         click();
         
         //Boton Para Agregar Filas a la Matriz Ortogonal
         insertarFila.setBounds(500, 80, 200, 50);
         add(insertarFila);
         click3AgregarFila();
         
         
         //Boton Para Agregar Colomnas a la Matriz Ortogonal
         insertarColumna.setBounds(300, 80, 200, 50);
         add(insertarColumna);
         click4AgregarColumna();
         
        //-------Agregar boton
        //boton1=new JButton("lol");
        //boton1.setBounds(90, 800, 40, 40);
        //add(boton1);
        
        
        //PRUEVAS DE SETEO------------------------------------------------------
        
        //setear loool OBJETO en Frame
        //objeto p = new objeto("lol",1); 
        
        //SetBounds(cordenada x,cordenada y,ancho,alto) del label
        /*
        p.label.setBounds(20, 20, 40, 40);
        add(p.label);
        objeto p1 = new objeto("lol",0); 
        p1.label.setBounds(50, 800, 40, 40);
        add(p1.label);
        
        p.boton.setBounds(90,800,40,40);
        add(p.boton);
        p1.boton.setBounds(130,800,40,40);
        add(p1.boton);
        */
        //objeto mario = new objeto("lol",7); 
        //mario.boton.setBounds(10, 50, 40, 40);
        //add(mario.boton);
       
        
      
       llenarEnFrame();
       //MostrarListaFinInicio ();
       
       if ("cola".equals(PilaCola.Metodo)){
            llenarListaDeObjetos();
            MostrarBoton();
       }else{
           MostrarListaFinInicio ();
           MostrarBoton();
       }
        
        
    }
    
    public static void main(String[] ar) {
        ventanalol formulario1=new ventanalol();
        formulario1.setBounds(0,0,1500,1000);
        formulario1.setResizable(false);
        formulario1.setVisible(true);
    }
    
    //llena la matriz
        public int llenarEnFrame(){
        

            int aux=10;
            int auy=180;
            
        int dato=0;
        try {
           
        if (!ClasePruevas.matriz.l.esVacia()){
        NodoLateral temporal1 = ClasePruevas.matriz.l.primero;
            
            
        while (temporal1.filas.primero!=null){
         
            
            NodoOrtogonal temporal2=temporal1.filas.primero;
            
        while (temporal2!=null){
          
            System.out.print("-"+temporal2.dato.id);
            
            
            
            temporal2.dato.boton.setBounds(aux,auy,40,40);
            add(temporal2.dato.boton).setVisible(true);
            
            temporal2 = temporal2.derecha;
            aux = aux+40;
        }
            
            aux = 10;
            
            System.out.println("-fila--"+temporal1.filas.primero.y);
            auy=auy+40;
            
            //System.out.println(" y= "+temporal1.x+" dato: Sin Dato");
            temporal1 = temporal1.siguiente;
        }
        auy = 180;
        }else{
            System.out.print("No hay nada");
        }
        //Captura cualquier Exepcion
        }catch (Exception e) {
          System.out.println("exepcion");
        }
        
        
            return dato;
        }
        
        
        //------------------------
         public void llenarListaDeObjetos(){
             
             int aux=10;
             int auy=70;
             
             if (!Eliminar.ListaObjetos2.esVacia()){ //si no esta vacia porlomenos tiene un nodo
            String datos="<-a-s->";
            NodoDoble auxiliar=Eliminar.ListaObjetos2.inicio; //crea nodoDoble auxiliar y apunta al inicio
            
            while (auxiliar!=null){//mientras auxiliar sea diferente de nulo, Mostrara los datos
            datos = datos + "["+auxiliar.dato.nombre+"]<-a-s->"; //mostrar de esta forma
            String lol = auxiliar.dato.nombre;
            //--------------
            
            auxiliar.dato.boton.setBounds(aux, auy, 40, 40);
            add(auxiliar.dato.boton);
            //int lol2=auxiliar.dato.id;
            auxiliar = auxiliar.siguiente; //auxiliar vaser = a auxiliar de siguiente
            //jComboBox1.addItem(lol);
             aux =aux +40;
             
             
             }
            JOptionPane.showMessageDialog(null, datos,"Mostrando De inicio a fin",JOptionPane.INFORMATION_MESSAGE);
        }else {
             System.out.println("VACIO");
             //JButton nullo=new JButton(" ");
             nullo.setBounds(aux, auy, 40, 40);
             add(nullo);
             
         }
             
         }
        
         
         public void MostrarBoton(){
              int aux=10;
             int auy=50;
             
             if (!Eliminar.ListaObjetos2.esVacia()){ //si no esta vacia porlomenos tiene un nodo
            //String datos="<-a-s->";
            NodoDoble auxiliar=Eliminar.ListaObjetos2.inicio; //crea nodoDoble auxiliar y apunta al inicio
            
            while (auxiliar!=null){//mientras auxiliar sea diferente de nulo, Mostrara los datos
            //datos = datos + "["+auxiliar.dato.nombre+"]<-a-s->"; //mostrar de esta forma
            String lol = auxiliar.dato.nombre;
            //--------------
            if(Eliminar.ListaObjetos2.esVacia()){
              JOptionPane.showMessageDialog(rootPane, "Lista VAcia");
              break;
            }else{
            Mostrar=auxiliar.dato.boton;
            Mostrar.setBounds(1000,10,40, 40);
            add(Mostrar);
            click2();
            //int lol2=auxiliar.dato.id;
            break;
            }
             //auxiliar vaser = a auxiliar de siguiente
            //jComboBox1.addItem(lol);
             }
            //JOptionPane.showMessageDialog(null, datos,"Mostrando De inicio a fin",JOptionPane.INFORMATION_MESSAGE);
        }else {
             System.out.println("VACIO");
             //JButton nullo=new JButton(" ");
             nullo.setBounds(aux, auy, 40, 40);
             add(nullo);
         }
         }
         
         
             public void MostrarListaFinInicio (){
        if (!Eliminar.ListaObjetos2.esVacia()){ //si no esta vacia porlomenos tiene un nodo
            String datos="<-a-s->";
            int aux=10;
            int auy=70;
            
            NodoDoble auxiliar=Eliminar.ListaObjetos2.fin; //crea nodoDoble auxiliar y apunta al final
            
            while (auxiliar!=null){//mientras auxiliar sea diferente de nulo, Mostrara los datos
            //datos = datos + "["+auxiliar.dato.nombre+"]<-a-s->"; //mostrar de esta forma
            //auxiliar = auxiliar.anterior; //auxiliar va a recorrer a anterior
            
            auxiliar.dato.boton.setBounds(aux, auy, 40, 40);
            add(auxiliar.dato.boton);
            //int lol2=auxiliar.dato.id;
            auxiliar = auxiliar.anterior; //auxiliar vaser = a auxiliar de siguiente
            //jComboBox1.addItem(lol);
             aux =aux +40;
            
            }
            
            JOptionPane.showMessageDialog(null, datos,"Mostrando De Fin a fin",JOptionPane.INFORMATION_MESSAGE);
            
        }else {
            JOptionPane.showMessageDialog(null, null,"ESta Vacia Mula",JOptionPane.INFORMATION_MESSAGE);
        }
        
        
        
    }
             
             public void MostrarBoton2(){
                 
            int aux=10;
            int auy=50;
             
             if (!Eliminar.ListaObjetos2.esVacia()){ //si no esta vacia porlomenos tiene un nodo
            //String datos="<-a-s->";
            NodoDoble auxiliar=Eliminar.ListaObjetos2.fin; //crea nodoDoble auxiliar y apunta al inicio
            
            
            
            while (auxiliar!=null){//mientras auxiliar sea diferente de nulo, Mostrara los datos
            //datos = datos + "["+auxiliar.dato.nombre+"]<-a-s->"; //mostrar de esta forma
            String lol = auxiliar.dato.nombre;
            //--------------
            if(Eliminar.ListaObjetos2.esVacia()){
                JOptionPane.showMessageDialog(rootPane, "Lista VAcia");
              break;
            }else{
            Mostrar=auxiliar.dato.boton;
            Mostrar.setBounds(1000,10,40, 40);
            add(Mostrar);
            click2();
            //int lol2=auxiliar.dato.id;
            break;
            }
             //auxiliar vaser = a auxiliar de siguiente
            //jComboBox1.addItem(lol);
             }
            //JOptionPane.showMessageDialog(null, datos,"Mostrando De inicio a fin",JOptionPane.INFORMATION_MESSAGE);
        }else {
             System.out.println("VACIO");
             
             nullo.setBounds(aux, auy, 40, 40);
             add(nullo);
         }
                 
             }
             
             
             public void click (){
              
                 ActionListener listener = new ActionListener() {

                     public void actionPerformed(ActionEvent e) {
                         
                         System.out.println("Accion del Boton Prueva");
                         //Validacion para Saber q metodo Esta Usando
                         if("cola".equals(PilaCola.Metodo)){
                             
                             if (Eliminar.ListaObjetos2.esVacia()){
                                 JOptionPane.showMessageDialog(rootPane, "Ya no Tiene Elementos Por Agregar");
                             }else{
                             NodoDoble auxiliar=Eliminar.ListaObjetos2.inicio;
                             Eliminar.ListaObjetos2.EliminarBicho(auxiliar);
                             MostrarBoton();
                             }
                             
                         }else{
                             
                              if (Eliminar.ListaObjetos2.esVacia()){
                                 JOptionPane.showMessageDialog(rootPane, "Ya no Tiene Elementos Por Agregar");
                             }else{
                             NodoDoble auxiliar=Eliminar.ListaObjetos2.inicio;
                             Eliminar.ListaObjetos2.EliminarBicho(auxiliar);
                             MostrarBoton();
                              }
                         }
                         
                     }
                 };
                 Sacar.addActionListener(listener);
                 
             }
             
             //ESTA ES LA ACCION DEL BOTON QUe TIene el OBJETO
             public void click2 (){
              
                 ActionListener listener = new ActionListener() {

                     public void actionPerformed(ActionEvent e) {
                         
                         System.out.println("jalkfdjlajdflklda");
                         
                         ClasePruevas.matriz.InsertarFila();
                         llenarEnFrame();
                         System.out.println("Se Inserto Fila: "+MatrizOrtogonal.Xinicial);
                     }
                 };
                 Mostrar.addActionListener(listener);
                 
             }
             
             public void click3AgregarFila (){
              
                 ActionListener listener = new ActionListener() {

                     public void actionPerformed(ActionEvent e) {
                         
                         System.out.println("INSERTA FILA");
                         
                         ClasePruevas.matriz.InsertarFila();
                         
                         
                         llenarEnFrame();
                         
                        
                         System.out.println("Se Inserto Fila: "+MatrizOrtogonal.Yinicial);
                         ClasePruevas.buscarej();
                         
                         /*
                         setVisible(false);
                         ventanalol formulario1=new ventanalol();
        formulario1.setBounds(0,0,1500,1000);
        formulario1.setResizable(false);
        formulario1.setVisible(true);
                                 */
                     }
                 };
                 insertarFila.addActionListener(listener);
                 
             }
             
                          public void click4AgregarColumna (){
              
                 ActionListener listener = new ActionListener() {

                     public void actionPerformed(ActionEvent e) {
                         
                         System.out.println("INSERTA COLUMNA");
                         
                         ClasePruevas.matriz.InsertarColumna();
                         
                         
                         llenarEnFrame();
                         
                         System.out.println("Se Inserto Columna: "+MatrizOrtogonal.Xinicial);
                         ClasePruevas.buscarej();
                         
                         
                         /*
                         setVisible(false);
                         ventanalol formulario1=new ventanalol();
        formulario1.setBounds(0,0,1500,1000);
        formulario1.setResizable(false);
        formulario1.setVisible(true);
                                 */
                     }
                 };
                 insertarColumna.addActionListener(listener);
                 
             }
                          
                          
                              
    //llena la matriz
        public int llenarEnFrame2(){
        
         int aux=10;
            int auy=180;
            
        int dato=0;
        try {
           
        if (!ClasePruevas.matriz.l.esVacia()){
        NodoCabezera temporal1 = ClasePruevas.matriz.c.primero;
            
            
        while (temporal1.columna.primero!=null){
         
            
            NodoOrtogonal temporal2=temporal1.columna.primero;
            
        while (temporal2!=null){
          
            System.out.print("-"+temporal2.dato.id);
            
            
            
            temporal2.dato.boton.setBounds(aux,auy,40,40);
            add(temporal2.dato.boton).setVisible(true);
            
            temporal2 = temporal2.derecha;
            aux = aux+40;
        }
            
            aux = 10;
            
            System.out.println("-columna--"+temporal1.columna.primero.y);
            auy=auy+40;
            
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
        //Actualizar Git
        
            return dato;
        }
 
}

