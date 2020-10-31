class WordCount{
    public static void main(String args[]) {
    String sentence = "The cow jumped over the moon";
    String[] words = sentence.split("\\s+");
    System.out.print("wordCount:" + words.length);

    }
}
