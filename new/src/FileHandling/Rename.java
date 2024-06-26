import java.io.File;

class Main {
  public static void main(String[] args) {

    try {
      // create a file object
      File oldFile = new File("input.txt");

      // create an object that contains the new name of file
      File newFile = new File("newName.txt");

      // change the name of file
      boolean value = oldFile.renameTo(newFile);

      if (value) {
        System.out.println("The name of the file is changed.");
      } 
      else {
        System.out.println("The name cannot be changed.");
      }
    } 
    catch (Exception e) {
      System.out.println(e);
    }
  }
}