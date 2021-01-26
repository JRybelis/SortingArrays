package sortingarrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arraySort = {15, 42, 15, 98, -2, -47, 10, 3, -14, 36};
        int al = arraySort.length;
        

//      Sorted descending:
        for (int i = 0; i < al - 1; i++) {
            for (int j = i + 1; j < al; j++) {
                if (arraySort[i] < arraySort[j]) {
                    int temp = arraySort[i];
                    arraySort[i] = arraySort[j];
                    arraySort[j] = temp;
                }
            }
        }
        for (int i = 0; i < al; i++) {
            System.out.print(arraySort[i] + "; ");
        }
        System.out.println("");

///      Sorted ascending: 
        for (int i = 0; i < al - 1; i++) {
            for (int j = i + 1; j < al; j++) {
                if (arraySort[i] > arraySort[j]) {
                    int temp = arraySort[i];
                    arraySort[i] = arraySort[j];
                    arraySort[j] = temp;
                }
            }
        }
        for (int i = 0; i < al; i++) {
            System.out.print(arraySort[i] + "; ");
        }
        System.out.println("");
    }
}
