package Assignment05;
class Encapsle {
        private String name;
        private int id;
        public  Encapsle(String name, int id) {
            this.name = name;
            this.id = id;
        }
        public String getName() {

            return name;
        }

        public void setName(String name) {

            this.name = name;
        }

        public int getId() {

            return id;
        }

        public void setId(int id) {

            this.id = id;
        }

}
public class Encapsulation{
    public static void main(String[] args) {
        Encapsle obj = new Encapsle("SQA", 101);
        System.out.println("Name: " + obj.getName()+" ID: "+obj.getId());
        obj.setName("QA ");
        obj.setId(102);
        System.out.println("Rename: " + obj.getName()+" ID: "+obj.getId());
    }
}
