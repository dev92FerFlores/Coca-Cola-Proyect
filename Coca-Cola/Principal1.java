import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal1 extends JFrame implements ActionListener {
  
  private JMenuBar     mb;
  private JMenu        menuOpciones,menuCalcular,menuAcercaDe,menuFondos;
  private JMenuItem    miCalculo,miRojo,miNegro,miElCreador,miSalir,Minuevo; 
  private JLabel       etiquetaLogo, etiquetaBienvenido, etiquetaTitle, etiquetaNombre, etiquetaAPaterno, etiquetaAMaterno, 
                       etiquetaDepartamento, etiquetaAntiguedad, etiquetaResultado,labelfooter;
  private JTextField   NombreTrabajador, APaternoTrabajador,AMaternoTrabajador;
  private JComboBox    cbDepartamento,cbAntiguedad;
  private JScrollPane  scroll1;
  private JTextArea    areatex1;
  String userAdmin = "";

  public Principal1() {
    //constructor 
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Pantalla principal");
    getContentPane().setBackground(new Color(255,0,0));
    setIconImage (new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    Bienvenida ventanabienvenida = new Bienvenida();
    userAdmin = ventanabienvenida.user;

    //Barra de menu
    mb = new JMenuBar();
    mb.setBackground(new Color(255,0,0));
    setJMenuBar(mb);

    //pestaña opcioes
    menuOpciones = new JMenu("Opciones");
    menuOpciones.setBackground(new Color(255,0,0));
    menuOpciones.setFont(new Font("Andale Mono", 1, 14));
    menuOpciones.setForeground(new Color(255, 255, 255));
    mb.add(menuOpciones);

    //pestaña Calcular
    menuCalcular = new JMenu("Calcular");
    menuCalcular.setBackground(new Color (255,0,0));
    menuCalcular.setFont(new Font("Andale Mono", 1, 14));
    menuCalcular.setForeground(new Color(255,255,255));
    mb.add(menuCalcular);
    
    //pestaña Acerca del programa
    menuAcercaDe = new JMenu ("Acerca de");
    menuAcercaDe.setBackground(new Color (255,0,0));
    menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
    menuAcercaDe.setForeground(new Color(255,255,255));
    mb.add(menuAcercaDe);

    //Pestaña Wallpapaer
    menuFondos = new JMenu("Wallpaper");
    menuFondos.setFont(new Font("Anadale Mono", 1, 14));
    menuFondos.setForeground(new Color (255,0,0));
    menuOpciones.add(menuFondos);

    //submenu Vacaciones de pestaña calcular
    miCalculo = new JMenuItem("Vacaciones");
    miCalculo.setFont(new Font("Andale Mono", 1, 14));
    miCalculo.setForeground(new Color(255,0,0));
    menuCalcular.add(miCalculo);
    miCalculo.addActionListener(this);

    //submenu color Rojo de pestaña Wallpaper
      miRojo = new JMenuItem("Rojo");
      miRojo.setFont(new Font("Andale Mono", 1, 14));
      miRojo.setForeground(new Color(255, 0, 0));
      menuFondos.add(miRojo);
      miRojo.addActionListener(this);

    //submenu color Negro de pestaña Wallpaper
      miNegro = new JMenuItem("Negro");
      miNegro.setFont(new Font("Andale Mono", 1, 14));
      miNegro.setForeground(new Color(255, 0, 0));
      menuFondos.add(miNegro);
      miNegro.addActionListener(this); 
  
    //submenu de Acerca del programa
    miElCreador = new JMenuItem ("El creador");
    miElCreador.setFont(new Font("Andale Mono", 1, 14));
    miElCreador.setForeground(new Color (255,0,0));
    menuAcercaDe.add(miElCreador);
    miElCreador.addActionListener(this);

    //Limpiar los campos
    Minuevo = new JMenuItem("Nuevo");
    Minuevo.setFont(new Font("Andale Mono", 1, 14));
    Minuevo.setForeground(new Color(255,0,0));
    menuOpciones.add(Minuevo);
    Minuevo.addActionListener(this);

    //Para salir del Programa
    miSalir = new JMenuItem("Salir");
    miSalir.setFont(new Font("Andale Mono", 1, 14));
    miSalir.setForeground(new Color(255, 0, 0));
    menuOpciones.add(miSalir);
    miSalir.addActionListener(this);


    //aqui se posicionaran las etiquetas empezando por el logo empresarioal
    //logo empresarial
    ImageIcon Logo =  new ImageIcon ("images/logo-coca.png");
    etiquetaLogo = new JLabel(Logo);
    etiquetaLogo.setBounds(5,5,250,100);
    add(etiquetaLogo);

    //etiqueta con leyenda Bienvenido
    etiquetaBienvenido = new JLabel("Bienvenido "+userAdmin);
    etiquetaBienvenido.setBounds(280,30,300,50);
    etiquetaBienvenido.setFont(new Font ("Andale Mono", 1, 32));
    etiquetaBienvenido.setForeground(new Color (255,255,255));
    add(etiquetaBienvenido);

    //titulo de la ventana
    etiquetaTitle = new JLabel("Datos del Trabajador para el calculo de vacaciones");
    etiquetaTitle.setBounds(45,140,900,25);
    etiquetaTitle.setFont(new Font("Andale Mono", 0, 14));
    etiquetaTitle.setForeground(new Color(255,255,255));
    add(etiquetaTitle);

    //etiqueta campo nombre
    etiquetaNombre = new JLabel("Nombre(s) Completo(s)");
    etiquetaNombre.setBounds(25,188,180,25);
    etiquetaNombre.setFont(new Font("Andale Mono",1, 12));
    etiquetaNombre.setForeground(new Color(255,255,255));
    add(etiquetaNombre);

    //caja de texto para Nombre del trabajador
    NombreTrabajador = new JTextField();
    NombreTrabajador.setBounds(25,213,150,25);
    NombreTrabajador.setBackground(new java.awt.Color(224, 224, 224));
    NombreTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
    NombreTrabajador.setForeground(new java.awt.Color(255, 0, 0));
    add(NombreTrabajador);

    //etiqueta de apellido paterno
    etiquetaAPaterno = new JLabel("Aperrido Paterno");
    etiquetaAPaterno.setBounds(25,248,180,25);
    etiquetaAPaterno.setFont(new Font("AndaleMono", 1, 12));
    etiquetaAPaterno.setForeground(new Color(255,255,255));
    add(etiquetaAPaterno);

    //Cajade texto para apellido paterno
    APaternoTrabajador = new JTextField ();
    APaternoTrabajador.setBounds(25,273,150,25);
    APaternoTrabajador.setBackground(new java.awt.Color(224, 224, 224));
    APaternoTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
    APaternoTrabajador.setForeground(new java.awt.Color(255, 0, 0));
    add(APaternoTrabajador);

    //etiqueta de apellido Materno
    etiquetaAMaterno = new JLabel("Aperrido Materno");
    etiquetaAMaterno.setBounds(25,308,180,25);
    etiquetaAMaterno.setFont(new Font("AndaleMono", 1, 12));
    etiquetaAMaterno.setForeground(new Color(255,255,255));
    add(etiquetaAMaterno);

    //Cajade texto para apellido Materno
    AMaternoTrabajador = new JTextField ();
    AMaternoTrabajador.setBounds(25,334,150,25);
    AMaternoTrabajador.setBackground(new java.awt.Color(224, 224, 224));
    AMaternoTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
    AMaternoTrabajador.setForeground(new java.awt.Color(255, 0, 0));
    add(AMaternoTrabajador);
    
    //Etiquea para el departamento
    etiquetaDepartamento = new JLabel("Selecciona el Departamento:");
    etiquetaDepartamento.setBounds(220,188,180,25);
    etiquetaDepartamento.setFont(new Font("Andale Mono", 1, 12));
    etiquetaDepartamento.setForeground(new Color(255, 255, 255));
    add(etiquetaDepartamento);

    //combo box de los departamentos Listados
    cbDepartamento = new JComboBox();
    cbDepartamento.setBounds(220,213,220,25);
    cbDepartamento.setBackground(new java.awt.Color(224, 224, 224));
    cbDepartamento.setFont(new java.awt.Font("Andale Mono", 1, 14));
    cbDepartamento.setForeground(new java.awt.Color(255, 0, 0));
    add(cbDepartamento);
    cbDepartamento.addItem("");
    cbDepartamento.addItem("Atencion al Cliente");
    cbDepartamento.addItem("Departamento de Logistica");
    cbDepartamento.addItem("Departamento de Gerencia");
    
    //Etiqueta de antiguedad
    etiquetaAntiguedad = new JLabel("Selecciona la Antigüedad:");
    etiquetaAntiguedad.setBounds(220,248,180,25);
    etiquetaAntiguedad.setFont(new Font("Andale Mono", 1, 12));
    etiquetaAntiguedad.setForeground(new Color(255, 255, 255));
    add(etiquetaAntiguedad);
    
    //Combo de antiguedad y su Listado
    cbAntiguedad = new JComboBox();
    cbAntiguedad.setBounds(220,273,220,25);
    cbAntiguedad.setBackground(new java.awt.Color(224, 224, 224));
    cbAntiguedad.setFont(new java.awt.Font("Andale Mono", 1, 14));
    cbAntiguedad.setForeground(new java.awt.Color(255, 0, 0));
    add(cbAntiguedad);
    cbAntiguedad.addItem("");
    cbAntiguedad.addItem("1 years de servicio");
    cbAntiguedad.addItem("2 a 6 years de servicio");
    cbAntiguedad.addItem("7 years o más de servicio");

    //Etiqueta de resultados 
    etiquetaResultado = new JLabel("Resultado del Cálculo:");
    etiquetaResultado.setBounds(220,307,180,25);
    etiquetaResultado.setFont(new Font("Andale Mono", 1, 12));
    etiquetaResultado.setForeground(new Color(255, 255, 255));
    add(etiquetaResultado);

    //Caja de testo donde se muestra el resultado con un scroll, scroll1 areatex1
    areatex1 = new JTextArea();
    areatex1.setEditable(false);
    areatex1.setBackground(new Color(224, 224, 224));
    areatex1.setFont(new Font("Andale Mono", 1, 11));
    areatex1.setForeground(new Color(255, 0, 0));
    areatex1.setText("\n   El calculo de las vacaciones es.");
    scroll1 = new JScrollPane(areatex1);
    scroll1.setBounds(220,333,385,90);
    add(scroll1);

    //Etiqueta de la leyenda CopyRigth de CocaCola
      labelfooter = new JLabel("©2021 The Coca-Cola FEMSA Company | Todos los derechos reservados");
      labelfooter.setBounds(135,445,500,30);
      labelfooter.setFont(new java.awt.Font("Andale Mono", 1, 12));
      labelfooter.setForeground(new java.awt.Color(255, 255, 255));
      add(labelfooter);
 }
  //Eventos
   public void actionPerformed(ActionEvent eve){
        if (eve.getSource() == miCalculo) {
   	   String nameWork = NombreTrabajador.getText();
   	   String AP    = APaternoTrabajador.getText();
   	   String AM    = AMaternoTrabajador.getText();
   	   String Depto = cbDepartamento.getSelectedItem().toString();
   	   String Anti  = cbAntiguedad.getSelectedItem().toString();
           
           //condicionantes de formulario en blanco
           if(NombreTrabajador.equals("") || APaternoTrabajador.equals("") || AMaternoTrabajador.equals("") || 
              cbDepartamento.equals("") || cbAntiguedad.equals("")){

              JOptionPane.showMessageDialog(null, "Uno o varios campos estan vacios.");
  }
              else{
                    if(Depto.equals("Atencion al Cliente")){
                             if(Anti.equals("1 years de servicio")){
                                  areatex1.setText("\n   El trabajador " + nameWork + " " + AP + " " + AM + 
                                                  "\n   quien labora en "+ Depto + " " + "con " + Anti +
                                                  "\n   tiene derecho a 6 dias de vacaciones.");
                               }
                             if(Anti.equals("2 a 6 years de servicio")){
                                  areatex1.setText("\n   El trabajador " + nameWork + " " + AP + " " + AM + 
                                                  "\n   quien labora en "+ Depto + " " + "con " + Anti +
                                                  "\n   tiene derecho a 14 dias de vacaciones.");
                               }
                             if(Anti.equals("7 years o más de servicio")){
                                  areatex1.setText("\n   El trabajador " + nameWork + " " + AP + " " + AM + 
                                                  "\n   quien labora en "+ Depto + " " + "con " + Anti +
                                                  "\n   tiene derecho a 28 dias de vacaciones.");
                               }
                      }
                       
                     if(Depto.equals("Departamento de Logistica")){
                             if(Anti.equals("1 years de servicio")){
                                  areatex1.setText("\n   El trabajador " + nameWork + " " + AP + " " + AM + 
                                                  "\n   quien labora en "+ Depto + " " + "con " + Anti +
                                                  "\n   tiene derecho a 7 dias de vacaciones.");
                               }
                             if(Anti.equals("2 a 6 years de servicio")){
                                  areatex1.setText("\n   El trabajador " + nameWork + " " + AP + " " + AM + 
                                                  "\n   quien labora en "+ Depto + " " + "con " + Anti +
                                                  "\n   tiene derecho a 15 dias de vacaciones.");
                               }
                             if(Anti.equals("7 years o más de servicio")){
                                  areatex1.setText("\n   El trabajador " + nameWork + " " + AP + " " + AM + 
                                                  "\n   quien labora en "+ Depto + " " + "con " + Anti +
                                                  "\n   tiene derecho a 22 dias de vacaciones.");
                               }
                      }
                       
                     if(Depto.equals("Departamento de Gerencia")){
                             if(Anti.equals("1 years de servicio")){
                                  areatex1.setText("\n   El trabajador " + nameWork + " " + AP + " " + AM + 
                                                  "\n   quien labora en "+ Depto + " " + "con " + Anti +
                                                  "\n   tiene derecho a 10 dias de vacaciones.");
                               }
                             if(Anti.equals("2 a 6 years de servicio")){
                                  areatex1.setText("\n   El trabajador " + nameWork + " " + AP + " " + AM + 
                                                  "\n   quien labora en "+ Depto + " "+ "con " + Anti +
                                                  "\n   tiene derecho a 20 dias de vacaciones.");
                               }
                             if(Anti.equals("7 years o más de servicio")){
                                  areatex1.setText("\n   El trabajador " + nameWork + " " + AP + " " + AM + 
                                                  "\n   quien labora en "+ Depto + " " + "con " + Anti +
                                                  "\n   tiene derecho a 30 dias de vacaciones.");
                               }

                      }
                  }
        }
        if (eve.getSource() == miRojo){
            getContentPane().setBackground(new Color(255,0,0));
        }
        if (eve.getSource() == miNegro){
            getContentPane().setBackground(new Color(0,0,0));
        }
        if (eve.getSource() == Minuevo){	
   	   NombreTrabajador.setText("");
   	   APaternoTrabajador.setText("");
   	   AMaternoTrabajador.setText("");
   	   cbDepartamento.setSelectedIndex(0);
   	   cbAntiguedad.setSelectedIndex(0);
           areatex1.setText("\n   El calculo de las vacaciones es.");
        }
	if (eve.getSource() == miSalir){
            Bienvenida ventanabienvenida = new Bienvenida();
            ventanabienvenida.setBounds(0,0,350,450);
            ventanabienvenida.setVisible(true);
            ventanabienvenida.setResizable(false);
            ventanabienvenida.setLocationRelativeTo(null);
            this.setVisible(false);
	}
        if (eve.getSource() == miElCreador){
       
           JOptionPane.showMessageDialog(null, "Desarrollado por Fernando Hernandez Flores\n"+
                                               "sistema creado con fines educativos 11/03/2021\n"+
                                               "https://www.instagram.com/dev_fer.flores/?hl=es-la\n");
        }
 } 
    //estructura de la ventana 
    public static void main(String args[]) {
        Principal1 ventana1 = new Principal1();
        ventana1.setBounds(0,0,640,535);
        ventana1.setVisible(true);
        ventana1.setResizable(false);
        ventana1.setLocationRelativeTo(null);
    }
}