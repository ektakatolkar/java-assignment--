class TextProcessingBuilder{
    void process(){
        StringBuilder sb=new StringBuilder("Hello");
        sb.append(" Java");
        System.out.println(sb);
    }
}
public class Assignment28{
    public static void main(String[] args){
        TextProcessingBuilder obj=new TextProcessingBuilder();
        obj.process();
    }
}