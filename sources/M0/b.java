package M0;

import com.google.android.gms.common.internal.AbstractC0642q;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f2697a;

    public b(String str) {
        this.f2697a = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            return AbstractC0642q.b(this.f2697a, ((b) obj).f2697a);
        }
        return false;
    }

    public int hashCode() {
        return AbstractC0642q.c(this.f2697a);
    }

    public String toString() {
        return AbstractC0642q.d(this).a("token", this.f2697a).toString();
    }
}
