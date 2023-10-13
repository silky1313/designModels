package shallowclone;

/**
 * 浅克隆之后引用类型属性没有进行克隆
 * 浅克隆引用类型的字段指向堆内存同一块地址空间
 * 当然String除外
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
