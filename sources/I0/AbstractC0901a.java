package i0;

import com.google.android.gms.common.api.a;

/* JADX INFO: renamed from: i0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0901a extends AbstractC0902b {
    public static int a(long j3) {
        if (j3 > 2147483647L) {
            return a.e.API_PRIORITY_OTHER;
        }
        if (j3 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j3;
    }
}
