import java.io.*;
public class FileExampleBufferStringRead {
    public static void main(String[] arr) throws IOException{
        
        BufferedReader br=new BufferedReader(new FileReader("Name3.text"));
        //String s1;
        //s1=br.readLine();  //ONLE ONE LINE READ
        //while((s1=br.readLine()) != null){ //JAB TK NULL NHI AYEGA TAB TAK CHLEGA
        //System.out.println(s1);
        //br.close();
       // }

       //ALL READ DATA ALL LINE
       //ARRAY NAME INDEX SHOWCHARARACTER READ
       char[] s=new char[100];
       br.read(s,0,100);
       System.out.println(s);
       br.close();

    }
}

