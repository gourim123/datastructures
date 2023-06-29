import java.util.Scanner;

public class Prime {
    static void isPrime(int n){
        int i,m=0,flag=0;
        m=n/2;
        if(n==0||n==1){
            System.out.println(n +" is not a prime");
        }
        else {
            for( i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n +" is not a prime");
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println( n+ " is prime");
            }

        }
    }

    public static void main(String[] args) {
        int n,count=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter input");
        n=s.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2) {
            System.out.println(n + " is prime");
        }
        else{
                System.out.println(n + " not prime");
            }

        isPrime(123);
        //isPrime(90);
        //isPrime(17);
        //isPrime(22);
    }
}
