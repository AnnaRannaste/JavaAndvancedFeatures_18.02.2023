/*
Task 4
Prepare a solution which will return the longest word from the provided file.
 */

package JavaIO_EX4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JavaIOEx4 {

    public static void main(String[] args) throws FileNotFoundException {

        String longestWord = new JavaIOEx4().findLongestWords();
        System.out.println("The longest Word is: " + longestWord);

    }

    public String findLongestWords() throws FileNotFoundException {
        String longestWord = "";
        String current;
        Scanner scanner = new Scanner(new File("C:/Users/RannastA/Documents/GitHub/JavaAdvancedFeatures_18.02.2023/src/main/java/JavaIO_EX4/test.txt"));

        while (scanner.hasNext()) {
            current = scanner.next();
            if (current.length() > longestWord.length()) {
                longestWord = current;
            }

        }
        return longestWord;
    }
}