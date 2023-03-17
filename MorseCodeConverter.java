
import java.util.HashMap;
import java.util.Scanner;

public class MorseCodeConverter {

        public static void main(String[] args) {

            // Morse code dictionary
            HashMap<Character, String> morseCodeMap = new HashMap<>();
            morseCodeMap.put('A', ".-");
            morseCodeMap.put('B', "-...");
            morseCodeMap.put('C', "-.-.");
            morseCodeMap.put('D', "-..");
            morseCodeMap.put('E', ".");
            morseCodeMap.put('F', "..-.");
            morseCodeMap.put('G', "--.");
            morseCodeMap.put('H', "....");
            morseCodeMap.put('I', "..");
            morseCodeMap.put('J', ".---");
            morseCodeMap.put('K', "-.-");
            morseCodeMap.put('L', ".-..");
            morseCodeMap.put('M', "--");
            morseCodeMap.put('N', "-.");
            morseCodeMap.put('O', "---");
            morseCodeMap.put('P', ".--.");
            morseCodeMap.put('Q', "--.-");
            morseCodeMap.put('R', ".-.");
            morseCodeMap.put('S', "...");
            morseCodeMap.put('T', "-");
            morseCodeMap.put('U', "..-");
            morseCodeMap.put('V', "...-");
            morseCodeMap.put('W', ".--");
            morseCodeMap.put('X', "-..-");
            morseCodeMap.put('Y', "-.--");
            morseCodeMap.put('Z', "--..");


            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter text to convert to Morse code: ");
            String input = scanner.nextLine().toUpperCase();

            String output = "";

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (morseCodeMap.containsKey(c)) {
                    output += morseCodeMap.get(c) + " ";
                } else if (c == ' ') {
                    output += "/ ";
                }
            }

            System.out.println("Morse code: " + output);

            System.out.print("Enter Morse code to convert to text: ");
            input = scanner.nextLine();

            output = "";

            String[] words = input.split(" / ");

            for (String word : words) {
                String[] letters = word.split(" ");
                for (String letter : letters) {
                    for (Character key : morseCodeMap.keySet()) {
                        if (morseCodeMap.get(key).equals(letter)) {
                            output += key;
                            break;
                        }
                    }
                }
                output += " ";
            }

            System.out.println("Text: " + output);
        }
    }
