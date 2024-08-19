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
        ArrayList<ticket> list = new ArrayList<>(listaticketes);
        if (pos >= 0 && pos < list.size()) {
            list.remove(pos);      //logicamente esta bien solamente hay que ver si la transformacion de queue - array y viceversa funciona
        } 
        listaticketes = new LinkedList<>(list);
     }
     
     public void eliminarVal(int val){
         ticket tic = new ticket("P",val);
         ticket tick = new ticket("C",val);
          ticket ticke = new ticket("A",val);
             if(listaticketes.contains(tic)){
                 listaticketes.remove(tic);
             }else if(listaticketes.contains(tick)){
                 listaticketes.remove(tick);
             }else{
                 listaticketes.remove(ticke);
             }
     }

    
     
    @Override
    public String toString() {
        return "ListaTickets{" + "listaticketes=" + listaticketes + '}';
    }
    
    
}
