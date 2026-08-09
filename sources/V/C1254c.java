package v;

import U1.l;
import androidx.lifecycle.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: v.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1254c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f11495a = new ArrayList();

    public final void a(Z1.c clazz, l initializer) {
        m.e(clazz, "clazz");
        m.e(initializer, "initializer");
        this.f11495a.add(new f(T1.a.a(clazz), initializer));
    }

    public final z.b b() {
        f[] fVarArr = (f[]) this.f11495a.toArray(new f[0]);
        return new C1253b((f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }
}
