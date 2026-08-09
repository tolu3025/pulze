package com.google.protobuf;

import com.google.protobuf.B0;

/* JADX INFO: loaded from: classes.dex */
public class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f6710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f6711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f6712c;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final B0.b f6713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f6714b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final B0.b f6715c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f6716d;

        public a(B0.b bVar, Object obj, B0.b bVar2, Object obj2) {
            this.f6713a = bVar;
            this.f6714b = obj;
            this.f6715c = bVar2;
            this.f6716d = obj2;
        }
    }

    private N(B0.b bVar, Object obj, B0.b bVar2, Object obj2) {
        this.f6710a = new a(bVar, obj, bVar2, obj2);
        this.f6711b = obj;
        this.f6712c = obj2;
    }

    static int b(a aVar, Object obj, Object obj2) {
        return C0802u.b(aVar.f6713a, 1, obj) + C0802u.b(aVar.f6715c, 2, obj2);
    }

    public static N d(B0.b bVar, Object obj, B0.b bVar2, Object obj2) {
        return new N(bVar, obj, bVar2, obj2);
    }

    static void e(AbstractC0794l abstractC0794l, a aVar, Object obj, Object obj2) {
        C0802u.u(abstractC0794l, aVar.f6713a, 1, obj);
        C0802u.u(abstractC0794l, aVar.f6715c, 2, obj2);
    }

    public int a(int i3, Object obj, Object obj2) {
        return AbstractC0794l.Q(i3) + AbstractC0794l.A(b(this.f6710a, obj, obj2));
    }

    a c() {
        return this.f6710a;
    }
}
