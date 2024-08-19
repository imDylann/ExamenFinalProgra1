/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tikets;

/**
 *
 * @author Student
 */
public class ticket {
    
   private String Tipo;
   private int numero;

    public String getTipo() {
        return Tipo;
    }

    public int getNumero() {
        return numero;
    }

    public ticket(String Tipo, int numero) {
        this.Tipo = Tipo;
        this.numero = numero;
    }
    

    @Override
    public String toString() {
        return "ticket{" + "Tipo=" + Tipo + ", numero=" + numero + '}';
    }

  
    
}
