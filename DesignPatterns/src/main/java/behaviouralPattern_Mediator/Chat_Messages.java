package behaviouralPattern_Mediator;

import java.util.Date;

public class Chat_Messages {
	public static void showMessage(Users user, String message) {
        System.out.println(new Date().toString() + "[" + user.getName() + "]: " + message);
    }

}
