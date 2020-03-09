package structuralPattern_Bridge;

public class BridgePattern_Example {
		  public static void main(String[] args) {
		 
		    Television sonyNewRemote = new Sony(new NewRemote());
		    sonyNewRemote.on();
		    sonyNewRemote.off();
		    System.out.println();
		    
		   
		    Television philipsNewRemote = new Philips(new NewRemote());
		    philipsNewRemote.on();
		    philipsNewRemote.off();
		    
		  }
		}

	abstract class Television {
		  Remote remote;
		  
		  Television(Remote r) {
		    this.remote = r;
		  }
		  
		  abstract void on();
		  abstract void off();
		}

		class Sony extends Television {
		  Remote remoteType;
		  Sony(Remote r) {
		    super(r);
		    this.remoteType = r;
		  }
		  
		  public void on(){
		    System.out.print("Zee TV ON: ");
		    remoteType.on();
		  }
		    
		  public void off(){
		    System.out.print("Zee TV OFF: ");
		    remoteType.off();
		  }
		}
		    
		class Philips extends Television {
		  Remote remoteType;
		  
		  Philips(Remote r) {
		    super(r);
		    this.remoteType = r;
		  }
		  
		  public void on(){
		    System.out.print("Philips TV ON: ");
		    remoteType.on();
		  }
		    
		  public void off(){
		    System.out.print("Philips TV OFF: ");
		    remoteType.off();
		  }
		}

		interface Remote {
		  public void on();
		  public void off();
		}

		class NewRemote implements Remote {
			public void on() {
		    System.out.println("ON with New Remote");
		  }
		  public void off() {
		    System.out.println("OFF with New Remote");
		  }
		  
		}

		

