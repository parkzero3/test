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
		System.out.println("ȸ�� ��ȥ�� �����ϴ�.");
		return false;
	}
	
	public void showAllMember() {  //Ű�� ����� ���ε��� ��ȸ�Ͽ�����
		Iterator<Integer> ir = treeMap.keySet().iterator(); //Ű��
		
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = treeMap.get(key);
			System.out.println(member);
			//hashMap.values().iterator(); //�����
	}
		System.out.println();
	}
}
