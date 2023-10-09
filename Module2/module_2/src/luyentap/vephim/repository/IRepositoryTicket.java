package luyentap.vephim.repository;

import luyentap.vephim.model.Ticket;

import java.util.List;

public interface IRepositoryTicket {
    void add(Ticket ticket);
    List<Ticket> getList();
    void delete(String maVe);
    List<Ticket> sort();
    void edit(Ticket ticket);
}
