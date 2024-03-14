/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jenniferbueso
 */
public class Nodo {
    int codigo;
    String nombre;
    Nodo siguiente;
    Nodo anterior;
    
    public Nodo(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        siguiente = null;
        anterior = null;
    }
    
    public String toString() {
        return "Nodo{ código: " + codigo + ", nombre: " + nombre + " }";
    }
}
