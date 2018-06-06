import java.util.Random;
public class Logika{
	public static void main(String args[]){
		Random newR = new Random();
		int x = newR.nextInt(10);
		int y = new Random().nextInt(10);
		
		boolean result = x > y;
		System.out.println("X jest wieksze od y? " + result);
		
		result = 2*x > y;
		System.out.println("2x jest wieksze od y? " + result);
		result = (y< x+3) && (y>x-2);
		System.out.println("Czy y jest mniejsze od x+3 i wieksze od x-2? " + result);
		result = ((x*y) % 2 == 0);
		System.out.println("Czy y*x jest parzyste? " + result);
		
	}
}
