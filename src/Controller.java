import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    Scanner sc = new Scanner(System.in);
    public void ex1(){
        System.out.print("Enter string: ");
        String strTemp = sc.nextLine();
        System.out.println(strTemp.length());
        if(strTemp.isEmpty() || strTemp == null){
            strTemp = "Hello world";
        }
        char firstChar = strTemp.charAt(0);
        char lastChar = strTemp.charAt(strTemp.length()-1);
        System.out.println("This is first character: " + firstChar);
        System.out.println("This is last character: "+ lastChar);
    }
    public void ex2(){
        BigInteger numFirst = new BigInteger("2");
        BigInteger result = numFirst.pow(1024);
        System.out.println(result);
    }
    public void ex3(){
        System.out.print("Enter number: ");
        int number = Integer.valueOf(sc.nextLine());
        System.out.print("All number from 0 to " + number +" is: \t");
        for(int i=0; i< number;i++){
            System.out.print(i+" ");
        }
        System.out.println();

    }
    public void ex4(){
        System.out.print("Enter string: ");
        String text = sc.nextLine();

        Long longTemp = 1L;
        for(int i = 0 ;i< text.length();i++){
            longTemp *= (int) text.charAt(i);
        }
        System.out.println(longTemp);
    }

    public Long getResultEx5() {
        return resultEx5;
    }

    public void setResultEx5(Long resultEx5) {
        this.resultEx5 = resultEx5;
    }

    String temp2 = null;
    Long resultEx5 = 1L;
    public int Ex5(String temp){

       if(temp.length() > 0){
           temp2 = temp.substring(0,temp.length()-1); // to check the lenghth of String is out of range yet.
           resultEx5 *= (int)temp.charAt(temp.length()-1);
           if(temp2 != null || temp2.isEmpty()){
               return Ex5(temp2);
           }
       }
        return 1;
    }
    public void stringFunction(){
        System.out.println("Enter String: ");
        String text = sc.nextLine();
        System.out.println("Your string is: "+ text);
        System.out.println("Enter number: ");
        int option;
        option = Integer.valueOf(sc.nextLine());
        while (option < 0 || option > text.length()){
            System.out.println("Out of range:  ");
            option = Integer.valueOf(sc.nextLine());
        }
        System.out.println("Select first n element: " + text.substring(0,option).charAt(0));
        int lengt = text.substring(option,text.length()).length();

        System.out.println("Select last n element: " +text.substring(option,text.length()).charAt(lengt-1));
        System.out.println("Selects all elements except first n ones."+ text.substring(1,option));
        System.out.println("Selects all elements except last n ones."+ text.substring(option,text.length()-1));

    }
    public void menu(){
        System.out.println("Example 1. Get the character");
        System.out.println("Example 2. Using BigInt");
        System.out.println("Example 3. Prints the numbers ");
        System.out.println("Example 4. Product of the Unicode codes");
        System.out.println("Example 5. Recursive function.");
        System.out.println("Example 6. String function.");
        System.out.println("Enter your choose: ");

    }
}
