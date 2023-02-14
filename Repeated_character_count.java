package javaAssignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Repeated_character_count {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String  input  = sc.next();
        input+=sc.nextLine();
        sc.close();
        HashMap<Character, Integer> char_count = new HashMap<>();
        char_count = characterCount(input);
        System.out.println("The characters count");
        for(Map.Entry<Character, Integer> entry : char_count.entrySet()){
            if(entry.getValue()!=1){
                System.out.println("character  " + entry.getKey()+": count "+entry.getValue());
            }
        }
        System.out.println("END");

    }

    public static HashMap<Character, Integer> characterCount(String input1 ){
        HashMap<Character, Integer> char_count = new HashMap<>();
        for(int i = input1.length()-1;i>=0;i--){
            if(char_count.containsKey(input1.charAt(i)))
            {
                int count = char_count.get(input1.charAt(i));
                char_count.put(input1.charAt(i),++count);
            }
            else {
                char_count.put(input1.charAt(i),1);
            }

        }
        return char_count;

       }

}
