import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DictionaryManagement dic = new DictionaryManagement();
        dic.insertFromFile("F:\\DIC\\src\\text.txt");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter word or enter 'q' to quit");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            if (input.equalsIgnoreCase("insert")) {
                System.out.println("Entry word: ");
                while (true) {


                    String input1 = scanner.nextLine();
                    if (input1.equalsIgnoreCase("quit insert")) {
                        break;
                    }
                    String[] parts = input1.split(",", 2);
                    dic.insertFromCommandline(parts[0], parts[1]);
                    System.out.println("insert successful");

                }
            }
        }
    }
}