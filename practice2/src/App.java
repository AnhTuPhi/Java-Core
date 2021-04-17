import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input : ");
        String input;
        input = scanner.nextLine();

        int position;
        System.out.println("Position : ");
        position = scanner.nextInt();

        System.out.println("codePointAt position " + position + " is : " + input.codePointAt(position));
    }
}
