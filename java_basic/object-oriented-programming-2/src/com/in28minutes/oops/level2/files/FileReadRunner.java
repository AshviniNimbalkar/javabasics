package com.in28minutes.oops.level2.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadRunner {
    public static void main(String[]args) throws IOException {
        Path pathFileReader = Paths.get("R:/sandbox/workspace/ashvini/java_basic/object-oriented-programming-2/Resources/Data.txt");
        //List<String> lines = Files.readAllLines(pathFileReader);
        //System.out.println(lines);

        Files.lines(pathFileReader).forEach(System.out::println);




    }
}
