public class Course{

    private String courseName;
    private int credits;

    public Course(String courseName, int credits){
        this.courseName = courseName;
        this.credits = credits;
    }

    public String getCourseName(){return this.courseName;}

    public int getCredit(){ return this.credits; }

}