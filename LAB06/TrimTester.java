public class TrimTester{
  public static void main(String [] args){
    char [] input = {'T','h','i','s',' ',' ',' ',' ',' ','i','s',' ',' ',' ',' ','a',' ',' ',' ',' ','t','e','s','t','.'};
    for (int i = 0; i< input.length; i++){
      System.out.print(input[i]);
    }
    System.out.println("");
    char []  output = Trim(input);
    for (int i = 0; i< output.length; i++){
      System.out.print(output[i]);
    }
    System.out.println("");    
  }
}