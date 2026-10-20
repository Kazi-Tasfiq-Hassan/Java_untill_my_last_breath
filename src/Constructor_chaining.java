class Bank_Account{
    String account_number;
    double balance;
    Bank_Account(String account_number , double balance){
        this.account_number = account_number;
        this.balance = balance;
    }
    Bank_Account(String account_number){

        this(account_number, 0.0);
    }
    void display_info(){
        System.out.println("The account number is " + account_number + " . The balance of the account is " + balance );
    }

}
public class Constructor_chaining {
    public static void main(String[] args){
        Bank_Account old_account = new Bank_Account("AC05231", 52021.51);
        old_account.display_info();
        Bank_Account new_account = new Bank_Account("AC0731561");
        new_account.display_info();

    }
}
