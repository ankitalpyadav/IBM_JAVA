
public class EmailValidator {

	public static void main(String[] args) {
		
//		String regex = "^([a-zA-Z0-9+_-]{4,})+@(([a-zA-Z0-9\\-]{3,3})+.)+([a-zA-Z]{2,2})+$";
		
		String email = "lpyadav@gma.co";
		int at = email.indexOf('@');
		int dot = email.indexOf('.');
		
		if (at == email.lastIndexOf('@') && dot == email.lastIndexOf('.')
				
				&& at>3 && dot > at + 3 && email.length() > dot +2) {
			System.out.println("Given email-id is valid");
	      } else {
	         System.out.println("Given email-id is not valid");
	      }
	      
//	      boolean result = email.matches(regex);
//	      if(result) {
//	         System.out.println("Given email-id is valid");
//	      } else {
//	         System.out.println("Given email-id is not valid");
//	      }

	}

}
