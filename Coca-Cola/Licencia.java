import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;


public class Licencia extends JFrame implements ActionListener,ChangeListener{
  private JLabel       etiqueta1, etiquetacoca;
  private JCheckBox     check1;
  private JButton      boton1,boton2;
  private JScrollPane  scroll1;
  private JTextArea    casilla1;
  String quienacepta = "";

  public Licencia(){
  setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  setTitle("Licencia de uso");
  setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
  Bienvenida ventanaBienvenida = new Bienvenida();
  quienacepta = ventanaBienvenida.user;
  
  etiqueta1 = new JLabel("TERMINOS Y CONDICIONES");
  etiqueta1.setBounds(215,5,200,30);
  etiqueta1.setFont(new Font("AndaleMono", 1, 14));
  etiqueta1.setForeground(new Color(0,0,0));
  add(etiqueta1);

  casilla1 = new JTextArea();
  casilla1.setEditable(false);
  casilla1.setFont(new Font("AndaleMono", 0, 9));
  casilla1.setText("\n\n          TÉRMINOS Y CONDICIONES" +
                    "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN DE LA APLICACION SIN PREVIA AUTORIZACION." +
                    "\n            B.  PROHIBIDA LA ALTERACION DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRAFICAS." +
                    "\n            C.  EL AUTOR NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                    "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                    "\n          (YO EL CREADOR DEL PROGRAMA), NO SE RESPONSABILIZAN DEL USO QUE USTED" + 
                    "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
                    "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." + 
                    "\n\n          PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" + 
                    "\n          https://www.instagram.com/dev_fer.flores/");
  scroll1 = new JScrollPane (casilla1);
  scroll1.setBounds(10,40,575,200);
  add(scroll1);

  check1 = new JCheckBox ("Yo " + quienacepta + " Acepto");
  check1.setBounds(10,250,300,30);
  check1.addChangeListener(this);
  add(check1);


  boton1 = new JButton ("Continuar");
  boton1.setBounds(10,290,100,30);
  boton1.addActionListener(this);
  boton1.setEnabled(false);
  add(boton1);


  boton2 = new JButton ("No Acepto");
  boton2.setBounds(120,290,100,30);
  boton2.addActionListener(this);
  boton2.setEnabled(true);
  add(boton2); 

  ImageIcon Cocacola = new ImageIcon("images/coca-cola.png");
  etiquetacoca = new JLabel(Cocacola);
  etiquetacoca.setBounds(315,135,300,300);
  add(etiquetacoca);
 }

  public void stateChanged(ChangeEvent eve){
    if(check1.isSelected() == true){
         boton1.setEnabled(true);
         boton2.setEnabled(false);
        } else{
              boton1.setEnabled(false);
              boton2.setEnabled(true);               
              }
 }

  public void actionPerformed(ActionEvent eve){
    if(eve.getSource() == boton1){
        Principal1 ventana1 = new Principal1();
        ventana1.setBounds(0,0,640,535);
        ventana1.setVisible(true);
        ventana1.setResizable(false);
        ventana1.setLocationRelativeTo(null);
        this.setVisible(false);
        }else if(eve.getSource() == boton2){
            Bienvenida ventanabienvenida = new Bienvenida();
            ventanabienvenida.setBounds(0,0,350,450);
            ventanabienvenida.setVisible(true);
            ventanabienvenida.setResizable(false);
            ventanabienvenida.setLocationRelativeTo(null);
            this.setVisible(false);
                  }
 }
  public static void main(String[] args){
    
    Licencia ventanalicencia = new Licencia();
    ventanalicencia.setBounds(0,0,600,360);
    ventanalicencia.setVisible(true);
    ventanalicencia.setResizable(false);
    ventanalicencia.setLocationRelativeTo(null);
 }
}






