import java.util.Scanner;
public class Main {
 
    public static String paragraph;
    public static String targetWord;
    private static String delimiter = ".!?"; //sentence terminating punctuation
    
    public static void main(String[] args) {
        //takes user input for typed paragraph
        Scanner keyboard = new Scanner(System.in);
        paragraph = keyboard.nextLine();
        
        //object for words
        TextAnalyzer ta = new TextAnalyzer(paragraph);
        
        System.out.println("Total Words: " + ta.countWords());
        
        //object for sentences
        TextAnalyzer _ta = new TextAnalyzer(paragraph, delimiter);    
        
        System.out.println("Total Sentences: " + _ta.countSentences());
        
        System.out.print("Target word? ");
        targetWord = keyboard.nextLine();
        System.out.println("Total " + targetWord + ": " + ta.countWords(targetWord));
}
}
