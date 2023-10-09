package luyentap.vephim.service.Impl;

import luyentap.vephim.model.Ticket;
import luyentap.vephim.repository.IRepositoryTicket;
import luyentap.vephim.repository.Impl.TicketRepositoryImpl;
import luyentap.vephim.service.ITicketService;

import java.util.List;

public class TicketServiceImpl implements ITicketService {
    IRepositoryTicket ticketRepository = new TicketRepositoryImpl();


    @Override
    public void add(Ticket ticket) {
      ticketRepository.add(ticket);
    }

    @Override
    public List<Ticket> getList() {
        return ticketRepository.getList();
    }

    @Override
    public void delete(String maVe) {
        ticketRepository.delete(maVe);

    }

    @Override
    public List<Ticket> sort() {
        return ticketRepository.sort();
    }

    @Override
    public void edit(Ticket ticket) {

    }
}
