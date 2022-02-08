package javapractice;
import java.io.*;
public class FileTutorial2 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		File f=new File("count.txt");
		if(f.createNewFile()) {
			System.out.println("created");
		}
		else {
			System.out.println("Already exist");
		}
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream f1=new FileOutputStream("count.txt",true);
        System.out.println("Enter the string: ");
        String s=br.readLine();
        byte[] arr=s.getBytes();
        f1.write(arr);
      f1.write(System.getProperty("line.separator").getBytes());  
        FileInputStream f2=new FileInputStream("count.txt");
        int k=1,j=0;
        int n=f2.available();
        for(int i=0;i<n;i++) {
        	char ch=(char)f2.read();
        	
        	if(ch=='\n') {
        		k++;
        		
        	}
        	if(ch==' ') {
        		j++;
        		
        	}
        }
        System.lineSeparator();
        System.out.println("\nnumber of lines: "+k);
        System.out.println("\nnumber of words: "+(k+j));
        System.out.println("\nNumber of characters: "+n);
        f1.close();
        f2.close();
	}

}
