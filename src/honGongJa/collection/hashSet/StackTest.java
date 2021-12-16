package honGongJa.collection.hashSet;

import java.util.ArrayList;

class Mystack {
	
	private ArrayList<String> arrayStack = new ArrayList<String>();

	public void push(String data) {
		arrayStack.add(data);
	}

	public String pop() {

		int length = arrayStack.size();
		if (length == 0) {
			System.out.println("데이터 없음");
			return null;
		}
		
		String data = arrayStack.remove(length - 1);

		return data;
	}

}

public class StackTest {

	public static void main(String[] args) {

		Mystack mystack = new Mystack();
		mystack.push("a");
		mystack.push("b");
		mystack.push("c");
		
		System.out.println(mystack.pop());// LIFO 마지막에 넣은거 가장 먼저 pop
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
	}
}
