package pck1;

public class ProxyImage implements Image {
private RealImage realImage;
private String jokeNumber1;

public ProxyImage(String jokeNumber1) {
	this.jokeNumber1 = jokeNumber1;
}
	@Override
	public void displayFunFact() {
		if(realImage == null) {
			realImage = new RealImage(jokeNumber1);
		}
		realImage.displayFunFact();
	}

}
