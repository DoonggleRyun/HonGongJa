package honGongJa.staticEx;

public class Student {

	static int serialNum = 10000;

	int studentID;
	String studentName;

	public Student() {
		// TODO Auto-generated constructor stub
		serialNum++;
		this.studentID = serialNum;
	}

	public static int getSerialNum() {
		int i = 10; //��������
		i++;
		System.out.println(i);
		//studentName = "ȫ�浿";// �������, �ν��Ͻ� ����
		
		return serialNum; //static ����, Ŭ���� ����
	}
}
