package shallowclone;

public class Customer implements Cloneable{
    public double price;
    public Address address;

    public Customer(double price, Address address){
           this.price = price;
           this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "price=" + price +
                ", address=" + address +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //浅克隆就是不对实体属性进行克隆
        return super.clone();
    }

}
