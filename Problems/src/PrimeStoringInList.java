import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeStoringInList {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int start=s.nextInt();
        int end =s.nextInt();
        List<Integer> primeNumbers=findPrime(start,end);
        System.out.println(primeNumbers);
        //for (int n:primeNumbers){
         //System.out.println("prime numbers are " + n);
        //}

    }
    public static List<Integer> findPrime(int start,int end){
        List<Integer> primes=new ArrayList<>();
        for(int i=start;i<=end;i++){
            if(isPrime(i)){
                primes.add(i);
            }
        }
        return primes;

    }

    public static boolean isPrime(int n){
        if(n<=1){
            System.out.println("not a prime");
            return false;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;

    }
}
