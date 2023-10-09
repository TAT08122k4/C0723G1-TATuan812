package luyentap.vephim.controller;

import luyentap.vephim.model.Ticket;
import luyentap.vephim.service.ITicketService;
import luyentap.vephim.service.Impl.TicketServiceImpl;

import java.util.List;

public class TicketController {
    ITicketService ticketService = new TicketServiceImpl();

    public void add(Ticket ticket) {
        ticketService.add(ticket);
    }

    public List<Ticket> getList() {
        return ticketService.getList();
    }

    public void delete(String maVe) {
        ticketService.delete(maVe);
    }

    public List<Ticket> sort(){
       return ticketService.sort();
    }

    public void edit(Ticket ticket){
        ticketService.edit(ticket);
    }
}
