package auto;

public class Golf extends Auto {
	
	int v;
	
	Golf(int v){
		this.v = v;
	}

	void fahren() {
		System.out.println("Ich fahre "+ v +"kmH");
	}
}
