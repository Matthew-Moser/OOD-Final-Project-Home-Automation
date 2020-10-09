package pck1;

public class RealImage implements Image {
	private String jokeNumber1 = ("Did you hear about the mathematician who's afraid of negative numbers? He'll stop at nothing to avoid them!");
	public RealImage(String jokeNumber1) {
		this.jokeNumber1 = jokeNumber1;
		loadFromRemoteDisk(jokeNumber1);
	}
	
	public void displayFunFact() {
		System.out.println(jokeNumber1);

	}
	private void loadFromRemoteDisk(String jokeNumber1) {
		System.out.println("Ok! Let me think for a second.");
	}

}
