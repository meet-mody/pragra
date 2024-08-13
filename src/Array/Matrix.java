package Array;

public class Matrix {

    public static void main(String[] args) {
        int arr1[][] = new int [3][3];
        generateArray(arr1);

        System.out.print("Array1: ");
        displayMatrix(arr1);

        int arr2[][] = new int[3][3];
        generateArray(arr2);

        System.out.print("\nArray2: ");
        displayMatrix(arr2);

        System.out.print("\nArray3: ");
        addMatrix(arr1, arr2);

    }

    public static void generateArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }

    public static void addMatrix(int[][] array1, int[][] array2){
        int array3[][] = new int [3][3];
        for(int i=0; i<array1.length; i++){
            for(int j=0; j<array1[i].length; j++){
                array3[i][j] = array1[i][j] + array2[i][j];
            }
        }
        displayMatrix(array3);
    }
}
