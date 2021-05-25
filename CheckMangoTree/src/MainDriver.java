public class MainDriver {

    public static void main(String args[]){


        //for tree number 17 with 5 rows and 4 columns
        CheckMangoTree cm1=new CheckMangoTree(5,4,17);
        cm1.isItMango();

        //for tree number 19 with 5 rows and invalid column
        CheckMangoTree cm2=new CheckMangoTree(5,-1,19);
        cm2.isItMango();

        //for an invalid tree number
        CheckMangoTree cm3=new CheckMangoTree(5,4,25);
        cm3.isItMango();
    }
}

