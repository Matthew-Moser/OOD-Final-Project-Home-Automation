package pck1;

public class TimerOff implements Command {
	Timer timer;
	public TimerOff (Timer timer) {
		this.timer=timer;
	}
	@Override
	public void execute() {
		timer.stopClock();
		
	}

}
