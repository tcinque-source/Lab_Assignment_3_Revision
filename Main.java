import java.util.Scanner;
public class Main {
 
    public static String paragraph;
    public static String targetWord;
    private static String delimiter = ".!?";
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        paragraph = keyboard.nextLine();
        
        TextAnalyzer ta = new TextAnalyzer(paragraph);
        
        System.out.println("Total Words: " + ta.countWords());
        
        TextAnalyzer _ta = new TextAnalyzer(paragraph, delimiter);    
        
        System.out.println("Total Sentences: " + _ta.countSentences());
        
        System.out.print("Target word? ");
        targetWord = keyboard.nextLine();
        System.out.println("Total " + targetWord + ": " + ta.countWords(targetWord));
}
}
