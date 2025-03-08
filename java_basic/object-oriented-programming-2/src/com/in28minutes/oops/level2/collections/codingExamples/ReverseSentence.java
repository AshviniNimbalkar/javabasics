package com.in28minutes.oops.level2.collections.codingExamples;

public class ReverseSentence {
    public String sentence;

    ReverseSentence(String sentence){
        this.sentence = sentence;
    }

    public String reverseWordInSentence() {
        if(sentence==null){
            return "INVALID";
        }
        if(sentence.equals("")){
            return "";
        }

       StringBuilder reverseSentence = new StringBuilder();
        for (String words : sentence.split(" ")) {
            StringBuilder reverseWord = new StringBuilder(words).reverse();
            reverseSentence.append(reverseWord).append(" ");
        }
        return reverseSentence.toString().trim();
    }
}
