package I1;

/* JADX INFO: loaded from: classes.dex */
public final class l extends Error {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String message) {
        super(message);
        kotlin.jvm.internal.m.e(message, "message");
    }

    public /* synthetic */ l(String str, int i3, kotlin.jvm.internal.h hVar) {
        this((i3 & 1) != 0 ? "An operation is not implemented." : str);
    }
}
