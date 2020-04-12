package JavaBasics;

public class SwitchExmaple2 {

	public static void main(String... strings) {
		
		String browser = "Chrome";
		
		switch(browser) {
		
		
		case "chrome":
		case "Chrome":
		case "CHROME":
		case "cHrome":
			System.out.println("Execute Chrome");
			break;
			
		case "Firefox":
			System.out.println("Execute Fireox");
			break;
			
		case "Internet Explorer": {
			System.out.println("IE executed");
			break;
		}

		default:
			System.out.println("No driver");
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
