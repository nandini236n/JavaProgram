package javaAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {
    public static void main(String[] args) {
        String input1, input2;
        System.out.println("Enter two strings ");
        Scanner sc = new Scanner(System.in);
        input1 = sc.nextLine();
        input2 = sc.nextLine();
        boolean numeric = input1.matches("-?\\d+(\\.\\d+)?");
        boolean numeric_2 = input2.matches("-?\\d+(\\.\\d+)?");
        if ((!numeric_2 && !numeric)) {
            if (areAnagram(input1, input2))
                System.out.println("The given two strings " + input1 + " " + input2 + " are anagram");
            else
                System.out.println("The given two strings " + input1 + " " + input2 + "are not anagram ");
        } else {
            System.out.println("the entered inputs are not strings ");
        }

    }

    public static boolean areAnagram(String a, String b) {

        if (a.length() != b.length())
            return false;
        char[] temp_a1 = a.toLowerCase().toCharArray();
        char[] temp_a2 = b.toLowerCase().toCharArray();
        Arrays.sort(temp_a1);
        Arrays.sort(temp_a2);
        //System.out.println(temp_a1);
        String a1 = new String(temp_a1);
        System.out.println(a1);
        String b1 = new String(temp_a2);
        System.out.println(b1);

        if (a1.equals(b1))
            return true;
        return false;
    }
}

