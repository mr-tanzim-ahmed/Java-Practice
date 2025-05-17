package Class4;

public class D {
    public static void main(String[] args) {
        int i;
        for(i=0;i<=20;i++){

            if(i%2==1)
                continue;
            System.out.println("Even: "+i);
        }
        i=0;
        while(true){
            if(i==10) {
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}

