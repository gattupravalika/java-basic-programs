package Constructor;

   
		//Instance variable
class Student2
{
		int studentId;
		String studentName;
		String courseName;
		int marks;
		

		
		

		public Student2(int studentId, String studentName, String courseName, int marks) {
			super();
			this.studentId = studentId;
			this.studentName = studentName;
			this.courseName = courseName;
			this.marks = marks;
		}





		public String Stringgrade()
		{
			String result=" ";
			if(marks>=90){
				result="A Grade";
			}
			else
			{
				result="B Grade";
			}
			return result;
		}
}
		public class Student {
			public static void main(String[] args)
			{
				Student2 s1=new Student2(100, "Prava", "java",80);
				s1.Stringgrade();
			System.out.println("studentId: "+s1.studentId);
			System.out.println("studentName: "+s1.studentName);	
			System.out.println("student course: "+s1.courseName);	
			}
		}
	

	
	


