package org.muzir.book.solution.InnerClasses;

class WhiteHouseControl extends GreenhouseControls {
	@SuppressWarnings("unused")
	private String waterMistGenerator = "off";

	public class WaterMissOn extends Event {
		public WaterMissOn(long delayTime) {
			super(delayTime);
		}

		public void action() {
			// Put hardware control code here.
			waterMistGenerator = "on";
		}

		public String toString() {
			return "WhiteHouseControl WaterMissOn is on";
		}
	}

	public class WaterMissOff extends Event {
		public WaterMissOff(long delayTime) {
			super(delayTime);
		}

		public void action() {
			// Put hardware control code here.
			waterMistGenerator = "off";
		}

		public String toString() {
			return "WhiteHouseControl WaterMissOff is off";
		}
	}
}

/**
 * @author erhun.baycelik
 *
 */
public class Exercise25 {

	public static void main(String[] args) {
		WhiteHouseControl wh = new WhiteHouseControl();
		// Instead of hard-wiring, you could parse
		// configuration information from a text file here:
		wh.addEvent(wh.new Bell(900));
		Event[] eventList = { wh.new ThermostatNight(0), wh.new LightOn(200), wh.new LightOff(400), wh.new WaterOn(600),
				wh.new WaterOff(800), wh.new ThermostatDay(1400), wh.new FansOn(1600), wh.new FansOff(1800),
				wh.new WaterMissOn(2000), wh.new WaterMissOff(2200) };
		wh.addEvent(wh.new Restart(2000, eventList));
		if (args.length == 1)
			wh.addEvent(new GreenhouseControls.Terminate(new Integer(args[0])));
		wh.run();
	}

}
