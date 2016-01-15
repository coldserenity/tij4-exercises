package edu.coldserenity.tij.ch09.ex25;

/**
 * Inherit from GreenhouseControls in GreenhouseControls.java
 * to add Event inner classes that turn water mist generators
 * on and off.
 */
public class MistyGreenhouseControls extends GreenhouseControls {
    private boolean waterMistGenerator = false;

    public class WaterMistGeneratorOn extends Event {

        public WaterMistGeneratorOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            waterMistGenerator = true;
        }

        @Override
        public String toString() {
            return "Water mist generator is ON";
        }
    }

    public class WaterMistGeneratorOff extends Event {

        public WaterMistGeneratorOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            waterMistGenerator = false;
        }

        @Override
        public String toString() {
            return "Water mist generator is OFF";
        }
    }
}
