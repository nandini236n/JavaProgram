package javaAssignment;

import java.util.*;

public class SwappingNumber {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a = acceptingInput();
        int b = acceptingInput();
        RecursionSwap r1 = new RecursionSwap();
        NonRecursionSwapping r2 = new NonRecursionSwapping();
        List<Object> arr1 = new ArrayList<>();
        List<Object> arr2 = new ArrayList<>();
        if(a==b)
            System.out.println("The numbers are equal ");
        else{
            if(a>b){
                arr1 =r1.swapNumbers(a,b,Math.abs(a-b));
                System.out.println("The swapping of the numbers "+a+" "+b +"using recursive method "+arr1.get(0)+" " +arr1.get(1));
                arr2 = r2.swapNumbers(a,b,Math.abs(a-b));
                System.out.println("The swapping of the numbers "+a+" " + b+" using non-recursive method "+arr2.get(0)+" " +arr2.get(1));

            }else{
                arr1 =r1.swapNumbers(b,a,Math.abs(a-b));
                System.out.println("The swapping of the numbers "+a+" "+b +"using recursive method "+arr1.get(1)+" "+arr1.get(0));
                arr2 =r2.swapNumbers(b,a,Math.abs(a-b));
                System.out.println("The swapping of the numbers "+a+" " + b+" using non-recursive method "+arr2.get(1)+" "+arr2.get(0));
            }
        }


    }

    public static int acceptingInput(){
        Scanner sc = new Scanner(System.in);
        boolean flag=false;
        int input = 0;
        do{
            try {
                input = sc.nextInt();
                flag = true;
            } catch (InputMismatchException msg) {
                System.out.println("the entered input is not of integer format  ");
                System.out.println("enter only integer ");
                sc.next();
            }
        }while (!flag);
        return input;
    }

}
interface Swap1{
    List<Object> swapNumbers(int a, int b,int d);
}
class RecursionSwap implements Swap1{
    @Override
    public  List<Object> swapNumbers(int a, int b,int d) {
        if(d==0)
            return Arrays.asList(a,b);
        d--;
        a--;
        b++;
        return swapNumbers(a,b,d);
      }
}
class NonRecursionSwapping implements Swap1{
    @Override
    public List<Object> swapNumbers(int a, int b,int d) {
            while(d!=0){
                d--;
                a--;
                b++;
            }
        return Arrays.asList(a,b);
    }
}