package FileHandling;

import java.io.FileReader;
import java.io.FileWriter;

class Main {
    public static void main(String[] args) {
        char[] contents = new char[1000];

        try {
            FileReader copy = new FileReader("message.txt");
            // reads all data from message.txt
            copy.read(contents);

            FileWriter paste = new FileWriter("output.txt");
            // writes all data to newFile
            paste.write(contents);

            // close 
            copy.close();
            paste.close();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}