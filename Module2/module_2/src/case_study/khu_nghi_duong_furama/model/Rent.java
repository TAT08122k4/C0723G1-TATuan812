package case_study.khu_nghi_duong_furama.model;

public class Rent {
    private int numbersContract;
    private int idBooking;
    private int deposits;
    private int paymentAmount;
    public Rent(){}

    public Rent(int numbersContract, int idBooking, int deposits, int paymentAmount) {
        this.numbersContract = numbersContract;
        this.idBooking = idBooking;
        this.deposits = deposits;
        this.paymentAmount = paymentAmount;
    }

    public int getNumbersContract() {
        return numbersContract;
    }

    public void setNumbersContract(int numbersContract) {
        this.numbersContract = numbersContract;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public int getDeposits() {
        return deposits;
    }

    public void setDeposits(int deposits) {
        this.deposits = deposits;
    }

    public int getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(int paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    @Override
    public String toString() {
        return "Thue{" +
                "numbersContract=" + numbersContract +
                ", idBooking=" + idBooking +
                ", deposits=" + deposits +
                ", paymentAmount=" + paymentAmount +
                '}';
    }
}
