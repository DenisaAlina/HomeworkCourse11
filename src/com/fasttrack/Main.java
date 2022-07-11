package com.fasttrack;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Classroom classroom= new Classroom(ReadingFromFile.readFileBuffered("File/grades.txt"));
        System.out.println(classroom.getGradesForDiscipline("Computer Science"));
        System.out.println(classroom.getGradesForStudent("Asim Jeltje"));
        System.out.println(classroom.getMaxGrade("Mathematics"));
        System.out.println(classroom.getMaxGrade());
        System.out.println(classroom.getAverageGrade("Physics"));
        System.out.println(classroom.getWorstGrade("History"));

        ReportGenerator reportGenerator = new ReportGenerator(ReadingFromFile.readFileBuffered("File/grades.txt"));
        reportGenerator.generateReport();

    }
}
