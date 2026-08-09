package y1;

import g0.AbstractC0870a;
import java.nio.charset.Charset;
import y1.Z;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f11799a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC0870a f11800b = Z.f11843f;

    public interface a extends Z.j {
    }

    public static int a(Z z2) {
        return z2.h();
    }

    public static Z.g b(String str, a aVar) {
        boolean z2 = false;
        if (str != null && !str.isEmpty() && str.charAt(0) == ':') {
            z2 = true;
        }
        return Z.g.g(str, z2, aVar);
    }

    public static Z c(byte[]... bArr) {
        return new Z(bArr);
    }

    public static byte[][] d(Z z2) {
        return z2.q();
    }
}
