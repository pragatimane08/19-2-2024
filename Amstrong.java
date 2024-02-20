import java.util.Scanner;
class Amstrong{
    public  static int amr(int n){
        int temp = n;
        int rem,sum =0;
        while(n >0){
            rem = n % 10;
            sum = sum + rem*rem*rem;
            n = n/10;
        }
        if(temp == sum){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = amr(n);
        System.out.println(result);

    }
}
