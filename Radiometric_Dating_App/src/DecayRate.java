
// This program is intended to act as a calculator for different absolute dating methods. (2023)
// This calculator is based on purely percentages of each element
// Radiometric_Dating_App
import java.util.Scanner;

public class DecayRate {

	public long getDecayRate() {

		// Scanner object created to take in user input
		Scanner scan = new Scanner(System.in);

		// Parent: Daughter: Half Life(years): Dating Range(years): Minerals/materials:
		// Uranium-238 Lead-206 4,500 million 10-4,600 million Zircon, Uraninite
		// Potassium-40 Argon-40 1,300 million 0.05 to 4,600 million Muscovite, Biotite,
		// volcanic rocks
		// Rubidium-87 Strontium-87 47,000 million 10-4,600 million Muscovite, Biotite,
		// Metamorphic or Igneous rock
		// Carbon-14 Nitrogen-14 5,730 years 100-70,000 years Wood, Charcoal, Peat,
		// Bone, Tissue, Carbonates, Water containing dissolved carbon

		// RADIOMETRIC DATING STEPS
		// Measure amount of Parent isotope in a Mass Spectrometer
		// Measure the amount of Daughter isotope in a Mass Spectrometer
		// Determine the number of half-lives undergone
		// Determine Age = (#half lives) x (half-life duration)

		// array to hold constant decay rates for elements
		long[] cdRate = { 4500000, 1300000, 47000000, 5730 };

		// out put menu to user
		System.out.println(
				" 1. Uranium Lead Dating\n 2. Potassium Argon Dating\n 3. Carbon-14 Dating\n 4. Rubidium Strontium\n 5. Quit\n");
		// a temporary variable is used to hold the constant rate of decay pertaining to
		// each parent element.
		long tempDecayRate = 0;

		// the userChoice variable is used with the scanner object taking in the users
		// request from the menu
		int userChoice = scan.nextInt();
		// the switch statement will act as a conditional statement for the menu
		switch (userChoice) {
		case 1: {
			tempDecayRate = cdRate[0];
		} // if user choice is 1 then sample now equals the value of UPb
			break;
		case 2: {
			tempDecayRate = cdRate[1];
		} // if user choice is 2 then sample now equals the value of KAr
			break;
		case 3: {
			tempDecayRate = cdRate[3];
		} // if user choice is 4 then sample now equals the value of C
			break;
		case 4: {
			tempDecayRate = cdRate[2];
		} // if user choice is 3 then sample now equals the value of RbSr
			break;
		default:
			System.out.println("That was not an option...");
			break;
		}
		return tempDecayRate;

	}

}
