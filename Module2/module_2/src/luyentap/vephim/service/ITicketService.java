package luyentap.vephim.service;

import luyentap.vephim.model.Ticket;

import java.util.List;

public interface ITicketService {
    void add(Ticket ticket);
    List<Ticket> getList();
    void delete(String maVe);
    List<Ticket> sort();
    void edit(Ticket ticket);
}
