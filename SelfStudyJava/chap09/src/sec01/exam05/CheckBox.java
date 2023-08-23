package sec01.exam05;

//체크박스할때 select를 써야된다
public class CheckBox {
	OnSelectListener listener;
	
	void setOnSelectListener(OnSelectListener listener) {
		this.listener = listener;
		System.out.println("CheckBox의 setOnSelectListener");
	}
	
	void select() {
		listener.onSelect();
		System.out.println("CheckBox의 select()");
	}
	
//	interface에는 출력 못함
//	추상클래스
	static interface OnSelectListener{
		void onSelect();
	}
}
