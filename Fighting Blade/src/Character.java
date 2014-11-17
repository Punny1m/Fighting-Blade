import org.eclipse.swt.graphics.Color;


public class Character {
	
	// Attachments
	private String name; // character's current name.
	private Player avatarOf; // who is he/she an avatar of
	private Class[] classes; // all the classes this character has. index 0 is the base character class.
	private Skill[] skills; // all the skills  this character has. 
	private Item[] blackBag, bagPack, equipping; // places to store items, which are black hole bag, bag pack and the item equipped at the current moment.
	private Character pastLife; // character's past life. 
	private Race Race; // the race of this character. 
	
	// Stats
	private int[] levels; // all the class's levels. index 0 is the base char level. 
	private int HP; // health point
	private int MP; // mana point
	private int SP; // stamina point
	private int Str; // Strength
	private int Int; // Intelligent
	private int Dex; // Dexterity
	private int Luc; // Luck
	private int Agi; // Agility
	private int Wis; // Wisdom
	private EffSet efficiency; // weapon, items, different efficiency. 
	
	// Character profile/looks
	private int age;
	private int Height;
	private int Width;
	private int Weight;
	private Color skinColor;
	private Color hairColor;
	private String profiles;
	
	public Character() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Player getAvatarOf() {
		return avatarOf;
	}

	public void setAvatarOf(Player avatarOf) {
		this.avatarOf = avatarOf;
	}

	public Class[] getClasses() {
		return classes;
	}

	public void setClasses(Class[] classes) {
		this.classes = classes;
	}

	public Skill[] getSkills() {
		return skills;
	}

	public void setSkills(Skill[] skills) {
		this.skills = skills;
	}

	public Item[] getBlackBag() {
		return blackBag;
	}

	public void setBlackBag(Item[] blackBag) {
		this.blackBag = blackBag;
	}

	public Item[] getBagPack() {
		return bagPack;
	}

	public void setBagPack(Item[] bagPack) {
		this.bagPack = bagPack;
	}

	public Item[] getEquipping() {
		return equipping;
	}

	public void setEquipping(Item[] equipping) {
		this.equipping = equipping;
	}

	public Character getPastLife() {
		return pastLife;
	}

	public void setPastLife(Character pastLife) {
		this.pastLife = pastLife;
	}

	public Race getRace() {
		return Race;
	}

	public void setRace(Race race) {
		Race = race;
	}

	public int[] getLevels() {
		return levels;
	}

	public void setLevels(int[] levels) {
		this.levels = levels;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public int getMP() {
		return MP;
	}

	public void setMP(int mP) {
		MP = mP;
	}

	public int getSP() {
		return SP;
	}

	public void setSP(int sP) {
		SP = sP;
	}

	public int getStr() {
		return Str;
	}

	public void setStr(int str) {
		Str = str;
	}

	public int getInt() {
		return Int;
	}

	public void setInt(int i) {
		Int = i;
	}

	public int getDex() {
		return Dex;
	}

	public void setDex(int dex) {
		Dex = dex;
	}

	public int getLuc() {
		return Luc;
	}

	public void setLuc(int luc) {
		Luc = luc;
	}

	public int getAgi() {
		return Agi;
	}

	public void setAgi(int agi) {
		Agi = agi;
	}

	public int getWis() {
		return Wis;
	}

	public void setWis(int wis) {
		Wis = wis;
	}

	public EffSet getEfficiency() {
		return efficiency;
	}

	public void setEfficiency(EffSet efficiency) {
		this.efficiency = efficiency;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return Height;
	}

	public void setHeight(int height) {
		Height = height;
	}

	public int getWidth() {
		return Width;
	}

	public void setWidth(int width) {
		Width = width;
	}

	public int getWeight() {
		return Weight;
	}

	public void setWeight(int weight) {
		Weight = weight;
	}

	public Color getSkinColor() {
		return skinColor;
	}

	public void setSkinColor(Color skinColor) {
		this.skinColor = skinColor;
	}

	public Color getHairColor() {
		return hairColor;
	}

	public void setHairColor(Color hairColor) {
		this.hairColor = hairColor;
	}

	public String getProfiles() {
		return profiles;
	}

	public void setProfiles(String profiles) {
		this.profiles = profiles;
	}

	

}
