import java.util.Scanner;
public class L020204{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[5];
    for ( int count = 0; count < a.length; count++){
      a[count] = sc.nextInt();
      for( int count1 = 0; count1 < count; count1++){
        if( a[count] == a[count1] ){
          System.out.println("Enter another number");
        count--;
        }
      }
    }
    for ( int count = 0; count < a.length; count++){
        System.out.println(a[count]);
  }
}
}