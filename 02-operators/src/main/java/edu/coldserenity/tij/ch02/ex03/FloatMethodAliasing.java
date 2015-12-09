package edu.coldserenity.tij.ch02.ex03;

public class FloatMethodAliasing {
    float markerField;

    public FloatMethodAliasing(float markerField) {
        this.markerField = markerField;
    }

    public static void f(FloatMethodAliasing fma) {
        fma.markerField *= 2;
    }

    public static void main(String[] args) {
        FloatMethodAliasing x = new FloatMethodAliasing(300f);

        System.out.println("Before method aliasing:");
        System.out.println(x);

        f(x);

        System.out.println("\nAfter method aliasing f(x): ");
        System.out.println(x);
    }

    @Override
    public String toString() {
        return "FloatAliasing{" +
                "hashCode=" + this.hashCode() + "; " +
                "markerField=" + markerField +
                '}';
    }
}
