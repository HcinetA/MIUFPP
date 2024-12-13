package Lesson9;


import java.util.LinkedList;
import java.util.Queue;

public class TicketingSystem {
    private  Queue<Ticket> tiquetque = new LinkedList<>();
    private int nextId =1;

    public  void addTicket (String description){
        Ticket ticket = new Ticket(nextId++,description);
        tiquetque.offer(ticket);
        System.out.println("ticket id" + ticket.getId() + " " +"Description" +  " " + ticket.getDescription());

    }

    public void processTicket(){
        if (tiquetque.isEmpty()){
            System.out.println("no ticket to process");
        }
        Ticket ticket = tiquetque.poll();
        System.out.println("procecced ticket id " +ticket.getId());
    }

    public void viewTicket(){
        if(tiquetque.isEmpty()){
            System.out.println("no ticket to prcoess");
        }
        Ticket ticket =tiquetque.peek();
        System.out.println("TicketID " + ticket.getId() + " " + "Description"  +  " " + ticket.getDescription());
    }


    public static void main(String[] args) {
        TicketingSystem system = new TicketingSystem();
        system.addTicket("test ticket");
        system.addTicket("test ticket2");
        system.processTicket();
        system.viewTicket();


    }



}


