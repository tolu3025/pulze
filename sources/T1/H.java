package t1;

import android.net.Uri;
import android.util.SparseArray;
import com.google.firebase.storage.C0770e;
import com.google.firebase.storage.E;
import com.google.firebase.storage.N;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import t1.G;

/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f11339l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final SparseArray f11340m = new SparseArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f11341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.firebase.storage.p f11343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f11344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Uri f11345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.firebase.storage.o f11346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f11347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f11348h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f11349i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.firebase.storage.E f11350j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f11351k;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final void a() {
            synchronized (d()) {
                try {
                    int size = H.f11339l.d().size();
                    for (int i3 = 0; i3 < size; i3++) {
                        H h3 = (H) H.f11339l.d().valueAt(i3);
                        if (h3 != null) {
                            h3.c();
                        }
                    }
                    H.f11339l.d().clear();
                    I1.u uVar = I1.u.f2419a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final H b(int i3, com.google.firebase.storage.p reference, File file) {
            kotlin.jvm.internal.m.e(reference, "reference");
            kotlin.jvm.internal.m.e(file, "file");
            return new H(b.f11354c, i3, reference, null, Uri.fromFile(file), null, null);
        }

        public final H c(int i3) {
            H h3;
            synchronized (d()) {
                h3 = (H) H.f11339l.d().get(i3);
            }
            return h3;
        }

        public final SparseArray d() {
            return H.f11340m;
        }

        public final Map e(C0770e.a snapshot) {
            kotlin.jvm.internal.m.e(snapshot, "snapshot");
            HashMap map = new HashMap();
            map.put("path", snapshot.b().q());
            map.put("bytesTransferred", Long.valueOf(snapshot.c().isSuccessful() ? snapshot.e() : snapshot.d()));
            map.put("totalBytes", Long.valueOf(snapshot.e()));
            return map;
        }

        public final Map f(Object snapshot) {
            kotlin.jvm.internal.m.e(snapshot, "snapshot");
            return snapshot instanceof C0770e.a ? e((C0770e.a) snapshot) : g((N.b) snapshot);
        }

        public final Map g(N.b snapshot) {
            kotlin.jvm.internal.m.e(snapshot, "snapshot");
            HashMap map = new HashMap();
            map.put("path", snapshot.b().q());
            map.put("bytesTransferred", Long.valueOf(snapshot.d()));
            map.put("totalBytes", Long.valueOf(snapshot.f()));
            if (snapshot.e() != null) {
                G.a aVar = G.f11334e;
                com.google.firebase.storage.o oVarE = snapshot.e();
                kotlin.jvm.internal.m.b(oVarE);
                map.put("metadata", aVar.d(oVarE));
            }
            return map;
        }

        public final H h(int i3, com.google.firebase.storage.p reference, byte[] data, com.google.firebase.storage.o oVar) {
            kotlin.jvm.internal.m.e(reference, "reference");
            kotlin.jvm.internal.m.e(data, "data");
            return new H(b.f11353b, i3, reference, data, null, oVar, null);
        }

        public final H i(int i3, com.google.firebase.storage.p reference, Uri fileUri, com.google.firebase.storage.o oVar) {
            kotlin.jvm.internal.m.e(reference, "reference");
            kotlin.jvm.internal.m.e(fileUri, "fileUri");
            return new H(b.f11352a, i3, reference, null, fileUri, oVar, null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f11352a = new b("FILE", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f11353b = new b("BYTES", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f11354c = new b("DOWNLOAD", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f11355d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ O1.a f11356e;

        static {
            b[] bVarArrC = c();
            f11355d = bVarArrC;
            f11356e = O1.b.a(bVarArrC);
        }

        private b(String str, int i3) {
        }

        private static final /* synthetic */ b[] c() {
            return new b[]{f11352a, f11353b, f11354c};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f11355d.clone();
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11357a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f11353b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f11352a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.f11354c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f11357a = iArr;
        }
    }

    private H(b bVar, int i3, com.google.firebase.storage.p pVar, byte[] bArr, Uri uri, com.google.firebase.storage.o oVar) {
        this.f11341a = bVar;
        this.f11342b = i3;
        this.f11343c = pVar;
        this.f11344d = bArr;
        this.f11345e = uri;
        this.f11346f = oVar;
        this.f11347g = new Object();
        this.f11348h = new Object();
        this.f11349i = new Object();
        SparseArray sparseArray = f11340m;
        synchronized (sparseArray) {
            sparseArray.put(i3, this);
            I1.u uVar = I1.u.f2419a;
        }
    }

    public final boolean b() {
        com.google.firebase.storage.E e3 = this.f11350j;
        if (e3 == null) {
            kotlin.jvm.internal.m.p("storageTask");
            e3 = null;
        }
        return e3.w();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002f A[Catch: all -> 0x0017, TryCatch #3 {all -> 0x0017, blocks: (B:7:0x000b, B:9:0x0010, B:12:0x0019, B:14:0x001f, B:16:0x0023, B:17:0x0029, B:24:0x003d, B:19:0x002f, B:21:0x0033, B:23:0x003a), top: B:56:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            r3 = this;
            boolean r0 = r3.f11351k
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r3.f11351k = r0
            android.util.SparseArray r0 = t1.H.f11340m
            monitor-enter(r0)
            com.google.firebase.storage.E r1 = r3.f11350j     // Catch: java.lang.Throwable -> L17
            r2 = 0
            if (r1 != 0) goto L19
            java.lang.String r1 = "storageTask"
            kotlin.jvm.internal.m.p(r1)     // Catch: java.lang.Throwable -> L17
            r1 = r2
            goto L19
        L17:
            r1 = move-exception
            goto L6a
        L19:
            boolean r1 = r1.K()     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L2f
            com.google.firebase.storage.E r1 = r3.f11350j     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L29
            java.lang.String r1 = "storageTask"
            kotlin.jvm.internal.m.p(r1)     // Catch: java.lang.Throwable -> L17
            r1 = r2
        L29:
            boolean r1 = r1.L()     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L3d
        L2f:
            com.google.firebase.storage.E r1 = r3.f11350j     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L39
            java.lang.String r1 = "storageTask"
            kotlin.jvm.internal.m.p(r1)     // Catch: java.lang.Throwable -> L17
            goto L3a
        L39:
            r2 = r1
        L3a:
            r2.w()     // Catch: java.lang.Throwable -> L17
        L3d:
            int r1 = r3.f11342b     // Catch: java.lang.Throwable -> L17
            r0.remove(r1)     // Catch: java.lang.Throwable -> L17
            I1.u r1 = I1.u.f2419a     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            java.lang.Object r0 = r3.f11349i
            monitor-enter(r0)
            java.lang.Object r1 = r3.f11349i     // Catch: java.lang.Throwable -> L67
            r1.notifyAll()     // Catch: java.lang.Throwable -> L67
            monitor-exit(r0)
            java.lang.Object r0 = r3.f11347g
            monitor-enter(r0)
            java.lang.Object r1 = r3.f11347g     // Catch: java.lang.Throwable -> L64
            r1.notifyAll()     // Catch: java.lang.Throwable -> L64
            monitor-exit(r0)
            java.lang.Object r0 = r3.f11348h
            monitor-enter(r0)
            java.lang.Object r1 = r3.f11348h     // Catch: java.lang.Throwable -> L61
            r1.notifyAll()     // Catch: java.lang.Throwable -> L61
            monitor-exit(r0)
            return
        L61:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L64:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L67:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L6a:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.H.c():void");
    }

    public final Object d() {
        com.google.firebase.storage.E e3 = this.f11350j;
        if (e3 == null) {
            kotlin.jvm.internal.m.p("storageTask");
            e3 = null;
        }
        E.a aVarF = e3.F();
        kotlin.jvm.internal.m.d(aVarF, "getSnapshot(...)");
        return aVarF;
    }

    public final boolean e() {
        return this.f11351k;
    }

    public final boolean f() {
        com.google.firebase.storage.E e3 = this.f11350j;
        if (e3 == null) {
            kotlin.jvm.internal.m.p("storageTask");
            e3 = null;
        }
        return e3.L();
    }

    public final void g() {
        synchronized (this.f11349i) {
            this.f11349i.notifyAll();
            I1.u uVar = I1.u.f2419a;
        }
    }

    public final void h() {
        synchronized (this.f11347g) {
            this.f11347g.notifyAll();
            I1.u uVar = I1.u.f2419a;
        }
    }

    public final void i() {
        synchronized (this.f11348h) {
            this.f11348h.notifyAll();
            I1.u uVar = I1.u.f2419a;
        }
    }

    public final boolean j() {
        com.google.firebase.storage.E e3 = this.f11350j;
        if (e3 == null) {
            kotlin.jvm.internal.m.p("storageTask");
            e3 = null;
        }
        return e3.a0();
    }

    public final boolean k() {
        com.google.firebase.storage.E e3 = this.f11350j;
        if (e3 == null) {
            kotlin.jvm.internal.m.p("storageTask");
            e3 = null;
        }
        return e3.d0();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final t1.W l(l1.k r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "channel"
            kotlin.jvm.internal.m.e(r3, r0)
            java.lang.String r3 = "identifier"
            kotlin.jvm.internal.m.e(r4, r3)
            t1.H$b r3 = r2.f11341a
            int[] r0 = t1.H.c.f11357a
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            if (r3 == r0) goto L55
            r0 = 2
            if (r3 == r0) goto L34
            r0 = 3
            if (r3 != r0) goto L2e
            com.google.firebase.storage.p r3 = r2.f11343c
            android.net.Uri r0 = r2.f11345e
            kotlin.jvm.internal.m.b(r0)
            com.google.firebase.storage.e r3 = r3.m(r0)
            java.lang.String r0 = "getFile(...)"
            kotlin.jvm.internal.m.d(r3, r0)
            goto L73
        L2e:
            I1.k r3 = new I1.k
            r3.<init>()
            throw r3
        L34:
            com.google.firebase.storage.o r3 = r2.f11346f
            if (r3 != 0) goto L44
            com.google.firebase.storage.p r3 = r2.f11343c
            android.net.Uri r0 = r2.f11345e
            kotlin.jvm.internal.m.b(r0)
            com.google.firebase.storage.N r3 = r3.A(r0)
            goto L51
        L44:
            com.google.firebase.storage.p r3 = r2.f11343c
            android.net.Uri r0 = r2.f11345e
            kotlin.jvm.internal.m.b(r0)
            com.google.firebase.storage.o r1 = r2.f11346f
            com.google.firebase.storage.N r3 = r3.B(r0, r1)
        L51:
            kotlin.jvm.internal.m.b(r3)
            goto L73
        L55:
            com.google.firebase.storage.o r3 = r2.f11346f
            if (r3 != 0) goto L65
            com.google.firebase.storage.p r3 = r2.f11343c
            byte[] r0 = r2.f11344d
            kotlin.jvm.internal.m.b(r0)
            com.google.firebase.storage.N r3 = r3.y(r0)
            goto L51
        L65:
            com.google.firebase.storage.p r3 = r2.f11343c
            byte[] r0 = r2.f11344d
            kotlin.jvm.internal.m.b(r0)
            com.google.firebase.storage.o r1 = r2.f11346f
            com.google.firebase.storage.N r3 = r3.z(r0, r1)
            goto L51
        L73:
            r2.f11350j = r3
            t1.W r3 = new t1.W
            com.google.firebase.storage.p r0 = r2.f11343c
            com.google.firebase.storage.f r0 = r0.s()
            java.lang.String r1 = "getStorage(...)"
            kotlin.jvm.internal.m.d(r0, r1)
            com.google.firebase.storage.E r1 = r2.f11350j
            if (r1 != 0) goto L8c
            java.lang.String r1 = "storageTask"
            kotlin.jvm.internal.m.p(r1)
            r1 = 0
        L8c:
            r3.<init>(r2, r0, r1, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.H.l(l1.k, java.lang.String):t1.W");
    }

    public /* synthetic */ H(b bVar, int i3, com.google.firebase.storage.p pVar, byte[] bArr, Uri uri, com.google.firebase.storage.o oVar, kotlin.jvm.internal.h hVar) {
        this(bVar, i3, pVar, bArr, uri, oVar);
    }
}
