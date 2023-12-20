import java.util.*;
public class Lab604 {
	static Scanner scn = new Scanner(System.in);
	static String studentId,strSubjectID;
	static int subjectId;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputStudent();
	}
	
	public static void inputStudent() {
		do {
			System.out.print("Enter Studen  Id: ");
			studentId = scn.next();
			System.out.print("Enter Subject Id: ");
			subjectId = scn.nextInt();
			strSubjectID = subjectId+"";
		}while(!(isLength(studentId,strSubjectID)));
		System.out.println();
		displayData(isITStudent(studentId),isITSubject(strSubjectID));
	}
	public static boolean isLength(String id,String sub_id) {
		if (id.length()==10 && sub_id.length()==7) {
			return true;
		}
		return false;
	}
	public static boolean isITStudent(String id) {
		if(id.substring(0,3).equals("211")&&id.substring(3,6).equals("311")) {
			return true;
		}else return false;
	}
	public static boolean isITSubject(String subid) {
		if(subid.substring(0,2).equals("21")&&subid.substring(4,5).equals("1")) {
			return true;
		}
		else return false;
	}
	public static void displayData(boolean sid,boolean SuB_id) {
		if(sid) {
			System.out.println("Student id: "+studentId+" 1st year student in IT");
		}else {
			System.out.println("Student id: "+studentId+" is not 1st year student in IT");
		}
		if(SuB_id) {
			System.out.println("Enroll in courses for Year 1");
		}else {
			System.out.println("not Enroll in courses for Year 1");
		}
	}
}
