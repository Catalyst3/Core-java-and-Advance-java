package Abstration;
abstract class Login
{
	abstract void login();
}
class UserData extends Login
{
	void login()
	{
		System.out.println("You are loged in ");
	}
}
public class BankLogin {

	public static void main(String[] args) {
		Login login = new UserData();
		login.login();
	}

}
