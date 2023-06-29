public class PrimeUsingRecursion {
    public static boolean isPrime(int n,int i){
        if(n<2){
            return false;
        }
        if(i==n){
            return true;
        }
        if(n%i==0){
            return false;
        }
        i++;
        return isPrime(n,i);
    }

    public static void main(String[] args) {
        int i=2;
        boolean isprime=true;
        int n=37;

        isprime=isPrime(n,i);

        String result=isprime?"is a prime number":"not a prime";
        System.out.println(n+ " is " +result);
    }
}
