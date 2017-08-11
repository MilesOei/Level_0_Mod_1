package for_loops;

public class ForLoopGauntlet {
	public static void main(String[] args) {

		for (int i = 1; i < 100; i += 10) {
			for (int j = i; j < i + 10; j++) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}

	}
}
