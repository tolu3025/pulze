package androidx.lifecycle;

import androidx.lifecycle.z;
import v.AbstractC1252a;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class A {
    public static y a(z.b bVar, Class modelClass) {
        kotlin.jvm.internal.m.e(modelClass, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    public static y b(z.b bVar, Class modelClass, AbstractC1252a extras) {
        kotlin.jvm.internal.m.e(modelClass, "modelClass");
        kotlin.jvm.internal.m.e(extras, "extras");
        return bVar.a(modelClass);
    }
}
