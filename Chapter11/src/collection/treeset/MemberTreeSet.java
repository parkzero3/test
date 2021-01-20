package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>(new Member()); // Comparator 를 사용시 매개변수를 작성해야함  comparable 을 더 많이 사용함
	}
	public void addMember(Member member) {
		treeSet.add(member);
	}
	public boolean removeMember (int memberId) {
		
		Iterator<Member> ir = treeSet.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			if(member.getMemberID() == memberId) {
				treeSet.remove(member);
				return true;
				}
			}
		System.out.println(memberId + " 번호가 존재 하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : treeSet) {
			System.out.println(member);
		}
			System.out.println();
	}
}
