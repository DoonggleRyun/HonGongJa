package honGongJa.array;

public enum Week {
	/* 열거타입은 한정된 값인 열거 상수중에서 하나의 상수를 저장하는 타입이다. */

	//관례적으로 열거 상수는 모두 대문자로 작성한다.
	MONDAY,
	TUESDAY,
	WEDENSDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY
}


// 열거 타입을 선언했다면 이제 열거 타입을 사용할 수 있다.
// 열거 타입도 하나의 타입이므로 변수를 선언하고 사용해야 한다.
// 열거 타입 변수를 선언했다면 열거 상수를 저장할 수 있다. 열거 상수는 단독적으로 사용할 수 없고 반드시
// '열거타입.열거상수' 형태로 사용된다.
// Week today = Week.SUNDAY;
// 열거 상수는 열거객체로 생성된다.
// WEEK의 경우 mon~ sun까지 총 7개의 Week객체로 생성된다.
// today는 스택영역에. today에 저장되는 값은 Week.Sunday열거 상수가 참조하는 객체의 번지수. 
// 따라서 열거 상수 Week.Sunday와 today변수는 서로 같은 Week 객체를 참조하게 된다.
// today == Week.SUNDAY 는 true임.