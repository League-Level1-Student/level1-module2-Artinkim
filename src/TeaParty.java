public class TeaParty {

	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		String t = "";
		if (isWoman == true && isKnighted == true) {
			t = "Lady";
		}
		if (isWoman == false && isKnighted == true) {
			t = "Sir";
		}
		if (isWoman == false && isKnighted == false) {
			t = "Mr.";
		}
		if (isWoman == true && isKnighted == false) {
			t = "Ms.";
		}
		return "Hello " + t +" "+ name;
	}

}
