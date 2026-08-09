package S1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final long a(InputStream inputStream, OutputStream out, int i3) throws IOException {
        m.e(inputStream, "<this>");
        m.e(out, "out");
        byte[] bArr = new byte[i3];
        int i4 = inputStream.read(bArr);
        long j3 = 0;
        while (i4 >= 0) {
            out.write(bArr, 0, i4);
            j3 += (long) i4;
            i4 = inputStream.read(bArr);
        }
        return j3;
    }

    public static /* synthetic */ long b(InputStream inputStream, OutputStream outputStream, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 8192;
        }
        return a(inputStream, outputStream, i3);
    }

    public static final byte[] c(InputStream inputStream) {
        m.e(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        b(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        m.d(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
