
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jenniferbueso
 */
public class ListaEnlazadaDoble {
    Nodo primerNodo;
    Nodo ultimoNodo;
    
    public ListaEnlazadaDoble() {
        primerNodo = null;
        ultimoNodo = null;
    }
    
    private boolean isEmpty() {
        return primerNodo == null;
    }
    
    public void insertarAlInicio(Nodo nuevoNodo) {
        if (isEmpty()) {
            primerNodo = nuevoNodo;
            ultimoNodo = nuevoNodo;
        } else {
            nuevoNodo.siguiente = primerNodo;
            primerNodo.anterior = nuevoNodo;
            primerNodo = nuevoNodo;
        }
    }
    
    public void insertarAlFinal(Nodo nuevoNodo) {
        if (isEmpty()) {
            primerNodo = nuevoNodo;
            ultimoNodo = nuevoNodo;
        } else {
            ultimoNodo.siguiente = nuevoNodo;
            nuevoNodo.anterior = ultimoNodo;
            ultimoNodo = nuevoNodo;
        }
    }
    
    public void eliminarPrimero() {
        if (!isEmpty()) {
            primerNodo = primerNodo.siguiente;
            
            if (primerNodo == null) {
                ultimoNodo = null;
            } else {
                primerNodo.anterior = null;
            }
            JOptionPane.showMessageDialog(null, "Elemento eliminado con éxito.");
        }
    }
    
    public void eliminarUltimo() {
        if (!isEmpty()) {
            ultimoNodo = ultimoNodo.anterior;
            
            if (ultimoNodo == null) {
                primerNodo = null;
            } else {
                ultimoNodo.siguiente = null;
            }
            JOptionPane.showMessageDialog(null, "Elemento eliminado con éxito.");
        }
    }
    
    public void mostrarElementos() {
        Nodo nodoActual = primerNodo;
        StringBuilder elementos = new StringBuilder();
        
        while (nodoActual != null) {
            elementos.append(nodoActual.toString()).append("\n");
            nodoActual = nodoActual.siguiente;
        }
        JOptionPane.showMessageDialog(null, elementos.toString(), "Elementos de la Lista",  JOptionPane.INFORMATION_MESSAGE);
    }
}
