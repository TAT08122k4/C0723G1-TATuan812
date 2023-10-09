package luyentap.vephim.repository.Impl;

import luyentap.vephim.model.Ticket;
import luyentap.vephim.repository.IRepositoryTicket;
import luyentap.vephim.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TicketRepositoryImpl implements IRepositoryTicket {
    private final String COMMA = ",";

    private static final String SOURCE_FILE = "E:\\CodeGym FullTime\\Module2\\module_2\\src\\luyentap\\vephim\\data\\vePhim.csv";




    @Override
    public void add(Ticket ticket) {
        List<Ticket> strings = new ArrayList<>();
        strings.add(ticket);
        ReadAndWrite.write(SOURCE_FILE, convertToString(strings), true);
    }

    public List<String> convertToString(List<Ticket> tickets) {
        List<String> stringList = new ArrayList<>();
        for (Ticket str1 : tickets) {
            stringList.add(str1.getMaVe() + COMMA +
                    str1.getTenPhim() + COMMA +
                    Integer.toString(str1.getGia()) + COMMA +
                    str1.getXuatChieu() + COMMA + str1.getNgayChieu());
        }
        return stringList;
    }

    public List<Ticket> convertToObj(List<String> strings) {
        List<Ticket> tickets = new ArrayList<>();
        String[] data;
        for (String str : strings) {
            if (str.isEmpty()){
                continue;
            }
            data = str.split(",");
            tickets.add(new Ticket(data[0], data[1], Integer.parseInt(data[2]), data[3], data[4]));
        }
        return tickets;
    }

    @Override
    public List<Ticket> getList() {
        List<Ticket> tickets = convertToObj(ReadAndWrite.read(SOURCE_FILE));
        tickets.sort(new Comparator<Ticket>() {
            @Override
            public int compare(Ticket o1, Ticket o2) {
                return o2.getGia() - o1.getGia();
            }
        });
        ReadAndWrite.write(SOURCE_FILE, convertToString(tickets), false);

        return tickets;
    }

    @Override
    public void delete(String maVe) {
        List<Ticket> tickets = getList();
        for (Ticket ticket : tickets) {
            if (ticket.getMaVe().equals(maVe)) {
                tickets.remove(ticket);
                ReadAndWrite.write(SOURCE_FILE, convertToString(tickets), false);
            }
        }

    }

    @Override
    public List<Ticket> sort() {
        List<Ticket> tickets = getList();
        tickets.sort(new Comparator<Ticket>() {
            @Override
            public int compare(Ticket o1, Ticket o2) {
                return o1.getGia() - o2.getGia();
            }
        });
        return tickets;
    }

    @Override
    public void edit(Ticket ticket) {
        List<Ticket> tickets = getList();
        for (Ticket ticket1: tickets) {
            if (ticket.getMaVe().equals(ticket1.getMaVe())){
                ticket1.setMaVe(ticket.getMaVe());
                ticket1.setTenPhim(ticket.getTenPhim());
                ticket1.setGia(ticket.getGia());
                ticket1.setXuatChieu(ticket.getXuatChieu());
                ticket1.setNgayChieu(ticket.getNgayChieu());
            }
        }

    }
}
