import java.util.Scanner;
import java.util.StringTokenizer;
class WordCounter{
    void countWords(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String text=sc.nextLine();
        StringTokenizer st=new StringTokenizer(text);
        int count=st.countTokens();
        System.out.println("Total words: "+count);
    }
}
public class Assignment26{
    public static void main(String[] args){
        WordCounter obj=new WordCounter();
        obj.countWords();
    }
}