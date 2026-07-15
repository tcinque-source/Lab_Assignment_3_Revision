import java.util.StringTokenizer;

public class TextAnalyzer {
    
    private StringTokenizer _paragraph;
    private StringTokenizer delimitedParagraph;

    public TextAnalyzer (String paragraph) { 
        _paragraph = new StringTokenizer(paragraph);
    }
    
    public TextAnalyzer (String paragraph, String delimiter) {
        delimitedParagraph = new StringTokenizer(paragraph, delimiter);
    }
    
    //counts total words of paragraph
    public int countWords() {
        int wordCount;
        return wordCount = _paragraph.countTokens();
    }
    
    //counts total words of paragraph that match target word
    public int countWords(String targetWord) {
        int targetWordCount = 0;
        int _wordCount;
        String currentWord;
        _wordCount = countWords(); //in case methods are not executed in order written
        //checks each token against target word
        for (int i =0; i < _wordCount; i++) {
            currentWord = _paragraph.nextToken();
            if(currentWord.equalsIgnoreCase(targetWord)) //When they match targetWordCount increases
                targetWordCount++;
        }
        return targetWordCount;
    }

    //counts total sentences of paragraph
    public int countSentences() {
        int sentenceCount;
        return sentenceCount = delimitedParagraph.countTokens();
    }
}
