import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Session {
    List<Student> students;

    public Session(List<Student> students) {
        this.students = students;
    }

    public void calculateAverageQuizScores() {
        for (Student student : students) {
            double average = student.quizScores.stream().mapToDouble(Integer::intValue).average().orElse(0.0);
            System.out.println(student.name + ": " + average);
        }
    }

    public void printQuizScoresAscending() {
        for (Student student : students) {
            Collections.sort(student.quizScores);
            System.out.println(student.name + ": " + student.quizScores);
        }
    }

    public void printPartTimeStudents() {
        System.out.println("Part-Time Students:");
        for (Student student : students) {
            if (student instanceof PartTimeStudent) {
                System.out.println(student.name);
            }
        }
}

    public void printFullTimeExamScores() {
        System.out.println("Full-Time Student Exam Scores:");
        for (Student student : students) {
            if (student instanceof FullTimeStudent) {
                System.out.println(student.name + ": " + ((FullTimeStudent) student).examScores);
            }
        }
    }
}
