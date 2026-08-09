package p;

import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes.dex */
public final class r extends D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f10220b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Throwable finalException) {
        super(a.e.API_PRIORITY_OTHER, null);
        kotlin.jvm.internal.m.e(finalException, "finalException");
        this.f10220b = finalException;
    }

    public final Throwable b() {
        return this.f10220b;
    }
}
