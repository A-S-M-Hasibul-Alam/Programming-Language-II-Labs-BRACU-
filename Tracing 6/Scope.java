public class Scope{ 
public int x = 1;
public int y = 100;
public void met1(){
    int x = 3;
    x = this.x + 1;
    y = y + this.x + 1;
    x = y + met2(x+y) + y;
    System.out.println(x);
    System.out.println(y);
  }
  public int met2(int y){    
    System.out.println(x);
    System.out.println(y);
    this.x = x + y;    
    this.y = this.y + 200;    
    return x + y;
  }
}
