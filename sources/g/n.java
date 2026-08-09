package G;

import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f1605a;

    private n() {
    }

    public static final n c(o oVar) {
        String strB = oVar.b();
        n nVar = new n();
        if (strB != null) {
            nVar.f1605a = AbstractC0643s.e(strB);
        }
        return nVar;
    }

    public final n a(String str) {
        this.f1605a = AbstractC0643s.e(str);
        return this;
    }

    public final o b() {
        return new o(this.f1605a);
    }
}
