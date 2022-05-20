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

/**
 *
 * @author NOTEBOOK
 */
public class Ventana03c extends JFrame{
    
private JPanel jPanel1;
    private List<JLabel> jLabelList;
    private List<JPanel> jPanelList;
    private List<JComboBox> jComboBox1;
    private List<JButton> jButtonList;
   
    
    
    public Ventana03c(String title) throws HeadlessException {
        super(title);
        this.setSize(700,400);
        this.setLocation(30, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
        
    }
    
    public void iniciarComponentes(){
   
        this.jPanel1 = new JPanel();
       this.jPanel1.setBorder(BorderFactory.createTitledBorder(""));
        this.jPanel1.setBackground(Color.CYAN);
        this.jPanel1.setLayout(new GridLayout(8,1));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarBoton();
        this.iniciarCombo();
    }
    
    public void iniciarPaneles(){
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());   
        this.jPanelList.add(new JPanel());
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
        this.jPanel1.add(this.jPanelList.get(6));
        this.jPanel1.add(this.jPanelList.get(7));
        this.jPanel1.add(this.jPanelList.get(8));
        this.jPanel1.add(this.jPanelList.get(9));
        this.jPanel1.add(this.jPanelList.get(10));
        this.jPanel1.add(this.jPanelList.get(11));
        this.jPanel1.add(this.jPanelList.get(12));
        this.jPanel1.add(this.jPanelList.get(13));
        this.jPanel1.add(this.jPanelList.get(14));
        this.jPanel1.add(this.jPanelList.get(15));
        
    }
    
    public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("Periodo Academico: "));
        this.jLabelList.add(new JLabel("Carrera: *"));
        this.jLabelList.add(new JLabel("Modalidad: * "));
        this.jLabelList.add(new JLabel("Sede: * "));
        this.jLabelList.add(new JLabel("Campus:* "));
        this.jLabelList.add(new JLabel("Jornada: * "));
        this.jLabelList.add(new JLabel("Fecha de Registro:"));
        this.jLabelList.add(new JLabel("2022-2022 "));
        this.jLabelList.add(new JLabel("29/04/2022 "));
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(2).add(this.jLabelList.get(1));
        this.jPanelList.get(4).add(this.jLabelList.get(2));
        this.jPanelList.get(6).add(this.jLabelList.get(3));
        this.jPanelList.get(8).add(this.jLabelList.get(4));
        this.jPanelList.get(10).add(this.jLabelList.get(5));
        this.jPanelList.get(12).add(this.jLabelList.get(6));
        this.jPanelList.get(1).add(this.jLabelList.get(7));
        this.jPanelList.get(13).add(this.jLabelList.get(8));
        
    }
 public void iniciarCombo(){
      this.jComboBox1 = new ArrayList<>();
      this.jComboBox1.add(new JComboBox());
      this.jComboBox1.add(new JComboBox());
      this.jComboBox1.add(new JComboBox());
      this.jComboBox1.add(new JComboBox());
      this.jComboBox1.add(new JComboBox());
      
        this.jComboBox1.get(0).addItem("TELECOMUNICACIONES");
        this.jComboBox1.get(0).addItem("COMPUTACION");
        this.jComboBox1.get(0).addItem("ELECTRONICA");
        this.jComboBox1.get(1).addItem("PRECENCIAL");
        this.jComboBox1.get(1).addItem("VIRTUAL");
        this.jComboBox1.get(1).addItem("DISTACIA");
        this.jComboBox1.get(2).addItem("MATRIZ CUENCA");
        this.jComboBox1.get(2).addItem("MATRIZ GUAYAQUIL");
        this.jComboBox1.get(2).addItem("MATRIZ QUITO");
        this.jComboBox1.get(3).addItem("EL VECINO");
        this.jComboBox1.get(3).addItem("CENTENARIO");
        this.jComboBox1.get(3).addItem("SUR");
        this.jComboBox1.get(4).addItem("MATUTINA");
        this.jComboBox1.get(4).addItem("VESPERTINA");
        this.jComboBox1.get(4).addItem("NOPTURNA");
        
        this.jPanelList.get(3).add(this.jComboBox1.get(0));
        this.jPanelList.get(5).add(this.jComboBox1.get(1));
        this.jPanelList.get(7).add(this.jComboBox1.get(2));
        this.jPanelList.get(9).add(this.jComboBox1.get(3));
        this.jPanelList.get(11).add(this.jComboBox1.get(4));
        
    }
 
 public void iniciarBoton(){
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton("Ingresar"));
        
        this.jPanelList.get(15).add(this.jButtonList.get(0));
         
 }
   
}
