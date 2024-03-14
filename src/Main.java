
import java.awt.Cursor;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jenniferbueso
 */
public class Main {
    public static ListaEnlazadaDoble lista = new ListaEnlazadaDoble();
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lista Enlazada Doble");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1));
        
        JButton insertarInicioBtn = new JButton("Insertar al Inicio");
        JButton insertarFinalBtn = new JButton("Insertar al Final");
        JButton eliminarInicioBtn = new JButton("Eliminar Primero");
        JButton eliminarFinalBtn = new JButton("Eliminar Último");
        JButton mostrarBtn = new JButton("Mostrar Elementos");
        
        insertarInicioBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        insertarFinalBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        eliminarInicioBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        eliminarFinalBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        mostrarBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        insertarInicioBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = JOptionPane.showInputDialog("Ingrese un nombre:");
                String codigoStr = JOptionPane.showInputDialog("Ingrese un código:");
                int codigo = Integer.parseInt(codigoStr);
                Nodo nuevoNodo = new Nodo(codigo, nombre);
                lista.insertarAlInicio(nuevoNodo);
            }
        });
        
        insertarFinalBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = JOptionPane.showInputDialog("Ingrese un nombre:");
                String codigoStr = JOptionPane.showInputDialog("Ingrese un código:");
                int codigo = Integer.parseInt(codigoStr);
                Nodo nuevoNodo = new Nodo(codigo, nombre);
                lista.insertarAlFinal(nuevoNodo);
            }
        });
        
        eliminarInicioBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lista.eliminarPrimero();
            }
        });

        eliminarFinalBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lista.eliminarUltimo();
            }
        });

        mostrarBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lista.mostrarElementos();
            }
        });
        
        panel.add(insertarInicioBtn);
        panel.add(insertarFinalBtn);
        panel.add(eliminarInicioBtn);
        panel.add(eliminarFinalBtn);
        panel.add(mostrarBtn);
        
        frame.add(panel);
        frame.setVisible(true);
    }
}
