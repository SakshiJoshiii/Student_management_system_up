import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

	public static void main(String[] args)throws IOException {
		
		System.out.println("Student Management app");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			System.out.println("press 1 to add Student");
			System.out.println("press 2 to delete Student");
			System.out.println("press 3 to  display Student");
			System.out.println("press 4 to exit app ");
			int c = Integer.parseInt(br.readLine());
			if(c == 1) {
				//ADD Student 
				System.out.println("Enter student name: ");
				String name = br.readLine();
				
				System.out.println("Enter student phone: ");
				String phone = br.readLine();
				
				System.out.println("Enter student city: ");
				String city = br.readLine();
				
				//create student object 
				Student st = new Student(name , phone ,city);
				boolean answer = StudentDao.insertStudentToDB(st);
				if(answer) {
					System.out.println("Student is added successfully");	
				}else {
					System.out.println("something went wrong");
				}
				System.out.println(st);
				
				
			}else if(c == 2) {
				//DELETE Student
				System.out.println("Enter student id to delete");
				int userId = Integer.parseInt(br.readLine()) ;
				boolean f = StudentDao.deleteStudent(userId);
				if(f) {
					System.out.println("deleted......");
				}else {
					System.out.println("something went wrong");
				}
				
				
			}else if(c == 3) {
				//DISPLAY Student
				StudentDao.showAllStudent();
				
				
				
			}else if (c == 4){
				//EXIT
				
				
				break;
			}else {
				
				
				
			}
			
		}
		System.out.println("Thank you ");
	}

}
