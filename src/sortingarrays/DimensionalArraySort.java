package sortingarrays;

public class DimensionalArraySort {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[][] array2d = new int[array.length][array.length];
        int arraySpan = array2d.length;

//      Array rows shifting backwards:
        for (int i = 0; i < arraySpan; i++) {
            for (int j = 0; j < arraySpan; j++) {
                array2d[i][j] = array[(i + j) % arraySpan];
            }
        }
//      Print the resulting array: 
        for (int i = 0; i < arraySpan; i++) {
            int[] row = array2d[i];
            for (int j = 0; j < row.length; j++) {
                int element = row[j];
                System.out.print(element + "");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");
        
//        Array rows shifting forwards: 
        for (int i = 0; i < arraySpan; i++) {
            for (int j = 0; j < arraySpan; j++) {
                array2d[i][(i + j) % arraySpan] = array[j];
            }
        }
//      Print the resulting array: 
        for (int i = 0; i < arraySpan; i++) {
            int[] row = array2d[i];
            for (int j = 0; j < row.length; j++) {
                int element = row[j];
                System.out.print(element + "");
            }
            System.out.println("");
        }
    }
}
