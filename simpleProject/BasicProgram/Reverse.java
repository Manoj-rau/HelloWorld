package BasicProgram;

public class Reverse {
	
	public static void main(String[] args) {
		int x=252;
		int y=0;
		int z;
		
		while(x != 0) 
		{
            z = x % 10;
            y = y * 10 + z;
            x /= 10;
        }
        System.out.println("Reversed Number: " + y);
		
	}

}
