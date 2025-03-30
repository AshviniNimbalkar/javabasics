package com.in28minutes.oops.level2.newjavafeatures;

public class StringClassNewFeatures {
    static class SampleClass{
        String str =null;
    }
    public static void main(String[]args){
        System.out.println(" ".isBlank());
        System.out.println("  LR  ".stripLeading());
        System.out.println(" LR  ".stripTrailing());
        System.out.println("  LR  ".replace(" ","@"));
        "Hi\nRajveer\nHow\nare\nyou!".lines().forEach(line->System.out.println(line));
        String substr = "Upper".transform(s->s.substring(1));
        System.out.println(substr);
        /*String str = null;
        str.isBlank();*/
        SampleClass smapleClass = new SampleClass();
        smapleClass.str.isBlank();

    }
}
