package case_study.khu_nghi_duong_furama.model.facility;

public class Room extends Furama{
    private String freeService;
    public Room(){}
    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(int serviceCode, String serviceName, float usableArea, float costs, int maximumQuantity, String typeRental, String serviceFree) {
        super(serviceCode, serviceName, usableArea, costs, maximumQuantity, typeRental);
        this.freeService = serviceFree;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "serviceFree='" + freeService + '\'' +
                "serviceCode=" + getServiceCode() +
                ", serviceName='" + getServiceName() + '\'' +
                ", usableArea=" + getUsableArea() +
                ", costs=" + getCosts() +
                ", maximumQuantity=" + getMaximumQuantity() +
                ", typeRental='" + getTypeRental() + '\'' +
                '}';
    }
}
