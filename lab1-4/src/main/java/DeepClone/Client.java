package DeepClone;

/**
 * 深克隆之后实体对象应该也是进行了一份克隆
* */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("silky road", "13");

        Customer customerA = new Customer(1000, address);
        Customer customerB = (Customer) customerA.clone();

        customerB.address.setSerialNumber("14");

        System.out.println("深拷贝后的结果");
        System.out.println(customerA);
        System.out.println(customerB);
    }
}
