package inheritance;
    public class Employee extends Person {
        private String employeeId;
    
        // Constructor
        public Employee(String name, int age, String employeeId) {
            super(name, age);
            this.employeeId = employeeId;
        }
    
        // Override getDetails method to include employeeId
        @Override
        public void getDetails() {
            super.getDetails(); // Call superclass method to display name and age
            System.out.println("Employee ID: " + employeeId);
        }
    
        // Main method to demonstrate inheritance
        public static void main(String[] args) {
            Employee emp = new Employee("John Doe", 30, "1001");
    
            // Call getDetails method of Employee
            emp.getDetails();
        }
    }
    
    public Employee(String name, int age, String employeeId){
       super(name, age);
       this.employeeId = employeeId;
    }

    @Override
    public void getDetails() {
        super.getDetails(); // Call superclass method to display name and age
        System.out.println("Employee ID: " + employeeId);
    }



    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 30, 1001);

        // Call displayDetails method of Employee
        emp.displayDetails();
    }

}

