import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
    String name;
    List<Integer> quizScores;

    public Student(String name, List<Integer> quizScores) {
        this.name = name;
        this.quizScores = quizScores;
    }
}

class PartTimeStudent extends Student {
    public PartTimeStudent(String name, List<Integer> quizScores) {
        super(name, quizScores);
    }
}

class FullTimeStudent extends Student {
    List<Integer> examScores;

    public FullTimeStudent(String name, List<Integer> quizScores, List<Integer> examScores) {
        super(name, quizScores);
        this.examScores = examScores;
    }
}


