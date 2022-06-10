package program2;
import java.util.Scanner;
import java.util.Arrays;

public class Sorter {
    // constructor
    Sorter(){
        read();
    }

    // methods
    void read(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a String with only Letters");
        String input = "test";
        while (input.isEmpty() == false){
            input = userInput.nextLine();
            if (input.isEmpty() == true){
                System.out.println("END of INPUT");
                break;
            }
            else if (onlyLetters(input) == false){
                System.out.println("Input has non-Letter characters, try again!");
            }
            else{
                userString = input;
                System.out.println("String:" + userString);
                write();
            }
        }

    }
    void write(){
        userString = userString.toUpperCase();
        userString = userString.replaceAll("\\s", "");
        sort();
    }
    void sort(){
        char arr[] = userString.toCharArray();
        Arrays.sort(arr);
        System.out.println(arr);
    }
    boolean onlyLetters(String string) {return string.matches("[a-zA-Z,' ']+");}

    // attributes
    String userString;
}
