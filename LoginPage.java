package Week3.day3;

public class LoginPage extends BasePage{
	public void performCommonTasks() {
		System.out.println("Perform the common task in login page");
	}
	public static void main(String[] args) {
		LoginPage result = new LoginPage();
		result.findElement();
		result.clickElement();
		result.enterText();
		result.performCommonTasks();
	}
}
