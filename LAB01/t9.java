import java.util.Scanner;
public class t9{
  public static void main(String args[]){
    Scanner sc =  new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    for(int i=1; i<=a; i++){
      for(int j=1; j<=i; j++){
        if(i==1 || j==1 || i==j || i==a){
          System.out.print(j);
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}