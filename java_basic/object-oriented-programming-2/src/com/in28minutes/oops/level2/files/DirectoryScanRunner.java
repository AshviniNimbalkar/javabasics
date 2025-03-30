package com.in28minutes.oops.level2.files;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;

public class DirectoryScanRunner {
    public static void main(String[]args) throws IOException {
        //Files.list(Paths.get(".")).forEach(System.out::println);
        Path currentDir = Paths.get(".");
        //Files.walk(currentDir,2).forEach(System.out::println);
        Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
        Files.walk(currentDir,8).filter(predicate).forEach(System.out::println);

    }
}
