
import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random(); // Setting new random object to randomly select a response when asked.

        String[] responses = {"It is certain.", "Without a doubt.", "You may rely on it.", "Yes, definitely.",
                "It is decidedly so.", "As I see it, yes.", "Most likely.", "Yes.", "Outlook good.",
                "Signs point to yes.", "Reply hazy, try again.", "Better not tell you now.",
                "Ask again later.", "Cannot predict now.", "Concentrate and ask again.",
                "Don't count on it.", "Outlook not so good.", "My sources say no.", "Very doubtful.",
                "My reply is no."}; // Array of all potential responses for the 8 Ball

        while (true) { // while loop to as user to input a yes or no question then to loop through possible responses randomly
            System.out.println("Ask a yes/no question or type 'quit' to exit:"); // What the program prints for the user
            String question = input.nextLine().toLowerCase(); //Forces all response to lowercase regardless of answer

            if (question.equals("quit")) {//if user enters quit then it ends program
                break;
            }

            int index = random.nextInt(responses.length); //spans length of the responses provided
            String answer = responses[index];
            System.out.println(answer);
        }
    }
}