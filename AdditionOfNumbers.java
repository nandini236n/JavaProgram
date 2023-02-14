package javaAssignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdditionOfNumbers {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        System.out.println("Enter integer values");
        Float input1 = acceptingInput();
        Float input2 = acceptingInput();
        System.out.println("The sum of "+input1+" "+input2+" is " + sum(input1,input2));

        }

    public static float acceptingInput(){
        Scanner sc = new Scanner(System.in);
        boolean flag=false;
        float input = 0;
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
       public static float sum(float input1, float input2){
        return (input1+input2);
       }

    }
