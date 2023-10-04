package case_study.khu_nghi_duong_furama.model.facility;

public class Villa extends Facility {
    private String roomStandards;
    private float poolArea;
    private int floors;
    public Villa(){

    }

    public Villa(String roomStandards, float poolArea, int floors) {
        this.roomStandards = roomStandards;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    public Villa(int serviceCode, String serviceName, float usableArea, float costs, int maximumQuantity, String typeRental, String roomStandards, float poolArea, int floors) {
        super(serviceCode, serviceName, poolArea, usableArea, maximumQuantity, typeRental);
        this.roomStandards = roomStandards;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    public String getRoomStandards() {
        return roomStandards;
    }

    public void setRoomStandards(String roomStandards) {
        this.roomStandards = roomStandards;
    }

    public float getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(float poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "room standards='" + roomStandards + '\'' +
                ", poolArea=" + poolArea +
                ", Floors=" + floors +
                "serviceCode=" + getServiceCode() +
                ", serviceName='" + getServiceName() + '\'' +
                ", usableArea=" + getUsableArea() +
                ", costs=" + getCosts() +
                ", maximumQuantity=" + getMaximumQuantity() +
                ", typeRental='" + getTypeRental() + '\'' +
                '}';
    }
}
