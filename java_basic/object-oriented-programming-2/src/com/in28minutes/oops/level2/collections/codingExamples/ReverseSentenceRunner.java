package com.in28minutes.oops.level2.collections.codingExamples;

public class ReverseSentenceRunner {
    public static void main(String[]args) {
        ReverseSentence sentence = new ReverseSentence("India is my country ");
        String reversesent = sentence.reverseWordInSentence();
        System.out.println(reversesent);
    }
}
