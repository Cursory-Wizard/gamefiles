package gamefiles;

public class inventory extends playerClass{

	weapon [] weaponList = new weapon [10];
	armor [] armorList = new armor [10];
	
	
	public void addWeapon(weapon newWeapon){
		if (weaponList.length < 20){
			weaponList[weaponList.length]= newWeapon;
		}
		else {
			System.out.println("You already look a bit...spikey...and so opt not to add another blade.");
		}
}
}
