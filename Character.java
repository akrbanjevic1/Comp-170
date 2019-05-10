public class Character {
	private String name;
	private String race;
	private int age;
	private int health;
	private int level;
	
	public Character(String n, String r, int a, int h, int l) {
		setName(n);
		setRace(r);
		setAge(a);
		setHealth(h);
		setLevel(l);
	}
	
	public void setLevel(int l) {
		this.level = l;
	}
	
	public int getLevel() {
		return level;
	}
	
	public void setHealth(int h) {
		this.health = h;
	}
	
	public int getHealth() {
		return health;
	}
	
	
	public void setName(String n) {
		this.name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setRace(String c) {
		this.race = c;
	}
	
	public String getRace() {
		return race;
	}
	
	public void setAge(int a) {
		this.age = a;
	}
	
	public int getAge() {
		return age;
	}
	
	public String toString() {
		String description = this.name + " is a member of the " + this.race + " race. The character in question is " +
				this.age + " years old, and the health is: " + health + "." + " The current level is " + level;
		return description;
	}
	
//	public boolean Strongerthan(Character otherCharacter) {
//		if (powerlevel > otherCharacter.getPowerlevel()) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
	
//	public boolean powerEquals(Character otherCharacter) {
//		if (powerlevel == otherCharacter.getPowerlevel()) {
//			return true;
//		}
//		
//		else {
//			return false; 
//		}
//	}
	
	
	public void addHealth(int addition) {
		health += addition;
	}
	
	public void subtractHealth(int subtraction) {
		health -= subtraction;
	}
}
