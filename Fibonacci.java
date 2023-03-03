
public class Fibonacci {
  public static void main(String[] args){
    /*//fibonacci
    // 1 1 2 3 5 8 13 21
    //a b c 
    //  a b c
    
    int  firstNumber =1;
    int  secondNumber =1;
    int c;
    System.out.println(firstNumber);
    System.out.println(secondNumber);
    for(int i =0;i<10;i++){
      c=firstNumber+secondNumber;
      firstNumber = secondNumber;
      secondNumber = c;
      System.out.println(c);
    }
    
  
  
  }
  */
    //solve with array
    
    int fib[] = new int[10];
    fib[0] = 1;
    fib[1] = 1;
    for (int i = 0; i<8;i++){
      fib[i+2]=fib[i+1]+fib[i];
      
    }
    
    for (int i = 0;i<10;i++){
      System.out.println(fib[i]);
    }
 
  
}
}
