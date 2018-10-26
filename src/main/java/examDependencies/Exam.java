package examDependencies;

import org.springframework.beans.factory.annotation.Autowired;

public class Exam {
    private AnswerChecker answerChecker;

    @Autowired
    public AnswerChecker getAnswerChecker() {
        return answerChecker;
    }

    public void setAnswerChecker(AnswerChecker answerChecker) {
        this.answerChecker = answerChecker;
        System.out.println("We've just set answerChecker using setter.");
    }

    public void examCheck(){
        answerChecker.checkAnswer();
    }
}
