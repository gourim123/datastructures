import java.util.HashSet;

public class FirstRepeatingNumInArray {
    public static Integer firstRepeat(int arr[]){
        HashSet<Integer> hs=new HashSet<>();
        for(int num:arr){
            if(hs.contains(num)){
                return num;
            }
            hs.add(num);
        }
        return null;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,5,6,0,9};
        Integer fs=firstRepeat(arr);
        System.out.println(fs);
    }
}
