package hashing_practical;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		// TODO Auto-generated method stub
		SecureRandom r = new SecureRandom();
		byte[] salt = new byte[16];

		/*for (int i=0;i<salt.length; i++) {
			
		}*/
		r.nextBytes(salt);
		
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(salt);
		String passw = "123";
		byte[] hashedPassword = md.digest(passw.getBytes(StandardCharsets.UTF_8));
		String hpw = Arrays.toString(hashedPassword);
		System.out.println(hpw);
	}

}
