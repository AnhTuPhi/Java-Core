public class App {
    public static void main(String[] args) throws Exception {
        String str1 = "Hello from the other side";
        String str2 = "Hello from the other side";
        String str3 = "Hello from this side";
        int result = str1.compareTo(str2);
       
        if( result ==0){
            System.out.println("String input is equal from position to string!");
        }
        else{
            System.out.println("Not equal");
        }
    }
}
