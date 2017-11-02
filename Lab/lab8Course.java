package lab7Pack;

import java.util.ArrayList;

public class Course {
    
    // knows
    private ArrayList<Student> students;
    private String courseName;
    
    // does
    public Course(String course)
    {
        students = new ArrayList<Student>();
        courseName = course;
    }
    
    public void addStudent(Student s)
    {
        students.add(s);
    }
    
    // make it private, only for internal use (average)
    private int count()
    {
        return students.size();
    }
    
    public double average()
    {
        double courseAverage, total;
        total = 0;
        for (Student s : students)
        {
            total += s.average();
        }
        courseAverage = total / count();
        return courseAverage;  
    }
    
    public String roll()
    {
        String result;
        result = "Student roster: \n";
        for (Student s : students)
        {
        	result += s + "\n\n";
        }
        return result;
        
    }
    
    
    public String toString()
    {
        String result;
        result = "Course name: " + courseName + "\nCourse average: " + average();
        return result;
    }
    

}
