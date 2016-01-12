package edu.coldserenity.tij.ch08.ex16;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * Exercise 16: (3)
 * <p/>
 * Create a class that produces a sequence of chars. Adapt this class so
 * that it can be an input to a Scanner object.
 */
public class AdaptingCharGeneratorToScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new RandomCharGeneratorReadableAdapter(10));
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }
}

class RandomCharGeneratorReadableAdapter implements Readable {
    private static final int WORD_SIZE = 10;
    RandomCharGenerator rcg = new RandomCharGenerator();
    long count;

    public RandomCharGeneratorReadableAdapter(long count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (--count == 0) {
            return -1;
        } else {
            char[] charSequence = rcg.next(WORD_SIZE);
            cb.append(new CharArray(charSequence, 0, charSequence.length, false));
            cb.append(" ");
            return WORD_SIZE;
        }
    }
}

class RandomCharGenerator {
    Random random = new Random(42);

    public char[] next(int count) {
        char[] result = new char[count];
        for (int i = 0; i < count; i++) {
            result[i] = (char) ((random.nextInt(2) == 1 ? 'A' : 'a') + random.nextInt(26));
        }
        return result;
    }
}
