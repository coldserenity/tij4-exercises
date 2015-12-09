package edu.coldserenity.tij.ch02.ex02;

public class FloatAliasing {
    float markerField;

    public FloatAliasing(float markerField) {
        this.markerField = markerField;
    }

    public static void main(String[] args) {
        FloatAliasing fa1 = new FloatAliasing(5);
        FloatAliasing fa2 = new FloatAliasing(7);

        System.out.println("Initial state: ");
        System.out.println(fa1);
        System.out.println(fa2);

        fa1 = fa2;

        System.out.println("\nAfter fa1 <- fa2: ");
        System.out.println(fa1);
        System.out.println(fa2);
    }

    @Override
    public String toString() {
        return "FloatAliasing{" +
                "hashCode=" + this.hashCode() + "; " +
                "markerField=" + markerField +
                '}';
    }
}
