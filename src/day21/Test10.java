package day21;

interface Lambda_01{
	public void lam();
}

class Test implements Lambda_01{

	@Override
	public void lam() {
		System.out.println("Lambda_01");
		
	}
	
}

interface Lambda_02{
	public void lam(Object obj);
}

interface Lambda_03<Integer>{
	public void lam(Integer num);
}

class Test03 implements Lambda_03{

	@Override
	public void lam(Object num) {
		System.out.println("기본 설정");
		
	}
	
}
public class Test10 {

	public static void main(String[] args) {
		
		Lambda_03<Integer> lam033 = e ->{
			System.out.println("test");
		};
		lam033.lam(4);
		
		Lambda_03<Integer> lam03 = new Lambda_03<Integer>(){
		
			@Override
			public void lam(Integer num) {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		Lambda_02 lam002 = (e) -> {
			e += "날씨가 추워요";
			System.out.println("lam002실행 => " + e);
		};
		lam002.lam("오늘");
		
		Lambda_02 lam02 = new Lambda_02() {
		
			@Override
			public void lam(Object obj) {
				
				
			}
			
		};
		Lambda_01 lam01 = ()-> System.out.println("변경식");
		lam01.lam();
		
		Lambda_01 lam = new Lambda_01() {

			@Override
			public void lam() {
				System.out.println("실행");
				
			}
			
		};
		lam.lam();
		//Test t = new Test();
		//t.lam();
		//람다식은 추상메소드가 하나일때만 이용가능하다
	}

}
