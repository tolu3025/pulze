package n2;

import java.io.EOFException;
import kotlin.jvm.internal.m;
import m2.d;
import m2.v;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f9961a = v.a("0123456789abcdef");

    public static final byte[] a() {
        return f9961a;
    }

    public static final String b(d dVar, long j3) throws EOFException {
        m.e(dVar, "<this>");
        if (j3 > 0) {
            long j4 = j3 - 1;
            if (dVar.z(j4) == 13) {
                String strX = dVar.X(j4);
                dVar.k(2L);
                return strX;
            }
        }
        String strX2 = dVar.X(j3);
        dVar.k(1L);
        return strX2;
    }
}
