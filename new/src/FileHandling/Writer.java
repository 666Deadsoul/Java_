package FileHandling;

import java.io.FileWriter;

class Main {
    public static void main(String args[]) {

        String data = "I am learning Java. And I am loving it.";
        try {

            // create a Writer using FileWriter
            FileWriter output = new FileWriter("java.txt");

            // write string to the file
            output.write(data);
            System.out.println("Data is written to the file.");

            // close FileWriter
            output.close();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
