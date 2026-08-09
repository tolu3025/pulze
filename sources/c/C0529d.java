package c;

import d.C0812e;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: c.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0529d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C0812e.InterfaceC0118e f4988a = C0812e.b.f7032a;

    /* JADX INFO: renamed from: c.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private C0812e.InterfaceC0118e f4989a = C0812e.b.f7032a;

        public final C0529d a() {
            C0529d c0529d = new C0529d();
            c0529d.b(this.f4989a);
            return c0529d;
        }

        public final a b(C0812e.InterfaceC0118e mediaType) {
            m.e(mediaType, "mediaType");
            this.f4989a = mediaType;
            return this;
        }
    }

    public final C0812e.InterfaceC0118e a() {
        return this.f4988a;
    }

    public final void b(C0812e.InterfaceC0118e interfaceC0118e) {
        m.e(interfaceC0118e, "<set-?>");
        this.f4988a = interfaceC0118e;
    }
}
