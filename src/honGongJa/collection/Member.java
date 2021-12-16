package honGongJa.collection;

public class Member {
// 

	private int memberId;
	private String memberName;

	public Member(int memberId, String memberName) {
		// TODO Auto-generated constructor stub
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;	
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id: " + memberId + ", name: " + memberName;
	}
}
