import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi String input: ");
        String input = scanner.nextLine();
        int position;
        System.out.println("Nhap position can tim: ");
        position = scanner.nextInt();
        
        System.out.println("Vi tri ki tu tai position " + position + " la: " + input.charAt(position));
        scanner.close();
    }
}
