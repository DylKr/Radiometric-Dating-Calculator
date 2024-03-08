// Radiometric_Dating_App
public class GTP extends Calculation {

	long finalResult = getFinalResult();

	public String getUnitOfTime() {
		String[] unitOfTime = { "thousand", "million", "billion" };
		String tempUnitOfTime = null;
		if (finalResult < 1000000) {
			// if the final result is less than million, the temp unit of time will =
			// thousand
			tempUnitOfTime = unitOfTime[0];
		} else if (finalResult < 1000000000) {
			// if the final result is less than billion, the temp unit of time will =
			// million
			tempUnitOfTime = unitOfTime[1];
		} else {
			// else the temp unit of time = billion
			tempUnitOfTime = unitOfTime[2];
		}
		return tempUnitOfTime;

	} // end of getUnitOfTime

	public String getGTP() {
		String[] GeologicTime = { "Paleozoic", "Triassic", "Jurassic", "Cretaceous", "Paleocene", "Eocene", "Oligocene",
				"Miocene", "Pliocene", "Pleistocene", "Holocene" };

		String tempString = null;
		if (finalResult < 542000000 && finalResult >= 251000000) {
			// Paleozoic
			tempString = GeologicTime[0];
		} else if (finalResult < 251000000 && finalResult >= 202000000) {
			// Triassic
			tempString = GeologicTime[1];
		} else if (finalResult < 202000000 && finalResult >= 146000000) {
			// Jurassic
			tempString = GeologicTime[2];
		} else if (finalResult < 146000000 && finalResult >= 66000000) {
			// Cretaceous
			tempString = GeologicTime[3];
		} else if (finalResult < 66000000 && finalResult >= 56000000) {
			// Paleocene
			tempString = GeologicTime[4];
		} else if (finalResult < 56000000 && finalResult >= 34000000) {
			// Eocene
			tempString = GeologicTime[5];
		} else if (finalResult < 34000000 && finalResult >= 23000000) {
			// Oligocene
			tempString = GeologicTime[6];
		} else if (finalResult < 23000000 && finalResult >= 5300000) {
			// Miocene
			tempString = GeologicTime[7];
		} else if (finalResult < 5300000 && finalResult >= 2600000) {
			// Pliocene
			tempString = GeologicTime[8];
		} else if (finalResult < 2600000 && finalResult >= 12000) {
			// Pleistocene
			tempString = GeologicTime[9];
		} else if (finalResult < 12000) {
			// Holocene
			tempString = GeologicTime[10];
		}
		return tempString;
	} // end of getGTP

}
