import java.security.*;
import javax.net.ssl.*;

public class ListCiphers {

	public static void main(String[] args) throws Exception {
		SSLContext context = SSLContext.getDefault();
		SSLSocketFactory sf = context.getSocketFactory();
		String[] cipherSuites = sf.getSupportedCipherSuites();

		for(String cipher : cipherSuites ) 
			System.out.println( cipher );
	}
}
