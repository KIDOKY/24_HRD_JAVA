package day03;
import java.util.ArrayList;
public class MemberTest {

	public static void main(String[] args) {
		
		Member user1 = new Member("홍길동", "hong");
		
		ArrayList<Member> memlist = new ArrayList<Member>();
		memlist.add(user1);
		memlist.add(new Member("강길동", "kang"));
		
		for(Member m : memlist) {
			System.out.println(m.name + "\t" + m.id);
		}
		
		MemberService memberService = new MemberService();
		
		boolean result = memberService.login("hong", "12345");
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		
	}

}
