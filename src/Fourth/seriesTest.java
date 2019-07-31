package Fourth;
import java.io.*;

public class seriesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("apple系列产品信息：");
		series iphone = new series(123,"iphone","telephone",4888.0f);
		series ipad = new series(234,"ipad","computer",5088.0f);
		series macbook = new series(345,"macbook","computer",10688.0f);
		series iwatch = new series(256,"iwatch","watch",4799.0f);
		
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\LexieLUV\\Desktop\\programming\\file\\product.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			FileInputStream fis = new FileInputStream("C:\\Users\\LexieLUV\\Desktop\\programming\\file\\product.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			series[] s = {iphone,ipad,macbook,iwatch};
			oos.writeObject(s);
			oos.flush();
			try {
				series[] s2 = (series[])ois.readObject();
				for(series s3:s2) {
					System.out.println(s3);
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			fos.close();
			fis.close();
			oos.close();
			ois.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}

  }
}
