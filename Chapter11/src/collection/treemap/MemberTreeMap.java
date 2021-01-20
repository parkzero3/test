package collection.treemap;

import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {

	private TreeMap<Integer, Member> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>();
	}
	public void addMember(Member member) {
		treeMap.put(member.getMemberID(), member);
	}
	public boolean removeMember(int memberID) {
		if(treeMap.containsKey(memberID)) {
			treeMap.remove(memberID);
			return true;
		}
		System.out.println("회원 번혼가 없습니다.");
		return false;
	}
	
	public void showAllMember() {  //키와 밸류를 따로따로 순회하여야함
		Iterator<Integer> ir = treeMap.keySet().iterator(); //키값
		
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = treeMap.get(key);
			System.out.println(member);
			//hashMap.values().iterator(); //밸류값
	}
		System.out.println();
	}
}
