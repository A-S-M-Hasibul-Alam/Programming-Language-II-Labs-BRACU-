import java.util.Scanner;
public class L0205{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[10];
    for ( int count = 0; count < a.length; count++){
      a[count] = sc.nextInt();
    }
    int x = sc.nextInt();
    boolean b = false;
    for ( int count = 0; count < a.length; count++){
      if( a[count] == x){
        b = true;
        break;
    }
    }
    if(b){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}