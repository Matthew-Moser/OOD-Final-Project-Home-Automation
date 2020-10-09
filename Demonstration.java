package pck1;
import java.util.Scanner;
public class Demonstration {

	public static void main(String[] args) {
		InternalClock systemClock = new InternalClock();
		
		System.out.println("Hello! My name is Ash!");
		System.out.println("I am a home automation system built by the IMC.\nOn behalf of everyone at the IMC, thank you for being a beta tester!");
		System.out.println("My feature set is currently limited to telling a single hilarious joke and sending texts to your contacts; which have already been imported from your phone!\nBut don't worry, in the future I will be able to automatically lock the doors in the house at a certain time, set timers for you, and much more! Exciting!");
		System.out.println("The current date and time is" + systemClock.internalClockFormatted);
		System.out.println("Please type one of the following!\nText Tai\njoke\nor exit to put me on standby mode.");
		Scanner scanner = new Scanner(System.in);
		String homeInput = scanner.nextLine();	
		
		if(homeInput.equalsIgnoreCase("Text Tai")){
			//Mediator demo
			System.out.println("Preparing a message for Tai, type what you would like to send him!");
			String textInput = scanner.nextLine();
			User cooper = new User("Cooper");
			cooper.sendMessage(textInput);
		}
		else if(homeInput.equalsIgnoreCase("Joke")) {
			//proxy demo
			Image image = new ProxyImage("Did you hear about the mathematician who's afraid of negative numbers? He'll stop at nothing to avoid them!");
			image.displayFunFact();
		}
		else if(homeInput.equalsIgnoreCase("Exit")) {
			System.out.println("Have a nice day!");
			System.exit(0);
		}
		else if(homeInput.equals("")){
			System.out.println("I'm sorry, you appear to have not typed anything, plese restart and try again!");
		}
		
		
	}

}
