package t;

import I1.o;
import I1.u;
import U1.p;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.m;
import p.InterfaceC1055i;

/* JADX INFO: renamed from: t.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1222d implements InterfaceC1055i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1055i f11278a;

    /* JADX INFO: renamed from: t.d$a */
    static final class a extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f11279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f11280b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f11281c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p pVar, M1.d dVar) {
            super(2, dVar);
            this.f11281c = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(Object obj, M1.d dVar) {
            a aVar = new a(this.f11281c, dVar);
            aVar.f11280b = obj;
            return aVar;
        }

        @Override // U1.p
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f fVar, M1.d dVar) {
            return ((a) create(fVar, dVar)).invokeSuspend(u.f2419a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = N1.d.e();
            int i3 = this.f11279a;
            if (i3 == 0) {
                o.b(obj);
                f fVar = (f) this.f11280b;
                p pVar = this.f11281c;
                this.f11279a = 1;
                obj = pVar.invoke(fVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            f fVar2 = (f) obj;
            m.c(fVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
            ((C1221c) fVar2).g();
            return fVar2;
        }
    }

    public C1222d(InterfaceC1055i delegate) {
        m.e(delegate, "delegate");
        this.f11278a = delegate;
    }

    @Override // p.InterfaceC1055i
    public Object a(p pVar, M1.d dVar) {
        return this.f11278a.a(new a(pVar, null), dVar);
    }

    @Override // p.InterfaceC1055i
    public f2.b b() {
        return this.f11278a.b();
    }
}
