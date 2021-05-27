import java.util.Scanner;

public class OperationsOnArray {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        FindRange array1 = new FindRange();
        int[] inputArray = new int[array1.sizeOfArray];

        for (int i = 0; i < array1.sizeOfArray; i++) {
            inputArray[i] = sc.nextInt();
        }

        System.out.println(array1.findRange());


    }
}
