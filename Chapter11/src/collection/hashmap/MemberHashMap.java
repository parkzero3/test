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
		System.out.println("ȸ�� ��ȥ�� �����ϴ�.");
		return false;
	}
	
	public void showAllMember() {  //Ű�� ����� ���ε��� ��ȸ�Ͽ�����
		Iterator<Integer> ir = hashMap.keySet().iterator(); //Ű��
		
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
			//hashMap.values().iterator(); //�����
	}
		System.out.println();
	}
}
