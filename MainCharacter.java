import java.awt.Image;


public class MainCharacter implements Movable { //includes Movable interface because main character is movable 

	private Image graphic;
	private int score;
	private int life;
	GameMap gameMap;
	
	public void addScore(int score) {
		
		this.score+=score;
		
	}
	
	public boolean decreaseLife() {
		
		this.life = this.life-1;
		
		if(this.life == 0) {
			
			return false;  //game is over 
		}
		
		else {
			
			return true;  //game continues
		}
	}
	
	public void putBomb(Bomb b) {
		
		gameMap.addBomb(b);
		
	}

	@Override
	public void move() {  
		// TODO Auto-generated method stub
		
	}
}
