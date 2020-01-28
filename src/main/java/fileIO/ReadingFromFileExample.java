package fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/** The exam demonstrates how to use a BufferedReader to read lines from the text file.
  */
public class ReadingFromFileExample {

        /**
        * Opens a textfile, reads each line and prints to the console
        * @param filename the name of the text file
        */
        public static void readFromFile(String filename) {
            try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
                String line;
                while ((line = br.readLine()) != null) { // read each line from the file
                    System.out.println(line); // print it to the console
                }
            } catch (IOException e) {
                System.out.println("Could not read from the file: " + filename);
            }
        }

        public static void main(String[] args) {
                readFromFile("example.txt");
        }
}
