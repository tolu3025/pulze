package p;

import java.io.IOException;

/* JADX INFO: renamed from: p.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1050d extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1050d(String message, Throwable th) {
        super(message, th);
        kotlin.jvm.internal.m.e(message, "message");
    }

    public /* synthetic */ C1050d(String str, Throwable th, int i3, kotlin.jvm.internal.h hVar) {
        this(str, (i3 & 2) != 0 ? null : th);
    }
}
