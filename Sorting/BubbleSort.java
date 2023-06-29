package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={7,8,3,1,2};
        //bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        //selectionsort(arr);

        insertionSort(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void insertionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++) {
            int j = i + 1;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }

        }

    }
    static void selectionsort(int arr[]){
        for (int i=0;i< arr.length-1;i++){
            int smallest=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;

        }

    }
    static void bubbleSort(int arr[]){
        for (int i=0;i< arr.length;i++){
            for (int j=1;j< arr.length-i;j++){
                //swap
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }

            }
        }
    }
}
