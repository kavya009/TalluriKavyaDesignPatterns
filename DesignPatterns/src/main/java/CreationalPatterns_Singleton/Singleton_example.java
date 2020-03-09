package CreationalPatterns_Singleton;

public class Singleton_example {
	 public static void main(String[] args) {
		 Singleton_example k = Singleton_example.getInstance();
		 k.str = (k.str).toUpperCase();
		 System.out.println(k.str);
		 k.str = (k.str).toLowerCase();
		 System.out.println(k.str);
		  }
	 private static Singleton_example instance = null;
	public String str;
	private Singleton_example() {
	str = "Desgin patterns";

	}
	public static Singleton_example getInstance () {
	if(instance == null)
	instance = new Singleton_example();
	return instance;
	}
}