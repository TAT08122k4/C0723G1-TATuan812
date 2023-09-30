package case_study.khu_nghi_duong_furama.model;

public class Booking {
    private int idBooking;
    private String dateBooking;
    private String rentalStartDate;
    private String rentalEndDate;
    private String idCustomer;
    private int idService;
   public Booking(){}

    public Booking(int idBooking, String dateBooking, String rentalStartDate, String rentalEndDate, String idCustomer, int idService) {
        this.idBooking = idBooking;
        this.dateBooking = dateBooking;
        this.rentalStartDate = rentalStartDate;
        this.rentalEndDate = rentalEndDate;
        this.idCustomer = idCustomer;
        this.idService = idService;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getDateBooking() {
        return dateBooking;
    }

    public void setDateBooking(String dateBooking) {
        this.dateBooking = dateBooking;
    }

    public String getRentalStartDate() {
        return rentalStartDate;
    }

    public void setRentalStartDate(String rentalStartDate) {
        this.rentalStartDate = rentalStartDate;
    }

    public String getRentalEndDate() {
        return rentalEndDate;
    }

    public void setRentalEndDate(String rentalEndDate) {
        this.rentalEndDate = rentalEndDate;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking=" + idBooking +
                ", dateBooking='" + dateBooking + '\'' +
                ", rentalStartDate='" + rentalStartDate + '\'' +
                ", rentalEndDate='" + rentalEndDate + '\'' +
                ", idCustomer=" + idCustomer +
                ", idService=" + idService +
                '}';
    }
}
