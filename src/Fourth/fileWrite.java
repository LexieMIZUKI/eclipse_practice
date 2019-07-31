package Fourth;
import java.io.*;
public class fileWrite {
	public void transWriteByBuf(String s1,String s2) {
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\LexieLUV\\Desktop\\programming\\file\\hello.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write(s1+s2);
			bw.close();
			fos.close();
			osw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String transReadByBuf() throws IOException{
			FileInputStream fis = new FileInputStream("C:\\Users\\LexieLUV\\Desktop\\programming\\file\\hello.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			String s1 = br.readLine();
			String s2 = br.readLine();
			fis.close();
			isr.close();
			br.close();
			return s1+"\n"+s2;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		fileWrite fw = new fileWrite();
		fw.transWriteByBuf("你好吗？","我很好！");
		System.out.print(fw.transReadByBuf());
	}
}
