package sec01.exam06;

// 중첩인터페이스
// static의 유무에 따라 제한범위가 달라진다.
// 버튼눌러서 이벤트 일어나는것도 객체로 만들어야함
public class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener =listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	static interface OnClickListener {
		void onClick();
	}
	
}
