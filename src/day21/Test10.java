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
		System.out.println("�⺻ ����");
		
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
			e += "������ �߿���";
			System.out.println("lam002���� => " + e);
		};
		lam002.lam("����");
		
		Lambda_02 lam02 = new Lambda_02() {
		
			@Override
			public void lam(Object obj) {
				
				
			}
			
		};
		Lambda_01 lam01 = ()-> System.out.println("�����");
		lam01.lam();
		
		Lambda_01 lam = new Lambda_01() {

			@Override
			public void lam() {
				System.out.println("����");
				
			}
			
		};
		lam.lam();
		//Test t = new Test();
		//t.lam();
		//���ٽ��� �߻�޼ҵ尡 �ϳ��϶��� �̿밡���ϴ�
	}

}
