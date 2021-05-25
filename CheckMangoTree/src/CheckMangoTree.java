public class CheckMangoTree{

    private int row;

    private int column;

    private int tree_num;

    public CheckMangoTree(int row, int column ,int tree_num){
        this.row=row;

        this.column=column;

        this.tree_num=tree_num;
    }

    public void isItMango(){

        if( row<1 || column<1 ){
            System.out.println("Invalid Parameters");
            return;
        }
        if( tree_num<1 || tree_num> (row * column) ){
            System.out.println("Tree Number does not exist");
            return;
        }
        if(tree_num % column ==0 || tree_num % column==1 || tree_num<column){
            System.out.println("Yes! It is a mango tree") ;
        }
        else {
            System.out.println("No! It is not a mango tree") ;
        }


    }




}

