package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	public void addMember(Member member) {
		hashMap.put(member.getMemberID(), member);
	}
	public boolean removeMember(int memberID) {
		if(hashMap.containsKey(memberID)) {
			hashMap.remove(memberID);
			return true;
		}
		System.out.println("회원 번혼가 없습니다.");
		return false;
	}
	
	public void showAllMember() {  //키와 밸류를 따로따로 순회하여야함
		Iterator<Integer> ir = hashMap.keySet().iterator(); //키값
		
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
			//hashMap.values().iterator(); //밸류값
	}
		System.out.println();
	}
}
