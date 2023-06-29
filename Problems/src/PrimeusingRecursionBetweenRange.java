import java.util.Scanner;

public class PrimeusingRecursionBetweenRange {
    public static boolean isPrime(int num){
        if(num<2){
            return false;
        }
        return checkPrime(num,2);
    }
    public static boolean checkPrime(int num,int div){
        if(div>Math.sqrt(num))
            return true;
        if(num %div==0)
            return false;
        return checkPrime(num,div+1);
    }
    public static void printPrime(int start,int end){
        if(start>end){
            return;
        }
        if(isPrime(start))
            System.out.println(start);
        printPrime(start+1,end);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int start=s.nextInt();
        int end =s.nextInt();

        System.out.println("prime between " + start+" and " +end);
        printPrime(start,end);


        }
    }

