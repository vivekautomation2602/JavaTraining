package JavaBasics;

public class Assisngment_Object {

	

	public void highestAge(int age1,int age2,int age3) {
		int vivek, harsh, nimit;
		
		vivek=age1;
		harsh=age2;
		nimit=age3;

		if (vivek > harsh && vivek > nimit) {

			System.out.println("vivke is Big");
		}

		else if (harsh > nimit && harsh > vivek) {
			System.out.println("harsh is Biggest");
		}

		else {
			System.out.println("nimit is big");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assisngment_Object high = new Assisngment_Object();
		
		high.highestAge(23, 34, 21);
		
		
		
		
		
	}

}
