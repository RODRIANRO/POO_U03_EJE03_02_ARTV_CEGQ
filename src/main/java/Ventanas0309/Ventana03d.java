/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventanas0309;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author NOTEBOOK
 */
public class Ventana03d extends JFrame {
private JPanel jPanel1;
     private List<JPanel> jPanelList;
     private List<JLabel> jLabelList;
     private List<JTextField> jTextFieldList;
     private List<JComboBox> jComboBox1;
     private List<JButton> jButtonList;
     private JCheckBox jCheckBox;
     

    public Ventana03d(String title) throws HeadlessException {
        super(title);
        this.setSize(700,600);
        this.setLocation(600, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }
     
    public void iniciarComponentes(){
        this.jPanel1=new JPanel();
        this.jPanel1.setBackground(Color.WHITE);
        this.jPanel1.setLayout(new GridLayout(14,1));
        this.IniciarPaneles();
        this.IniciarEtiquetas();
        this.IniciarCombo();
        this.IniciarBoton();
        this.IniciarTexto();
        this.IniciarCheck();
     }
     
     public void IniciarPaneles(){
         this.jPanelList=new ArrayList<>();
         for(var i=0;i<40;i++)
         this.jPanelList.add(new JPanel());
         
         this.jPanelList.get(1).setBackground(Color.WHITE);
         this.jPanelList.get(2).setBackground(Color.WHITE);
         this.jPanelList.get(4).setBackground(Color.WHITE);
         this.jPanelList.get(5).setBackground(Color.WHITE);
         this.jPanelList.get(7).setBackground(Color.WHITE);
         this.jPanelList.get(8).setBackground(Color.WHITE);
         this.jPanelList.get(10).setBackground(Color.WHITE);
         this.jPanelList.get(11).setBackground(Color.WHITE);
         this.jPanelList.get(13).setBackground(Color.WHITE);
         this.jPanelList.get(14).setBackground(Color.WHITE);
         this.jPanelList.get(16).setBackground(Color.WHITE);
         this.jPanelList.get(17).setBackground(Color.WHITE);
         this.jPanelList.get(19).setBackground(Color.WHITE);
         this.jPanelList.get(20).setBackground(Color.WHITE);
         this.jPanelList.get(22).setBackground(Color.WHITE);
         this.jPanelList.get(23).setBackground(Color.WHITE);
         this.jPanelList.get(25).setBackground(Color.WHITE);
         this.jPanelList.get(26).setBackground(Color.WHITE);
         this.jPanelList.get(28).setBackground(Color.WHITE);
         this.jPanelList.get(29).setBackground(Color.WHITE);
         this.jPanelList.get(31).setBackground(Color.WHITE);
         this.jPanelList.get(32).setBackground(Color.WHITE);
         this.jPanelList.get(34).setBackground(Color.WHITE);
         this.jPanelList.get(35).setBackground(Color.WHITE);
         this.jPanelList.get(37).setBackground(Color.WHITE);
         this.jPanelList.get(38).setBackground(Color.WHITE);
         this.jPanelList.get(39).setBackground(Color.WHITE);
         //this.jPanelList.get(40).setBackground(Color.WHITE);
        
         for(var i=0;i<40;i++)
         this.jPanel1.add(this.jPanelList.get(i));
       
     }
      public void IniciarEtiquetas(){
         this.jLabelList= new ArrayList<>();
         this.jLabelList.add(new JLabel("Periodo Académico: ")); 
         this.jLabelList.add(new JLabel("2022-2022 "));
         this.jLabelList.add(new JLabel("Sede: "));
         this.jLabelList.add(new JLabel("MATRIZ CUENCA "));
         this.jLabelList.add(new JLabel("Campus/Extension:"));
         this.jLabelList.add(new JLabel("EL VECINO "));
         this.jLabelList.add(new JLabel("Modalidad:"));
         this.jLabelList.add(new JLabel("PRESENCIAL "));
         this.jLabelList.add(new JLabel("Carrera: "));    
         this.jLabelList.add(new JLabel("AGROPECUARIA"));
         this.jLabelList.add(new JLabel("Codigo de Proyecto: "));
         this.jLabelList.add(new JLabel("TELECOMUNICACIONES [REDISEÑO]- NUEVA"));  
         this.jLabelList.add(new JLabel("Asignatura:"));
         this.jLabelList.add(new JLabel("E-CV-IAG-003 PROGRAMACION "));
         this.jLabelList.add(new JLabel("Nombre de grupo:* "));  
         this.jLabelList.add(new JLabel("Cupos por Grupo:*"));
         this.jLabelList.add(new JLabel("Autorización calficación sobre 100:"));
         this.jLabelList.add(new JLabel("Seleccionar Jornada del Grupo: "));  
         this.jLabelList.add(new JLabel("Oferta para estudiantes: ")); 
         this.jLabelList.add(new JLabel("Aplica cambia de Grupo: ")); 
        
         
         this.jPanelList.get(0).add(this.jLabelList.get(0),BorderLayout.EAST);
         this.jPanelList.get(1).add(this.jLabelList.get(1),BorderLayout.WEST);
         this.jPanelList.get(3).add(this.jLabelList.get(2),BorderLayout.EAST);
         this.jPanelList.get(4).add(this.jLabelList.get(3),BorderLayout.WEST);
         this.jPanelList.get(6).add(this.jLabelList.get(4),BorderLayout.EAST);
         this.jPanelList.get(7).add(this.jLabelList.get(5),BorderLayout.WEST);
         this.jPanelList.get(9).add(this.jLabelList.get(6),BorderLayout.EAST);
         this.jPanelList.get(10).add(this.jLabelList.get(7),BorderLayout.WEST);
         this.jPanelList.get(12).add(this.jLabelList.get(8),BorderLayout.EAST);
         this.jPanelList.get(13).add(this.jLabelList.get(9),BorderLayout.WEST);
         this.jPanelList.get(15).add(this.jLabelList.get(10),BorderLayout.EAST);
         this.jPanelList.get(16).add(this.jLabelList.get(11),BorderLayout.WEST);
         this.jPanelList.get(18).add(this.jLabelList.get(12),BorderLayout.EAST);
         this.jPanelList.get(19).add(this.jLabelList.get(13),BorderLayout.WEST);
         this.jPanelList.get(21).add(this.jLabelList.get(14),BorderLayout.EAST);
         this.jPanelList.get(24).add(this.jLabelList.get(15),BorderLayout.EAST);
         this.jPanelList.get(27).add(this.jLabelList.get(16),BorderLayout.EAST);
         this.jPanelList.get(30).add(this.jLabelList.get(17),BorderLayout.EAST);
         this.jPanelList.get(33).add(this.jLabelList.get(18),BorderLayout.WEST);
         this.jPanelList.get(36).add(this.jLabelList.get(19),BorderLayout.WEST);
     }    
     
     public void IniciarCombo(){
         this.jComboBox1= new ArrayList<>();
         this.jComboBox1.add(new JComboBox());
         this.jComboBox1.add(new JComboBox());
         this.jComboBox1.add(new JComboBox());
       
         this.jComboBox1.get(0).addItem("NO");
         this.jComboBox1.get(0).addItem("SI");
         this.jComboBox1.get(1).addItem("Jornadas disponibles");
         this.jComboBox1.get(1).addItem("DIURNO");
         this.jComboBox1.get(1).addItem("DESPERTINO");
         this.jComboBox1.get(1).addItem("NOCTURNO");
         this.jComboBox1.get(2).addItem("NO");
         this.jComboBox1.get(2).addItem("SI");
        
        this.jPanelList.get(28).add(this.jComboBox1.get(0));
        this.jPanelList.get(31).add(this.jComboBox1.get(1)); 
        this.jPanelList.get(37).add(this.jComboBox1.get(2));
     }
     
     public void IniciarBoton(){
       this.jButtonList = new ArrayList<>();
       this.jButtonList.add(new JButton());
       this.jButtonList.add(new JButton());
       
       this.jButtonList.get(0).setText("Guardar");
       this.jButtonList.get(1).setText("Cancelar");
       
       this.jPanelList.get(39).add(this.jButtonList.get(0));
       this.jPanelList.get(39).add(this.jButtonList.get(1));
     }
     
     public void IniciarTexto(){
          this.jTextFieldList= new ArrayList<>();
          this.jTextFieldList.add(new JTextField ());
          this.jTextFieldList.add(new JTextField ());
          this.jTextFieldList.get(0).setColumns(10);
          this.jTextFieldList.get(1).setColumns(10);
          
          this.jPanelList.get(22).add(this.jTextFieldList.get(0));
          this.jPanelList.get(25).add(this.jTextFieldList.get(1));   
     }
     
     public void IniciarCheck(){
          this.jCheckBox = new JCheckBox();
         this.jCheckBox.add(new JCheckBox("Nuevos"));
         this.jPanelList.get(34).add(this.jCheckBox);
     }
  }