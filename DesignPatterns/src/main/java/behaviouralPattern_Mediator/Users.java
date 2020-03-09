package behaviouralPattern_Mediator;

public class Users {
	private String name;

    public Users(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }   

    public void sendMessage(String message) {
        Chat_Messages.showMessage(this, message);
    }

}
