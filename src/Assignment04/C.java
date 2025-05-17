package Class4;

public class C {
    public static void main(String[] args) {
        System.out.println("Do while");
        int i=0;
        do{
            System.out.println("Hello");
            i++;
        }while (i<5);
        System.out.println();
        System.out.println("While");
        int j=10;
        while(j>0){
            System.out.println(j);
            j--;
            if(j==3){
                break;
            }
        }
        System.out.println("For");
        for(i=0;i<11;i++){
            if(i%2==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
