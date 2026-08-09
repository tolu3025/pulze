package q0;

import com.google.android.gms.common.api.internal.ComponentCallbacks2C0603c;
import java.util.Objects;

/* JADX INFO: renamed from: q0.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1149h0 implements ComponentCallbacks2C0603c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C1143e0 f10731a;

    C1149h0(C1143e0 c1143e0) {
        Objects.requireNonNull(c1143e0);
        this.f10731a = c1143e0;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C0603c.a
    public final void a(boolean z2) {
        if (z2) {
            this.f10731a.f10715c = true;
            this.f10731a.b();
        } else {
            this.f10731a.f10715c = false;
            if (this.f10731a.f()) {
                this.f10731a.f10714b.c();
            }
        }
    }
}
