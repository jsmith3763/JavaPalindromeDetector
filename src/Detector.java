import java.util.Scanner;
import java.util.ArrayList;
/*
* class Detector determines whether word or sequence is a palindrome
* Author: Justin Smith Date: 04/07/2020
* */
public class Detector {
    String possiblePalindrome;
    String lc;
    ArrayList<String> inputList = new ArrayList<String>();
    ArrayList<String> notPalindrome = new ArrayList<String>();
    ArrayList<String> isPalindrome = new ArrayList<String>();

    /*
    * constructor
    * */
    public Detector(){

    }

     /*
     * method that prompts user to input 5 words or sequences
     * */
    public void getInput(){
     Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 words or sequences!");
         for (int i = 0; i < 5; i++) {
             System.out.println("Enter word or sequence: ");
             possiblePalindrome = input.nextLine();
             String lc = possiblePalindrome.toLowerCase();
             inputList.add(lc);
             //System.out.println("");
         }
     }

     /*
     * method that determines if inputted sequence is palindrome or not
     * */
    public void isPalindrome(){
        for (String s : inputList) {
            int length = s.length();
            int forward = 0;
            int backward = length - 1;
            while (backward > forward) {
                char forwardChar = s.charAt(forward++);
                char backwardChar = s.charAt(backward--);
                if (forwardChar != backwardChar) {
                    notPalindrome.add(s);
                } else {
                    isPalindrome.add(s);
                }
                break;
            }
        }

    }

    public static void main(String[] args){
        System.out.println("--PALINDROME DETECTOR--");

        Detector d1 = new Detector();
        d1.getInput();

        //System.out.println(d1.inputList.toString());

        d1.isPalindrome();
        System.out.print("Not palindromes: ");
        System.out.println(d1.notPalindrome.toString());
        System.out.print("Are palindromes: ");
        System.out.println(d1.isPalindrome.toString());
    }
}

