
public class StringDemo {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = new String("Hello");
		String s3 = "Hello";
		
		System.out.println(s1);
		
		//Here we are comparing not the content but the address
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		s1 = s1 + " World";  //new memory location created
		
		System.out.println(s1);
		
		System.out.println(s1.length());
		System.out.println(s1.indexOf('o'));
		System.out.println(s1.lastIndexOf('o'));
		
		System.out.println(s1.charAt(5));
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3, 7));
		
		System.out.println(s1.replace('o', 'a'));
		System.out.println(s1);
		
		String week = "Sun-Mon-Tue-Wed-Thu-Fri-Sat";
		String[] days = week.split("-");
		for (String d : days) 
            System.out.println(d); 
		
		StringBuffer s = new StringBuffer("Ankita ");
		System.out.println(s.append( "Yadav"));
		

	}

}
