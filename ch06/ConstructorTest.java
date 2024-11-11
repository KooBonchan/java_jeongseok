package ch06;

class Data1{
	int value;
}

class Data2{
	int value;
	Data2(int value){
		this.value = value;
	}
}


public class ConstructorTest {
	public static void main(String[] args) {
		Data1 data1 = new Data1();
		Data2 data2 = new Data2(10);
			//default compiler is not created.
	}
}
