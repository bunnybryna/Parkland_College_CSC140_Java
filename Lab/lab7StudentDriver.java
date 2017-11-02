package lab7Pack;

import java.lang.Math;

public class StudentDriver {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1);
		System.out.println();
		
		Student s2 = new Student("Yoda", 100, 90, 95);
		System.out.println(s2);
		if (s2.getTestScore(1) > s2.getTestScore(2) && s2.getTestScore(1) > s2.getTestScore(3))
			System.out.println(s2.getName() + " had highest score in the first test");			
		System.out.println();
		
		Student s3 = new Student();
		s3.setName("Obi wan");
		s3.setTestScore(1, 80);
		s3.setTestScore(2, 95);
		s3.setTestScore(3, 74);		
		System.out.println(s3);	
		
		int max = Math.max(s2.getTestScore(2), s3.getTestScore(2));
		if (max == s2.getTestScore(2))
			System.out.println(s2.getName() + " had higher score in the second test compared with " 
								+ s3.getName());
		else
			System.out.println(s3.getName() + " had higher score in the second test compared with " 
					+ s2.getName());			

	}

}
