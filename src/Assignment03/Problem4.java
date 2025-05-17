package class3;
class Address{
    private String city ;
    private int zipCode ;
    public Address(String city, int zipCode){
        this.city = city;
        this.zipCode = zipCode;
    }
    Address(){
        this.city = "Cantonment ";
        this.zipCode = 1206;
    }
    String getCity(){
        return city;
    }
    public String getAddress() {
        return city + zipCode;
    }
}
public class Problem4 {
    public static void main(String[] args) {
        Address obj1 = new Address("Mirpur", 1205);
        System.out.println(obj1.getAddress());

        Address obj2 = new Address();
        System.out.println(obj2.getAddress());

        System.out.println(obj1.getCity());
    }
}
