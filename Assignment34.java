class FileProcessingSystem{
    void processFile(){
        try{
            System.out.println("Reading file...");
        }catch(Exception e){
            System.out.println("Error");
        }finally{
            System.out.println("Closing file resources");
        }
    }
}
public class Assignment34{
    public static void main(String[] args){
        FileProcessingSystem obj=new FileProcessingSystem();
        obj.processFile();
    }
}