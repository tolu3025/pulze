package io.grpc.internal;

import e0.AbstractC0829j;
import io.grpc.internal.InterfaceC0966s;
import y1.AbstractC1308k;

/* JADX INFO: loaded from: classes.dex */
public final class G extends C0962p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y1.l0 f8598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0966s.a f8599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AbstractC1308k[] f8600e;

    public G(y1.l0 l0Var, InterfaceC0966s.a aVar, AbstractC1308k[] abstractC1308kArr) {
        AbstractC0829j.e(!l0Var.o(), "error must not be OK");
        this.f8598c = l0Var;
        this.f8599d = aVar;
        this.f8600e = abstractC1308kArr;
    }

    @Override // io.grpc.internal.C0962p0, io.grpc.internal.r
    public void g(InterfaceC0966s interfaceC0966s) {
        AbstractC0829j.u(!this.f8597b, "already started");
        this.f8597b = true;
        for (AbstractC1308k abstractC1308k : this.f8600e) {
            abstractC1308k.i(this.f8598c);
        }
        interfaceC0966s.c(this.f8598c, this.f8599d, new y1.Z());
    }

    @Override // io.grpc.internal.C0962p0, io.grpc.internal.r
    public void l(Y y2) {
        y2.b("error", this.f8598c).b("progress", this.f8599d);
    }

    public G(y1.l0 l0Var, AbstractC1308k[] abstractC1308kArr) {
        this(l0Var, InterfaceC0966s.a.PROCESSED, abstractC1308kArr);
    }
}
