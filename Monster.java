import java.awt.Image;


public class Monster implements Movable { //includes Movable interface because monster is movable

	private int life=2;  //each monster has 2 lives at the beginning of the game
	MainCharacter mainCharacter;
	GameMap map;
	public static int numOfMonsters = 5;  //game starts with 5 monsters at the beginning of the game
	
public void decreaseLife() {
		
		this.life = this.life-1; //number of lives of monster are decreased by one
		
		if(life == 0) {  
			
		   map.removeObjectFromGUI(this);  //clears dead monster from GUI
		   mainCharacter.addScore(20); //main character gathers 20 points for each dead monster
		   numOfMonsters--;  //total number of monsters decrease by one
		}
		
	}

@Override
public void move() { //enum directions 
	
}

	
}
