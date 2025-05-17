package Class4;

public class B {
    public static void main(String[] args) {
        int age = 30;
        System.out.println("You are: ");
        if (age > 17) {
            if (age < 60) {
                System.out.println("Yong");
            }
        }
        else if (age < 18) {
            System.out.println("Children");
        }
        else if(age<60){
            System.out.println("Old");
        }
        else {
            System.out.println("Invalid");
        }
        String subject = "math";
        System.out.println("Which subject do you like?");
        switch (subject){
            case "bangla":
                System.out.println("Bangla");
                break;
            case "english":
                System.out.println("English");
                break;
            case "math":
                System.out.println("Math");
                break;
            default:
                System.out.println("No!");
        }


    }
}