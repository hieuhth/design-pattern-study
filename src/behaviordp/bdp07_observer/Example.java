package behaviordp.bdp07_observer;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountService account1 = createAccount("contact@gpcoder.com", "127.0.0.1");
        account1.login();
        account1.changeStatus(LoginStatus.EXPIRED);
 
        System.out.println("---");
        AccountService account2 = createAccount("contact@gpcoder.com", "116.108.77.231");
        account2.login();
    }
 
    private static AccountService createAccount(String email, String ip) {
        AccountService account = new AccountService(email, ip);
        account.attach(new Logger());
        account.attach(new Mailer());
        account.attach(new Protector());
        return account;
    }

}
