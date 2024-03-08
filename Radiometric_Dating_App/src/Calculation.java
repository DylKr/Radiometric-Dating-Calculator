// Radiometric_Dating_App
import java.util.Scanner;

// This class will calculate the finalResult for the Radiometric_Dating_App
public class Calculation extends DecayRate {

	long tempDR = getDecayRate();
	String tempElement2 = getOriginalElementName();

	public String getOriginalElementName() {
		String tempElement = null;
		if (tempDR == 5730) {
			tempElement = "Carbon-14";
		} else if (tempDR == 4500000) {
			tempElement = "Uranium-238";
		} else if (tempDR == 1300000) {
			tempElement = "Potassium-40";
		} else if (tempDR == 47000000) {
			tempElement = "Rubidium-87";
		}
		return tempElement;
	} // end of getOriginalElementName

	public long getFinalResult() {
		Scanner scan = new Scanner(System.in);
		// prompting user to enter their percentage of the original parent element
		System.out.println("Enter your percentage of original " + tempElement2 + ": ");
		float samplePercent = scan.nextFloat(); // user stores their percentage of sample in this variable
		float start = 100;
		float ogSampAmt = 0; // ogSampAmt will store the original sample amount
		int hlCounter = 0; // hlCounter keeps track of the amount of half lives that have passes
		while (start > samplePercent) {
			// while the start amount is greater than the samplePercent, iterate till 100
			// has been divided by 2 to match the percentage of the sample amount
			for (int i = 0; i < 100;) {
				ogSampAmt = start /= 2;
				hlCounter++;
				break;
			}
		}
		long finalResult = hlCounter * tempDR;
		return finalResult;
	} // end of getFinalResult

}
