public class StudentMain {

    public static void main(String[] args) {
          // Create some courses
          Course course1 = new Course("Mathematics", 3);
          Course course2 = new Course("Computer Science", 4);
  
          // Create a student and add courses
          Student student = new Student("Alice");
          student.addCourse(course1);
          student.addCourse(course2);
  
          // Display student details
          System.out.println(student.getDetails());
        
    }

    
}
