package k0;

import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: renamed from: k0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0999m extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0999m(String str) {
        super(str);
        AbstractC0643s.f(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0999m(String str, Throwable th) {
        super(str, th);
        AbstractC0643s.f(str, "Detail message must not be empty");
    }
}
