package whitespacetounderscore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhitespaceToUnderscore {

    public static void main(String[] args) {
        try {
            String input = null;

            // read in user input
            System.out.print("Input: ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            input = reader.readLine();

            // convert String input to char array
            char[] inputToChar = input.toCharArray();

            // check for white spaces
            for (int i = 0; i < inputToChar.length; i++) {
                if (inputToChar[i] == ' ') {
                    inputToChar[i] = '_';
                }
            }

            // convert char array to string
            input = new String(inputToChar);

            // output
            System.out.println("Output: " + input);
        } catch (IOException ioex) {
            System.out.println("IO Excpetion: " + ioex);
        }
    }
}