public class App {
    public String string(String str){
        String newformString = " ";
        for(int i=0;i<str.length(); i++){
            newformString += str.substring(i, i+1);
            if(i>0 && i< str.length() -1){
                if(str.charAt(i) == 'z' && str.charAt(i+1) == 'g'){
                    newformString = newformString.substring(0,newformString.length()-1);
                }
            }
        }
        return newformString;
    }
    public static void main(String[] args) throws Exception {
        App app =new App();
        String string = "zzgkitandkatcaketoket";
        System.out.println("The given string is: "+string);
        System.out.println("The new string is: "+ app.string(string));
    }
}
