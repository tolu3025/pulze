package androidx.window.java.layout;

import I1.o;
import I1.u;
import M1.d;
import U1.p;
import c2.N;
import f2.b;
import f2.c;
import j.InterfaceC0980a;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: loaded from: classes.dex */
@f(c = "androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1", f = "WindowInfoTrackerCallbackAdapter.kt", l = {96}, m = "invokeSuspend")
final class WindowInfoTrackerCallbackAdapter$addListener$1$1 extends l implements p {
    final /* synthetic */ InterfaceC0980a $consumer;
    final /* synthetic */ b $flow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WindowInfoTrackerCallbackAdapter$addListener$1$1(b bVar, InterfaceC0980a interfaceC0980a, d dVar) {
        super(2, dVar);
        this.$flow = bVar;
        this.$consumer = interfaceC0980a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new WindowInfoTrackerCallbackAdapter$addListener$1$1(this.$flow, this.$consumer, dVar);
    }

    @Override // U1.p
    public final Object invoke(N n3, d dVar) {
        return ((WindowInfoTrackerCallbackAdapter$addListener$1$1) create(n3, dVar)).invokeSuspend(u.f2419a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE = N1.d.e();
        int i3 = this.label;
        if (i3 == 0) {
            o.b(obj);
            b bVar = this.$flow;
            final InterfaceC0980a interfaceC0980a = this.$consumer;
            c cVar = new c() { // from class: androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1
                @Override // f2.c
                public Object emit(T t2, d dVar) {
                    interfaceC0980a.accept(t2);
                    return u.f2419a;
                }
            };
            this.label = 1;
            if (bVar.a(cVar, this) == objE) {
                return objE;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
        }
        return u.f2419a;
    }
}
