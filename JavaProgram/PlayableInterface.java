package JavaProgram;

interface Playable{
	void play();
}
class FootBall implements Playable{

	@Override
	public void play() {
		System.out.println("Playing football");
		
	}
	
}
class VolleyBall implements Playable{

	@Override
	public void play() {
		System.out.println("Playing volleyball");
		
	}
	
}
class BasketBall implements Playable{

	@Override
	public void play() {
		System.out.println("Playing basketball ");
		
	}
	
}

public class PlayableInterface {

	public static void main(String[] args) {
		FootBall football = new FootBall();
		VolleyBall volleyball = new VolleyBall();
		BasketBall basketball = new BasketBall();
		football.play();
		volleyball.play();
		basketball.play();
		
		
	

	}

}