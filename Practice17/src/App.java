public class App {
    public String repeatAllTwice(String str){
        String newString = " ";
        for(int i=0; i<str.length(); i++){
            newString += str.substring(i, i+1) + str.substring(i, i+1) ;

        }
        
        return newString;
        
    }
    public static void main(String[] args) throws Exception {
        App app= new App();
      String str1 =  "welcome";
      System.out.println("The given string is: "+str1);
      System.out.println("The new string is: "+app.repeatAllTwice(str1));
    }
}
