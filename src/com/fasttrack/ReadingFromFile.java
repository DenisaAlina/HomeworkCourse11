package com.fasttrack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ReadingFromFile {
    public static List<StudentGrade> readFileBuffered(String filePath) throws IOException {
        List<StudentGrade> studentGradeList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String line;
        while( (line=bufferedReader.readLine())!=null){
            studentGradeList.add(fromLine(line));
        }
        return studentGradeList;
    }

    private static StudentGrade fromLine(String line){
        String [] tokens = line.split((Pattern.quote("|")));


        return new StudentGrade(tokens[0], tokens[1], Integer.parseInt(tokens[2]));
    }
}
