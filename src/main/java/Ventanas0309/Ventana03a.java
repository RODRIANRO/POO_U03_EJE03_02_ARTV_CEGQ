/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventanas0309;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author NOTEBOOK
 */
public class Ventana03a extends JFrame{
    
    private JPanel jPanel1;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private List<JComboBox> jComboBox1;
    
    
    public Ventana03a(String title) throws HeadlessException {
     super(title);
        this.setSize(500, 600);
        this.setLocation(50, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
       
    }
    
    public void iniciarComponentes(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setBorder(BorderFactory.createTitledBorder(""));
         this.jPanel1.setBackground(Color.BLUE);
        this.jPanel1.setLayout(new GridLayout(6,1));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarTextos();
        this.iniciarBotones();
        this.iniciarCombo();
        //this.iniciarCombo2();
    }
    
    public void iniciarPaneles(){
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
  
        this.jPanel1.add(this.jPanelList.get(0));
        this.jPanel1.add(this.jPanelList.get(1));
        this.jPanel1.add(this.jPanelList.get(2));
        this.jPanel1.add(this.jPanelList.get(3));
        this.jPanel1.add(this.jPanelList.get(4));
        this.jPanel1.add(this.jPanelList.get(5));
        
    }
    
    public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("Seleccione una Cede: "));
        this.jLabelList.add(new JLabel("Tipo Documento : "));
        this.jLabelList.add(new JLabel("Ingrese su Identificacion: "));
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(1).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jLabelList.get(2));
        

    }
    
    public void iniciarTextos(){
        this.jTextFieldList = new ArrayList<>();
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.get(0).setColumns(10);
        this.jTextFieldList.get(2).setColumns(30);
        this.jPanelList.get(2).add(this.jTextFieldList.get(2));
    }
    
    public void iniciarBotones(){
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton("Ingresar"));
        
        this.jPanelList.get(5).add(this.jButtonList.get(0)); 
    }
  
    public void iniciarCombo(){
        this.jComboBox1 = new ArrayList<>();
        this.jComboBox1.add(new JComboBox());
        this.jComboBox1.add(new JComboBox());
         
        this.jComboBox1.get(0).addItem("MATRIZ CUENCA");
        this.jComboBox1.get(0).addItem("MATRIZ GUAYAQUIL");
        this.jComboBox1.get(0).addItem("MATRIZ QUITO");
        this.jComboBox1.get(1).addItem("CÉDULA");
        this.jComboBox1.get(1).addItem("PASAPORTE");
       
        this.jPanelList.get(0).add(this.jComboBox1.get(0));
        this.jPanelList.get(1).add(this.jComboBox1.get(1));
        
       
    } 
}   
  
    
    

