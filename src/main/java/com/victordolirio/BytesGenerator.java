package com.victordolirio;

public class BytesGenerator {

    private static final int KILO_SIZE = 1024;
    private static final byte[] BASE = new byte[] {45, 23, 12, 52, 98, 34, 12, 75, 73, 72, 12, 111, 100, 12, 32, 98,
            45, 23, 12, 52, 98, 34, 12, 75, 73, 72, 12, 111, 100, 12, 32, 98};

    public byte[] nextBytes(int count) {
        byte[] bytes = new byte[count];
        generate(count, 1, bytes);
        return bytes;
    }

    public byte[] nextKiloBytes(int count) {
        byte[] bytes = new byte[KILO_SIZE * count];
        generate(count, KILO_SIZE, bytes);
        return bytes;
    }

    private void generate(int count, int scale, byte[] bytes) {

        int inc, pos = 0, size = scale * count, remainder = size % BASE.length;

        while (pos < size) {
            inc = (remainder > 0 && size - pos < BASE.length) ? remainder : BASE.length;
            System.arraycopy(BASE, 0, bytes, pos, inc);
            pos += inc;
        }
    }
}
