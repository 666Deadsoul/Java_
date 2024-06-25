package FileHandling;

import java.io.File;

class Main {
    public static void main(String[] args) {

        // create a file object
        File file = new File("newFile.txt");

        // trying to create a file
        try {
            boolean value = file.createNewFile();

            // check if file is created
            if (value) {
                System.out.println("The new file is created.");
            }

            else {
                System.out.println("The file already exists.");
            }
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}