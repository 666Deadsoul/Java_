package FileHandling;

import java.io.File;

class Main {
    public static void main(String[] args) {

        // create a file object
        File file = new File("message.txt");

        try {
            // delete the file
            boolean value = file.delete();

            if (value) {
                System.out.println("The File is deleted.");
            } else {
                System.out.println("The File is not deleted.");
            }
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
