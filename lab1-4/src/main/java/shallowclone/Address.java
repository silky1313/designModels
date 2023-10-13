package shallowclone;

public class Address{
    public String road;
    public String serialNumber;

    public Address(String road, String serialNumber){
        this.road = road;
        this.serialNumber = serialNumber;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    @Override
    public String toString() {
        return "Address{" +
                "road='" + road + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
