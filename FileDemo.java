//creating a file

package javapractice;
import java.io.*;
public class FilleDemo {

public static void main(String[] args)throws IOException {
// TODO Auto-generated method stub
File ob=new File("MyFile.txt");
if(ob.createNewFile()) {
System.out.println("created");
}
else
{
System.out.println("Not created");
}

}

}
//*****************************************************************************
//writing a file
package javapractice;
import java.io.*;
public class FileDemoW {

public static void main(String[] args)throws IOException {
// TODO Auto-generated method stub
FileOutputStream ff=new FileOutputStream("MyFile.txt",true);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the data: ");
String s=br.readLine();
System.out.println("\n");
byte[] arr=s.getBytes();


ff.write(arr);


ff.close();
}

}
//***********************************************************************
//reading a file
package javapractice;
import java.io.*;
public class FileDemoR {

public static void main(String[] args)throws IOException {
// TODO Auto-generated method stub
FileInputStream fin=new FileInputStream("MyFile.txt");
         System.out.println(fin.available());
         int i;
         while((i=fin.read())!=-1) {
//Converts Byte to Character
char c = (char)i;
System.out.print(c);

}
         System.lineSeparator();
       
       
         fin.close();
}

}
