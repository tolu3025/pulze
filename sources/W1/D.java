package w1;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import c2.AbstractC0568j;
import c2.N;
import g1.InterfaceC0872a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l1.InterfaceC1017c;
import p.InterfaceC1055i;
import t.C1221c;
import t.f;
import w1.z;

/* JADX INFO: loaded from: classes.dex */
public final class D implements InterfaceC0872a, z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f11564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC1262B f11565d = new a();

    public static final class a implements InterfaceC1262B {
        @Override // w1.InterfaceC1262B
        public String a(List list) throws IOException {
            kotlin.jvm.internal.m.e(list, "list");
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(list);
                objectOutputStream.flush();
                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                kotlin.jvm.internal.m.d(strEncodeToString, "encodeToString(...)");
                return strEncodeToString;
            } catch (RuntimeException e3) {
                throw new RuntimeException(e3);
            }
        }

        @Override // w1.InterfaceC1262B
        public List b(String listString) throws ClassNotFoundException, IOException {
            kotlin.jvm.internal.m.e(listString, "listString");
            try {
                Object object = new ObjectInputStream(new ByteArrayInputStream(Base64.decode(listString, 0))).readObject();
                kotlin.jvm.internal.m.c(object, "null cannot be cast to non-null type kotlin.collections.List<*>");
                ArrayList arrayList = new ArrayList();
                for (Object obj : (List) object) {
                    if (obj instanceof String) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            } catch (RuntimeException e3) {
                throw new RuntimeException(e3);
            }
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f11566a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f11568c;

        static final class a extends kotlin.coroutines.jvm.internal.l implements U1.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f11569a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f11570b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f11571c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List list, M1.d dVar) {
                super(2, dVar);
                this.f11571c = list;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final M1.d create(Object obj, M1.d dVar) {
                a aVar = new a(this.f11571c, dVar);
                aVar.f11570b = obj;
                return aVar;
            }

            @Override // U1.p
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C1221c c1221c, M1.d dVar) {
                return ((a) create(c1221c, dVar)).invokeSuspend(I1.u.f2419a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                I1.u uVar;
                N1.d.e();
                if (this.f11569a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                I1.o.b(obj);
                C1221c c1221c = (C1221c) this.f11570b;
                List list = this.f11571c;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        c1221c.i(t.i.a((String) it.next()));
                    }
                    uVar = I1.u.f2419a;
                } else {
                    uVar = null;
                }
                if (uVar == null) {
                    c1221c.f();
                }
                return I1.u.f2419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List list, M1.d dVar) {
            super(2, dVar);
            this.f11568c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(Object obj, M1.d dVar) {
            return D.this.new b(this.f11568c, dVar);
        }

        @Override // U1.p
        public final Object invoke(N n3, M1.d dVar) {
            return ((b) create(n3, dVar)).invokeSuspend(I1.u.f2419a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = N1.d.e();
            int i3 = this.f11566a;
            if (i3 == 0) {
                I1.o.b(obj);
                Context context = D.this.f11564c;
                if (context == null) {
                    kotlin.jvm.internal.m.p("context");
                    context = null;
                }
                InterfaceC1055i interfaceC1055iB = E.b(context);
                a aVar = new a(this.f11568c, null);
                this.f11566a = 1;
                obj = t.j.a(interfaceC1055iB, aVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                I1.o.b(obj);
            }
            return obj;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f11572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f11573b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f.a f11574c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f11575d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(f.a aVar, String str, M1.d dVar) {
            super(2, dVar);
            this.f11574c = aVar;
            this.f11575d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(Object obj, M1.d dVar) {
            c cVar = new c(this.f11574c, this.f11575d, dVar);
            cVar.f11573b = obj;
            return cVar;
        }

        @Override // U1.p
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C1221c c1221c, M1.d dVar) {
            return ((c) create(c1221c, dVar)).invokeSuspend(I1.u.f2419a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            N1.d.e();
            if (this.f11572a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I1.o.b(obj);
            ((C1221c) this.f11573b).j(this.f11574c, this.f11575d);
            return I1.u.f2419a;
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f11576a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f11578c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(List list, M1.d dVar) {
            super(2, dVar);
            this.f11578c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(Object obj, M1.d dVar) {
            return D.this.new d(this.f11578c, dVar);
        }

        @Override // U1.p
        public final Object invoke(N n3, M1.d dVar) {
            return ((d) create(n3, dVar)).invokeSuspend(I1.u.f2419a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = N1.d.e();
            int i3 = this.f11576a;
            if (i3 == 0) {
                I1.o.b(obj);
                D d3 = D.this;
                List list = this.f11578c;
                this.f11576a = 1;
                obj = d3.s(list, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                I1.o.b(obj);
            }
            return obj;
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f11579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f11580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f11581c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ D f11582d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.y f11583e;

        public static final class a implements f2.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f2.b f11584a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ f.a f11585b;

            /* JADX INFO: renamed from: w1.D$e$a$a, reason: collision with other inner class name */
            public static final class C0177a implements f2.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ f2.c f11586a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ f.a f11587b;

                /* JADX INFO: renamed from: w1.D$e$a$a$a, reason: collision with other inner class name */
                public static final class C0178a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f11588a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f11589b;

                    public C0178a(M1.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f11588a = obj;
                        this.f11589b |= Integer.MIN_VALUE;
                        return C0177a.this.emit(null, this);
                    }
                }

                public C0177a(f2.c cVar, f.a aVar) {
                    this.f11586a = cVar;
                    this.f11587b = aVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // f2.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public java.lang.Object emit(java.lang.Object r5, M1.d r6) throws java.lang.Throwable {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof w1.D.e.a.C0177a.C0178a
                        if (r0 == 0) goto L13
                        r0 = r6
                        w1.D$e$a$a$a r0 = (w1.D.e.a.C0177a.C0178a) r0
                        int r1 = r0.f11589b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f11589b = r1
                        goto L18
                    L13:
                        w1.D$e$a$a$a r0 = new w1.D$e$a$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f11588a
                        java.lang.Object r1 = N1.b.e()
                        int r2 = r0.f11589b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        I1.o.b(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        I1.o.b(r6)
                        f2.c r6 = r4.f11586a
                        t.f r5 = (t.f) r5
                        t.f$a r2 = r4.f11587b
                        java.lang.Object r5 = r5.b(r2)
                        r0.f11589b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        I1.u r5 = I1.u.f2419a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: w1.D.e.a.C0177a.emit(java.lang.Object, M1.d):java.lang.Object");
                }
            }

            public a(f2.b bVar, f.a aVar) {
                this.f11584a = bVar;
                this.f11585b = aVar;
            }

            @Override // f2.b
            public Object a(f2.c cVar, M1.d dVar) {
                Object objA = this.f11584a.a(new C0177a(cVar, this.f11585b), dVar);
                return objA == N1.d.e() ? objA : I1.u.f2419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, D d3, kotlin.jvm.internal.y yVar, M1.d dVar) {
            super(2, dVar);
            this.f11581c = str;
            this.f11582d = d3;
            this.f11583e = yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(Object obj, M1.d dVar) {
            return new e(this.f11581c, this.f11582d, this.f11583e, dVar);
        }

        @Override // U1.p
        public final Object invoke(N n3, M1.d dVar) {
            return ((e) create(n3, dVar)).invokeSuspend(I1.u.f2419a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlin.jvm.internal.y yVar;
            Object objE = N1.d.e();
            int i3 = this.f11580b;
            if (i3 == 0) {
                I1.o.b(obj);
                f.a aVarA = t.i.a(this.f11581c);
                Context context = this.f11582d.f11564c;
                if (context == null) {
                    kotlin.jvm.internal.m.p("context");
                    context = null;
                }
                a aVar = new a(E.b(context).b(), aVarA);
                kotlin.jvm.internal.y yVar2 = this.f11583e;
                this.f11579a = yVar2;
                this.f11580b = 1;
                Object objH = f2.d.h(aVar, this);
                if (objH == objE) {
                    return objE;
                }
                yVar = yVar2;
                obj = objH;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yVar = (kotlin.jvm.internal.y) this.f11579a;
                I1.o.b(obj);
            }
            yVar.f9750a = obj;
            return I1.u.f2419a;
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.l implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f11591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f11592b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f11593c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ D f11594d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.y f11595e;

        public static final class a implements f2.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f2.b f11596a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ D f11597b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ f.a f11598c;

            /* JADX INFO: renamed from: w1.D$f$a$a, reason: collision with other inner class name */
            public static final class C0179a implements f2.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ f2.c f11599a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ D f11600b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ f.a f11601c;

                /* JADX INFO: renamed from: w1.D$f$a$a$a, reason: collision with other inner class name */
                public static final class C0180a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f11602a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f11603b;

                    public C0180a(M1.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f11602a = obj;
                        this.f11603b |= Integer.MIN_VALUE;
                        return C0179a.this.emit(null, this);
                    }
                }

                public C0179a(f2.c cVar, D d3, f.a aVar) {
                    this.f11599a = cVar;
                    this.f11600b = d3;
                    this.f11601c = aVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // f2.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public java.lang.Object emit(java.lang.Object r6, M1.d r7) throws java.lang.Throwable {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof w1.D.f.a.C0179a.C0180a
                        if (r0 == 0) goto L13
                        r0 = r7
                        w1.D$f$a$a$a r0 = (w1.D.f.a.C0179a.C0180a) r0
                        int r1 = r0.f11603b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f11603b = r1
                        goto L18
                    L13:
                        w1.D$f$a$a$a r0 = new w1.D$f$a$a$a
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.f11602a
                        java.lang.Object r1 = N1.b.e()
                        int r2 = r0.f11603b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        I1.o.b(r7)
                        goto L4f
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        I1.o.b(r7)
                        f2.c r7 = r5.f11599a
                        t.f r6 = (t.f) r6
                        w1.D r2 = r5.f11600b
                        t.f$a r4 = r5.f11601c
                        java.lang.Object r6 = r6.b(r4)
                        java.lang.Object r6 = w1.D.q(r2, r6)
                        java.lang.Double r6 = (java.lang.Double) r6
                        r0.f11603b = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L4f
                        return r1
                    L4f:
                        I1.u r6 = I1.u.f2419a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: w1.D.f.a.C0179a.emit(java.lang.Object, M1.d):java.lang.Object");
                }
            }

            public a(f2.b bVar, D d3, f.a aVar) {
                this.f11596a = bVar;
                this.f11597b = d3;
                this.f11598c = aVar;
            }

            @Override // f2.b
            public Object a(f2.c cVar, M1.d dVar) {
                Object objA = this.f11596a.a(new C0179a(cVar, this.f11597b, this.f11598c), dVar);
                return objA == N1.d.e() ? objA : I1.u.f2419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, D d3, kotlin.jvm.internal.y yVar, M1.d dVar) {
            super(2, dVar);
            this.f11593c = str;
            this.f11594d = d3;
            this.f11595e = yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(Object obj, M1.d dVar) {
            return new f(this.f11593c, this.f11594d, this.f11595e, dVar);
        }

        @Override // U1.p
        public final Object invoke(N n3, M1.d dVar) {
            return ((f) create(n3, dVar)).invokeSuspend(I1.u.f2419a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlin.jvm.internal.y yVar;
            Object objE = N1.d.e();
            int i3 = this.f11592b;
            if (i3 == 0) {
                I1.o.b(obj);
                f.a aVarG = t.i.g(this.f11593c);
                Context context = this.f11594d.f11564c;
                if (context == null) {
                    kotlin.jvm.internal.m.p("context");
                    context = null;
                }
                a aVar = new a(E.b(context).b(), this.f11594d, aVarG);
                kotlin.jvm.internal.y yVar2 = this.f11595e;
                this.f11591a = yVar2;
                this.f11592b = 1;
                Object objH = f2.d.h(aVar, this);
                if (objH == objE) {
                    return objE;
                }
                yVar = yVar2;
                obj = objH;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yVar = (kotlin.jvm.internal.y) this.f11591a;
                I1.o.b(obj);
            }
            yVar.f9750a = obj;
            return I1.u.f2419a;
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.l implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f11605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f11606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f11607c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ D f11608d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.y f11609e;

        public static final class a implements f2.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f2.b f11610a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ f.a f11611b;

            /* JADX INFO: renamed from: w1.D$g$a$a, reason: collision with other inner class name */
            public static final class C0181a implements f2.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ f2.c f11612a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ f.a f11613b;

                /* JADX INFO: renamed from: w1.D$g$a$a$a, reason: collision with other inner class name */
                public static final class C0182a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f11614a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f11615b;

                    public C0182a(M1.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f11614a = obj;
                        this.f11615b |= Integer.MIN_VALUE;
                        return C0181a.this.emit(null, this);
                    }
                }

                public C0181a(f2.c cVar, f.a aVar) {
                    this.f11612a = cVar;
                    this.f11613b = aVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // f2.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public java.lang.Object emit(java.lang.Object r5, M1.d r6) throws java.lang.Throwable {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof w1.D.g.a.C0181a.C0182a
                        if (r0 == 0) goto L13
                        r0 = r6
                        w1.D$g$a$a$a r0 = (w1.D.g.a.C0181a.C0182a) r0
                        int r1 = r0.f11615b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f11615b = r1
                        goto L18
                    L13:
                        w1.D$g$a$a$a r0 = new w1.D$g$a$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f11614a
                        java.lang.Object r1 = N1.b.e()
                        int r2 = r0.f11615b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        I1.o.b(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        I1.o.b(r6)
                        f2.c r6 = r4.f11612a
                        t.f r5 = (t.f) r5
                        t.f$a r2 = r4.f11613b
                        java.lang.Object r5 = r5.b(r2)
                        r0.f11615b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        I1.u r5 = I1.u.f2419a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: w1.D.g.a.C0181a.emit(java.lang.Object, M1.d):java.lang.Object");
                }
            }

            public a(f2.b bVar, f.a aVar) {
                this.f11610a = bVar;
                this.f11611b = aVar;
            }

            @Override // f2.b
            public Object a(f2.c cVar, M1.d dVar) {
                Object objA = this.f11610a.a(new C0181a(cVar, this.f11611b), dVar);
                return objA == N1.d.e() ? objA : I1.u.f2419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, D d3, kotlin.jvm.internal.y yVar, M1.d dVar) {
            super(2, dVar);
            this.f11607c = str;
            this.f11608d = d3;
            this.f11609e = yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(Object obj, M1.d dVar) {
            return new g(this.f11607c, this.f11608d, this.f11609e, dVar);
        }

        @Override // U1.p
        public final Object invoke(N n3, M1.d dVar) {
            return ((g) create(n3, dVar)).invokeSuspend(I1.u.f2419a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlin.jvm.internal.y yVar;
            Object objE = N1.d.e();
            int i3 = this.f11606b;
            if (i3 == 0) {
                I1.o.b(obj);
                f.a aVarF = t.i.f(this.f11607c);
                Context context = this.f11608d.f11564c;
                if (context == null) {
                    kotlin.jvm.internal.m.p("context");
                    context = null;
                }
                a aVar = new a(E.b(context).b(), aVarF);
                kotlin.jvm.internal.y yVar2 = this.f11609e;
                this.f11605a = yVar2;
                this.f11606b = 1;
                Object objH = f2.d.h(aVar, this);
                if (objH == objE) {
                    return objE;
                }
                yVar = yVar2;
                obj = objH;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yVar = (kotlin.jvm.internal.y) this.f11605a;
                I1.o.b(obj);
            }
            yVar.f9750a = obj;
            return I1.u.f2419a;
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.l implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f11617a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f11619c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(List list, M1.d dVar) {
            super(2, dVar);
            this.f11619c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(Object obj, M1.d dVar) {
            return D.this.new h(this.f11619c, dVar);
        }

        @Override // U1.p
        public final Object invoke(N n3, M1.d dVar) {
            return ((h) create(n3, dVar)).invokeSuspend(I1.u.f2419a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = N1.d.e();
            int i3 = this.f11617a;
            if (i3 == 0) {
                I1.o.b(obj);
                D d3 = D.this;
                List list = this.f11619c;
                this.f11617a = 1;
                obj = d3.s(list, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                I1.o.b(obj);
            }
            return obj;
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f11620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f11621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f11622c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f11623d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f11624e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f11625f;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f11627m;

        i(M1.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f11625f = obj;
            this.f11627m |= Integer.MIN_VALUE;
            return D.this.s(null, this);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.l implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f11628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f11629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f11630c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ D f11631d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.y f11632e;

        public static final class a implements f2.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f2.b f11633a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ f.a f11634b;

            /* JADX INFO: renamed from: w1.D$j$a$a, reason: collision with other inner class name */
            public static final class C0183a implements f2.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ f2.c f11635a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ f.a f11636b;

                /* JADX INFO: renamed from: w1.D$j$a$a$a, reason: collision with other inner class name */
                public static final class C0184a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f11637a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f11638b;

                    public C0184a(M1.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f11637a = obj;
                        this.f11638b |= Integer.MIN_VALUE;
                        return C0183a.this.emit(null, this);
                    }
                }

                public C0183a(f2.c cVar, f.a aVar) {
                    this.f11635a = cVar;
                    this.f11636b = aVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // f2.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public java.lang.Object emit(java.lang.Object r5, M1.d r6) throws java.lang.Throwable {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof w1.D.j.a.C0183a.C0184a
                        if (r0 == 0) goto L13
                        r0 = r6
                        w1.D$j$a$a$a r0 = (w1.D.j.a.C0183a.C0184a) r0
                        int r1 = r0.f11638b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f11638b = r1
                        goto L18
                    L13:
                        w1.D$j$a$a$a r0 = new w1.D$j$a$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f11637a
                        java.lang.Object r1 = N1.b.e()
                        int r2 = r0.f11638b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        I1.o.b(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        I1.o.b(r6)
                        f2.c r6 = r4.f11635a
                        t.f r5 = (t.f) r5
                        t.f$a r2 = r4.f11636b
                        java.lang.Object r5 = r5.b(r2)
                        r0.f11638b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        I1.u r5 = I1.u.f2419a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: w1.D.j.a.C0183a.emit(java.lang.Object, M1.d):java.lang.Object");
                }
            }

            public a(f2.b bVar, f.a aVar) {
                this.f11633a = bVar;
                this.f11634b = aVar;
            }

            @Override // f2.b
            public Object a(f2.c cVar, M1.d dVar) {
                Object objA = this.f11633a.a(new C0183a(cVar, this.f11634b), dVar);
                return objA == N1.d.e() ? objA : I1.u.f2419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, D d3, kotlin.jvm.internal.y yVar, M1.d dVar) {
            super(2, dVar);
            this.f11630c = str;
            this.f11631d = d3;
            this.f11632e = yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(Object obj, M1.d dVar) {
            return new j(this.f11630c, this.f11631d, this.f11632e, dVar);
        }

        @Override // U1.p
        public final Object invoke(N n3, M1.d dVar) {
            return ((j) create(n3, dVar)).invokeSuspend(I1.u.f2419a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlin.jvm.internal.y yVar;
            Object objE = N1.d.e();
            int i3 = this.f11629b;
            if (i3 == 0) {
                I1.o.b(obj);
                f.a aVarG = t.i.g(this.f11630c);
                Context context = this.f11631d.f11564c;
                if (context == null) {
                    kotlin.jvm.internal.m.p("context");
                    context = null;
                }
                a aVar = new a(E.b(context).b(), aVarG);
                kotlin.jvm.internal.y yVar2 = this.f11632e;
                this.f11628a = yVar2;
                this.f11629b = 1;
                Object objH = f2.d.h(aVar, this);
                if (objH == objE) {
                    return objE;
                }
                yVar = yVar2;
                obj = objH;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yVar = (kotlin.jvm.internal.y) this.f11628a;
                I1.o.b(obj);
            }
            yVar.f9750a = obj;
            return I1.u.f2419a;
        }
    }

    public static final class k implements f2.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f2.b f11640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f.a f11641b;

        public static final class a implements f2.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f2.c f11642a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ f.a f11643b;

            /* JADX INFO: renamed from: w1.D$k$a$a, reason: collision with other inner class name */
            public static final class C0185a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f11644a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f11645b;

                public C0185a(M1.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f11644a = obj;
                    this.f11645b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(f2.c cVar, f.a aVar) {
                this.f11642a = cVar;
                this.f11643b = aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // f2.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.lang.Object emit(java.lang.Object r5, M1.d r6) throws java.lang.Throwable {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof w1.D.k.a.C0185a
                    if (r0 == 0) goto L13
                    r0 = r6
                    w1.D$k$a$a r0 = (w1.D.k.a.C0185a) r0
                    int r1 = r0.f11645b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f11645b = r1
                    goto L18
                L13:
                    w1.D$k$a$a r0 = new w1.D$k$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f11644a
                    java.lang.Object r1 = N1.b.e()
                    int r2 = r0.f11645b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    I1.o.b(r6)
                    goto L47
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    I1.o.b(r6)
                    f2.c r6 = r4.f11642a
                    t.f r5 = (t.f) r5
                    t.f$a r2 = r4.f11643b
                    java.lang.Object r5 = r5.b(r2)
                    r0.f11645b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    I1.u r5 = I1.u.f2419a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: w1.D.k.a.emit(java.lang.Object, M1.d):java.lang.Object");
            }
        }

        public k(f2.b bVar, f.a aVar) {
            this.f11640a = bVar;
            this.f11641b = aVar;
        }

        @Override // f2.b
        public Object a(f2.c cVar, M1.d dVar) {
            Object objA = this.f11640a.a(new a(cVar, this.f11641b), dVar);
            return objA == N1.d.e() ? objA : I1.u.f2419a;
        }
    }

    public static final class l implements f2.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f2.b f11647a;

        public static final class a implements f2.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f2.c f11648a;

            /* JADX INFO: renamed from: w1.D$l$a$a, reason: collision with other inner class name */
            public static final class C0186a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f11649a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f11650b;

                public C0186a(M1.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f11649a = obj;
                    this.f11650b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(f2.c cVar) {
                this.f11648a = cVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // f2.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.lang.Object emit(java.lang.Object r5, M1.d r6) throws java.lang.Throwable {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof w1.D.l.a.C0186a
                    if (r0 == 0) goto L13
                    r0 = r6
                    w1.D$l$a$a r0 = (w1.D.l.a.C0186a) r0
                    int r1 = r0.f11650b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f11650b = r1
                    goto L18
                L13:
                    w1.D$l$a$a r0 = new w1.D$l$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f11649a
                    java.lang.Object r1 = N1.b.e()
                    int r2 = r0.f11650b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    I1.o.b(r6)
                    goto L49
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    I1.o.b(r6)
                    f2.c r6 = r4.f11648a
                    t.f r5 = (t.f) r5
                    java.util.Map r5 = r5.a()
                    java.util.Set r5 = r5.keySet()
                    r0.f11650b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L49
                    return r1
                L49:
                    I1.u r5 = I1.u.f2419a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: w1.D.l.a.emit(java.lang.Object, M1.d):java.lang.Object");
            }
        }

        public l(f2.b bVar) {
            this.f11647a = bVar;
        }

        @Override // f2.b
        public Object a(f2.c cVar, M1.d dVar) {
            Object objA = this.f11647a.a(new a(cVar), dVar);
            return objA == N1.d.e() ? objA : I1.u.f2419a;
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.l implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f11652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f11653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ D f11654c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f11655d;

        static final class a extends kotlin.coroutines.jvm.internal.l implements U1.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f11656a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f11657b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ f.a f11658c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f11659d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f.a aVar, boolean z2, M1.d dVar) {
                super(2, dVar);
                this.f11658c = aVar;
                this.f11659d = z2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final M1.d create(Object obj, M1.d dVar) {
                a aVar = new a(this.f11658c, this.f11659d, dVar);
                aVar.f11657b = obj;
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
                if (this.f11656a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                I1.o.b(obj);
                ((C1221c) this.f11657b).j(this.f11658c, kotlin.coroutines.jvm.internal.b.a(this.f11659d));
                return I1.u.f2419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, D d3, boolean z2, M1.d dVar) {
            super(2, dVar);
            this.f11653b = str;
            this.f11654c = d3;
            this.f11655d = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(Object obj, M1.d dVar) {
            return new m(this.f11653b, this.f11654c, this.f11655d, dVar);
        }

        @Override // U1.p
        public final Object invoke(N n3, M1.d dVar) {
            return ((m) create(n3, dVar)).invokeSuspend(I1.u.f2419a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = N1.d.e();
            int i3 = this.f11652a;
            if (i3 == 0) {
                I1.o.b(obj);
                f.a aVarA = t.i.a(this.f11653b);
                Context context = this.f11654c.f11564c;
                if (context == null) {
                    kotlin.jvm.internal.m.p("context");
                    context = null;
                }
                InterfaceC1055i interfaceC1055iB = E.b(context);
                a aVar = new a(aVarA, this.f11655d, null);
                this.f11652a = 1;
                if (t.j.a(interfaceC1055iB, aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                I1.o.b(obj);
            }
            return I1.u.f2419a;
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.l implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f11660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f11661b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ D f11662c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ double f11663d;

        static final class a extends kotlin.coroutines.jvm.internal.l implements U1.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f11664a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f11665b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ f.a f11666c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ double f11667d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f.a aVar, double d3, M1.d dVar) {
                super(2, dVar);
                this.f11666c = aVar;
                this.f11667d = d3;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final M1.d create(Object obj, M1.d dVar) {
                a aVar = new a(this.f11666c, this.f11667d, dVar);
                aVar.f11665b = obj;
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
                if (this.f11664a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                I1.o.b(obj);
                ((C1221c) this.f11665b).j(this.f11666c, kotlin.coroutines.jvm.internal.b.b(this.f11667d));
                return I1.u.f2419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, D d3, double d4, M1.d dVar) {
            super(2, dVar);
            this.f11661b = str;
            this.f11662c = d3;
            this.f11663d = d4;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(Object obj, M1.d dVar) {
            return new n(this.f11661b, this.f11662c, this.f11663d, dVar);
        }

        @Override // U1.p
        public final Object invoke(N n3, M1.d dVar) {
            return ((n) create(n3, dVar)).invokeSuspend(I1.u.f2419a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = N1.d.e();
            int i3 = this.f11660a;
            if (i3 == 0) {
                I1.o.b(obj);
                f.a aVarC = t.i.c(this.f11661b);
                Context context = this.f11662c.f11564c;
                if (context == null) {
                    kotlin.jvm.internal.m.p("context");
                    context = null;
                }
                InterfaceC1055i interfaceC1055iB = E.b(context);
                a aVar = new a(aVarC, this.f11663d, null);
                this.f11660a = 1;
                if (t.j.a(interfaceC1055iB, aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                I1.o.b(obj);
            }
            return I1.u.f2419a;
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.l implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f11668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f11669b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ D f11670c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f11671d;

        static final class a extends kotlin.coroutines.jvm.internal.l implements U1.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f11672a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f11673b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ f.a f11674c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ long f11675d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f.a aVar, long j3, M1.d dVar) {
                super(2, dVar);
                this.f11674c = aVar;
                this.f11675d = j3;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final M1.d create(Object obj, M1.d dVar) {
                a aVar = new a(this.f11674c, this.f11675d, dVar);
                aVar.f11673b = obj;
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
                if (this.f11672a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                I1.o.b(obj);
                ((C1221c) this.f11673b).j(this.f11674c, kotlin.coroutines.jvm.internal.b.d(this.f11675d));
                return I1.u.f2419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, D d3, long j3, M1.d dVar) {
            super(2, dVar);
            this.f11669b = str;
            this.f11670c = d3;
            this.f11671d = j3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(Object obj, M1.d dVar) {
            return new o(this.f11669b, this.f11670c, this.f11671d, dVar);
        }

        @Override // U1.p
        public final Object invoke(N n3, M1.d dVar) {
            return ((o) create(n3, dVar)).invokeSuspend(I1.u.f2419a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = N1.d.e();
            int i3 = this.f11668a;
            if (i3 == 0) {
                I1.o.b(obj);
                f.a aVarF = t.i.f(this.f11669b);
                Context context = this.f11670c.f11564c;
                if (context == null) {
                    kotlin.jvm.internal.m.p("context");
                    context = null;
                }
                InterfaceC1055i interfaceC1055iB = E.b(context);
                a aVar = new a(aVarF, this.f11671d, null);
                this.f11668a = 1;
                if (t.j.a(interfaceC1055iB, aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                I1.o.b(obj);
            }
            return I1.u.f2419a;
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.l implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f11676a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f11678c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f11679d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, String str2, M1.d dVar) {
            super(2, dVar);
            this.f11678c = str;
            this.f11679d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(Object obj, M1.d dVar) {
            return D.this.new p(this.f11678c, this.f11679d, dVar);
        }

        @Override // U1.p
        public final Object invoke(N n3, M1.d dVar) {
            return ((p) create(n3, dVar)).invokeSuspend(I1.u.f2419a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = N1.d.e();
            int i3 = this.f11676a;
            if (i3 == 0) {
                I1.o.b(obj);
                D d3 = D.this;
                String str = this.f11678c;
                String str2 = this.f11679d;
                this.f11676a = 1;
                if (d3.r(str, str2, this) == objE) {
                    return objE;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                I1.o.b(obj);
            }
            return I1.u.f2419a;
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.l implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f11680a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f11682c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f11683d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(String str, String str2, M1.d dVar) {
            super(2, dVar);
            this.f11682c = str;
            this.f11683d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(Object obj, M1.d dVar) {
            return D.this.new q(this.f11682c, this.f11683d, dVar);
        }

        @Override // U1.p
        public final Object invoke(N n3, M1.d dVar) {
            return ((q) create(n3, dVar)).invokeSuspend(I1.u.f2419a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = N1.d.e();
            int i3 = this.f11680a;
            if (i3 == 0) {
                I1.o.b(obj);
                D d3 = D.this;
                String str = this.f11682c;
                String str2 = this.f11683d;
                this.f11680a = 1;
                if (d3.r(str, str2, this) == objE) {
                    return objE;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                I1.o.b(obj);
            }
            return I1.u.f2419a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r(String str, String str2, M1.d dVar) {
        f.a aVarG = t.i.g(str);
        Context context = this.f11564c;
        if (context == null) {
            kotlin.jvm.internal.m.p("context");
            context = null;
        }
        Object objA = t.j.a(E.b(context), new c(aVarG, str2, null), dVar);
        return objA == N1.d.e() ? objA : I1.u.f2419a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a2 -> B:33:0x00a5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s(java.util.List r9, M1.d r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof w1.D.i
            if (r0 == 0) goto L13
            r0 = r10
            w1.D$i r0 = (w1.D.i) r0
            int r1 = r0.f11627m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11627m = r1
            goto L18
        L13:
            w1.D$i r0 = new w1.D$i
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f11625f
            java.lang.Object r1 = N1.b.e()
            int r2 = r0.f11627m
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L58
            if (r2 == r4) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r9 = r0.f11624e
            t.f$a r9 = (t.f.a) r9
            java.lang.Object r2 = r0.f11623d
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.f11622c
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r5 = r0.f11621b
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Object r6 = r0.f11620a
            w1.D r6 = (w1.D) r6
            I1.o.b(r10)
            goto La5
        L40:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L48:
            java.lang.Object r9 = r0.f11622c
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r2 = r0.f11621b
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r4 = r0.f11620a
            w1.D r4 = (w1.D) r4
            I1.o.b(r10)
            goto L7a
        L58:
            I1.o.b(r10)
            if (r9 == 0) goto L63
            java.util.Set r9 = J1.AbstractC0410n.a0(r9)
        L61:
            r2 = r9
            goto L65
        L63:
            r9 = 0
            goto L61
        L65:
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            r0.f11620a = r8
            r0.f11621b = r2
            r0.f11622c = r9
            r0.f11627m = r4
            java.lang.Object r10 = r8.v(r0)
            if (r10 != r1) goto L79
            return r1
        L79:
            r4 = r8
        L7a:
            java.util.Set r10 = (java.util.Set) r10
            if (r10 == 0) goto Lbe
            java.util.Iterator r10 = r10.iterator()
            r5 = r2
            r6 = r4
            r4 = r9
            r2 = r10
        L86:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto Lbd
            java.lang.Object r9 = r2.next()
            t.f$a r9 = (t.f.a) r9
            r0.f11620a = r6
            r0.f11621b = r5
            r0.f11622c = r4
            r0.f11623d = r2
            r0.f11624e = r9
            r0.f11627m = r3
            java.lang.Object r10 = r6.t(r9, r0)
            if (r10 != r1) goto La5
            return r1
        La5:
            java.lang.String r7 = r9.toString()
            boolean r7 = r6.u(r7, r10, r5)
            if (r7 == 0) goto L86
            java.lang.Object r10 = r6.x(r10)
            if (r10 == 0) goto L86
            java.lang.String r9 = r9.toString()
            r4.put(r9, r10)
            goto L86
        Lbd:
            r9 = r4
        Lbe:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.D.s(java.util.List, M1.d):java.lang.Object");
    }

    private final Object t(f.a aVar, M1.d dVar) {
        Context context = this.f11564c;
        if (context == null) {
            kotlin.jvm.internal.m.p("context");
            context = null;
        }
        return f2.d.h(new k(E.b(context).b(), aVar), dVar);
    }

    private final boolean u(String str, Object obj, Set set) {
        return set == null ? (obj instanceof Boolean) || (obj instanceof Long) || (obj instanceof String) || (obj instanceof Double) : set.contains(str);
    }

    private final Object v(M1.d dVar) {
        Context context = this.f11564c;
        if (context == null) {
            kotlin.jvm.internal.m.p("context");
            context = null;
        }
        return f2.d.h(new l(E.b(context).b()), dVar);
    }

    private final void w(InterfaceC1017c interfaceC1017c, Context context) {
        this.f11564c = context;
        try {
            z.f11709b.o(interfaceC1017c, this);
        } catch (Exception e3) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object x(Object obj) {
        if (!(obj instanceof String)) {
            return obj;
        }
        String str = (String) obj;
        if (!b2.o.p(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false, 2, null)) {
            return obj;
        }
        InterfaceC1262B interfaceC1262B = this.f11565d;
        String strSubstring = str.substring(40);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return interfaceC1262B.b(strSubstring);
    }

    @Override // g1.InterfaceC0872a
    public void A(InterfaceC0872a.b binding) {
        kotlin.jvm.internal.m.e(binding, "binding");
        InterfaceC1017c interfaceC1017cB = binding.b();
        kotlin.jvm.internal.m.d(interfaceC1017cB, "getBinaryMessenger(...)");
        Context contextA = binding.a();
        kotlin.jvm.internal.m.d(contextA, "getApplicationContext(...)");
        w(interfaceC1017cB, contextA);
        new C1264a().A(binding);
    }

    @Override // w1.z
    public Double a(String key, C1263C options) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(options, "options");
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        AbstractC0568j.b(null, new f(key, this, yVar, null), 1, null);
        return (Double) yVar.f9750a;
    }

    @Override // w1.z
    public void b(String key, boolean z2, C1263C options) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(options, "options");
        AbstractC0568j.b(null, new m(key, this, z2, null), 1, null);
    }

    @Override // w1.z
    public List c(List list, C1263C options) {
        kotlin.jvm.internal.m.e(options, "options");
        return J1.x.V(((Map) AbstractC0568j.b(null, new h(list, null), 1, null)).keySet());
    }

    @Override // w1.z
    public void d(String key, List value, C1263C options) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(value, "value");
        kotlin.jvm.internal.m.e(options, "options");
        AbstractC0568j.b(null, new q(key, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + this.f11565d.a(value), null), 1, null);
    }

    @Override // w1.z
    public void e(String key, long j3, C1263C options) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(options, "options");
        AbstractC0568j.b(null, new o(key, this, j3, null), 1, null);
    }

    @Override // w1.z
    public void f(List list, C1263C options) {
        kotlin.jvm.internal.m.e(options, "options");
        AbstractC0568j.b(null, new b(list, null), 1, null);
    }

    @Override // w1.z
    public List g(String key, C1263C options) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(options, "options");
        List list = (List) x(l(key, options));
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof String) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // w1.z
    public Map h(List list, C1263C options) {
        kotlin.jvm.internal.m.e(options, "options");
        return (Map) AbstractC0568j.b(null, new d(list, null), 1, null);
    }

    @Override // w1.z
    public Long i(String key, C1263C options) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(options, "options");
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        AbstractC0568j.b(null, new g(key, this, yVar, null), 1, null);
        return (Long) yVar.f9750a;
    }

    @Override // w1.z
    public void j(String key, double d3, C1263C options) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(options, "options");
        AbstractC0568j.b(null, new n(key, this, d3, null), 1, null);
    }

    @Override // w1.z
    public void k(String key, String value, C1263C options) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(value, "value");
        kotlin.jvm.internal.m.e(options, "options");
        AbstractC0568j.b(null, new p(key, value, null), 1, null);
    }

    @Override // w1.z
    public String l(String key, C1263C options) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(options, "options");
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        AbstractC0568j.b(null, new j(key, this, yVar, null), 1, null);
        return (String) yVar.f9750a;
    }

    @Override // w1.z
    public Boolean m(String key, C1263C options) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(options, "options");
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        AbstractC0568j.b(null, new e(key, this, yVar, null), 1, null);
        return (Boolean) yVar.f9750a;
    }

    @Override // g1.InterfaceC0872a
    public void y(InterfaceC0872a.b binding) {
        kotlin.jvm.internal.m.e(binding, "binding");
        z.a aVar = z.f11709b;
        InterfaceC1017c interfaceC1017cB = binding.b();
        kotlin.jvm.internal.m.d(interfaceC1017cB, "getBinaryMessenger(...)");
        aVar.o(interfaceC1017cB, null);
    }
}
