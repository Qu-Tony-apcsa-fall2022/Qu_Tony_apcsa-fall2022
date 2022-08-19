package Unit1;

public class StarsAndStripes {
	public String repeat(String character,int len) {
		String baseString = "";
		for (int i = 0; i < len; i ++) {
			baseString += character;
		}
		return baseString;
	}
	public void printBox(int xLength, int yLength) {
		System.out.println("Box:\n");
		for (int i = 0; i < yLength; i++) {
			if (i % 2 == 0) {
				System.out.println(repeat("-",xLength));
			}
			else {
				System.out.println(repeat("*",xLength));
			}
		}
	}
	public void printFlag() {
		System.out.println("Flag:\n");
		System.out.print(repeat("    ",5) + " " + repeat("_",24));
		
		printBlank(1);
		for (int i = 0; i < 4; i ++) {
			System.out.print(repeat("*   ",5));
			System.out.print("*");
			System.out.print(repeat("_",24));
			printBlank(1);
			System.out.print(repeat("  * ",5));
			System.out.print(" ");
			System.out.print(repeat("_",24));
			printBlank(1);
		}
		System.out.print(repeat("*   ",5));
		System.out.print("*");
		System.out.print(repeat("_",24));
		printBlank(1);
		for (int i = 0; i < 4; i ++) {
			System.out.print(repeat("_",45));
			printBlank(1);
		}
	}
	public void printBlank(int times) {
		for (int i = 0; i < times; i ++) {
			System.out.println("");
		}
	}
	
}
