import java.util.Scanner;

public class Prime {
    public static void isprime(int n){
        int f =0;
        if(n<0){
            System.out.println("enter valid");
        }
        if(n ==0 && n==1){
            System.out.println("not prime");
        }else{
            for(int i=2;i<n/2;i++){
                if(n%i==0){
                    f =1;
                }
            }
        }
        if(f!=0){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isprime(n);
    }
}
