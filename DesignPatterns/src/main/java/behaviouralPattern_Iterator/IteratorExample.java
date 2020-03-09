package behaviouralPattern_Iterator;

public class IteratorExample {
	public static void main(String[] args) {

        EmployeeRepository emp_repo = new EmployeeRepository();

        for(Iterator iterator = emp_repo.get(); 
                iterator.Next();) {
            String emp = (String)iterator.next();
            System.out.println("Employee: " + emp);
        }
    }

}
