public class App {
    public static void main(String[] args) throws Exception {
        String str = "Halo from the heaven";
        String str1 = "halo form the heaven";
        int result = str.compareToIgnoreCase(str1);
        if(result == 0){
            System.out.println("Equals");
        }
    }
}
