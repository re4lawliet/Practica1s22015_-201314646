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
    NodoOrtogonal temporal3;
    NodoOrtogonal temporalMatriz;
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
    
    JButton Jugar = new JButton ("jugar");
    
    public ListaDoble ListaObjetos3= new ListaDoble(); 
    
    int validar=0;
        
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
         
         Jugar.setBounds(700, 80, 200, 50);
         add(Jugar);
         jugarclick();
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
        public void llenarEnFrame(){
        

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
            temporal2.dato.boton.setVisible(true);
            add(temporal2.dato.boton);
            int aux2=aux;
            int auy3=auy;
            Drop(aux2, auy3, temporal2.dato.id, temporal2.dato, temporal2);
            
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
                             
                             Eliminar.ListaObjetos2.EliminarBicho(auxiliar);
                             MostrarBoton();
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
                             auxiliar=Eliminar.ListaObjetos2.inicio;
                             
                             Eliminar.ListaObjetos2.EliminarBicho(auxiliar);
                             MostrarBoton2();
                             
                              if (validar==1){
                                 JOptionPane.showMessageDialog(rootPane, "Tiene Un Objeto Seleccionado Coloque en el Mapa");
                             }else{
                             JOptionPane.showMessageDialog(rootPane, "Tiene Un Objeto: '"+auxiliar.dato.nombre+"' Seleccionado");
                                 //Seleccione :V
                                 validar=1;
                                 //-------------------------------
                                 //Luego de Colocar en el Mapa Se elimina y se setea en la Matriz
                             
                             }
                                         
                             
                              //MostrarBoton2();
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
        
        GraficarPrueba();
        ClasePruevas.EscribirArchivoMatriz();
        ClasePruevas.graficarMatriz();
        
         //cada vs q grafica limpia 
        
        
        Lineas.clear();
        ClasePruevas.LineasGrafico.clear();
        System.out.println("LA MIERDA ESTA AQUII::::"+ClasePruevas.matriz.c.primero.columna.ultimo.dato.nombre);
        
                     }
                 };
                 graficar.addActionListener(listener);
                 
             }
        
        
 
        //Drag
        
        //Drop
        public void Drop (int x, int y,int id, objeto o, NodoOrtogonal n){
                       
            
                 ActionListener listener = new ActionListener() {

                     public void actionPerformed(ActionEvent e) {                 
                        
                         
                         //Aqui ya se elimina el objeto de la Doble Enlazada y se Debe colocar en la Ortogonal
                         objeto dato;
                         dato = auxiliar.dato;
                         
                         
                         //MostrarBoton2();
                        //---------------------------------------------------------------------------------}
                        //---------------------------------------------------------------------------------
                        NodoOrtogonal x1 = new NodoOrtogonal(dato,1000,1000);
                         
                        
                        recorrerMatriz(id,auxiliar.dato);
                        //Repintar();
                        dato.boton.setBounds(x,y,40,40);
                        dato.boton.add(dato.boton);
                        dato.boton.setEnabled(false);
                        
                        llenarEnFrame();
                        
                     }
                 };
                 temporal2.dato.boton.addActionListener(listener);
                 
             }
        
        public void recorrer(int idviejo, objeto objetonuevo, NodoOrtogonal nodo){
            
            NodoOrtogonal Columna=ClasePruevas.matriz.c.primero.columna.primero;
            NodoOrtogonal Fila =ClasePruevas.matriz.l.primero.filas.primero;
            
            
            
                       
           
        
        try {
           
        
        NodoLateral temporal1 = ClasePruevas.matriz.l.primero;
            
            
        while (temporal1.filas.primero!=null){
         
            
            NodoOrtogonal temporal3=temporal1.filas.primero;
            
        while (temporal3!=null){
          
            System.out.print("-"+temporal3.dato.id);
            
            //buscar dato
            if (temporal3.dato.id==idviejo){                 
                temporal3.dato=objetonuevo;             
                System.out.println("Inserto Dato :v");
            }
                        
            
            temporal3 = temporal3.derecha;   
        }   
        
            System.out.println("-fila--"+temporal1.filas.primero.y);
            temporal1 = temporal1.siguiente;
            
        }  
        llenarEnFrame();
        //Captura cualquier Exepcion
        }catch (Exception e) {
          System.out.println("exepcion");
        }
            
        
            
            
        }
        
        
        public void GraficarMatriz () {
            
        
        try {
           
        
        NodoLateral temporal1 = ClasePruevas.matriz.l.primero;
            
            
        while (temporal1.filas.primero!=null){ 
            
            temporalMatriz=temporal1.filas.primero;
            
        while (temporalMatriz!=null){
                
                //se mete la primera linea
                if (temporalMatriz.derecha==null){
                    
                }else{
            
                String identi=temporalMatriz.dato.nombre+temporalMatriz.dato.id;
                String identi2=temporalMatriz.derecha.dato.nombre+temporalMatriz.derecha.dato.id;
                
                String linea1=""+identi+"->"+identi2+"; \n"
                                +identi2+"->"+identi+";\n";
                linea1=linea1+"{rank=same;"+identi+" "+identi2+"}\n";
                
                if (temporalMatriz.abajo==null){                   
                }else{
                    String identi3=temporalMatriz.derecha.dato.nombre+temporalMatriz.abajo.dato.id;
                    linea1=linea1+""+identi+"->"+identi3+"; \n"
                                   +identi3+"->"+identi+";\n";  
                }
                
                Lineas.add(linea1);
                }
                
                
            temporalMatriz = temporalMatriz.derecha;
            
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
        
        //jugar
        public void jugarclick (){
                       
            
                 ActionListener listener = new ActionListener() {

                     public void actionPerformed(ActionEvent e) {                 
                        
                       //PARA JUGAR.. 
                         
                         
                     }
                 };
                 Jugar.addActionListener(listener);
                 
             }
        
        
    
            public void recorrerMatriz(int idviejo,objeto objetonuevo){
    
    
            for(NodoOrtogonal i=ClasePruevas.matriz.l.primero.filas.primero;i!=null;i=i.derecha){
            
                for(NodoOrtogonal j=i;j!=null;j=j.abajo){
                    
                     if (j.dato.id==idviejo){       
                        
                         
                         j.dato.nombre=objetonuevo.nombre;
                         j.dato.id=objetonuevo.id;
                         j.dato.imagen=objetonuevo.imagen;
                         j.dato.tipo=objetonuevo.tipo;
                        
                         
                                                 
                      System.out.println("Inserto Dato :v");
                      }
                    
                    }              
              
            }
            
            llenarEnFrame();
            }
            
            
                        public void GraficarPrueba(){
                        String linea1="";
    //----------------------------------------Agregar Nodos
                for(NodoOrtogonal i=ClasePruevas.matriz.l.primero.filas.primero;i!=null;i=i.derecha){
            
                for(NodoOrtogonal j=i;j!=null;j=j.abajo){
                linea1=linea1+""+j.dato.nombre+j.dato.id+";\n";
                    }                         
            }
                
                Lineas.add(linea1);
                linea1="";         
                
                //-----------------------------------Agregar punteros de Arriba Abajo            
            for(NodoOrtogonal k=ClasePruevas.matriz.l.primero.filas.primero;k!=null;k=k.abajo){
            
                for(NodoOrtogonal l=k;l!=null;l=l.derecha){
                
                
                if (l.derecha!=null){             
                String identi=l.dato.nombre+l.dato.id;
                String identi2=l.derecha.dato.nombre+l.derecha.dato.id;
                
                linea1=linea1+" "+identi+"->"+identi2+"; \n"
                         +identi2+"->"+identi+";\n";
                linea1=linea1+"{rank=same;"+identi+" "+identi2+"}\n";
                 }else{}
                  
                    }                         
            }
                
                Lineas.add(linea1);
                linea1="";
                
                //-----------------------------------Agregar punteros de izquierda a derecha            
            for(NodoOrtogonal k=ClasePruevas.matriz.l.primero.filas.primero;k!=null;k=k.derecha){
            
                for(NodoOrtogonal l=k;l!=null;l=l.abajo){
                
                
                if (l.abajo!=null){             
                String identi=l.dato.nombre+l.dato.id;
                String identi2=l.abajo.dato.nombre+l.abajo.dato.id;
                
                linea1=linea1+" "+identi+"->"+identi2+"; \n"
                         +identi2+"->"+identi+";\n";
                
                 }else{}
                  
                    }                         
            }
                
                Lineas.add(linea1);
                linea1="";
            }
            
            
            public void Repintar (){
                
                int aux=10;
                int auy=180;
                
                for(NodoOrtogonal i=ClasePruevas.matriz.l.primero.filas.primero;i!=null;i=i.derecha){
            
                for(NodoOrtogonal j=i;j!=null;j=j.abajo){
                    
                    
            j.dato.boton.setBounds(auy,aux,40,40);
            j.dato.boton.setVisible(true);
            add(j.dato.boton);
            
            int aux2=aux;
            int auy3=auy;
            
                    
            auy = auy+40;
                      }
                aux=aux+40;    
                
                    }              
            
            }
            
         
}

