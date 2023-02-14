package javaAssignment;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class BinarySearch {
    public static void main(String[] args ){
        int n ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Lists size");
        n = acceptingInput();
        List<Integer> List_numbers = new ArrayList<>();
        System.out.println("Enter the List elements");
        for(int i =0;i<n;i++){
            List_numbers.add(acceptingInput());
        }
        System.out.println("Enter the element to be searched ");
        int ele = acceptingInput();
        System.out.println("Enter the lowerRange and higherRange of the list to be searched");
        int lowerRange= acceptingInput();
        int higherRange = acceptingInput();
        if(binarySearch(List_numbers,ele, lowerRange, higherRange)==-1)
            System.out.println("The element not found in the provided list ");
        else
            System.out.println("The element found at index " + binarySearch(List_numbers,ele, 0, n-1));

    }

    public static int binarySearch(List<Integer> List_numbers , int ele, int lowerRange , int higherRange){
        if(higherRange<lowerRange){
            System.out.println("The ranges are incorrect ");
            return -1;
        }
        int midIndex=1;
        midIndex = lowerRange + (higherRange- lowerRange) / 2;
            
        if (List_numbers.get(midIndex) == ele)
                return midIndex;
        if (List_numbers.get(midIndex) > ele)
                return binarySearch(List_numbers, ele, lowerRange, midIndex - 1);
        return binarySearch(List_numbers,ele, midIndex + 1, higherRange);



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
