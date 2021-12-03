import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class FileDay9 {
    public static void main(String[] args) throws IOException{
//         File file1 = new File("./out/a..txt");
//         System.out.println(file1.createNewFile());    //creates empty file
//         file1.delete();
          File file = new File("./out/a.txt");
//         System.out.println(file.createNewFile());
//         FileWriter fileWrite = new FileWriter("./out/a.txt");
//         fileWrite.write("Hi!My name is Sakshi.");
//         fileWrite.append("I am a Prograd Intern.");
//         fileWrite.close();
         FileReader fileReader = new FileReader("./out/a.txt");
//         System.out.println(fileReader.read());   // int return type- therefore,returns ascii value of char
//         System.out.println(fileReader.read());
           int i = fileReader.read();     // stores ascii value of first char, then pointer shifts to next char in file content
           while(i!=-1) {
               System.out.print((char) i);
               i = fileReader.read();
           }
           Scanner scanner = new Scanner(file);
           System.out.println("");
           while(scanner.hasNext()){
               System.out.println(scanner.nextLine());
           }
    }
}
