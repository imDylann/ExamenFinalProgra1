/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tikets;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class ListaTickets {
    
    private Queue<ticket> listaticketes;

    private ListaTickets() {
        this.listaticketes = new LinkedList<>();
    }
    
    private static ListaTickets listatick;
    
     public static synchronized ListaTickets getInstance() {
        if (listatick == null) {
            listatick = new ListaTickets();
        }
        return listatick;
    }
        
     public void addTicket(ticket tick){
         this.listaticketes.add(tick);
     }
     
     public void eliminarPos(int pos){
                            

        //List<ticket> list = new ArrayList<>(listatick); //aqui hay que pasar el queue a un list para buscar por valor!!!
        
        int positionToRemove = 2;  
        if (positionToRemove >= 0 && positionToRemove < list.size()) {
            list.remove(positionToRemove);
        }
        
        listatick = new LinkedList<>(list);
     }

    @Override
    public String toString() {
        return "ListaTickets{" + "listaticketes=" + listaticketes + '}';
    }
    
    
}
