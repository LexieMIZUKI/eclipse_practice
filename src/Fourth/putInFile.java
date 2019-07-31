package Fourth;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class putInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1 = new File("C:\\Users\\LexieLUV\\Desktop\\programming\\file\\speech.txt");
		if(!file1.exists()) {
			try {
				file1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			FileInputStream f = new FileInputStream(file1);
			int n = f.read();
			int count = 0;
			System.out.print("文本内容为：");
			while(n != -1) {
				System.out.print((char)n);
				n = f.read();
				count++;
			}
			System.out.println("\n统计结果为："+file1.getName()+"文件共有"+count+"个字节。");
			f.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
