package com.fasttrack;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReportGenerator extends Classroom {


    public ReportGenerator(List<StudentGrade> studentGradeList) {
        super(studentGradeList);
    }

    public void generateReport() throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("File/grade-reports.out"));
        bufferedWriter.write(super.getMaxGrade() + "   " + (super.getMaxGrade()).getGrade());
        bufferedWriter.newLine();
        bufferedWriter.write(String.valueOf(super.getTheAverage()));
        System.out.println(super.getTheAverage());
        bufferedWriter.newLine();
        bufferedWriter.write(super.getWorstGrade() + "   " + (super.getWorstGrade()).getGrade());
        bufferedWriter.flush();
    }
}


