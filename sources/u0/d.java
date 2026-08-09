package u0;

import kotlin.jvm.internal.m;
import t.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final Object a(f fVar, f.a key, Object obj) {
        m.e(fVar, "<this>");
        m.e(key, "key");
        Object objB = fVar.b(key);
        return objB == null ? obj : objB;
    }
}
