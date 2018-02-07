import java.util.Scanner;
public class ChangeCalculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print ("Enter the total");
		double amount = input.nextDouble();
		int remainingAmount = (int)(amount * 100);
		int numberOfOneDollars = remainingAmount/100;
		remainingAmount = remainingAmount % 100;
		int numbeOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		int numberOfNickles = remainingAmount / 5;
		remaingAmount = remainingAmount % 5;
		int numberOfPennies = remainingAmount / 1;
		remainingAmount = remainingAmount % 1;
		System.out.println("Your amount " + amount + "is \n" + "\t" numberOfOneDollars + "dollars\n" + "\t" + numberOfQuarters + "quarters \n" +"\t" + numberOfDimes + "dimes \n + "\t" + numberOfNickels + "nickels \n" + "\t" + numberOfPennies + "pennies \n" + "\t");
	}
}
