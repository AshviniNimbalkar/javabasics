package com.in28minutes.oops.level2.collections.codingExamples;

public class AnagramRunner {
    public static void main(String[]args){
        Anagrams anagram = new Anagrams();
        String str1 = "silent";
        String str2 = "sileTne";
       Boolean areAnagram = anagram.areAnagrams(str1,str2);
       System.out.println(areAnagram);
    }
}
