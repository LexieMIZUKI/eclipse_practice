package Fourth;

import java.io.File;
import java.io.IOException;

public class makeFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1 = new File("C:\\Users\\LexieLUV\\Desktop\\programming\\file");
		File file2 = new File("C:\\Users\\LexieLUV\\Desktop\\programming\\file\\Monday.docx");
		System.out.println("是否是文件："+file1.isFile());
		System.out.println("是否是目录："+file1.isDirectory());
		System.out.println("是否可读："+file1.canRead());
		System.out.println("是否可写："+file1.canWrite());
		System.out.println("***********************************");
		if(file2.exists()) {
			System.out.println("文件名："+file2.getName()+"\n路径名："+file2.getParent());
		}else {
			try {
				System.out.println("文件不存在，已创建！");
				file1.mkdir();
				file2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("文件名："+file2.getName()+"\n路径名："+file2.getParent());
		}
		
	}

}
