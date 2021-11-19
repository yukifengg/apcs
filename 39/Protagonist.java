public class Protagonist{
	private String name;
	private boolean status;
	private int health;
	private int damage;
	private int defense;

	public Protagonist(String protagonistname){
  	health = 100;
  	damage = 100;
  	defense = 25;
  	name = protagonistname;
  	status = true;
	}

	public boolean isAlive(){
	   return status;
}

	public void specialize(){
  	damage = 1000;
  	defense = 10;
}
	public void normalize(){
  	damage = 50;
  	defense = 25;
	}

	public int attack(Monster monstername ){
  	int d = damage - monstername.defense;
  	monstername.health = monstername.health - d;
  	if (monstername.health <= 0){
  		monstername.status = false;
  		}
  	return d;
	}

	public String getName(){
  	return name;
  }

}
