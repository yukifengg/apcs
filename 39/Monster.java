public class Monster{
	private boolean status;
	private int health;
	private int damage;
	private int defense;

	public Monster(){
	health = 100;
	damage = 500;
	defense = 25;
	status = true;
	}

	public boolean isAlive(){
	return status;

}
	public int attack( Protagonist protagonistname){
	int d = damage - protagonistname.defense;
	protagonistname.health = protagonistname.health - d;
	if (protagonistname.health <= 0){
		protagonistname.status = false;
	}
	return d;
}

	public void setHealth(int a){
	health = a;
}
}
