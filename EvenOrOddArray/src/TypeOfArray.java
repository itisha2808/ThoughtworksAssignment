import java.util.Scanner;

public class TypeOfArray {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        int sizeOfArray;
        sizeOfArray = scanner.nextInt();
        int[] inputArray = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            inputArray[i] = scanner.nextInt();
        }

        switch (findType(inputArray)) {
            case 1:
                System.out.println("The array is even");
            case 2:
                System.out.println("The array is odd");
            case 3:
                System.out.println("The array is mixed");
        }
    }

    public static int findType(int[] inputArray) {
        int odd = 0;
        int even = 0;

        for (int i = 0; i < inputArray.length; i++) {

            if (inputArray[i] % 2 == 0)
                even++;

            else if (inputArray[i] % 2 != 0)
                odd++;
        }

        if (odd == inputArray.length)
            return 1;
        else if (even == inputArray.length)
            return 2;
        else
            return 3;
    }
}
