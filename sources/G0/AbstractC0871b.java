package g0;

import e0.AbstractC0829j;
import h0.AbstractC0878c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* JADX INFO: renamed from: g0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0871b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final OutputStream f7336a = new a();

    /* JADX INFO: renamed from: g0.b$a */
    class a extends OutputStream {
        a() {
        }

        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i3) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            AbstractC0829j.n(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i3, int i4) {
            AbstractC0829j.n(bArr);
            AbstractC0829j.s(i3, i4 + i3, bArr.length);
        }
    }

    private static byte[] a(Queue queue, int i3) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        if (bArr.length == i3) {
            return bArr;
        }
        int length = i3 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i3);
        while (length > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i3 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static long b(InputStream inputStream, OutputStream outputStream) throws IOException {
        AbstractC0829j.n(inputStream);
        AbstractC0829j.n(outputStream);
        byte[] bArrC = c();
        long j3 = 0;
        while (true) {
            int i3 = inputStream.read(bArrC);
            if (i3 == -1) {
                return j3;
            }
            outputStream.write(bArrC, 0, i3);
            j3 += (long) i3;
        }
    }

    static byte[] c() {
        return new byte[8192];
    }

    public static byte[] d(InputStream inputStream) {
        AbstractC0829j.n(inputStream);
        return e(inputStream, new ArrayDeque(20), 0);
    }

    private static byte[] e(InputStream inputStream, Queue queue, int i3) throws IOException {
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(i3) * 2));
        while (i3 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i3);
            byte[] bArr = new byte[iMin2];
            queue.add(bArr);
            int i4 = 0;
            while (i4 < iMin2) {
                int i5 = inputStream.read(bArr, i4, iMin2 - i4);
                if (i5 == -1) {
                    return a(queue, i3);
                }
                i4 += i5;
                i3 += i5;
            }
            iMin = AbstractC0878c.f(iMin, iMin < 4096 ? 4 : 2);
        }
        if (inputStream.read() == -1) {
            return a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
