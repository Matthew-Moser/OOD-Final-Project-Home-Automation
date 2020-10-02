package pck1;

public class TimerOn implements  Command{
	Timer timer;
	public TimerOn (Timer timer) {
	this.timer=timer;
	}
	@Override
	public void execute() {
		timer.startClock();		
	}
}
