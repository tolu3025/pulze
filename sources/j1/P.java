package J1;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class P {

    static final class a extends kotlin.coroutines.jvm.internal.k implements U1.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f2525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f2526c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f2527d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2528e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f2529f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f2530l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f2531m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Iterator f2532n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f2533o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f2534p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i3, int i4, Iterator it, boolean z2, boolean z3, M1.d dVar) {
            super(2, dVar);
            this.f2530l = i3;
            this.f2531m = i4;
            this.f2532n = it;
            this.f2533o = z2;
            this.f2534p = z3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(Object obj, M1.d dVar) {
            a aVar = new a(this.f2530l, this.f2531m, this.f2532n, this.f2533o, this.f2534p, dVar);
            aVar.f2529f = obj;
            return aVar;
        }

        @Override // U1.p
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a2.e eVar, M1.d dVar) {
            return ((a) create(eVar, dVar)).invokeSuspend(I1.u.f2419a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00d8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x012f  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x014f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a2 -> B:16:0x0055). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0118 -> B:59:0x011b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0146 -> B:72:0x0149). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 360
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: J1.P.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void a(int i3, int i4) {
        String str;
        if (i3 <= 0 || i4 <= 0) {
            if (i3 != i4) {
                str = "Both size " + i3 + " and step " + i4 + " must be greater than zero.";
            } else {
                str = "size " + i3 + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    public static final Iterator b(Iterator iterator, int i3, int i4, boolean z2, boolean z3) {
        kotlin.jvm.internal.m.e(iterator, "iterator");
        return !iterator.hasNext() ? y.f2553a : a2.g.a(new a(i3, i4, iterator, z3, z2, null));
    }
}
