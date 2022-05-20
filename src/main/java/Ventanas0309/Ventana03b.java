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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author NOTEBOOK
 */
public class Ventana03b extends JFrame{
    
private JPanel jPanel1;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JPanel> jPanelList;
    
   
    
    
    public Ventana03b(String title) throws HeadlessException {
        super(title);
        this.setSize(700,400);
        this.setLocation(30, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
        
       
    }
    
    public void iniciarComponentes(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setBorder(BorderFactory.createTitledBorder("Personal"));
        this.jPanel1.setBackground(Color.BLUE);
        this.jPanel1.setLayout(new GridLayout(9,2));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarTextos();
  
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
        this.jPanel1.add(this.jPanelList.get(16));
        this.jPanel1.add(this.jPanelList.get(17));
        
    }
    
    public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("Apellidos: "));
        this.jLabelList.add(new JLabel("Guaman Quintuna: "));
        this.jLabelList.add(new JLabel("Nombre: "));
        this.jLabelList.add(new JLabel("Cesar Esteban: "));
        this.jLabelList.add(new JLabel("Nacionalidad: "));
        this.jLabelList.add(new JLabel("Ecuatoriano: "));
        this.jLabelList.add(new JLabel("Genero: "));
        this.jLabelList.add(new JLabel("Masculino: "));
        this.jLabelList.add(new JLabel("Correo Electronico Personal: "));
        this.jLabelList.add(new JLabel("cesarr93@live.com: "));
        this.jLabelList.add(new JLabel("Fecha de Nacimiento: "));
        this.jLabelList.add(new JLabel("7 de Abril 1999: "));
        this.jLabelList.add(new JLabel("Telefono Domicilio: "));
        this.jLabelList.add(new JLabel("0999800164: "));
        this.jLabelList.add(new JLabel("Telefono Celular: "));
        this.jLabelList.add(new JLabel("0999800164: "));
        this.jLabelList.add(new JLabel("Whatsapp: "));
        
        
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(1).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jLabelList.get(2));
        this.jPanelList.get(3).add(this.jLabelList.get(3));
        this.jPanelList.get(4).add(this.jLabelList.get(4));
        this.jPanelList.get(5).add(this.jLabelList.get(5));
        this.jPanelList.get(6).add(this.jLabelList.get(6));
        this.jPanelList.get(7).add(this.jLabelList.get(7));
        this.jPanelList.get(8).add(this.jLabelList.get(8));
        
        this.jPanelList.get(9).add(this.jLabelList.get(9));
        this.jPanelList.get(10).add(this.jLabelList.get(10));
        this.jPanelList.get(11).add(this.jLabelList.get(11));
        this.jPanelList.get(12).add(this.jLabelList.get(12));
        this.jPanelList.get(13).add(this.jLabelList.get(13));
        this.jPanelList.get(14).add(this.jLabelList.get(14));
        this.jPanelList.get(15).add(this.jLabelList.get(15));
        this.jPanelList.get(16).add(this.jLabelList.get(16));
    
    }
    
    public void iniciarTextos(){
        this.jTextFieldList = new ArrayList<>();
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.get(0).setColumns(10);
        
        this.jPanelList.get(17).add(this.jTextFieldList.get(0));
    }
 
}