import java.util.ArrayList;

public class RepeatingNum {
    public static void findDuplicates(int arr[]){
        boolean ifPresent=false;
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=0;i< arr.length-1;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    if(ls.contains(arr[i])){
                        break;}
                    else {

                        ls.add(arr[i]);
                        ifPresent=true;

                    }
                }
            }
        }
        if (ifPresent==true){
            System.out.println(ls + "");
        }
        else
            System.out.println("no duplicates are found");

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,};

        findDuplicates(arr);
    }
}
