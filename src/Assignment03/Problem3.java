package class3;
class Name{
    public String firstName = "First Name";
    private String middleName = "Middle Name";
    protected String lastName = "Last Name";
    public String getMiddleName() {
        return middleName;
    }
    String address= "Address";
}
public class Problem3 {
    public static void main(String[] args) {
        Name obj = new Name();
        System.out.println(obj.firstName);
        System.out.println(obj.getMiddleName());
        System.out.println(obj.lastName);
        System.out.println(obj.address);
    }
}
