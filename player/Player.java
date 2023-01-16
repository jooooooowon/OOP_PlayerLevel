package review.player;

public class Player {
	PlayerLevel level;
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public Player() {
		BeginnerLevel beginLevel = new BeginnerLevel();
		level = beginLevel;
	}
	
	public void upgradeLevel(PlayerLevel playerLevel) {
		level = playerLevel;
	}
	
	public void play(int count) {
		level.go(count);
	}
}
