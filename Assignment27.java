class TextEditorBuffer{
    void processText(){
        StringBuffer sb=new StringBuffer("Hello");
        sb.append(" World");
        sb.insert(5," Java");
        sb.reverse();
        System.out.println(sb);
    }
}
public class Assignment27{
    public static void main(String[] args){
        TextEditorBuffer obj=new TextEditorBuffer();
        obj.processText();
    }
}