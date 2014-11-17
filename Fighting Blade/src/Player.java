import org.eclipse.swt.graphics.Color;

public class Player {

	// Attachments
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Character getPlayerOf() {
		return playerOf;
	}

	public void setPlayerOf(Character playerOf) {
		this.playerOf = playerOf;
	}

	public Item[] getItems() {
		return items;
	}

	public void setItems(Item[] items) {
		this.items = items;
	}

	public EffSet getEffeciency() {
		return effeciency;
	}

	public void setEffeciency(EffSet effeciency) {
		this.effeciency = effeciency;
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

	private Character playerOf;
	private Item[] items;
	private EffSet effeciency;

	// Player profile/looks
	private int age;
	private int Height;
	private int Width;
	private int Weight;
	private Color skinColor;
	private Color hairColor;
	private String profiles;

	public Player() {
		// TODO Auto-generated constructor stub
	}

}
