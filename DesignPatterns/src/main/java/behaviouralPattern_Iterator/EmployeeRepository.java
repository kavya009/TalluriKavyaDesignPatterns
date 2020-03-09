package behaviouralPattern_Iterator;

public class EmployeeRepository implements Sector {
    public String[] emp = {"Elina", "Klaus", "Stefen", "Freya", "Caroline"};
    public Iterator get() {
        return new EmployeeIterator();
    }
    
    private class EmployeeIterator implements Iterator {
        int i;
        
        
        public boolean Next() {
            if(i < emp.length) {
                return true;
            } 
            return false;
        }

        
        public Object next() {
            if(this.Next()) {
                return emp[i++];
            }
            return null;
        }
    }
}




