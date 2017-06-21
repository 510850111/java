import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.Buffer;


public class Test {
	public static void main(String[] args) throws UnsupportedEncodingException {
		try {
			Reader fr = new FileReader("test.txt");
			Writer fw = new FileWriter("2.txt");
		    BufferedReader br = new BufferedReader(fr);
		    String line = null;
		    while ((line = br.readLine())!= null) {
				fw.write(line+"\r\n");
				
			}
		    br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		try {
//			InputStream in = new FileInputStream("test.txt");
//			OutputStream out = new FileOutputStream("1.txt");
//		    byte[] buffer = new byte[2<<10];
//		    int len = 0;
//		    while((len = in.read(buffer,0,buffer.length)) > 0){
//		    	out.write(buffer, 0, len);
//		    	
//		    }
//		    in.close();
//		    out.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
	}

	private static void disp(byte[] buffer) {
		for (int i = 0; i < buffer.length; i++) {
			System.out.printf("%x ",buffer[i]);
		}
	}
}
