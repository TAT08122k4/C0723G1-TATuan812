package luyentap.vephim.view;

import luyentap.vephim.controller.TicketController;
import luyentap.vephim.model.Ticket;
import luyentap.vephim.utils.Regex;

import java.util.List;
import java.util.Scanner;

public class TicketView {
    Scanner sc = new Scanner(System.in);
    TicketController ticketController = new TicketController();

    public void displayMainMenu() {
        System.out.println("==Menu==");
        System.out.println("1.Add new Ticket");
        System.out.println("2.Display Tickets");
        System.out.println("3.Delete a Ticket");
        System.out.println("4.Edit Ticket");
        System.out.println("5.Exit");
    }

    public void runPrograming() {
        int choose = 0;
        do {
            displayMainMenu();
            choose = choose(0, 6);
            switch (choose) {
                case 1:
                    ticketController.add(addTicket());
                    break;
                case 2:
                    List<Ticket> tickets = ticketController.getList();
                    for (Ticket t : tickets) {
                        System.out.println(t);
                    }
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    ticketController.edit(edit());
                    break;
                case 5:
                    System.exit(1);
                    break;
            }
        } while (choose > 0 && choose < 6);

    }

    public boolean kiemTraMaVe(String maVe) {
        List<Ticket> tickets = ticketController.getList();
        for (Ticket t : tickets) {
            if (t.getMaVe().equals(maVe)) {
                System.out.println("Mã Vé Tồn Tại");
                return false;
            }
        }
        return true;
    }

    public int choose(int low, int high) {
        int choose = 0;
        do {
            try {
                choose = Integer.parseInt(sc.nextLine());
                if (choose < low || choose > high) {
                    System.out.println("Enter ur choose " + "Lower than " + high + " and " + " Bigger than " + low);
                }
                if (choose > 0 && choose < high) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Enter Integer Plzzz");
            }
        } while (true);
        return choose;
    }

    public Ticket addTicket() {
        return new Ticket(inputMaVe(), inputTenPhim(), nhapGia(), xuatChieu(), ngayChieu());
    }

    public List<Ticket> displayTicket() {
        return ticketController.getList();
    }

    public String inputMaVe() {
        String maVe = null;
        do {
            System.out.println("Nhập Mã Vé Khách Hàng");
            maVe = sc.nextLine();
            if (!Regex.kiemTraMaVe(maVe)) {
                System.err.println("Vui lòng nhập đúng định dạng MV-XXXX");
            }
        } while (!Regex.kiemTraMaVe(maVe) || !kiemTraMaVe(maVe));
        return maVe;
    }

    public String inputTenPhim() {
        int choose = 0;
        String name = null;
        do {
            System.out.println("1.Harry Potter");
            System.out.println("2.Tom & Jerry");
            System.out.println("3.One Piece");
            System.out.println("4.Naruto");
            System.out.println("Nhập 1->4");
            choose = choose(0, 6);
            switch (choose) {
                case 1:
                    name = "Harry Potter";
                    break;
                case 2:
                    name = "Tom & Jerry";
                    break;
                case 3:
                    name = "One Piece";
                    break;
                case 4:
                    name = "Naruto";
                    break;
                case 5:
                    break;
            }
        } while (choose < 0 || choose > 6);
        return name;
    }

    public int nhapGia() {
        int choose = 0;
        int gia = 0;
        do {
            System.out.println("1.vé thường 50k");
            System.out.println("2.vé thường + combo 100k");
            System.out.println("3.vé vip 70k");
            System.out.println("4.vé vip + combo 120k");
            choose = choose(0, 5);
            switch (choose) {
                case 1:
                    gia = 50;
                    break;
                case 2:
                    gia = 100;
                    break;
                case 3:
                    gia = 70;
                    break;
                case 4:
                    gia = 120;
                    break;
                case 5:
                    break;
            }
        } while (choose < 1 || choose > 5);
        return gia;
    }

    public String xuatChieu() {
        int choose = 0;
        String xuatChieu = null;
        do {
            System.out.println("1.8h30 - 10h30");
            System.out.println("2.14h30 - 16h30");
            System.out.println("3.17h - 19h30");
            System.out.println("4.19h30 - 21h30");
            choose = choose(0, 5);
            switch (choose) {
                case 1:
                    xuatChieu = "8h30 - 10h30";
                    break;
                case 2:
                    xuatChieu = "2h30 - 4h30";
                    break;
                case 3:
                    xuatChieu = "17h - 19h";
                    break;
                case 4:
                    xuatChieu = "19h30 - 21h30";
                    break;
                case 5:
                    break;
            }
        } while (choose < 1 || choose > 5);
        return xuatChieu;
    }

    public String ngayChieu() {
        int choose = 0;
        String ngayChieu = null;
        do {
            System.out.println("1.Thứ hai");
            System.out.println("2.Thứ ba");
            System.out.println("3.Thứ tư");
            System.out.println("4.Thứ năm");
            System.out.println("5.Thứ sáu");
            System.out.println("6.Thứ bảy");
            System.out.println("7.Chủ Nhật");
            choose = choose(0, 8);
            switch (choose) {
                case 1:
                    ngayChieu = "Thứ hai";
                    break;
                case 2:
                    ngayChieu = "Thứ ba";
                    break;
                case 3:
                    ngayChieu = "Thứ tư";
                    break;
                case 4:
                    ngayChieu = "Thứ năm";
                    break;
                case 5:
                    ngayChieu = "Thứ sáu";
                    break;
                case 6:
                    ngayChieu = "Thứ bảy";
                    break;
                case 7:
                    ngayChieu = "Chủ nhật";
                    break;
            }
        } while (choose < 1 || choose > 8);
        return ngayChieu;
    }
    public boolean checkMaVe(String maVe){
        List<Ticket> tickets = ticketController.getList();
        boolean flag = false;
        for (Ticket ticket: tickets) {
            if (ticket.getMaVe().equals(maVe)){
                flag = true;
            }
        }
        return flag;
    }
    public String inputMaVeDelete() {
        String maVe = null;
        do {
            System.out.println("Nhập Mã Vé Khách Hàng");
            maVe = sc.nextLine();
            if (!Regex.kiemTraMaVe(maVe)) {
                System.err.println("Vui lòng nhập đúng định dạng MV-XXXX");
            }
            if (!kiemTraMaVe(maVe)){
                System.out.println("Không tìm thấy");
            }
        } while (!Regex.kiemTraMaVe(maVe) || kiemTraMaVe(maVe));
        return maVe;
    }
    public Ticket search(String maVe){
        List<Ticket> tickets = ticketController.getList();
        for (Ticket ticket : tickets){
            if (ticket.getMaVe().equals(maVe)){
                return ticket;
            }
        }
        return null;
    }
    public Ticket edit(){
        Ticket ticket = null;
        String maVe = inputMaVe();
        String tenPhim = null;
        int gia = 0;
        String xuatChieu = null;
        String ngayChieu = null;
//        System.out.println(search(maVe));
        int choose = 0;
        do {
            System.out.println("==Edit==");
            System.out.println("1.Tên Phim");
            System.out.println("2.Giá");
            System.out.println("3.Xuất Chiếu");
            System.out.println("4.Ngày chiếu");
            if (!kiemTraMaVe(maVe)) {
                choose = choose(0,5);
                switch (choose) {
                    case 1:
                        tenPhim = inputTenPhim();
                        break;
                    case 2:
                        gia = nhapGia();
                        break;
                    case 3:
                        xuatChieu = xuatChieu();
                        break;
                    case 4:
                        ngayChieu = ngayChieu();
                        break;
                    default:
                        break;
                }
            }
        }while (choose > 0 && choose < 5);
        return ticket = new Ticket(maVe,tenPhim,gia,xuatChieu,ngayChieu);

    }
    public void delete(){
        List<Ticket> tickets = ticketController.getList();
        String maVeDelete = inputMaVeDelete();
        if (checkMaVe(maVeDelete)){
            for (Ticket ticket: tickets) {
                if (ticket.getMaVe().equals(maVeDelete)){
                   ticketController.delete(maVeDelete);
                }
            }
        }else {
            System.out.println("Mã vé Không tồn tại");
        }
    }
}
