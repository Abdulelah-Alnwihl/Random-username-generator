import java.io.*;
import java.awt.Desktop;
import java.util.Random;
import java.util.Scanner;
import javax.annotation.processing.FilerException;
public class NewClass {
    public static void main(String[] args) throws IOException {
      try{
        Scanner input=new Scanner(System.in);
 Desktop desktop = Desktop.getDesktop();
     File file = new File("newfile.txt");  
     
String user = "ASDFGHJKLZXCVBNMQWERTYUIOPqwertyuiopasdfghjklzxcvbnm1234567890";
     
System.out.println("Number of users ? ");

int nOfusers = input.nextInt();

System.out.println("Number of letters ?");
          int nOfletters = input.nextInt();
char u[] = user.toCharArray();
Random r = new Random();
String temp;
FileWriter write = new FileWriter("newfile.txt");
for(int k = 1;k<=nOfusers;k++){
    temp="";
for (int i = 0; i < nOfletters; i++) {
int x = r.nextInt(0+user.length());             
   
temp+=user.charAt(x);
  
}
write.write(temp);
write.write("\n");
}  
    
     write.close();
      FileReader f = new FileReader("newfile.txt");
      int c = f.read();
      while(c!=-1){
          System.out.print((char)c);
          c = f.read();
      }
      desktop.open(file);
      }
      
      catch(FileNotFoundException e){
          System.out.println("File not found");
      }
    
    
    catch(IOException e){
        System.out.println("Not found ");
    }
    }
}