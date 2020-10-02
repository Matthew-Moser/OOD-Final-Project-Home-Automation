package pck1;

public class Context {
	private AutoLock autoLock;
	
	public Context() {
		autoLock = null;
	}
	public void setAutoLock (AutoLock autoLock) {
		this.autoLock = autoLock;
	}
	public AutoLock getAutoLock() {
		return autoLock;
	}
}
