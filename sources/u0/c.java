package u0;

import I1.o;
import J1.AbstractC0411o;
import J1.G;
import U1.p;
import Z1.i;
import android.content.Context;
import android.os.Process;
import android.util.Log;
import c2.AbstractC0568j;
import c2.N;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.z;
import p.C1050d;
import p.InterfaceC1055i;
import q.C1122b;
import s.AbstractC1206a;
import t.C1221c;
import t.f;
import t.g;
import t.j;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ i[] f11466f = {z.f(new u(c.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f11467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ThreadLocal f11469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final X1.a f11470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC1055i f11471e;

    static final class a extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f11472a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ U1.l f11474c;

        /* JADX INFO: renamed from: u0.c$a$a, reason: collision with other inner class name */
        static final class C0172a extends l implements p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f11475a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f11476b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ U1.l f11477c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0172a(U1.l lVar, M1.d dVar) {
                super(2, dVar);
                this.f11477c = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final M1.d create(Object obj, M1.d dVar) {
                C0172a c0172a = new C0172a(this.f11477c, dVar);
                c0172a.f11476b = obj;
                return c0172a;
            }

            @Override // U1.p
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C1221c c1221c, M1.d dVar) {
                return ((C0172a) create(c1221c, dVar)).invokeSuspend(I1.u.f2419a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                N1.d.e();
                if (this.f11475a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                this.f11477c.invoke((C1221c) this.f11476b);
                return I1.u.f2419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(U1.l lVar, M1.d dVar) {
            super(2, dVar);
            this.f11474c = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(Object obj, M1.d dVar) {
            return c.this.new a(this.f11474c, dVar);
        }

        @Override // U1.p
        public final Object invoke(N n3, M1.d dVar) {
            return ((a) create(n3, dVar)).invokeSuspend(I1.u.f2419a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = N1.d.e();
            int i3 = this.f11472a;
            try {
                if (i3 == 0) {
                    o.b(obj);
                    if (m.a(c.this.f11469c.get(), kotlin.coroutines.jvm.internal.b.a(true))) {
                        throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                    }
                    c.this.f11469c.set(kotlin.coroutines.jvm.internal.b.a(true));
                    InterfaceC1055i interfaceC1055i = c.this.f11471e;
                    C0172a c0172a = new C0172a(this.f11474c, null);
                    this.f11472a = 1;
                    obj = j.a(interfaceC1055i, c0172a, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                return (f) obj;
            } finally {
                c.this.f11469c.set(kotlin.coroutines.jvm.internal.b.a(false));
            }
        }
    }

    static final class b extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f11478a;

        b(M1.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(Object obj, M1.d dVar) {
            return c.this.new b(dVar);
        }

        @Override // U1.p
        public final Object invoke(N n3, M1.d dVar) {
            return ((b) create(n3, dVar)).invokeSuspend(I1.u.f2419a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Map mapA;
            Object objE = N1.d.e();
            int i3 = this.f11478a;
            if (i3 == 0) {
                o.b(obj);
                f2.b bVarB = c.this.f11471e.b();
                this.f11478a = 1;
                obj = f2.d.h(bVarB, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            f fVar = (f) obj;
            return (fVar == null || (mapA = fVar.a()) == null) ? G.d() : mapA;
        }
    }

    /* JADX INFO: renamed from: u0.c$c, reason: collision with other inner class name */
    static final class C0173c extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f11480a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f.a f11482c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f11483d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0173c(f.a aVar, Object obj, M1.d dVar) {
            super(2, dVar);
            this.f11482c = aVar;
            this.f11483d = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(Object obj, M1.d dVar) {
            return c.this.new C0173c(this.f11482c, this.f11483d, dVar);
        }

        @Override // U1.p
        public final Object invoke(N n3, M1.d dVar) {
            return ((C0173c) create(n3, dVar)).invokeSuspend(I1.u.f2419a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            Object objE = N1.d.e();
            int i3 = this.f11480a;
            if (i3 == 0) {
                o.b(obj);
                f2.b bVarB = c.this.f11471e.b();
                this.f11480a = 1;
                obj = f2.d.h(bVarB, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            f fVar = (f) obj;
            return (fVar == null || (objB = fVar.b(this.f11482c)) == null) ? this.f11483d : objB;
        }
    }

    static final class d extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f11484a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f.a f11486c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f11487d;

        static final class a extends l implements p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f11488a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f11489b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ f.a f11490c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Object f11491d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f.a aVar, Object obj, M1.d dVar) {
                super(2, dVar);
                this.f11490c = aVar;
                this.f11491d = obj;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final M1.d create(Object obj, M1.d dVar) {
                a aVar = new a(this.f11490c, this.f11491d, dVar);
                aVar.f11489b = obj;
                return aVar;
            }

            @Override // U1.p
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C1221c c1221c, M1.d dVar) {
                return ((a) create(c1221c, dVar)).invokeSuspend(I1.u.f2419a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                N1.d.e();
                if (this.f11488a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                ((C1221c) this.f11489b).j(this.f11490c, this.f11491d);
                return I1.u.f2419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(f.a aVar, Object obj, M1.d dVar) {
            super(2, dVar);
            this.f11486c = aVar;
            this.f11487d = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(Object obj, M1.d dVar) {
            return c.this.new d(this.f11486c, this.f11487d, dVar);
        }

        @Override // U1.p
        public final Object invoke(N n3, M1.d dVar) {
            return ((d) create(n3, dVar)).invokeSuspend(I1.u.f2419a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = N1.d.e();
            int i3 = this.f11484a;
            if (i3 == 0) {
                o.b(obj);
                InterfaceC1055i interfaceC1055i = c.this.f11471e;
                a aVar = new a(this.f11486c, this.f11487d, null);
                this.f11484a = 1;
                obj = j.a(interfaceC1055i, aVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return obj;
        }
    }

    public c(Context context, String name) {
        m.e(context, "context");
        m.e(name, "name");
        this.f11467a = context;
        this.f11468b = name;
        this.f11469c = new ThreadLocal();
        this.f11470d = AbstractC1206a.b(name, new C1122b(new U1.l() { // from class: u0.a
            @Override // U1.l
            public final Object invoke(Object obj) {
                return c.e(this.f11464a, (C1050d) obj);
            }
        }), new U1.l() { // from class: u0.b
            @Override // U1.l
            public final Object invoke(Object obj) {
                return c.f(this.f11465a, (Context) obj);
            }
        }, null, 8, null);
        this.f11471e = i(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f e(c cVar, C1050d ex) {
        m.e(ex, "ex");
        Log.w(z.b(c.class).b(), "CorruptionException in " + cVar.f11468b + " DataStore running in process " + Process.myPid(), ex);
        return g.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f(c cVar, Context it) {
        m.e(it, "it");
        return AbstractC0411o.d(s.i.b(it, cVar.f11468b, null, 4, null));
    }

    private final InterfaceC1055i i(Context context) {
        return (InterfaceC1055i) this.f11470d.a(context, f11466f[0]);
    }

    public final f g(U1.l transform) {
        m.e(transform, "transform");
        return (f) AbstractC0568j.b(null, new a(transform, null), 1, null);
    }

    public final Map h() {
        return (Map) AbstractC0568j.b(null, new b(null), 1, null);
    }

    public final Object j(f.a key, Object obj) {
        m.e(key, "key");
        return AbstractC0568j.b(null, new C0173c(key, obj, null), 1, null);
    }

    public final f k(f.a key, Object obj) {
        m.e(key, "key");
        return (f) AbstractC0568j.b(null, new d(key, obj, null), 1, null);
    }
}
