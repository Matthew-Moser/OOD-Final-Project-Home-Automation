package pck1;

public class StopAutoLock implements AutoLock {

	@Override
	public void activateLock(Context context) {
		System.out.println("Locks have been automatically unlocked");
		context.setAutoLock(this);
	}

}
