
package mariobross.pkg1.pkg1;

//libreria PAra las IMAGENES -----------|
import java.util.ArrayList;
import javax.swing.ImageIcon;//---------|
import javax.swing.JButton;
import javax.swing.JLabel;
//--------------------------------------|

/**
 *
 * @author carlos
 */

public class objeto extends JButton {
    
    ArrayList <JLabel> NombreArrayList= new ArrayList <JLabel> ();
    
    //-----Atributos------------
    public int id; //id de cada objeto creado
    public String nombre; //nombre q le pone el usuario
    public int tipo;   //el numero que identifica cada objeto
    public ImageIcon imagen;//aqui va la imagen del objeto como Atributo
    public JLabel label;
    public JButton boton;
    
    
    public static int contador=0;//contador para poner ID
    
    public objeto (String nombreusuario, int tipousuario){
        
        //colocar ID cn contador
        this.id = contador;
        contador = contador+1;
       //------------------------|
       //----Case para el tipo----------------------|
       switch (tipousuario){
           case 0: 
               this.tipo = tipousuario; //coloca tipo 0 ES EL NULLO
               this.nombre = "nullo";
               //setear Imagen PENDIENTE
               this.imagen = new javax.swing.ImageIcon(getClass().getResource("/mariobross/Imagenes/null.png"));
               
//setea el label como Atributo del objeto
               label= new JLabel(nombre);//pone el nombre q ingreso
               label.setIcon(imagen);    //pone la imagen del objeto
               
               //setea el Boton como Atributo del objeto
               boton= new JButton("");//pone el nombre q ingreso
               boton.setIcon(imagen);    //pone la imagen del objeto
               break;
               
           case 1: 
               this.tipo = tipousuario; //coloca tipo 1 suelo
               this.nombre = nombreusuario; //coloca nombre
               //setear Imagen
               this.imagen = new javax.swing.ImageIcon(getClass().getResource("/mariobross/Imagenes/suelo1.png"));
               
          //setea el label como Atributo del objeto
               label= new JLabel(nombre);//pone el nombre q ingreso
               label.setIcon(imagen);    //pone la imagen del objeto
            //setea el Boton como Atributo del objeto
               boton= new JButton("");//pone el nombre q ingreso
               boton.setIcon(imagen);    //pone la imagen del objeto   
               
               break;            
            case 2: 
               this.tipo = tipousuario; //coloca tipo 2 pared
               this.nombre = nombreusuario; //coloca nombre
               //setear Imagen
               this.imagen = new javax.swing.ImageIcon(getClass().getResource("/mariobross/Imagenes/pared1.png"));
               
               //setea el label como Atributo del objeto
               label= new JLabel(nombre);//pone el nombre q ingreso
               label.setIcon(imagen);    //pone la imagen del objeto
               //setea el Boton como Atributo del objeto
               boton= new JButton("");//pone el nombre q ingreso
               boton.setIcon(imagen);    //pone la imagen del objeto
            break;
            case 3: 
               this.tipo = tipousuario; //coloca tipo 3 Gomba
               this.nombre = nombreusuario; //coloca nombre
               //setear Imagen
               this.imagen = new javax.swing.ImageIcon(getClass().getResource("/mariobross/Imagenes/kopa22.gif"));
               
               //setea el label como Atributo del objeto
               label= new JLabel(nombre);//pone el nombre q ingreso
               label.setIcon(imagen);    //pone la imagen del objeto
               //setea el Boton como Atributo del objeto
               boton= new JButton("");//pone el nombre q ingreso
               boton.setIcon(imagen);    //pone la imagen del objeto
            break;
            case 4: 
               this.tipo = tipousuario; //coloca tipo 4 Tortuga
               this.nombre = nombreusuario; //coloca nombre
               //setear Imagen
               this.imagen = new javax.swing.ImageIcon(getClass().getResource("/mariobross/Imagenes/tortuga11.gif"));
               
               //setea el label como Atributo del objeto
               label= new JLabel(nombre);//pone el nombre q ingreso
               label.setIcon(imagen);    //pone la imagen del objeto
               //setea el Boton como Atributo del objeto
               boton= new JButton("");//pone el nombre q ingreso
               boton.setIcon(imagen);    //pone la imagen del objeto
            break;    
            case 5: 
               this.tipo = tipousuario; //coloca tipo 5 Ficha
               this.nombre = nombreusuario; //coloca nombre
               //setear Imagen
               this.imagen = new javax.swing.ImageIcon(getClass().getResource("/mariobross/Imagenes/ficha1.png"));
               
               //setea el label como Atributo del objeto
               label= new JLabel(nombre);//pone el nombre q ingreso
               label.setIcon(imagen);    //pone la imagen del objeto
               //setea el Boton como Atributo del objeto
               boton= new JButton("");//pone el nombre q ingreso
               boton.setIcon(imagen);    //pone la imagen del objeto
            break; 
            case 6: 
               this.tipo = tipousuario; //coloca tipo 6 hongo
               this.nombre = nombreusuario; //coloca nombre
               //setear Imagen
               this.imagen = new javax.swing.ImageIcon(getClass().getResource("/mariobross/Imagenes/hongo1.png"));
               
               //setea el label como Atributo del objeto
               label= new JLabel(nombre);//pone el nombre q ingreso
               label.setIcon(imagen);    //pone la imagen del objeto
               //setea el Boton como Atributo del objeto
               boton= new JButton("");//pone el nombre q ingreso
               boton.setIcon(imagen);    //pone la imagen del objeto
            break;  
            case 7: 
               this.tipo = tipousuario; //coloca tipo 7 Personaje
               this.nombre = nombreusuario; //coloca nombre
               //setear Imagen
               this.imagen = new javax.swing.ImageIcon(getClass().getResource("/mariobross/Imagenes/mariolol2.gif"));
               
               //setea el label como Atributo del objeto
               label= new JLabel(nombre);//pone el nombre q ingreso
               label.setIcon(imagen);    //pone la imagen del objeto
               //setea el Boton como Atributo del objeto
               boton= new JButton("");//pone el nombre q ingreso
               boton.setIcon(imagen);    //pone la imagen del objeto
            break;   
            case 8: 
               this.tipo = tipousuario; //coloca tipo 8 Castillo
               this.nombre = nombreusuario; //coloca nombre
               //setear Imagen
               this.imagen = new javax.swing.ImageIcon(getClass().getResource("/mariobross/Imagenes/castillo.png"));
               
               //setea el label como Atributo del objeto
               label= new JLabel(nombre);//pone el nombre q ingreso
               label.setIcon(imagen);    //pone la imagen del objeto
               //setea el Boton como Atributo del objeto
               boton= new JButton("");//pone el nombre q ingreso
               boton.setIcon(imagen);    //pone la imagen del objeto
            break;    
       } 
       //-------Fin Case del Tipo-------------------| 
       
       
       
    }
    
}
