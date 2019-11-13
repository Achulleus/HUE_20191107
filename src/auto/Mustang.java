package auto;

public class Mustang extends Auto {
	
	int v;
	
	Mustang(int v){
		this.v = v;
	}

	void fahren() {
		System.out.println("Ich fahre "+ v +"kmH");
	}
	
}
