package Fourth;

import java.io.File;
import java.io.IOException;

public class makeFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1 = new File("C:\\Users\\LexieLUV\\Desktop\\programming\\file");
		File file2 = new File("C:\\Users\\LexieLUV\\Desktop\\programming\\file\\Monday.docx");
		System.out.println("�Ƿ����ļ���"+file1.isFile());
		System.out.println("�Ƿ���Ŀ¼��"+file1.isDirectory());
		System.out.println("�Ƿ�ɶ���"+file1.canRead());
		System.out.println("�Ƿ��д��"+file1.canWrite());
		System.out.println("***********************************");
		if(file2.exists()) {
			System.out.println("�ļ�����"+file2.getName()+"\n·������"+file2.getParent());
		}else {
			try {
				System.out.println("�ļ������ڣ��Ѵ�����");
				file1.mkdir();
				file2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("�ļ�����"+file2.getName()+"\n·������"+file2.getParent());
		}
		
	}

}
