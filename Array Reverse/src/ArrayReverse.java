import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Input size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);

        arr = new int[size];
        for (int i = 0; i < arr.length;i++){
            System.out.print("arr["+i+"] = ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Elements in array: ");
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.print("Element in reverse array: ");
        ReverseArray(arr);
    }

    public static void ReverseArray(int[] x){
        for (int i = 0; i < x.length/2; i++){
            int temp = x[i];
            x[i] = x[x.length-1-i];
            x[x.length-1-i] = temp;

        }
        for (int j : x) {
            System.out.print(j + "\t");
        };
    }
}
