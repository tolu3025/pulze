package S1;

import I1.u;
import J1.AbstractC0406j;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import kotlin.jvm.internal.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class f extends e {
    public static byte[] a(File file) throws IOException {
        m.e(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i3 = (int) length;
            byte[] bArrD = new byte[i3];
            int i4 = i3;
            int i5 = 0;
            while (i4 > 0) {
                int i6 = fileInputStream.read(bArrD, i5, i4);
                if (i6 < 0) {
                    break;
                }
                i4 -= i6;
                i5 += i6;
            }
            if (i4 > 0) {
                bArrD = Arrays.copyOf(bArrD, i5);
                m.d(bArrD, "copyOf(...)");
            } else {
                int i7 = fileInputStream.read();
                if (i7 != -1) {
                    c cVar = new c(8193);
                    cVar.write(i7);
                    a.b(fileInputStream, cVar, 0, 2, null);
                    int size = cVar.size() + i3;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrB = cVar.b();
                    byte[] bArrCopyOf = Arrays.copyOf(bArrD, size);
                    m.d(bArrCopyOf, "copyOf(...)");
                    bArrD = AbstractC0406j.d(bArrB, bArrCopyOf, i3, 0, cVar.size());
                }
            }
            b.a(fileInputStream, null);
            return bArrD;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                b.a(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static void b(File file, byte[] array) throws IOException {
        m.e(file, "<this>");
        m.e(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            u uVar = u.f2419a;
            b.a(fileOutputStream, null);
        } finally {
        }
    }
}
