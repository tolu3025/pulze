package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class e0 extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f4065a;

    public e0(J j3) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f4065a = null;
    }

    public C0507v a() {
        return new C0507v(getMessage());
    }
}
