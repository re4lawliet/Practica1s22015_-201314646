/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariobross.pkg1.pkg1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import static mariobross.pkg1.pkg1.ventanalol.Lineas;

/**
 *
 * @author carlos
 */
public class ventanajuego extends JFrame {
    
    NodoOrtogonal temporal2;
    NodoOrtogonal Mario;
    NodoOrtogonal temporal3;
    NodoOrtogonal Temporal;
    
    public static int vidas=3;
    public static int Monedas=0;
    public static JLabel label1;
    public static JLabel label2;
    
    static MatrizOrtogonal temporal4 = ClasePruevas.matriz;
    
    
    //Botones
        JButton graficar = new JButton("Graficar");
        JButton pausa=new JButton ("Pausa");
        JButton inicio=new JButton ("Inicio");
        JButton estadisticas = new JButton ("Estadisticas");
        JButton reiniciar = new JButton ("Reset");
    
    public ventanajuego() {
        setLayout(null);
        
         
        
        JScrollPane scrollPane = new JScrollPane(graficar);

        setPreferredSize(new Dimension(450, 110));

        add(scrollPane, BorderLayout.CENTER);
        
        label1=new JLabel("Monedas Totales::: "+Monedas);
        label2=new JLabel("Vidas Totales::: "+vidas);
        
        
        
        //-------SEtear Cosas-----------------------
        
        //setea el contador De Monedas
        label1.setBounds(25,0,300,50);
        add(label1);
        //setea contador de Vidas
        label2.setBounds(300,0,300,50);
        add(label2);
        
         inicio.setBounds(100, 115, 200, 50);
         add(inicio);
        //set graficar
         pausa.setBounds(300, 115, 200, 50);
         add(pausa);
         
         //set Pausa
         graficar.setBounds(500, 115, 200, 50);
         add(graficar);
         graficas();
         //set Reiniciar
         estadisticas.setBounds(700, 115, 200, 50);
         add(estadisticas);
         
         reiniciar.setBounds(1300, 115, 100, 50);
         add(reiniciar);
         ReiniciarClick();
                
        llenarEnFrame();
        BuscarMario();
        
        inicio.addKeyListener(new KeyListener(){
            
         @Override
         public void keyPressed(KeyEvent a){
             
             //para guardar tecla del teclado :v precionada
             System.out.println(a.getKeyText(a.getKeyCode()));
             String l =a.getKeyText(a.getKeyCode());
             String conv = a.getKeyText(a.getKeyCode())+a.getKeyText(a.getKeyCode());
             
             if(l.equals("Derecha")){
                 //lama al metodo de Moverlo Derecha
                 MoverMarioDerecha();
                }else if (l.equals("Izquierda")){
                 //llama al metodo moverlo Izquierda   
                 MoverMarioIzquierda();   
                }else if (l.equals("Arriba")){
                    //llamar al metodo de Salto
                 SaltarSimple();
                }else if (l.equals("Abajo")){
                 //abajo no hace
                    //NAda
                    
                }else if (conv.equals("ArribaDerecha")){
                 //Metodo Salto ComvinadoDerecha   
                 JOptionPane.showMessageDialog(rootPane, "Salto Convinado Derecha");   
                }else if (conv.equals("ArribaIzquierda")){
                 //Metodo Salto ComvinadoIzquierda   
                 JOptionPane.showMessageDialog(rootPane, "Salto Convinado Izquierda");   
                }
                 
                
                 
             
             
         } 
            @Override
            public void keyTyped(KeyEvent e) {
               //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //To change body of generated methods, choose Tools | Templates.
            }
            
            
        });
        
        
        
        
    }
    
        public static void main(String[] ar) {
        ventanajuego formulario1=new ventanajuego();
        formulario1.setBounds(0,0,1500,1000);
        formulario1.setResizable(false);
        formulario1.setVisible(true);
        
        
        
    }
    
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
              
            temporal2.dato.label.setBounds(aux,auy,40,40);
            temporal2.dato.label.setVisible(true);
            add(temporal2.dato.label);
            int aux2=aux;
            int auy3=auy;
            
            
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
     
     public void BuscarMario(){
         for(NodoOrtogonal i=ClasePruevas.matriz.l.primero.filas.primero;i!=null;i=i.derecha){
            
                for(NodoOrtogonal j=i;j!=null;j=j.abajo){
                    
                     if (j.dato.tipo==7){       
                      
                         Mario=j;
                                                 
                      System.out.println("Inserto Dato Temporal Mario");
                      }
                    
                }   
         
         }
    
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
     
     public void MoverMarioDerecha(){
                objeto temporal3;
                boolean validar=true; 
                
                 for(NodoOrtogonal i=ClasePruevas.matriz.l.primero.filas.primero;i!=null;i=i.derecha){
            
                     for(NodoOrtogonal j=i;j!=null;j=j.abajo){
                    
                         //Condiciones para Moverse a la Derecha 
                         //si el encontrado es de tipo mario y validacion solo a pasado una ves y el de la derecha no es nulo
                     if (j.dato.tipo==7 && validar==true &&j.derecha!=null){       
                         
                         if ((j.abajo.dato.tipo==1 || j.abajo.dato.tipo==2)&&(j.derecha.abajo.dato.tipo==1 || j.derecha.abajo.dato.tipo==2)){
                             
                         temporal3=j.derecha.dato;
                         j.derecha.dato=j.dato;
                         j.dato=temporal3;
                         
                         llenarEnFrame();
                         validar=false;  
                             
                         }else{
                         JOptionPane.showMessageDialog(rootPane, "Caiste Pierdes una Vida");
                         if(vidas<=0){
                         JOptionPane.showMessageDialog(rootPane, "GAME OVER");
                         inicio.setEnabled(false);
                         }
                         vidas=vidas-1;
                         label2.setText("Vidas Totales::: "+vidas);
                         repaint();
                         
                         }
                         
                                                 
                      System.out.println("Movio Mario Derecha");
                      }else{
                      //NAda  
                      }
                    
                      }
         
                 }
}
     
     public void MoverMarioIzquierda(){
                objeto temporal3;
                boolean validar=true; 
                
                 for(NodoOrtogonal i=ClasePruevas.matriz.l.primero.filas.primero;i!=null;i=i.derecha){
            
                     for(NodoOrtogonal j=i;j!=null;j=j.abajo){
                    
                         //Condiciones para Moverse a la Derecha 
                         //si el encontrado es de tipo mario y validacion solo a pasado una ves y el de la derecha no es nulo
                     if (j.dato.tipo==7 && validar==true &&j.izquierda!=null){       
                         
                         temporal3=j.izquierda.dato;
                         j.izquierda.dato=j.dato;
                         j.dato=temporal3;
                         
                         llenarEnFrame();
                         validar=false;   
                                                 
                      System.out.println("Movio Mario Ala Izquierda");
                      }else{
                      //Nada
                      }
                    
                      }
                }
         
     }
     
     public void SaltarSimple(){
         objeto temporal3;
         objeto temporal4;
                boolean validar=true; 
                
                 for(NodoOrtogonal i=ClasePruevas.matriz.l.primero.filas.primero;i!=null;i=i.derecha){
            
                     for(NodoOrtogonal j=i;j!=null;j=j.abajo){
                    
                         //Condiciones para Moverse a la Derecha 
                         //si el encontrado es de tipo mario y validacion solo a pasado una ves y el de la derecha no es nulo
                     if (j.dato.tipo==7 && validar==true &&j.arriba.arriba!=null){       
                         
                         temporal3=j.arriba.arriba.dato;
                         j.arriba.arriba.dato=j.dato;
                         j.dato=temporal3;
                         
                         temporal4=j.abajo.abajo.dato;
                         j.abajo.abajo.dato=j.dato;
                         j.dato=temporal4;
                         
                         
                         llenarEnFrame();
                         validar=false;   
                                                 
                      System.out.println("Movio Mario Saltar");
                      }else{
                      //Nada
                      }
                    
                      }
                }
     }
     
     
             public void ReiniciarClick (){
                       
            
                 ActionListener listener = new ActionListener() {

                     public void actionPerformed(ActionEvent e) {                 
                        
                    ClasePruevas.matriz=temporal4;
                    
                    ventanajuego formulario1=new ventanajuego();
                    formulario1.setBounds(0,0,1500,1000);
                    formulario1.setResizable(false);
                    formulario1.setVisible(true);
                     
                    inicio.setEnabled(true);
                    vidas=3;
                    Monedas=0;
                    
                     }
                 };
                 reiniciar.addActionListener(listener);
                 
             }
}
