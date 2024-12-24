import java.util.Scanner;
public class evenornot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter you number:");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("evennumber");
        }else{
           System.out.println("odd number");
        }
    }
}
