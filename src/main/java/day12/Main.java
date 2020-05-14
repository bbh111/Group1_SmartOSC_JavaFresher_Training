package day12;

class ChangeIt  {

    static void doIt(int[] z) {

        z =new int[]{1,2,3,4,5,5,6,7,8,89,9};

    }

}

class TestIt {

    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 4, 5};
        ChangeIt.doIt(myArray);
        System.out.println(1);
        for (int j = 0; j < myArray.length; j++)
            System.out.print(myArray[j]+" ") ;
    }
    public static void main(String args) {

        int[] myArray = {1, 2, 3, 4, 5};
        ChangeIt.doIt(myArray);
        System.out.println(2);
        for (int j = 0; j < myArray.length; j++)
            System.out.print(myArray[j]+" ") ;
    }

}