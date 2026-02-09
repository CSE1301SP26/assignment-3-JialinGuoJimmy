import java.util.Scanner;

public class BubbleSort {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Please enter size of array: ");
    int arraySize = scan.nextInt();
    int[] arraySort = new int[arraySize];
    int a = 0;
    while (a < arraySize){
        System.out.print("Please enter number: ");
        int num = scan.nextInt();
        arraySort[a] = num;
        a++;
    }
    System.out.print("Given Values: ");
    for (int b = 0; b < arraySize; b++){
        System.out.print(arraySort[b] + " ");
    }
    int n = arraySize;
    for (int i = 0; i < n; i++){
        for (int j = 1; j < n - i; j++){
            if(arraySort[j - 1] > arraySort[j]){
                int numSort = arraySort[j - 1];
                arraySort[j - 1] = arraySort[j];
                arraySort[j] = numSort;
            }
        }
    }
    System.out.println();
    System.out.print("Sorted Values: ");
    for (int b = 0; b < arraySize; b++){
        System.out.print(arraySort[b] + " ");
    }
}
}
