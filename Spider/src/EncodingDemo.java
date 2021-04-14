import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.Base64;


public class EncodingDemo {
	
	public static void main(String[] args) {
		String password = "P@ssw0rd";
		System.out.println(password);
		
		Encoder encoder = Base64.getEncoder();
		String encoderPassword = encoder.encodeToString(password.getBytes());
		System.out.println(encoderPassword);
		
		Decoder decoder = Base64.getDecoder();
		String decoderPassword = new String( decoder.decode(encoderPassword.getBytes()));
		System.out.println(decoderPassword);
		
	}
}
