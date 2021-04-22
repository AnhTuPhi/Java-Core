public class App {
    public static void main(String[] args) throws Exception {
        String main = "This is the test string";
        String removeChar = "st";
        System.out.println(main);
        System.out.println(removeChar);
        String newString ="";
        for(int i = 0; i< main.length() ; i++){
            if(i>0 && i<main.length()-1){
                if(main.charAt(i) == "s" && main.charAt(i+1) =="t"){
                    
                }
            }
        }
    }
}
