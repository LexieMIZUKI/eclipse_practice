package Fourth;
import java.io.*;

public class bufferCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("C:\\Users\\LexieLUV\\Desktop\\programming\\file\\one.txt");
		File f2 = new File("C:\\Users\\LexieLUV\\Desktop\\programming\\file\\two.txt");
		if(!f1.exists()&&!f2.exists()) {
			try {
				f1.createNewFile();
				f2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			byte[] b1 = new byte[10000];
			Long l1 = System.currentTimeMillis();
			FileOutputStream fos1 = new FileOutputStream(f1);
			FileInputStream fis1 = new FileInputStream(f1);
			for(int i = 0;i < 10000;i++) {
				fos1.write('a');
				fis1.read();
			}
			fis1.close();
			fos1.close();
			Long l2 = System.currentTimeMillis();
			System.out.println(f1.getName()+"不使用缓冲流\n用时为："+(l2 - l1));
			
			byte[] b2 = new byte[10000];
			Long l3 = System.currentTimeMillis();
			FileOutputStream fos2 = new FileOutputStream(f2);
			BufferedOutputStream bos = new BufferedOutputStream(fos2);
			FileInputStream fis2 = new FileInputStream(f2);
			BufferedInputStream bis = new BufferedInputStream(fis2);
			for(int i = 0;i < 10000;i++) {
				bos.write('b');
				bis.read();
			}
			bos.flush();
			bis.close();
			bos.close();
			fis2.close();
			fos2.close();
			Long l4 = System.currentTimeMillis();
			System.out.println(f2.getName()+"使用缓冲流\n用时为："+(l4 - l3));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
