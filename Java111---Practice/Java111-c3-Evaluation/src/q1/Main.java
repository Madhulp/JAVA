package q1;

public class Main {
	
	public static void main(String[] args) {
		
		Object[] given = {
				new Student(23, "rakesh", 450),
				new Employee(12,  "Lokesh", 84000),
				"String",
				50
				};
		
		Object[] modifiedArray = changeArray(given);
		
		for(Object i: modifiedArray) {
			System.out.println(i);
		}
		
		
	}
	
	public static Object[] changeArray(Object[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] instanceof Student) {
				Student s1 = (Student) arr[i];
				s1.setMarks(s1.getMarks()+10);
			}
			else if(arr[i] instanceof Employee) {
				Employee e1 = (Employee) arr[i];
				e1.setSalary(e1.getSalary() + 10000);
			}
			else if(arr[i] instanceof String) {
				String s = (String) arr[i];
				arr[i]= new StringBuilder(s).reverse().toString();
			}
			else if(arr[i] instanceof Integer) {
				Integer num = (Integer) arr[i];
				arr[i] = num+20;
			}
		}
		return arr;
	}
	

}
