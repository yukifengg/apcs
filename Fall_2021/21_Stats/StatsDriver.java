public class StatsDriver {
	public static void main(String[] args) {
		Stats.mean(2,8); //should return 8
		Stats.mean(1.0, 5.0); //should return 3.0
		Stats.mean(-1, 5); //should return 3
		Stats.mean(0, 0); //should return 0
		Stats.max(-4,0); //should return 0
		Stats.max(
	}
}
