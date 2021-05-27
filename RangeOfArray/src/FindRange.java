import java.util.Scanner;

public class FindRange {
    Scanner scanner = new Scanner(System.in);
    public int sizeOfArray;
    public int[] inputArray = new int[sizeOfArray];

    public FindRange() {
        this.sizeOfArray = scanner.nextInt();
    }

    public int findRange() {

        int minElement = Integer.MAX_VALUE;
        int maxElement = Integer.MIN_VALUE;

        for (int i = 0; i < sizeOfArray; i++) {
            if (inputArray[i] < minElement)
                minElement = inputArray[i];

            if (inputArray[i] > maxElement)
                maxElement = inputArray[i];
        }
        return (maxElement - minElement);
    }


}
