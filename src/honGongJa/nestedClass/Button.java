package honGongJa.nestedClass;

// 중첩인터페이스는 클래스의 멤버로 선언된 인터페이스를 말한다.
// 주로 정적멤버 인터페이스를 많이 사용하는데 UI프로그래밍에서 이벤트를 처리할 목적으로 많이 활용된다.

public class Button {

	onClickListener listener; // 인터페이스 타입 필드

	void setOnclickListener(onClickListener clickListener) {
		this.listener = clickListener;
	}

	void touch() {
		listener.onClick();

	}

	static interface onClickListener { // 중첩 인터페이스

		void onClick();
	}
}
