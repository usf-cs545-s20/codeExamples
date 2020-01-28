package fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/** The exam demonstrates how to use a PrintWriter to write lines to a text file.
  */
public class WritingToFileExample {

        /**Takes an array of Strings, and writes them to a text file
         * with the given name.
         *
        * @param filename the name of the text file
        */
        public static void writeToFile(String[] array, String filename) {
            try (PrintWriter pw = new PrintWriter(filename)) {
                for (String elem: array) {
                    pw.println(elem); // write a string to a file
                }
                pw.flush(); // send everything from the buffer to the file
            } catch (IOException e) {
                System.out.println("Could not read from the file: " + filename);
            }
        }

        public static void main(String[] args) {
            String[] arr = {"cat", "dog", "fish"};
            writeToFile(arr, "output.txt");

        }
}
