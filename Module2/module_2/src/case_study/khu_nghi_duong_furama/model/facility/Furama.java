package case_study.khu_nghi_duong_furama.model.facility;

public abstract class Furama {
    private int serviceCode;
    private String serviceName;
    private float usableArea;
    private float costs;
    private int maximumQuantity;
    private String typeRental;

    public Furama() {
    }

    public Furama(int serviceCode, String serviceName, float usableArea, float costs, int maximumQuantity, String typeRental) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.costs = costs;
        this.maximumQuantity = maximumQuantity;
        this.typeRental = typeRental;
    }

    public int getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(int serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public float getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(float usableArea) {
        this.usableArea = usableArea;
    }

    public float getCosts() {
        return costs;
    }

    public void setCosts(float costs) {
        this.costs = costs;
    }

    public int getMaximumQuantity() {
        return maximumQuantity;
    }

    public void setMaximumQuantity(int maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }

    public String getTypeRental() {
        return typeRental;
    }

    public void setTypeRental(String typeRental) {
        this.typeRental = typeRental;
    }

    @Override
    public String toString() {
        return "Furama{" +
                "serviceCode=" + serviceCode +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", costs=" + costs +
                ", maximumQuantity=" + maximumQuantity +
                ", typeRental='" + typeRental + '\'' +
                '}';
    }
}
