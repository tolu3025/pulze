package e0;

import com.google.android.gms.common.api.a;

/* JADX INFO: renamed from: e0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0830k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0820a f7078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f7079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f7080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f7081d;

    /* JADX INFO: renamed from: e0.k$a */
    class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC0820a f7082a;

        a(AbstractC0820a abstractC0820a) {
            this.f7082a = abstractC0820a;
        }
    }

    /* JADX INFO: renamed from: e0.k$b */
    private interface b {
    }

    private C0830k(b bVar) {
        this(bVar, false, AbstractC0820a.d(), a.e.API_PRIORITY_OTHER);
    }

    public static C0830k a(char c3) {
        return b(AbstractC0820a.b(c3));
    }

    public static C0830k b(AbstractC0820a abstractC0820a) {
        AbstractC0829j.n(abstractC0820a);
        return new C0830k(new a(abstractC0820a));
    }

    public C0830k c() {
        return d(AbstractC0820a.g());
    }

    public C0830k d(AbstractC0820a abstractC0820a) {
        AbstractC0829j.n(abstractC0820a);
        return new C0830k(this.f7080c, this.f7079b, abstractC0820a, this.f7081d);
    }

    private C0830k(b bVar, boolean z2, AbstractC0820a abstractC0820a, int i3) {
        this.f7080c = bVar;
        this.f7079b = z2;
        this.f7078a = abstractC0820a;
        this.f7081d = i3;
    }
}
