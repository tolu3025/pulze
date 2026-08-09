package F0;

import com.google.protobuf.AbstractC0806y;

/* JADX INFO: loaded from: classes.dex */
public final class T extends AbstractC0297a {
    public T() {
        this(B.f1420c);
    }

    @Override // F0.AbstractC0297a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public T b(B options) {
        kotlin.jvm.internal.m.e(options, "options");
        return new T(options);
    }

    public final T g(String indexField) {
        kotlin.jvm.internal.m.e(indexField, "indexField");
        AbstractC0806y abstractC0806yN = V0.I.J0().C(indexField).n();
        kotlin.jvm.internal.m.d(abstractC0806yN, "build(...)");
        return (T) d("index_field", (V0.I) abstractC0806yN);
    }

    private T(B b3) {
        super(b3);
    }
}
