import java.sql.SQLOutput;

public class Reversing_string {
    public static void main(String[] args) {


        String name = "Barkha";
        String reverse = " ";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }
        System.out.println ("reverse of  string Barkha is " +" " + reverse);
    }

}
// here i am creating a class and the main method to execute my code.
//i am initializing a string that i want to reverse,
//i am also initializing a empty Sting in which i will store the reverse string.
// i am creating a for loop iterator for the original string which will iterate in the reverse order
// by using the method charAt(), then it will store each character with the new string in reverse order.