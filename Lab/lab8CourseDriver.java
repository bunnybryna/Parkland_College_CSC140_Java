package lab7Pack;

public class CourseDriver {

	public static void main(String[] args) {
		Student s1 = new Student("Yoda", 100, 90, 95);
		Student s2 = new Student("Anakin Skywalker", 80, 100, 50);
		Student s3 = new Student("Princess Leia", 90, 90, 90); 
				
		Student s4 = new Student();
		s4.setName("Obi Wan");
		s4.setTestScore(1, 85);
		s4.setTestScore(2, 95);
		s4.setTestScore(3, 90);

		Student s5 = new Student();
		s5.setName("Darth Sidious");
		s5.setTestScore(1, 90);
		s5.setTestScore(2, 95);
		s5.setTestScore(3, 100);
			
        Course c = new Course("Star Wars");
        c.addStudent(s1);
        c.addStudent(s2);
        c.addStudent(s3);
        c.addStudent(s4);
        c.addStudent(s5);     
        System.out.println(c.roll());
        System.out.println(c);        

	}

}