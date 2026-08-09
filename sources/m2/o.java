package m2;

import J1.AbstractC0406j;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f9886h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f9887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f9892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o f9893g;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    public o() {
        this.f9887a = new byte[8192];
        this.f9891e = true;
        this.f9890d = false;
    }

    public final void a() {
        int i3;
        o oVar = this.f9893g;
        if (oVar == this) {
            throw new IllegalStateException("cannot compact".toString());
        }
        kotlin.jvm.internal.m.b(oVar);
        if (oVar.f9891e) {
            int i4 = this.f9889c - this.f9888b;
            o oVar2 = this.f9893g;
            kotlin.jvm.internal.m.b(oVar2);
            int i5 = 8192 - oVar2.f9889c;
            o oVar3 = this.f9893g;
            kotlin.jvm.internal.m.b(oVar3);
            if (oVar3.f9890d) {
                i3 = 0;
            } else {
                o oVar4 = this.f9893g;
                kotlin.jvm.internal.m.b(oVar4);
                i3 = oVar4.f9888b;
            }
            if (i4 > i5 + i3) {
                return;
            }
            o oVar5 = this.f9893g;
            kotlin.jvm.internal.m.b(oVar5);
            f(oVar5, i4);
            b();
            p.b(this);
        }
    }

    public final o b() {
        o oVar = this.f9892f;
        if (oVar == this) {
            oVar = null;
        }
        o oVar2 = this.f9893g;
        kotlin.jvm.internal.m.b(oVar2);
        oVar2.f9892f = this.f9892f;
        o oVar3 = this.f9892f;
        kotlin.jvm.internal.m.b(oVar3);
        oVar3.f9893g = this.f9893g;
        this.f9892f = null;
        this.f9893g = null;
        return oVar;
    }

    public final o c(o segment) {
        kotlin.jvm.internal.m.e(segment, "segment");
        segment.f9893g = this;
        segment.f9892f = this.f9892f;
        o oVar = this.f9892f;
        kotlin.jvm.internal.m.b(oVar);
        oVar.f9893g = segment;
        this.f9892f = segment;
        return segment;
    }

    public final o d() {
        this.f9890d = true;
        return new o(this.f9887a, this.f9888b, this.f9889c, true, false);
    }

    public final o e(int i3) {
        o oVarC;
        if (i3 <= 0 || i3 > this.f9889c - this.f9888b) {
            throw new IllegalArgumentException("byteCount out of range".toString());
        }
        if (i3 >= 1024) {
            oVarC = d();
        } else {
            oVarC = p.c();
            byte[] bArr = this.f9887a;
            byte[] bArr2 = oVarC.f9887a;
            int i4 = this.f9888b;
            AbstractC0406j.f(bArr, bArr2, 0, i4, i4 + i3, 2, null);
        }
        oVarC.f9889c = oVarC.f9888b + i3;
        this.f9888b += i3;
        o oVar = this.f9893g;
        kotlin.jvm.internal.m.b(oVar);
        oVar.c(oVarC);
        return oVarC;
    }

    public final void f(o sink, int i3) {
        kotlin.jvm.internal.m.e(sink, "sink");
        if (!sink.f9891e) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i4 = sink.f9889c;
        if (i4 + i3 > 8192) {
            if (sink.f9890d) {
                throw new IllegalArgumentException();
            }
            int i5 = sink.f9888b;
            if ((i4 + i3) - i5 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f9887a;
            AbstractC0406j.f(bArr, bArr, 0, i5, i4, 2, null);
            sink.f9889c -= sink.f9888b;
            sink.f9888b = 0;
        }
        byte[] bArr2 = this.f9887a;
        byte[] bArr3 = sink.f9887a;
        int i6 = sink.f9889c;
        int i7 = this.f9888b;
        AbstractC0406j.d(bArr2, bArr3, i6, i7, i7 + i3);
        sink.f9889c += i3;
        this.f9888b += i3;
    }

    public o(byte[] data, int i3, int i4, boolean z2, boolean z3) {
        kotlin.jvm.internal.m.e(data, "data");
        this.f9887a = data;
        this.f9888b = i3;
        this.f9889c = i4;
        this.f9890d = z2;
        this.f9891e = z3;
    }
}
