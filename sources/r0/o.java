package r0;

import android.util.Log;
import com.google.android.gms.common.api.internal.m0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import r0.o;
import v0.InterfaceC1256a;
import x0.InterfaceC1271b;
import x0.InterfaceC1272c;

/* JADX INFO: loaded from: classes.dex */
public class o implements InterfaceC1202e, InterfaceC1256a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final L0.b f11139i = new L0.b() { // from class: r0.k
        @Override // L0.b
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f11140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f11141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f11142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f11143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Set f11144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final v f11145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicReference f11146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final j f11147h;

    private o(Executor executor, Iterable iterable, Collection collection, j jVar) {
        this.f11140a = new HashMap();
        this.f11141b = new HashMap();
        this.f11142c = new HashMap();
        this.f11144e = new HashSet();
        this.f11146g = new AtomicReference();
        v vVar = new v(executor);
        this.f11145f = vVar;
        this.f11147h = jVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1200c.s(vVar, v.class, InterfaceC1272c.class, InterfaceC1271b.class));
        arrayList.add(C1200c.s(this, InterfaceC1256a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C1200c c1200c = (C1200c) it.next();
            if (c1200c != null) {
                arrayList.add(c1200c);
            }
        }
        this.f11143d = q(iterable);
        n(arrayList);
    }

    public static b m(Executor executor) {
        return new b(executor);
    }

    private void n(List list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f11143d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((L0.b) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f11147h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (w e3) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e3);
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = ((C1200c) it2.next()).j().toArray();
                int length = array.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        Object obj = array[i3];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f11144e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f11144e.add(obj.toString());
                        }
                        i3++;
                    }
                }
            }
            if (this.f11140a.isEmpty()) {
                q.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f11140a.keySet());
                arrayList2.addAll(list);
                q.a(arrayList2);
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                final C1200c c1200c = (C1200c) it3.next();
                this.f11140a.put(c1200c, new x(new L0.b() { // from class: r0.l
                    @Override // L0.b
                    public final Object get() {
                        return this.f11133a.r(c1200c);
                    }
                }));
            }
            arrayList.addAll(w(list));
            arrayList.addAll(x());
            v();
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        u();
    }

    private void o(Map map, boolean z2) {
        for (Map.Entry entry : map.entrySet()) {
            C1200c c1200c = (C1200c) entry.getKey();
            L0.b bVar = (L0.b) entry.getValue();
            if (c1200c.n() || (c1200c.o() && z2)) {
                bVar.get();
            }
        }
        this.f11145f.c();
    }

    private static List q(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(C1200c c1200c) {
        return c1200c.h().a(new G(c1200c, this));
    }

    private void u() {
        Boolean bool = (Boolean) this.f11146g.get();
        if (bool != null) {
            o(this.f11140a, bool.booleanValue());
        }
    }

    private void v() {
        Map map;
        F fC;
        Object objE;
        for (C1200c c1200c : this.f11140a.keySet()) {
            for (r rVar : c1200c.g()) {
                if (rVar.g() && !this.f11142c.containsKey(rVar.c())) {
                    map = this.f11142c;
                    fC = rVar.c();
                    objE = y.b(Collections.emptySet());
                } else if (this.f11141b.containsKey(rVar.c())) {
                    continue;
                } else {
                    if (rVar.f()) {
                        throw new z(String.format("Unsatisfied dependency for component %s: %s", c1200c, rVar.c()));
                    }
                    if (!rVar.g()) {
                        map = this.f11141b;
                        fC = rVar.c();
                        objE = D.e();
                    }
                }
                map.put(fC, objE);
            }
        }
    }

    private List w(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1200c c1200c = (C1200c) it.next();
            if (c1200c.p()) {
                final L0.b bVar = (L0.b) this.f11140a.get(c1200c);
                for (F f3 : c1200c.j()) {
                    if (this.f11141b.containsKey(f3)) {
                        final D d3 = (D) ((L0.b) this.f11141b.get(f3));
                        arrayList.add(new Runnable() { // from class: r0.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                d3.j(bVar);
                            }
                        });
                    } else {
                        this.f11141b.put(f3, bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    private List x() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f11140a.entrySet()) {
            C1200c c1200c = (C1200c) entry.getKey();
            if (!c1200c.p()) {
                L0.b bVar = (L0.b) entry.getValue();
                for (F f3 : c1200c.j()) {
                    if (!map.containsKey(f3)) {
                        map.put(f3, new HashSet());
                    }
                    ((Set) map.get(f3)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f11142c.containsKey(entry2.getKey())) {
                final y yVar = (y) this.f11142c.get(entry2.getKey());
                for (final L0.b bVar2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: r0.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            yVar.a(bVar2);
                        }
                    });
                }
            } else {
                this.f11142c.put((F) entry2.getKey(), y.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override // r0.InterfaceC1202e
    public /* synthetic */ Object a(Class cls) {
        return AbstractC1201d.a(this, cls);
    }

    @Override // r0.InterfaceC1202e
    public L0.a b(F f3) {
        L0.b bVarC = c(f3);
        return bVarC == null ? D.e() : bVarC instanceof D ? (D) bVarC : D.i(bVarC);
    }

    @Override // r0.InterfaceC1202e
    public synchronized L0.b c(F f3) {
        E.c(f3, "Null interface requested.");
        return (L0.b) this.f11141b.get(f3);
    }

    @Override // r0.InterfaceC1202e
    public /* synthetic */ Set d(Class cls) {
        return AbstractC1201d.e(this, cls);
    }

    @Override // r0.InterfaceC1202e
    public /* synthetic */ L0.b e(Class cls) {
        return AbstractC1201d.d(this, cls);
    }

    @Override // r0.InterfaceC1202e
    public /* synthetic */ Set f(F f3) {
        return AbstractC1201d.f(this, f3);
    }

    @Override // r0.InterfaceC1202e
    public /* synthetic */ Object g(F f3) {
        return AbstractC1201d.b(this, f3);
    }

    @Override // r0.InterfaceC1202e
    public /* synthetic */ L0.a h(Class cls) {
        return AbstractC1201d.c(this, cls);
    }

    @Override // r0.InterfaceC1202e
    public synchronized L0.b i(F f3) {
        y yVar = (y) this.f11142c.get(f3);
        if (yVar != null) {
            return yVar;
        }
        return f11139i;
    }

    public void p(boolean z2) {
        HashMap map;
        if (m0.a(this.f11146g, null, Boolean.valueOf(z2))) {
            synchronized (this) {
                map = new HashMap(this.f11140a);
            }
            o(map, z2);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Executor f11148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f11149b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f11150c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private j f11151d = j.f11132a;

        b(Executor executor) {
            this.f11148a = executor;
        }

        public b b(C1200c c1200c) {
            this.f11150c.add(c1200c);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.f11149b.add(new L0.b() { // from class: r0.p
                @Override // L0.b
                public final Object get() {
                    return o.b.f(componentRegistrar);
                }
            });
            return this;
        }

        public b d(Collection collection) {
            this.f11149b.addAll(collection);
            return this;
        }

        public o e() {
            return new o(this.f11148a, this.f11149b, this.f11150c, this.f11151d);
        }

        public b g(j jVar) {
            this.f11151d = jVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ComponentRegistrar f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }
    }
}
