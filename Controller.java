package pck1;
import java.util.Scanner;
public class Controller {
	private Command command;
	public void setCommand (Command command) {
		this.command = command;
	}
	Scanner userInput = new Scanner(System.in);
	public void userInput() {
		command.execute();
	}
}
