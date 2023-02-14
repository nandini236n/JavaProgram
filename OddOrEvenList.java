package javaAssignment;

import java.io.Serializable;
import java.util.*;

public class OddOrEvenList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list");
        boolean flag=false;
        int list_size = acceptingInput();
        List<Integer> List_numbers = new ArrayList<>();
        System.out.println("Enter the array elements ");

        for (int i = 0; i < list_size; i++) {
            List_numbers.add(acceptingInput());
                }
        List<Serializable> result = new ArrayList();
        result = isEvenOdd(List_numbers);
        if(result.get(1).equals(false))
            System.out.println("the list contains both even and odd numbers ");
        else{
            if(result.get(0).equals(1))
                System.out.println("the list contains only odd number");
            else
                System.out.println("the list contains only even numbers");
        }
    }

    public static List<Serializable> isEvenOdd(List<Integer> list) {
        System.out.println(list);
        int check = 1;
        if (list.get(0) % 2 == 0)
            check = 0;
        if (check == 0) {
            for (int k = 1; k < list.size(); k++) {
                if (list.get(k) % 2 != 0)
                    return Arrays.asList(check,false);
            }
        } else {
            for (int k = 1; k < list.size(); k++) {
                if (list.get(k) % 2 == 0)
                    return Arrays.asList(check,false);
            }
        }
        return Arrays.asList(check,true);

    }

    public static int  acceptingInput(){
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
