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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JFrame;
 
import javax.swing.*;
public class ventanalol extends JFrame {
    NodoOrtogonal temporalito;
    NodoOrtogonal temporal2;
    NodoDoble auxiliar;
    
    objeto objetoDrag;
    
    //Matriz para pintar
    public static ArrayList <String> Lineas= new ArrayList <String> ();
    //
    
    private JLabel label1,label2;
    JButton boton1;
    JButton Mostrar=new JButton();
    
    JButton Sacar = new JButton("Sacar");
    JButton graficar = new JButton("graficar");
    
    
    JButton nullo=new JButton(" ");
    
    
    JButton insertarFila = new JButton("Insertar Fila");
    JButton insertarColumna=new JButton ("Insertar Columna");
    
    
    public ListaDoble ListaObjetos3= new ListaDoble(); 
    
    int validar=0;
        
    public ventanalol() {
        setLayout(null);
        
        MouseListener m1 = new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent e) {
                
                JComponent jc = (JComponent)e.getSource();
                TransferHandler th = jc.getTransferHandler();
                
                th.exportAsDrag(jc, e, TransferHandler.COPY);
                
                }

            @Override
            public void mousePressed(MouseEvent e) {
                
                JComponent jc = (JComponent)e.getSource();
                TransferHandler th = jc.getTransferHandler();
                
                th.exportAsDrag(jc, e, TransferHandler.COPY);
                
                
                }

            @Override
            public void mouseReleased(MouseEvent e) {
                }

            @Override
            public void mouseEntered(MouseEvent e) {
                }

            @Override
            public void mouseExited(MouseEvent e) {
                }
            
        };
        
        
        
        
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
         
         //boton para Graficar
         graficar.setBounds(1300, 50, 100, 50);
         add(graficar);
         graficas();
         
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
           
           MostrarListaFinInicio();
           MostrarBoton2();
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
         
            
            temporal2=temporal1.filas.primero;
            
        while (temporal2!=null){
          
            System.out.print("-"+temporal2.dato.id);
            
            
            
            temporal2.dato.boton.setBounds(aux,auy,40,40);
            add(temporal2.dato.boton);
            int aux2=aux;
            int auy3=auy;
            Drop(aux2, auy3, temporal2.dato.id, temporal2.dato);
            
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
                                 JOptionPane.showMessageDialog(rootPane, "Ya no Tiene Elementos Por Sacar");
                             }else{
                            auxiliar=Eliminar.ListaObjetos2.inicio;
                             
                            //Auxiliar es el Q sera Eliminado
                            
                             if (validar==1){
                                 JOptionPane.showMessageDialog(rootPane, "Tiene Un Objeto Seleccionado Coloque en el Mapa");
                             }else{
                             JOptionPane.showMessageDialog(rootPane, "Tiene Un Objeto: '"+auxiliar.dato.nombre+"' Seleccionado");
                                 //Seleccione :V
                                 validar=1;
                                 //-------------------------------
                                 //Luego de Colocar en el Mapa Se elimina y se setea en la Matriz
                             
                             }
                             
                             
                             }
                             
                         }else{
                             
                              if (Eliminar.ListaObjetos2.esVacia()){
                                 JOptionPane.showMessageDialog(rootPane, "Ya no Tiene Elementos Por Sacar");
                             }else{
                             NodoDoble auxiliar=Eliminar.ListaObjetos2.inicio;
                             
                             //Auxiliar es el otro eliminado
                             
                             Eliminar.ListaObjetos2.EliminarBicho(auxiliar);
                             MostrarBoton2();
                              }
                         }
                         
                     }
                 };
                 Sacar.addActionListener(listener);
                 
             }
             
             //ESTA ES LA ACCION DEL BOTON QUe TIene el OBJETO

             
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
            
            
            
            temporal2.dato.label.setBounds(aux,auy,40,40);
            add(temporal2.dato.label).setVisible(true);
            
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
        //MALDITO GIT
        //Otra Prueba
        
            return dato;
        }
        
        
        //GRAFICAR
        public void graficas (){
              
                 ActionListener listener = new ActionListener() {

                     public void actionPerformed(ActionEvent e) {
                         
                         //Graficar
                         
                         
        Eliminar.ListaObjetos2.Graficar();
        ClasePruevas.ExcribirArchivo();
        ClasePruevas.graficar();
        
        GraficarMatriz();
        ClasePruevas.EscribirArchivoMatriz();
        ClasePruevas.graficarMatriz();
        
         //cada vs q grafica limpia 
        
        
        Lineas.clear();
        ClasePruevas.LineasGrafico.clear();
        
        
                     }
                 };
                 graficar.addActionListener(listener);
                 
             }
        
        
 
        //Drag
        
        //Drop
        public void Drop (int x, int y,int id, objeto o){
                       
            
                 ActionListener listener = new ActionListener() {

                     public void actionPerformed(ActionEvent e) {                 
                        
                         
                         //Aqui ya se elimina el objeto de la Doble Enlazada y se Debe colocar en la Ortogonal
                         objeto dato;
                         dato = auxiliar.dato;
                         
                         Eliminar.ListaObjetos2.EliminarBicho(auxiliar);
                         MostrarBoton();
                        //---------------------------------------------------------------------------------}
                        //---------------------------------------------------------------------------------
                          
                        dato.boton.setBounds(x, y, 40, 40);
                        add(dato.boton);                         
                        
                        llenarEnFrame();
                        recorrer(id,dato);
                     }
                 };
                 temporal2.dato.boton.addActionListener(listener);
                 
             }
        
        public void recorrer(int idviejo, objeto objetonuevo){
            
            NodoOrtogonal Columna=ClasePruevas.matriz.c.primero.columna.primero;
            NodoOrtogonal Fila =ClasePruevas.matriz.l.primero.filas.primero;
            
            
            NodoLateral temporal3 = ClasePruevas.matriz.l.primero;
            NodoCabezera temporal4 = ClasePruevas.matriz.c.primero;
            
            
                       
           
        int aux=10;
        int auy=180;    
        int dato=0;
        
        try {
           
        
        NodoLateral temporal1 = ClasePruevas.matriz.l.primero;
            
            
        while (temporal1.filas.primero!=null){
         
            
            temporal2=temporal1.filas.primero;
            
        while (temporal2!=null){
          
            System.out.print("-"+temporal2.dato.id);
            //buscar dato
            
            if (temporal2.dato.id==idviejo){
                
                temporal2.dato=objetonuevo;
                System.out.println("Inserto Dato :v");
            }
                        
            temporal2 = temporal2.derecha;
            
        }   
            System.out.println("-fila--"+temporal1.filas.primero.y);
            temporal1 = temporal1.siguiente;
        }  
        //Captura cualquier Exepcion
        }catch (Exception e) {
          System.out.println("exepcion");
        }
            
        
            
            
        }
        
        
        public void GraficarMatriz () {
            
        
        try {
           
        
        NodoLateral temporal1 = ClasePruevas.matriz.l.primero;
            
            
        while (temporal1.filas.primero!=null){ 
            
            temporal2=temporal1.filas.primero;
            
        while (temporal2!=null){
          
            System.out.print("-"+temporal2.dato.id);
            
            String linea = ""+temporal2.dato.nombre+temporal2.dato.id;
            Lineas.add(linea);
            
            
            temporal2 = temporal2.derecha;
            
        }
                    
            System.out.println("-fila--"+temporal1.filas.primero.y);
            
            //System.out.println(" y= "+temporal1.x+" dato: Sin Dato");
            temporal1 = temporal1.siguiente;
        }
        
        //Captura cualquier Exepcion
        }catch (Exception e) {
          System.out.println("exepcion");
        }
  
}
        
        
}

