
public class Strings {
  
  public static void main(String[] args){
    String s = "Hello. My name is Tom.";
    s=s.toUpperCase();
    System.out.println(s);
    int firstSpace = s.indexOf(" ");
    System.out.println(firstSpace);
    String firstWord = s.substring(0,firstSpace);
    int lastSpace=s.lastIndexOf(" ");
    String lastWord = s.substring(lastSpace);
    System.out.println(firstWord);
    System.out.println(lastWord);
    System.out.println(s.charAt(10));
    
  }
  
  
}
