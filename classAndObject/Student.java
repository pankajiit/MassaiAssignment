import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentName;
    private List<Course> enrolledCourses;

    public Student(String studentName){
        this.studentName = studentName;
        this.enrolledCourses = new ArrayList<>(); 
    }

     public void addCourse(Course course) {
        enrolledCourses.add(course);
    }

    // Method to display student details along with enrolled courses
    public String getDetails() {
        StringBuilder details = new StringBuilder("Student Name: " + studentName + "\nEnrolled Courses:\n");
        for (Course course : enrolledCourses) {
            details.append(course.toString()).append("\n");
        }
        return details.toString();
    }
    
}
