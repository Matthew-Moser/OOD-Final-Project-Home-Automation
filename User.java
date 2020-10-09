package pck1;

public class User {
	private String name;
	
	public String accessName() {
		return name;
	}
	public void setName (String name) {
		this.name = name;
	}
	public User(String name) {
		this.name = name;
	}
	public void sendMessage(String message) {
		ContactMessaging.showMessage(this, message);
	}
}
