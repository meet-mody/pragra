package Array;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = new int[]{10,20,30,40,50};
        //int [] arr = new int[]{1,3,2};

        System.out.println("\nOriginal Array:");
        for (int element : arr) {
            System.out.print(element + " ");
        }

        reverseArray(arr);
        minValue(arr);
        maxValue(arr);
        sumArray(arr);

        System.out.println("\nReversed Array:");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    public static void reverseArray (int[] array) {

        int start=0;
        int end=array.length-1;

        while(start<end){
            int temp = array[start];
            array[start]=array[end];
            array[end]=temp;
            start ++;
            end --;
        }
    }

    public static void minValue (int[] array){

        int min=array[0];

        for(int element:array){
            if(element<min){
                min=element;
            }
        }
        System.out.println("\nMinimum value in the array: " + min);
    }

    public static void maxValue (int[] array){

        int max=array[0];

        for(int element:array){
            if(element>max){
                max=element;
            }
        }
        System.out.println("\nMaximum value in the array: " + max);
    }

    public static void sumArray (int[] array){

        int sum=0;

        for(int element:array){
            sum+=element;
        }
        System.out.println("\nSum of all elements in array: " + sum);
    }
}
