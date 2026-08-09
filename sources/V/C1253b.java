package v;

import androidx.lifecycle.A;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: v.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1253b implements z.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f[] f11494a;

    public C1253b(f... initializers) {
        m.e(initializers, "initializers");
        this.f11494a = initializers;
    }

    @Override // androidx.lifecycle.z.b
    public /* synthetic */ y a(Class cls) {
        return A.a(this, cls);
    }

    @Override // androidx.lifecycle.z.b
    public y b(Class modelClass, AbstractC1252a extras) {
        m.e(modelClass, "modelClass");
        m.e(extras, "extras");
        y yVar = null;
        for (f fVar : this.f11494a) {
            if (m.a(fVar.a(), modelClass)) {
                Object objInvoke = fVar.b().invoke(extras);
                yVar = objInvoke instanceof y ? (y) objInvoke : null;
            }
        }
        if (yVar != null) {
            return yVar;
        }
        throw new IllegalArgumentException("No initializer set for given class " + modelClass.getName());
    }
}
