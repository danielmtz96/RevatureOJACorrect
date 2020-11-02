package eg_if_else_switch;

public class DemoMain {
	public static void main(String[] args) {
		
		int x = 8;
		
		if (x == 8) {
			System.out.println("Yes, it is 8");
		}
		else {
			System.out.println("No, it is not.");
		}
		
		System.out.println("\nDisplaying scores");
		int score = 39;
		if (score >= 80) {
			System.out.println("Top score");
		} else if(score < 80 && score >= 60) {
			System.out.println("Doing good");
		} else if(score < 60 && score >= 40) {
			System.out.println("Ahhhh ... you might wanna make it bit better");
		} else {
			System.out.println("Retry!!!");
		}
		
		System.out.println("\nSwitch-case example");
		int day = 3;
		switch(day) {
		case 1: System.out.println("It's Monday");
		break;
		case 2: System.out.println("It's Tuesday");
		break;
		case 3: System.out.println("It's Wednesday");
		break;
		//without break, the next part of the code executes
		default: System.out.println("It's some other day.");
		}
		
		// switch-case is better when you are expecting constants.
		// if I take out all breaks, and I put day = 1, everything will execute.
	}
}
