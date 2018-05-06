import java.util.ArrayList;
import java.util.Scanner;

public class TestAnimals {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> arrayList = new ArrayList<>();
        
		
		for (int i=0;i<1;i++){
			System.out.println("Enter Type of Animal");
			String scan = scanner.nextLine();
			
			if(scan.equals("Dog")){
				arrayList.add(new Dog("uyktyhn","tytj","rtrth","sdsd"));
				System.out.println();
				arrayList.get(i).eat();
				arrayList.get(i).makeNoise();
				arrayList.get(i).sleep();
				arrayList.get(i).move();
			}
			else if (scan.equals("Cat")){
			arrayList.add(new Cat("Pot","Chicken","Persian","Mano"));
			System.out.println();
			arrayList.get(i).eat();
			arrayList.get(i).makeNoise();
			arrayList.get(i).sleep();
			arrayList.get(i).move();
			}
			else{
				System.out.println("invalid input Enter a valid input");
				}
		}
            }
}
