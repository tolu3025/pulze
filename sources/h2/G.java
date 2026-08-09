package h2;

import com.google.android.gms.common.api.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class G {
    public static final int a(String str, int i3, int i4, int i5) {
        return (int) E.c(str, i3, i4, i5);
    }

    public static final long b(String str, long j3, long j4, long j5) {
        String strD = E.d(str);
        if (strD == null) {
            return j3;
        }
        Long lF = b2.n.f(strD);
        if (lF == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strD + '\'').toString());
        }
        long jLongValue = lF.longValue();
        if (j4 <= jLongValue && jLongValue <= j5) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j4 + ".." + j5 + ", but is '" + jLongValue + '\'').toString());
    }

    public static final String c(String str, String str2) {
        String strD = E.d(str);
        return strD == null ? str2 : strD;
    }

    public static final boolean d(String str, boolean z2) {
        String strD = E.d(str);
        return strD != null ? Boolean.parseBoolean(strD) : z2;
    }

    public static /* synthetic */ int e(String str, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            i4 = 1;
        }
        if ((i6 & 8) != 0) {
            i5 = a.e.API_PRIORITY_OTHER;
        }
        return E.b(str, i3, i4, i5);
    }

    public static /* synthetic */ long f(String str, long j3, long j4, long j5, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            j4 = 1;
        }
        long j6 = j4;
        if ((i3 & 8) != 0) {
            j5 = Long.MAX_VALUE;
        }
        return E.c(str, j3, j6, j5);
    }
}
