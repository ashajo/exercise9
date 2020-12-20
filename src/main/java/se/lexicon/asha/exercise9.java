package se.lexicon.asha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class exercise9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        String[] myArray = new String[size];
        System.out.println("Enter elements of the array using Strings: ");
        for(int i=0; i<size; i++) {
            myArray[i] = sc.next();
        }
        System.out.println(Arrays.toString(myArray));
        ArrayList<String> myList = new ArrayList<>(Arrays.asList(myArray));
        System.out.println("Enter more element to add to the existing array: ");
        String element = sc.next();
        myList.add(element);
        myArray = myList.toArray(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
