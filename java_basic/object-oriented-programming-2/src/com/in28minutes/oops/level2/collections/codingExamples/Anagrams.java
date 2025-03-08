package com.in28minutes.oops.level2.collections.codingExamples;

import java.util.Arrays;
import java.util.Locale;

public class Anagrams {
    public boolean areAnagrams(String str1,String str2){
        if(str1==null || str2==null){
            return false;
        }
        if(str1.length()!=str2.length()){
            return false;
        }

        String lowerCaseStr1 = str1.toLowerCase();
        String lowerCaseStr2 = str2.toLowerCase();

        char[] str1Array = lowerCaseStr1.toCharArray();
        char[] str2Array = lowerCaseStr2.toCharArray();

        Arrays.sort(str1Array);
        Arrays.sort(str2Array);
        return Arrays.equals(str1Array,str2Array);
    }
}
