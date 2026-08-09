package r;

import I1.g;
import I1.i;
import I1.o;
import I1.u;
import J1.x;
import U1.p;
import U1.q;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p.InterfaceC1053g;

/* JADX INFO: renamed from: r.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1194a implements InterfaceC1053g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f11078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f11079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f11080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f11081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f11082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f11083f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: r.a$a, reason: collision with other inner class name */
    public static final class C0164a extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f11084a;

        C0164a(M1.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(Object obj, M1.d dVar) {
            return new C0164a(dVar);
        }

        @Override // U1.p
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, M1.d dVar) {
            return ((C0164a) create(obj, dVar)).invokeSuspend(u.f2419a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            N1.d.e();
            if (this.f11084a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(true);
        }
    }

    /* JADX INFO: renamed from: r.a$b */
    static final class b extends n implements U1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f11085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f11086b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, String str) {
            super(0);
            this.f11085a = context;
            this.f11086b = str;
        }

        @Override // U1.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            SharedPreferences sharedPreferences = this.f11085a.getSharedPreferences(this.f11086b, 0);
            m.d(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
            return sharedPreferences;
        }
    }

    /* JADX INFO: renamed from: r.a$c */
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f11087a = new c();

        private c() {
        }

        public static final boolean a(Context context, String name) {
            m.e(context, "context");
            m.e(name, "name");
            return context.deleteSharedPreferences(name);
        }
    }

    /* JADX INFO: renamed from: r.a$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f11088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f11089b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f11091d;

        d(M1.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f11089b = obj;
            this.f11091d |= Integer.MIN_VALUE;
            return C1194a.this.c(null, this);
        }
    }

    private C1194a(U1.a aVar, Set set, p pVar, q qVar, Context context, String str) {
        this.f11078a = pVar;
        this.f11079b = qVar;
        this.f11080c = context;
        this.f11081d = str;
        this.f11082e = i.a(aVar);
        this.f11083f = set == AbstractC1195b.a() ? null : x.Z(set);
    }

    private final void d(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            c.a(context, str);
            return;
        }
        File fileG = g(context, str);
        File fileF = f(fileG);
        fileG.delete();
        fileF.delete();
    }

    private final SharedPreferences e() {
        return (SharedPreferences) this.f11082e.getValue();
    }

    private final File f(File file) {
        return new File(file.getPath() + ".bak");
    }

    private final File g(Context context, String str) {
        return new File(new File(context.getApplicationInfo().dataDir, "shared_prefs"), str + ".xml");
    }

    @Override // p.InterfaceC1053g
    public Object a(M1.d dVar) throws IOException {
        Context context;
        String str;
        SharedPreferences.Editor editorEdit = e().edit();
        Set set = this.f11083f;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (e().getAll().isEmpty() && (context = this.f11080c) != null && (str = this.f11081d) != null) {
            d(context, str);
        }
        Set set2 = this.f11083f;
        if (set2 != null) {
            set2.clear();
        }
        return u.f2419a;
    }

    @Override // p.InterfaceC1053g
    public Object b(Object obj, M1.d dVar) {
        return this.f11079b.e(new r.c(e(), this.f11083f), obj, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p.InterfaceC1053g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(java.lang.Object r5, M1.d r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof r.C1194a.d
            if (r0 == 0) goto L13
            r0 = r6
            r.a$d r0 = (r.C1194a.d) r0
            int r1 = r0.f11091d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11091d = r1
            goto L18
        L13:
            r.a$d r0 = new r.a$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f11089b
            java.lang.Object r1 = N1.b.e()
            int r2 = r0.f11091d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f11088a
            r.a r5 = (r.C1194a) r5
            I1.o.b(r6)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            I1.o.b(r6)
            U1.p r6 = r4.f11078a
            r0.f11088a = r4
            r0.f11091d = r3
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r5 = r4
        L46:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r0 = 0
            if (r6 != 0) goto L54
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r0)
            return r5
        L54:
            java.util.Set r6 = r5.f11083f
            android.content.SharedPreferences r5 = r5.e()
            if (r6 != 0) goto L6e
            java.util.Map r5 = r5.getAll()
            java.lang.String r6 = "sharedPrefs.all"
            kotlin.jvm.internal.m.d(r5, r6)
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L6c
            goto L8f
        L6c:
            r3 = r0
            goto L8f
        L6e:
            boolean r1 = r6 instanceof java.util.Collection
            if (r1 == 0) goto L79
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L79
            goto L6c
        L79:
            java.util.Iterator r6 = r6.iterator()
        L7d:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r5.contains(r1)
            if (r1 == 0) goto L7d
        L8f:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C1194a.c(java.lang.Object, M1.d):java.lang.Object");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1194a(Context context, String sharedPreferencesName, Set keysToMigrate, p shouldRunMigration, q migrate) {
        this(new b(context, sharedPreferencesName), keysToMigrate, shouldRunMigration, migrate, context, sharedPreferencesName);
        m.e(context, "context");
        m.e(sharedPreferencesName, "sharedPreferencesName");
        m.e(keysToMigrate, "keysToMigrate");
        m.e(shouldRunMigration, "shouldRunMigration");
        m.e(migrate, "migrate");
    }

    public /* synthetic */ C1194a(Context context, String str, Set set, p pVar, q qVar, int i3, h hVar) {
        this(context, str, (i3 & 4) != 0 ? AbstractC1195b.a() : set, (i3 & 8) != 0 ? new C0164a(null) : pVar, qVar);
    }
}
