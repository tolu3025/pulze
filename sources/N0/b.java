package n0;

import com.google.android.gms.common.internal.AbstractC0643s;
import k0.C0999m;
import m0.AbstractC1027a;
import m0.AbstractC1028b;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC1028b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0999m f9915b;

    private b(String str, C0999m c0999m) {
        AbstractC0643s.e(str);
        this.f9914a = str;
        this.f9915b = c0999m;
    }

    public static b c(AbstractC1027a abstractC1027a) {
        AbstractC0643s.k(abstractC1027a);
        return new b(abstractC1027a.b(), null);
    }

    public static b d(C0999m c0999m) {
        return new b("eyJlcnJvciI6IlVOS05PV05fRVJST1IifQ==", (C0999m) AbstractC0643s.k(c0999m));
    }

    @Override // m0.AbstractC1028b
    public Exception a() {
        return this.f9915b;
    }

    @Override // m0.AbstractC1028b
    public String b() {
        return this.f9914a;
    }
}
