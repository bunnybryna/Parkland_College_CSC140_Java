package lab9Pack;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {


    // knows
    private ArrayList<Question> quiz;
    private String quizName;
    private int correctNumber, incorrectNumber; 
    
    public Quiz(String name)
    {
        quiz = new ArrayList<Question>();
        quizName = name;
    }
    public void add(Question q)
    {
        quiz.add(q);
    }
    //present each question in order to the user, accept an answer, and keep track of the result
    public void giveQuiz()
    {
        Scanner scan = new Scanner(System.in);
        String userAnswer;
    	int number = 0;
        for (Question q: quiz)
        {
            number += 1;
        	System.out.println("Question " + Integer.toString(number) + ": " + q.getQuestion());
            userAnswer = scan.nextLine();
            System.out.println("Your answer: " + userAnswer);
            if (q.answerCorrect(userAnswer))
                correctNumber += 1;
            else
                incorrectNumber += 1;
        }
        scan.close();
        System.out.println("Correct: " + correctNumber + "\tIncorrect: " + incorrectNumber);
    }
    // present answers to the user
    public String toString()
    {
    	int number = 0;
    	String result = "You're taking " + quizName + ":\n";
    	for (Question q: quiz)
        {
        	number += 1;
    		result += "\n\nQuestion " + Integer.toString(number) + ": "+ q.getQuestion();
            result += "\nCorrect answer: " + q.getAnswer();
        }
        return result;
    }
}
