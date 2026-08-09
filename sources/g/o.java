package G;

import android.os.Bundle;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.AbstractC0642q;

/* JADX INFO: loaded from: classes.dex */
public final class o implements a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1606a;

    public o(String str) {
        this.f1606a = str;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("session_id", this.f1606a);
        return bundle;
    }

    public final String b() {
        return this.f1606a;
    }

    public final boolean equals(Object obj) {
        return obj instanceof o;
    }

    public final int hashCode() {
        return AbstractC0642q.c(o.class);
    }
}
