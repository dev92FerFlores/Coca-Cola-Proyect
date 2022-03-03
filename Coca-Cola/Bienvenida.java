import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener{

  private JTextField UsuarioInicio;
  private JLabel  etiqueta1, etiqueta2,etiqueta3,etiqueta4;
  private JButton boton1;
  public  static String user = "";

  public Bienvenida(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Bienvenido");
    getContentPane().setBackground(new Color(255,0,0));
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    
    ImageIcon imagenletras = new ImageIcon("images/logo-coca.png");
    etiqueta1 = new JLabel(imagenletras);
    etiqueta1.setBounds(25,15,300,150);
    add(etiqueta1);

    etiqueta2 = new JLabel("Sistema de Control Vacacional");
    etiqueta2.setBounds(35,15,300,30);
    etiqueta2.setFont(new Font("andale Mono", 3, 18));
    etiqueta2.setForeground(new Color (255,255,255));
    add(etiqueta2);

    etiqueta3 = new JLabel("Ingrese su nombre");
    etiqueta3.setBounds(45,212,200,30);
    etiqueta3.setFont(new Font("andale Mono", 1, 12));
    etiqueta3.setForeground(new Color (255,255,255));
    add(etiqueta3);

    etiqueta4 = new JLabel("©2021 The Coca-Cola Femsa Company");
    etiqueta4.setBounds(85,375,300,30);
    etiqueta4.setFont(new Font("andale Mono", 1, 12));
    etiqueta4.setForeground(new Color (255,255,255));
    add(etiqueta4);

    UsuarioInicio = new JTextField ();
    UsuarioInicio.setBounds(45,240,255,25);
    UsuarioInicio.setBackground(new Color(224,224,224,244));
    UsuarioInicio.setFont(new Font("andale Mono", 1, 14));
    UsuarioInicio.setForeground(new Color (255,0,0));
    add(UsuarioInicio);

    boton1 = new JButton ("Ingresar");
    boton1.setBounds(125,280,100,30);
    boton1.setBackground(new Color(255,255,255,255));
    boton1.setFont(new Font("andale Mono", 1, 14));
    boton1.setForeground(new Color (255,0,0));
    boton1.addActionListener(this);
    add(boton1);
 }
    public void actionPerformed(ActionEvent  eve){
    if(eve.getSource() == boton1){
        user = UsuarioInicio.getText().trim();
    if(user.equals("")){
         JOptionPane.showMessageDialog(null, "Campo vasio");
      } else{
          Licencia ventanalicencia = new Licencia();
          ventanalicencia.setBounds(0,0,600,360);
          ventanalicencia.setVisible(true);
          ventanalicencia.setResizable(false);
          ventanalicencia.setLocationRelativeTo(null);
          this.setVisible(false);
            } 
      }
 }
  
  public static void main(String[] args){
    Bienvenida ventanabienvenida = new Bienvenida();
    ventanabienvenida.setBounds(0,0,350,450);
    ventanabienvenida.setVisible(true);
    ventanabienvenida.setResizable(false);
    ventanabienvenida.setLocationRelativeTo(null);
 }
}





