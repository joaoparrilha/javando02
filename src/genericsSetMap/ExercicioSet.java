package genericsSetMap;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioSet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<Integer> allStudents = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int totalStudentsA = sc.nextInt();
		
		for (int i = 0; i < totalStudentsA; i++) {
			int student = sc.nextInt();
			allStudents.add(student);
		}
		
		System.out.print("How many students for course B? ");
		int totalStudentsB = sc.nextInt();
		
		for (int i = 0; i < totalStudentsB; i++) {
			int student = sc.nextInt();
			allStudents.add(student);
		}
		
		System.out.print("How many students for course C? ");
		int totalStudentsC = sc.nextInt();
		
		for (int i = 0; i < totalStudentsC; i++) {
			int student = sc.nextInt();
			allStudents.add(student);
		}
		
		
		System.out.println("Total students: " + allStudents.size());
		
		
		
		sc.close();
	}
}
