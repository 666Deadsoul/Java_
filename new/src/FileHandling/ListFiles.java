package FileHandling;

import java.io.File;

class Main {
    public static void main(String[] args) {

        try {
            // creates a file object
            File file = new File("directory/test");

            // returns an array of all files
            String[] fileList = file.list();

            for (String str : fileList) {
                System.out.println(str);
            }

        }

        catch (Exception e) {
            System.out.println(e);
        }

    }
}