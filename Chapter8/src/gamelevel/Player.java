package gamelevel;

public class Player {
	
	private PlayerLevel level;
	
	public Player() { //기본셋팅
		level = new BeginnerLevel();
		level.showLevelMessage();
	}

	public PlayerLevel getLevel() {
		return level;
	}

	public void setLevel(PlayerLevel level) {
		this.level = level;
	}
	
	public void upgradeLevel (PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	public void play(int count) {
		level.go(count);
	}
}
