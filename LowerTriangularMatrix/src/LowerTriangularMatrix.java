import java.util.Scanner;

public class LowerTriangularMatrix {
    Scanner scanner=new Scanner(System.in);
    private int rowCount;
    private int columnCount;
    private int[][] input2DArray;

    public LowerTriangularMatrix(){
        System.out.println("Enter the row count:");
        this.rowCount = scanner.nextInt();

        System.out.println("Enter the column count:");
        this.columnCount = scanner.nextInt();
    }

    public void isUpperRect(){

        if(rowCount<0 || columnCount<0){
            System.out.println("Invalid Parameters");
            return;
        }

        if(rowCount!=columnCount){
            System.out.println("Not a Square Matrix");
            return;
        }

        input2DArray=new int[this.rowCount][this.columnCount];
        System.out.println("Enter the elements:");

        for(int i=0;i<rowCount;i++){
            for(int j=0;j<columnCount;j++){
                this.input2DArray[i][j]=scanner.nextInt();

                if(i<j && input2DArray[i][j]!=0) {
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}
