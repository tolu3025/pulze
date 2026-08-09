package D;

import android.os.Bundle;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.AbstractC0642q;

/* JADX INFO: loaded from: classes.dex */
public final class c implements a.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f1244b = new c(new Bundle(), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f1245a;

    /* synthetic */ c(Bundle bundle, g gVar) {
        this.f1245a = bundle;
    }

    public final Bundle a() {
        return new Bundle(this.f1245a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return AbstractC0642q.a(this.f1245a, ((c) obj).f1245a);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC0642q.c(this.f1245a);
    }
}
