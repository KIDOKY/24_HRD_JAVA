package day03;

public class MemberService {
		
		// 로그인 메소드 정의
		public boolean login(String id, String password) {
			boolean result;
			if(id.equals("hong") && password.equals("12345")) {
				result = true;
			} else {
				result = false;
			}
			return result;
		}
		
		//로그아웃 메소드 정의
		public void logout(String id) {
			if(id.equals("hong")) {
				System.out.println(id + "님이 로그아웃 되었습니다.");
			}
		}
}
