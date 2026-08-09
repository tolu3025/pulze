package p;

import c2.InterfaceC0595x;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    public static final class a extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final U1.p f10221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC0595x f10222b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final D f10223c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final M1.g f10224d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(U1.p transform, InterfaceC0595x ack, D d3, M1.g callerContext) {
            super(null);
            kotlin.jvm.internal.m.e(transform, "transform");
            kotlin.jvm.internal.m.e(ack, "ack");
            kotlin.jvm.internal.m.e(callerContext, "callerContext");
            this.f10221a = transform;
            this.f10222b = ack;
            this.f10223c = d3;
            this.f10224d = callerContext;
        }

        public final InterfaceC0595x a() {
            return this.f10222b;
        }

        public final M1.g b() {
            return this.f10224d;
        }

        public D c() {
            return this.f10223c;
        }

        public final U1.p d() {
            return this.f10221a;
        }
    }

    private w() {
    }

    public /* synthetic */ w(kotlin.jvm.internal.h hVar) {
        this();
    }
}
