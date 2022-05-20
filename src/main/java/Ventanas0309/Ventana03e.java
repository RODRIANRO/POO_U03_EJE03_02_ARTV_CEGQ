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
public class Ventana03e extends JFrame {
    private JPanel jPanel1;
    private List<JPanel> jPanelList;
    private List<JLabel> jLabelList;
    private List<JComboBox> jComboBoxList;

    public Ventana03e(String title) throws HeadlessException {
        super(title);
        this.setSize(1500,200);
        this.setLocation(30, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }
    public void iniciarComponentes(){
        this.jPanel1=new JPanel();
        this.jPanel1.setBorder(BorderFactory.createTitledBorder(""));
        //this.jPanel1.setBackground(Color.BLUE);
        this.jPanel1.setBackground(Color.WHITE);
        this.jPanel1.setLayout(new GridLayout(3,3));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarCombo();
     }
    
    public void iniciarPaneles(){
         this.jPanelList=new ArrayList<>();
         this.jPanelList.add(new JPanel());
         this.jPanelList.add(new JPanel());
         this.jPanelList.add(new JPanel());
         this.jPanelList.add(new JPanel());
         this.jPanelList.add(new JPanel());
         this.jPanelList.add(new JPanel());
         this.jPanelList.add(new JPanel());
         
         this.jPanelList.get(0).setBackground(Color.WHITE);
         this.jPanelList.get(1).setBackground(Color.WHITE);
         this.jPanelList.get(2).setBackground(Color.WHITE);
         this.jPanelList.get(3).setBackground(Color.WHITE);
         this.jPanelList.get(4).setBackground(Color.WHITE);
         this.jPanelList.get(5).setBackground(Color.WHITE);
         this.jPanelList.get(6).setBackground(Color.WHITE);
         
         this.jPanel1.add(this.jPanelList.get(0));
         this.jPanel1.add(this.jPanelList.get(1));
         this.jPanel1.add(this.jPanelList.get(2));
         this.jPanel1.add(this.jPanelList.get(3));
         this.jPanel1.add(this.jPanelList.get(4));
         this.jPanel1.add(this.jPanelList.get(5));
         this.jPanel1.add(this.jPanelList.get(6)); 
     }
     
     public void iniciarEtiquetas(){
         this.jLabelList= new ArrayList<>();
         this.jLabelList.add(new JLabel("Sede: "));
         this.jLabelList.add(new JLabel("Campus/Extension:"));
         this.jLabelList.add(new JLabel("Carrera: "));
         this.jLabelList.add(new JLabel("Código del proyecto: "));
         this.jLabelList.add(new JLabel("Modalidad: "));
         this.jLabelList.add(new JLabel("Periodo Académico: "));
         this.jLabelList.add(new JLabel("Fecha inicio clases: "));
         this.jLabelList.add(new JLabel("     20/05/2022 "));         
         
         this.jPanelList.get(0).add(this.jLabelList.get(0));
         this.jPanelList.get(1).add(this.jLabelList.get(1));
         this.jPanelList.get(2).add(this.jLabelList.get(2));
         this.jPanelList.get(3).add(this.jLabelList.get(3));
         this.jPanelList.get(4).add(this.jLabelList.get(4));
         this.jPanelList.get(5).add(this.jLabelList.get(5));
         this.jPanelList.get(6).add(this.jLabelList.get(6));
         this.jPanelList.get(6).add(this.jLabelList.get(7));
     }
     
     public void iniciarCombo(){
         this.jComboBoxList= new ArrayList<>();
         this.jComboBoxList.add(new JComboBox());
         this.jComboBoxList.add(new JComboBox());
         this.jComboBoxList.add(new JComboBox());
         this.jComboBoxList.add(new JComboBox());
         this.jComboBoxList.add(new JComboBox());
         this.jComboBoxList.add(new JComboBox());
        
         this.jComboBoxList.get(0).addItem("Seleccione una opción");
         this.jComboBoxList.get(0).addItem("MATRIZ CUENCA");
         this.jComboBoxList.get(0).addItem("MATRIZ GUAYAQUIL");
         this.jComboBoxList.get(0).addItem("MATRIZ QUITO");
         this.jComboBoxList.get(1).addItem("EL VECINO");
         this.jComboBoxList.get(1).addItem("CENTENARIO");
         this.jComboBoxList.get(1).addItem("SUR");
         this.jComboBoxList.get(2).addItem("Seleccione una opción");
         this.jComboBoxList.get(2).addItem("ARQUITECTURA");
         this.jComboBoxList.get(2).addItem("ECONOMIA");
         this.jComboBoxList.get(2).addItem("INGENIERIA ELECTRONICA Y AUTOMATIZACION");
         this.jComboBoxList.get(2).addItem("INGENIERIA EN TELECOMUNICACIONES");
         this.jComboBoxList.get(2).addItem("INGENIERIA MECATRONICA");
         this.jComboBoxList.get(3).addItem("Seleccione una opción");
         this.jComboBoxList.get(3).addItem("CONTABILIDAD Y AUDITORIA");
         this.jComboBoxList.get(3).addItem("PEDAGOGIA FISICA Y DEPORTE ");
         this.jComboBoxList.get(3).addItem("INGENIERIA ELECTRONICA Y AUTOMATIZACION[Rediseño]");
         this.jComboBoxList.get(3).addItem("INGENIERIA EN TELECOMUNICACIONES[Rediseño]");
         this.jComboBoxList.get(3).addItem("INGENIERIA MECATRONICA[Rediseño]");
         this.jComboBoxList.get(4).addItem("Seleccione una opción");
         this.jComboBoxList.get(4).addItem("PRESENCIAL");
         this.jComboBoxList.get(4).addItem("SEMIPRESENCIAL");
         this.jComboBoxList.get(4).addItem("VIRTUAL");
         this.jComboBoxList.get(5).addItem("2021-2022");
         this.jComboBoxList.get(5).addItem("2022-2023");
        
        this.jPanelList.get(0).add(this.jComboBoxList.get(0));
        this.jPanelList.get(1).add(this.jComboBoxList.get(1)); 
        this.jPanelList.get(2).add(this.jComboBoxList.get(2));
        this.jPanelList.get(3).add(this.jComboBoxList.get(3));
        this.jPanelList.get(4).add(this.jComboBoxList.get(4));
        this.jPanelList.get(5).add(this.jComboBoxList.get(5));
     }
     
}