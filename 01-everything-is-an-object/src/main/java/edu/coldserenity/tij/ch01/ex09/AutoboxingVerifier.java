package edu.coldserenity.tij.ch01.ex09;

public class AutoboxingVerifier {

    public static void main(String[] args) {
        System.out.print("Verifying autoUnboxing: ... ");
        boolean bool = new Boolean(true);
        char c = new Character('c');
        byte b = new Byte((byte) 0);
        short s = new Short((short) 0);
        int i = new Integer(0);
        long l = new Long(0L);
        float f = new Float(0F);
        double d = new Double(0D);
        System.out.println("SUCCESS.");

        System.out.print("Verifying autoBoxing: ... ");
        Boolean Bool = true;
        Character C = 'c';
        Byte B = (byte) 0;
        Short S = (short) 0;
        Integer I = 0;
        Long L = 0L;
        Float F = 0F;
        Double D = 0D;
        System.out.println("SUCCESS.");
    }

}
