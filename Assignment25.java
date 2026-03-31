import java.util.Scanner;
class FileExtensionExtractor{
    void extractExtension(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter file name: ");
        String file=sc.nextLine();
        int index=file.lastIndexOf(".");
        String ext=file.substring(index+1);
        System.out.println("Extension: "+ext);
    }
}
public class Assignment25{
    public static void main(String[] args){
        FileExtensionExtractor obj=new FileExtensionExtractor();
        obj.extractExtension();
    }
}