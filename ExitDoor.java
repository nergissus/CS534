
public class ExitDoor extends StaticObject {

	private boolean open;
	GameMap gm;
	
	
	public boolean isAllMonstersCleared() {
		
		if(Monster.numOfMonsters == 0) {
			
			return true;
		}
		
		else {
			
			return false;
		}
		
	}
	
	public void openDoor() {
		
		if(isAllMonstersCleared()) {
			
			this.open=true;
			gm.setDoorOpen();  //close door image replaces with open door image
		}
	}
	
	public boolean isOpened() {
		
		if(this.open == true) {
			
			return true;
		}
		
		else {
			
			return false;
		}
	}
}
