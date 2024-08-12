package day05;
import java.awt.*;

class Button {
	// 정적 중첩 인터페이스
	public static interface ClickListener {
		void onClick();
	}
	
	private ClickListener clistener;
	
	public void setClickListener(ClickListener clistener) {
		this.clistener = clistener;
	}
	
	public void onClick() {
		this.clistener.onClick();
	}
}

public class ButtonExample {

	public static void main(String[] args) {
	
	Button okBtn = new Button();
	
	// 로컬 클래스
	class OkListener implements Button.ClickListener {

		@Override
		public void onClick() {
			System.out.println("OK 버튼을 클릭했습니다.");
			
		}
		
	}
	
	okBtn.setClickListener(new OkListener());
	okBtn.onClick();

	}
}
