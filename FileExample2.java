import java.io.*;
import java.io.IOException;
class FileExample2{
    public static void main(String [] arr) throws IOException{
        int i;
        //FileOutputStream fout; //CREATE A REFERENCE VARIBALE
        FileOutputStream fout=new FileOutputStream("./Name2.txt", true);
        String s="TATA";

        char ch[]=s.toCharArray(); //STRING CONVERT TO CHARACTER ARRAY
        for(i=0;i<s.length();i++){
            fout.write(ch[i]);
            fout.close();
        }
    }
}