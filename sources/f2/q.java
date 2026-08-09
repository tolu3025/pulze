package f2;

import I1.u;
import h2.D;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
final class q extends g2.b implements l, b, g2.k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f7303e = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f7304d;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f7305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f7306b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f7307c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f7308d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f7309e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f7310f;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f7312m;

        a(M1.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7310f = obj;
            this.f7312m |= Integer.MIN_VALUE;
            return q.this.a(null, this);
        }
    }

    public q(Object obj) {
        this._state$volatile = obj;
    }

    private final boolean l(Object obj, Object obj2) {
        int i3;
        g2.d[] dVarArrH;
        synchronized (this) {
            Object obj3 = f7303e.get(this);
            if (obj != null && !kotlin.jvm.internal.m.a(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.m.a(obj3, obj2)) {
                return true;
            }
            f7303e.set(this, obj2);
            int i4 = this.f7304d;
            if ((i4 & 1) != 0) {
                this.f7304d = i4 + 2;
                return true;
            }
            int i5 = i4 + 1;
            this.f7304d = i5;
            g2.d[] dVarArrH2 = h();
            u uVar = u.f2419a;
            while (true) {
                s[] sVarArr = (s[]) dVarArrH2;
                if (sVarArr != null) {
                    for (s sVar : sVarArr) {
                        if (sVar != null) {
                            sVar.g();
                        }
                    }
                }
                synchronized (this) {
                    i3 = this.f7304d;
                    if (i3 == i5) {
                        this.f7304d = i5 + 1;
                        return true;
                    }
                    dVarArrH = h();
                    u uVar2 = u.f2419a;
                }
                dVarArrH2 = dVarArrH;
                i5 = i3;
            }
        }
    }

    /* JADX WARN: Path cross not found for [B:33:0x009e, B:35:0x00a4], limit reached: 48 */
    /* JADX WARN: Path cross not found for [B:35:0x00a4, B:33:0x009e], limit reached: 48 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0099, B:33:0x009e, B:43:0x00bf, B:45:0x00c5, B:35:0x00a4, B:39:0x00ab, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0099, B:33:0x009e, B:43:0x00bf, B:45:0x00c5, B:35:0x00a4, B:39:0x00ab, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0099, B:33:0x009e, B:43:0x00bf, B:45:0x00c5, B:35:0x00a4, B:39:0x00ab, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00c3 -> B:29:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00d5 -> B:29:0x008f). Please report as a decompilation issue!!! */
    @Override // f2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(f2.c r11, M1.d r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.q.a(f2.c, M1.d):java.lang.Object");
    }

    @Override // g2.k
    public b b(M1.g gVar, int i3, e2.a aVar) {
        return r.d(this, gVar, i3, aVar);
    }

    @Override // f2.l
    public boolean d(Object obj, Object obj2) {
        if (obj == null) {
            obj = g2.m.f7367a;
        }
        if (obj2 == null) {
            obj2 = g2.m.f7367a;
        }
        return l(obj, obj2);
    }

    @Override // f2.c
    public Object emit(Object obj, M1.d dVar) {
        setValue(obj);
        return u.f2419a;
    }

    @Override // f2.l
    public Object getValue() {
        D d3 = g2.m.f7367a;
        Object obj = f7303e.get(this);
        if (obj == d3) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g2.b
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public s e() {
        return new s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g2.b
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public s[] f(int i3) {
        return new s[i3];
    }

    @Override // f2.l
    public void setValue(Object obj) {
        if (obj == null) {
            obj = g2.m.f7367a;
        }
        l(null, obj);
    }
}
