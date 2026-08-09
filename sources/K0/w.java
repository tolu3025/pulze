package K0;

import android.content.Context;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import t.C1221c;
import t.f;

/* JADX INFO: loaded from: classes.dex */
class w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final f.a f2603b = t.i.f("fire-global");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f.a f2604c = t.i.f("fire-count");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final f.a f2605d = t.i.g("last-used-date");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u0.c f2606a;

    public w(Context context, String str) {
        this.f2606a = new u0.c(context, "FirebaseHeartBeat" + str);
    }

    private synchronized long e(C1221c c1221c) {
        long j3;
        try {
            long jLongValue = ((Long) u0.d.a(c1221c, f2604c, 0L)).longValue();
            String strA = "";
            Set hashSet = new HashSet();
            String str = null;
            for (Map.Entry entry : c1221c.a().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set<String> set = (Set) entry.getValue();
                    for (String str2 : set) {
                        if (str == null || str.compareTo(str2) > 0) {
                            strA = ((f.a) entry.getKey()).a();
                            hashSet = set;
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet2.remove(str);
            c1221c.j(t.i.h(strA), hashSet2);
            j3 = jLongValue - 1;
            c1221c.j(f2604c, Long.valueOf(j3));
        } catch (Throwable th) {
            throw th;
        }
        return j3;
    }

    private synchronized String h(long j3) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j3).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j3));
    }

    private synchronized f.a i(C1221c c1221c, String str) {
        for (Map.Entry entry : c1221c.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return t.i.h(((f.a) entry.getKey()).a());
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ I1.u k(C1221c c1221c) {
        long j3 = 0;
        for (Map.Entry entry : c1221c.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                f.a aVar = (f.a) entry.getKey();
                Set set = (Set) entry.getValue();
                String strH = h(System.currentTimeMillis());
                if (set.contains(strH)) {
                    c1221c.j(aVar, r.a(new Object[]{strH}));
                    j3++;
                } else {
                    c1221c.i(aVar);
                }
            }
        }
        if (j3 == 0) {
            c1221c.i(f2604c);
            return null;
        }
        c1221c.j(f2604c, Long.valueOf(j3));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ I1.u l(String str, C1221c c1221c) {
        c1221c.j(f2605d, str);
        p(c1221c, str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ I1.u m(String str, String str2, f.a aVar, C1221c c1221c) {
        f.a aVar2 = f2605d;
        if (((String) u0.d.a(c1221c, aVar2, "")).equals(str)) {
            f.a aVarI = i(c1221c, str);
            if (aVarI == null || aVarI.a().equals(str2)) {
                return null;
            }
            u(c1221c, aVar, str);
            return null;
        }
        f.a aVar3 = f2604c;
        long jLongValue = ((Long) u0.d.a(c1221c, aVar3, 0L)).longValue();
        if (jLongValue + 1 == 30) {
            jLongValue = e(c1221c);
        }
        HashSet hashSet = new HashSet((Collection) u0.d.a(c1221c, aVar, new HashSet()));
        hashSet.add(str);
        c1221c.j(aVar, hashSet);
        c1221c.j(aVar3, Long.valueOf(jLongValue + 1));
        c1221c.j(aVar2, str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ I1.u n(long j3, C1221c c1221c) {
        c1221c.j(f2603b, Long.valueOf(j3));
        return null;
    }

    private synchronized void p(C1221c c1221c, String str) {
        try {
            f.a aVarI = i(c1221c, str);
            if (aVarI == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) u0.d.a(c1221c, aVarI, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                c1221c.i(aVarI);
            } else {
                c1221c.j(aVarI, hashSet);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void u(C1221c c1221c, f.a aVar, String str) {
        p(c1221c, str);
        HashSet hashSet = new HashSet((Collection) u0.d.a(c1221c, aVar, new HashSet()));
        hashSet.add(str);
        c1221c.j(aVar, hashSet);
    }

    synchronized void f() {
        this.f2606a.g(new U1.l() { // from class: K0.v
            @Override // U1.l
            public final Object invoke(Object obj) {
                return this.f2602a.k((C1221c) obj);
            }
        });
    }

    synchronized List g() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            String strH = h(System.currentTimeMillis());
            for (Map.Entry entry : this.f2606a.h().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strH);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(x.a(((f.a) entry.getKey()).a(), new ArrayList(hashSet)));
                    }
                }
            }
            t(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    synchronized boolean j(long j3, long j4) {
        return h(j3).equals(h(j4));
    }

    synchronized void o() {
        final String strH = h(System.currentTimeMillis());
        this.f2606a.g(new U1.l() { // from class: K0.s
            @Override // U1.l
            public final Object invoke(Object obj) {
                return this.f2595a.l(strH, (C1221c) obj);
            }
        });
    }

    synchronized boolean q(long j3) {
        return r(f2603b, j3);
    }

    synchronized boolean r(f.a aVar, long j3) {
        if (j(((Long) this.f2606a.j(aVar, -1L)).longValue(), j3)) {
            return false;
        }
        this.f2606a.k(aVar, Long.valueOf(j3));
        return true;
    }

    synchronized void s(long j3, final String str) {
        final String strH = h(j3);
        final f.a aVarH = t.i.h(str);
        this.f2606a.g(new U1.l() { // from class: K0.u
            @Override // U1.l
            public final Object invoke(Object obj) {
                return this.f2598a.m(strH, str, aVarH, (C1221c) obj);
            }
        });
    }

    synchronized void t(final long j3) {
        this.f2606a.g(new U1.l() { // from class: K0.t
            @Override // U1.l
            public final Object invoke(Object obj) {
                return w.n(j3, (C1221c) obj);
            }
        });
    }
}
