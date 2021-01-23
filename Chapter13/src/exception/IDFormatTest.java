package exception;

public class IDFormatTest {
	
	//테스트 코드작성
	
	private String userID;
	

	public String getUserID() {
		return userID;
	}


	public void setUserID(String userID) throws IDFormatException {
		if(userID == null) {
			//throw = 익셉션 발생시키는것
			//throws = 익셉션을 미루는것
			throw new IDFormatException("아이디는 null 일수 없습니다.");
		}else if(userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 사용하세요.");
		}
		this.userID = userID;
	}


	public static void main(String[] args) {
		
		IDFormatTest idTest = new IDFormatTest();
		
		String myId = null;
		
		try {
			idTest.setUserID(myId);
		} catch (IDFormatException e) {
			System.out.println(e);
		}
		
		myId = "123456";
		try {
			idTest.setUserID(myId);
		} catch (IDFormatException e) {
			System.out.println(e);
		}
	}

}
