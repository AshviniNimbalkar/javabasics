package com.in28minutes.oops.level2.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {
    public static void main(String[]args) throws IOException {
        Path pathFileReader = Paths.get("R:/sandbox/workspace/ashvini/java_basic/object-oriented-programming-2/Resources/DataWrite.txt");
        List<String> list = List.of("Apple","Banana","Cat");
        Files.write(pathFileReader,list);
    }
}
