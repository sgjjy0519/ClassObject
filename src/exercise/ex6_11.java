// Member클래스에 생성자 선언 및 초기화
// 로그인, 로그아웃 메서드

package exercise;

public class ex6_11 {

	public static void main(String[] args) {
		Member mem = new Member();
		
		boolean result = mem.login("Yang", "1234");
		
		if(result) {
			System.out.println("Yang님이 로그인 되었습니다.");
			mem.logout("Yang");
		}else {
			System.out.println("id나 password가 올바르지 않습니다.");
		}
	}

}

class Member{
	String name;
	String id;
	String password;
	int age;
	
//	Member(String name, String id, String password, int age){
//		this.name = name;
//		this.id = id;
//		this.password = password;
//		this.age = age;
//		
//	}
		
	public boolean login(String id, String password) {
		if(id.equals("Yang") && (password.equals("1234"))) {
			return true;
		}else {
			return false;
		}
	}
	
	public void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}
}