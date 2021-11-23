package honGongJa.instance;
/*
 * 
 불변의 값을 상수라고 부른다. 불변의값을 저장하는 변수를 자바에서는 constant상수라고 한다.
 상수는 static이면서 fianal이어야 한다. static final 필드는 객체마다 존재하지 않고 클래스에만 존재한다.
 그리고 한 번 초기값이 저정되면 변경할 수 없다.
 (final은 상수가 아님. final은 초기화시 값이 최종값이 돼서 수정할 수 없는 값일 뿐, 
 객체마다 저장할 수있고 여러가지 값으로 초기화된다. 그런데 상수는 클래스에만 존재하고 여러가지로 초기화 ㄴㄴ)  

상수 이름은 모두 대문자로 작성하는 것이 관례다. 만약 서로 다른 단어가 혼합된 이름이라면 언더바로 단어들을 연결해준다.
*
*/

public class Earth {
	static final double EARH_RADIUS = 6400;
	static final double EARTH_AREA = 4 * Math.PI * EARH_RADIUS * EARH_RADIUS;
	
}
