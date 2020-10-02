package pck1;

public class StartAutoLock implements AutoLock{

	public void activateLock(Context context) {
		System.out.println("Automatic locks activated, you can still manually unlock the doors");
		context.setAutoLock(this);
		
	}

}
