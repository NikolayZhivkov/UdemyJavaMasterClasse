import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteDeleteFile {

    public static void main(String[] args) {

   try{
       FileWriter myWriter = new FileWriter("filename.txt");
       myWriter.write("Test file ");
       myWriter.close();
       System.out.println("Sucessfully write the file");

   }catch (IOException e){
       System.out.println("An error occurred");
       e.printStackTrace();
   }

   try {

       File myObj = new File("filename.txt");
       Scanner myReader = new Scanner(myObj);
       while (myReader.hasNextLine()) {
           String data = myReader.nextLine();
           System.out.println(data);
       }
       myReader.close();
   }catch (FileNotFoundException e){
       System.out.println("An error occured");
       e.printStackTrace();
   }

   File myObj = new File("filename.txt");
   if (myObj.exists()){
       System.out.println("File name : " + myObj.getName());
       System.out.println("Absolute path : " + myObj.getAbsolutePath());
       System.out.println("Writable : " + myObj.canWrite());
       System.out.println("Readable : " + myObj.canRead());
       System.out.println("File size is : " + myObj.length());
   }else
   {
       System.out.println("The file does not exist.");
   }


   if(myObj.delete()){
       System.out.println("Delete the file : " + myObj.getName());
   }else
   {
       System.out.println("Failed to delete the file!");
   }



    }
}
