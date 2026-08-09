package androidx.core.app;

import android.content.res.Configuration;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f3777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Configuration f3778b;

    public e(boolean z2) {
        this.f3777a = z2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(boolean z2, Configuration newConfig) {
        this(z2);
        kotlin.jvm.internal.m.e(newConfig, "newConfig");
        this.f3778b = newConfig;
    }
}
