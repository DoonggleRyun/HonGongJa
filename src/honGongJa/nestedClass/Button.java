package honGongJa.nestedClass;

// ��ø�������̽��� Ŭ������ ����� ����� �������̽��� ���Ѵ�.
// �ַ� ������� �������̽��� ���� ����ϴµ� UI���α׷��ֿ��� �̺�Ʈ�� ó���� �������� ���� Ȱ��ȴ�.

public class Button {

	onClickListener listener; // �������̽� Ÿ�� �ʵ�

	void setOnclickListener(onClickListener clickListener) {
		this.listener = clickListener;
	}

	void touch() {
		listener.onClick();

	}

	static interface onClickListener { // ��ø �������̽�

		void onClick();
	}
}
