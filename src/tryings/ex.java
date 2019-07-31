package tryings;

public class ex extends Exception {
	ex(double i){
		super("输入了负数"+i+"，请重新输入！");
	}

	@Override
	public String toString() {
		return "ex [输入了负数]";
	}
}
