package gameproject;
import java.util.*;
import java.io.*;
public class BigDriver {
	public static void main(String[] args) {
        WheelClass wheeler = new WheelClass();
        Timer timer = new Timer();
        TimerTask task = new TimeKeeper();
        String currentQuestion = "";
        String userAnswer = "";
        int correctPoints = 0;

        Scanner keyboardScanner = new Scanner(System.in);
        ArrayList<Player> players = new ArrayList<Player>();
        ArrayList <String> playoor = new ArrayList<String>();
        players.add(new Player());
        players.add(new Player());
        players.add(new Player());
        players.add(new Player());


        playoor.add("PEEPEE");

        if (playoor.contains("PEEPEE")){
            System.out.println(playoor.get(playoor.indexOf("PEEPEE")));
        }

        //timer.schedule(task,5000,1000);

        currentQuestion = wheeler.questionSelect(wheeler.wheelSelect());

        if (wheeler.getQuest() == 2){
            System.out.println(currentQuestion);
            System.out.println("You can put in 'pass' to skip the question, but you will not be awarded any points.");
            userAnswer = keyboardScanner.nextLine();
            correctPoints = wheeler.answerChecker(userAnswer,currentQuestion);
            if (userAnswer.equalsIgnoreCase("pass")){
                System.out.println("you passed this question !");
            }else if (correctPoints == 0){
                System.out.println("Your answer is wrong.");
            }else {
                System.out.println("You are correct !");
                players.get(0).addPointPlayer(correctPoints);
                System.out.println("Your total score is "+players.get(0).getPlayerPoints());
            }

        }

        wheeler.removeQuestion(currentQuestion);
        if (wheeler.hardWheel.contains(currentQuestion)){
            System.out.println("Didnt work !");
        }else {
            System.out.println("It works !");
        }

        if (wheeler.answeredQuestions.contains(currentQuestion))
            System.out.println("It got stored !");









    }
}
