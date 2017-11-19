package gamefiles;

public class playerClass {
	
	private int playerHealth;
	private int playerCurrentHealth;
	private int playerStrength;
	
	playerClass () {
		playerHealth = 10;
		playerCurrentHealth = 10;
		playerStrength = 12;
		
	}

	public int getHealth (){
		return playerCurrentHealth;
	}
	public int getStrength(){
		return playerStrength;
	}
	public void setHealth(int health){
		playerCurrentHealth = health;
	}
	public void checkMaxHealth(){
		if (playerCurrentHealth > playerHealth){
			playerCurrentHealth = playerHealth;
		}
	}
}
