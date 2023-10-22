import java.io.*;
import java.io.FileReader;
public class F1 {
    //static String path="D:/CDAC JAVA/Filehandling/Name3.txt";  
    public static void main(String[] arr) throws IOException{
        int charCount=0;
        int wordCount=0;
        int lineCount=0;

        BufferedReader br=new BufferedReader(new FileReader("Name3.text"));
        String currLine=br.readLine();
        while(currLine!=null){
            lineCount++;

            //WORDS
            String words[]=currLine.split(" ");
            wordCount=wordCount+words.length;

            //LINE
            for(String word:words){
                charCount=charCount+word.length();
            }
            currLine=br.readLine();
        }
        System.out.println("total lines :" +lineCount);
        System.out.println("total words :" +wordCount);
        System.out.println("total chars :" +charCount);
        br.close();
    }
}
