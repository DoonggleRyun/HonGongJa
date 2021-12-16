package honGongJa.collection.arrayList;

import honGongJa.collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();

		Member memberlee = new Member(101, "�̼���");
		Member memberKim = new Member(102, "������");
		Member memberShin = new Member(102, "�Ż�ȣ");

		memberArrayList.addMember(memberlee);
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberShin);

		memberArrayList.showAll();
		memberArrayList.removeMember(memberKim.getMemberId());
		memberArrayList.showAll();
	}

}
