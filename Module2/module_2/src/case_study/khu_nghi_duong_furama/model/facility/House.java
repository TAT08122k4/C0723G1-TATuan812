package case_study.khu_nghi_duong_furama.model.facility;

public class House extends Facility {
    private String roomStandards;
    private int floors;
    public House(){}

    public House(String roomStandards, int floors) {
        this.roomStandards = roomStandards;
        this.floors = floors;
    }

    public House(int serviceCode, String serviceName, float usableArea, float costs, int maximumQuantity, String typeRental, String roomStandards, int floors) {
        super(serviceCode, serviceName, usableArea, costs, maximumQuantity, typeRental);
        this.roomStandards = roomStandards;
        this.floors = floors;
    }

    public String getRoomStandards() {
        return roomStandards;
    }

    public void setRoomStandards(String tieuChuanPhong) {
        this.roomStandards = tieuChuanPhong;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "House{" +
                "tieuChuanPhong='" + this.roomStandards + '\'' +
                ", floors=" + this.floors +
                "serviceCode=" + getServiceCode() +
                ", serviceName='" + getServiceName() + '\'' +
                ", usableArea=" + getUsableArea() +
                ", costs=" + getCosts() +
                ", maximumQuantity=" + getMaximumQuantity() +
                ", typeRental='" + getTypeRental() + '\'' +
                '}';
    }
}