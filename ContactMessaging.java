package pck1;
import java.util.Date;
public class ContactMessaging {
	public static void showMessage(User user, String message) {
		System.out.println(new Date().toString() + " [" + user.accessName() + "] :" + message );
	}
}
