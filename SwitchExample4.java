package test.statements;

public class SwitchExample4 {
	public static void main(String... strings) {
		String browser = "CHROME";

		switch (browser) {

		case "chrome":
		case "Chrome":
		case "CHROME":
		case "cHrome":
		{

			System.out.println("Chrome executed");
			break;
		}

		case "firefox": {
			System.out.println("Firefox executed");
			break;
		}

		case "Internet Explorer": {
			System.out.println("IE executed");
			break;
		}

		default:
			System.out.println("No driver intiralized");

		}
	}

}
