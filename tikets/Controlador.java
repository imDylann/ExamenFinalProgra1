/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tikets;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Student
 */
public class Controlador {
      private HashMap<String,Integer> ticketCounters;
      private ListaTickets litaticketes;

    public Controlador() {
      ticketCounters = new HashMap<>();
        this.litaticketes = ListaTickets.getInstance();
    }
      
       public ticket generar(String tipo) {
          
       if (!ticketCounters.containsKey(tipo)) {
        ticketCounters.put(tipo, 0);
    }
        int numero = ticketCounters.get(tipo) + 1;
        ticketCounters.put(tipo, numero);

        ticket t = new ticket(tipo, numero);
        litaticketes.addTicket(t);
        return t;
    }

  public ticket Atender(){
      //en proceso ASJDJASD
    return null;  
  }
}