public class CheckingAccount extends Account{
  static int numberOfAccount = 0;
   CheckingAccount(){
     super(0.0);
    numberOfAccount++;
  }
  CheckingAccount(double d){
    super(d);
    numberOfAccount++;
  }
}