package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.k0;

/* JADX INFO: loaded from: classes.dex */
public class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f3986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f3987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f3988c;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k0.b f3989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f3990b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k0.b f3991c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f3992d;

        public a(k0.b bVar, Object obj, k0.b bVar2, Object obj2) {
            this.f3989a = bVar;
            this.f3990b = obj;
            this.f3991c = bVar2;
            this.f3992d = obj2;
        }
    }

    private C(k0.b bVar, Object obj, k0.b bVar2, Object obj2) {
        this.f3986a = new a(bVar, obj, bVar2, obj2);
        this.f3987b = obj;
        this.f3988c = obj2;
    }

    static int b(a aVar, Object obj, Object obj2) {
        return C0503q.b(aVar.f3989a, 1, obj) + C0503q.b(aVar.f3991c, 2, obj2);
    }

    public static C d(k0.b bVar, Object obj, k0.b bVar2, Object obj2) {
        return new C(bVar, obj, bVar2, obj2);
    }

    static void e(AbstractC0495i abstractC0495i, a aVar, Object obj, Object obj2) {
        C0503q.u(abstractC0495i, aVar.f3989a, 1, obj);
        C0503q.u(abstractC0495i, aVar.f3991c, 2, obj2);
    }

    public int a(int i3, Object obj, Object obj2) {
        return AbstractC0495i.O(i3) + AbstractC0495i.y(b(this.f3986a, obj, obj2));
    }

    a c() {
        return this.f3986a;
    }
}
