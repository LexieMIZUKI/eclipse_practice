package tryings;

public class ex extends Exception {
	ex(double i){
		super("�����˸���"+i+"�����������룡");
	}

	@Override
	public String toString() {
		return "ex [�����˸���]";
	}
}
