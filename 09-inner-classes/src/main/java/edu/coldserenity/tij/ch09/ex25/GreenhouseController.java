package edu.coldserenity.tij.ch09.ex25;

/**
 * Exercise 25: (3)
 * <p/>
 * Inherit from GreenhouseControls in GreenhouseControls.java
 * to add Event inner classes that turn water mist generators
 * on and off.
 * Write a new version of GreenhouseController.java to use
 * these new Event objects.
 */
public class GreenhouseController {
    public static void main(String[] args) {
        MistyGreenhouseControls gc = new MistyGreenhouseControls();
        // Instead of hard-wiring, you could parse
        // configuration information from a text file here:
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new FansOn(1000),
                gc.new FansOff(1200),
                gc.new ThermostatDay(1400),
                gc.new WaterMistGeneratorOn(1600),
                gc.new WaterMistGeneratorOff(1800),
        };
        gc.addEvent(gc.new Restart(2000, eventList));

        args = new String[1];
        args[0] = "5000";
        if (args.length == 1)
            gc.addEvent(
                    new GreenhouseControls.Terminate(
                            new Integer(args[0])));
        gc.run();
    }
}