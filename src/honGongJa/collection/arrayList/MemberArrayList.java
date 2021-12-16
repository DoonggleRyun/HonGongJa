package honGongJa.collection.arrayList;

import java.util.ArrayList;
import honGongJa.collection.Member;

public class MemberArrayList {

	private ArrayList<Member> arrayList;

	public MemberArrayList() {

		arrayList = new ArrayList<Member>();
	}

	public void addMember(Member member) {
		arrayList.add(member);
	}

	public boolean removeMember(int memberId) {

		for (int i = 0; i < arrayList.size(); i++) {
			Member tempMember = arrayList.get(i);
			int tempId = tempMember.getMemberId();
			if (tempId == memberId) {
				arrayList.remove(i);
				return true;
			}
		}

		System.out.println(memberId + "가 중복이 없습니다.");
		return false;
	}
	
	public void showAll() {
		for (Member member : arrayList) {
			System.out.println(member.toString());
		}
		System.out.println(arrayList);
	}
	
	
}
