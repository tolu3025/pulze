package androidx.lifecycle;

import androidx.lifecycle.AbstractC0516e;
import e.C0817c;
import f.C0839a;
import f.C0840b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class j extends AbstractC0516e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f4747j = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f4748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C0839a f4749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AbstractC0516e.b f4750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final WeakReference f4751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f4752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f4753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f4754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList f4755i;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final AbstractC0516e.b a(AbstractC0516e.b state1, AbstractC0516e.b bVar) {
            kotlin.jvm.internal.m.e(state1, "state1");
            return (bVar == null || bVar.compareTo(state1) >= 0) ? state1 : bVar;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AbstractC0516e.b f4756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private g f4757b;

        public b(h hVar, AbstractC0516e.b initialState) {
            kotlin.jvm.internal.m.e(initialState, "initialState");
            kotlin.jvm.internal.m.b(hVar);
            this.f4757b = k.f(hVar);
            this.f4756a = initialState;
        }

        public final void a(i iVar, AbstractC0516e.a event) {
            kotlin.jvm.internal.m.e(event, "event");
            AbstractC0516e.b bVarE = event.e();
            this.f4756a = j.f4747j.a(this.f4756a, bVarE);
            g gVar = this.f4757b;
            kotlin.jvm.internal.m.b(iVar);
            gVar.d(iVar, event);
            this.f4756a = bVarE;
        }

        public final AbstractC0516e.b b() {
            return this.f4756a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(i provider) {
        this(provider, true);
        kotlin.jvm.internal.m.e(provider, "provider");
    }

    private final void d(i iVar) {
        Iterator itDescendingIterator = this.f4749c.descendingIterator();
        kotlin.jvm.internal.m.d(itDescendingIterator, "observerMap.descendingIterator()");
        while (itDescendingIterator.hasNext() && !this.f4754h) {
            Map.Entry entry = (Map.Entry) itDescendingIterator.next();
            kotlin.jvm.internal.m.d(entry, "next()");
            h hVar = (h) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f4750d) > 0 && !this.f4754h && this.f4749c.contains(hVar)) {
                AbstractC0516e.a aVarA = AbstractC0516e.a.Companion.a(bVar.b());
                if (aVarA == null) {
                    throw new IllegalStateException("no event down from " + bVar.b());
                }
                l(aVarA.e());
                bVar.a(iVar, aVarA);
                k();
            }
        }
    }

    private final AbstractC0516e.b e(h hVar) {
        b bVar;
        Map.Entry entryO = this.f4749c.o(hVar);
        AbstractC0516e.b bVar2 = null;
        AbstractC0516e.b bVarB = (entryO == null || (bVar = (b) entryO.getValue()) == null) ? null : bVar.b();
        if (!this.f4755i.isEmpty()) {
            bVar2 = (AbstractC0516e.b) this.f4755i.get(r0.size() - 1);
        }
        a aVar = f4747j;
        return aVar.a(aVar.a(this.f4750d, bVarB), bVar2);
    }

    private final void f(String str) {
        if (!this.f4748b || C0817c.f().b()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    private final void g(i iVar) {
        C0840b.d dVarD = this.f4749c.d();
        kotlin.jvm.internal.m.d(dVarD, "observerMap.iteratorWithAdditions()");
        while (dVarD.hasNext() && !this.f4754h) {
            Map.Entry entry = (Map.Entry) dVarD.next();
            h hVar = (h) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f4750d) < 0 && !this.f4754h && this.f4749c.contains(hVar)) {
                l(bVar.b());
                AbstractC0516e.a aVarB = AbstractC0516e.a.Companion.b(bVar.b());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
                bVar.a(iVar, aVarB);
                k();
            }
        }
    }

    private final boolean i() {
        if (this.f4749c.size() == 0) {
            return true;
        }
        Map.Entry entryA = this.f4749c.a();
        kotlin.jvm.internal.m.b(entryA);
        AbstractC0516e.b bVarB = ((b) entryA.getValue()).b();
        Map.Entry entryF = this.f4749c.f();
        kotlin.jvm.internal.m.b(entryF);
        AbstractC0516e.b bVarB2 = ((b) entryF.getValue()).b();
        return bVarB == bVarB2 && this.f4750d == bVarB2;
    }

    private final void j(AbstractC0516e.b bVar) {
        AbstractC0516e.b bVar2 = this.f4750d;
        if (bVar2 == bVar) {
            return;
        }
        if (bVar2 == AbstractC0516e.b.INITIALIZED && bVar == AbstractC0516e.b.DESTROYED) {
            throw new IllegalStateException(("no event down from " + this.f4750d + " in component " + this.f4751e.get()).toString());
        }
        this.f4750d = bVar;
        if (this.f4753g || this.f4752f != 0) {
            this.f4754h = true;
            return;
        }
        this.f4753g = true;
        n();
        this.f4753g = false;
        if (this.f4750d == AbstractC0516e.b.DESTROYED) {
            this.f4749c = new C0839a();
        }
    }

    private final void k() {
        this.f4755i.remove(r0.size() - 1);
    }

    private final void l(AbstractC0516e.b bVar) {
        this.f4755i.add(bVar);
    }

    private final void n() {
        i iVar = (i) this.f4751e.get();
        if (iVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            boolean zI = i();
            this.f4754h = false;
            if (zI) {
                return;
            }
            AbstractC0516e.b bVar = this.f4750d;
            Map.Entry entryA = this.f4749c.a();
            kotlin.jvm.internal.m.b(entryA);
            if (bVar.compareTo(((b) entryA.getValue()).b()) < 0) {
                d(iVar);
            }
            Map.Entry entryF = this.f4749c.f();
            if (!this.f4754h && entryF != null && this.f4750d.compareTo(((b) entryF.getValue()).b()) > 0) {
                g(iVar);
            }
        }
    }

    @Override // androidx.lifecycle.AbstractC0516e
    public void a(h observer) {
        i iVar;
        kotlin.jvm.internal.m.e(observer, "observer");
        f("addObserver");
        AbstractC0516e.b bVar = this.f4750d;
        AbstractC0516e.b bVar2 = AbstractC0516e.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = AbstractC0516e.b.INITIALIZED;
        }
        b bVar3 = new b(observer, bVar2);
        if (((b) this.f4749c.m(observer, bVar3)) == null && (iVar = (i) this.f4751e.get()) != null) {
            boolean z2 = this.f4752f != 0 || this.f4753g;
            AbstractC0516e.b bVarE = e(observer);
            this.f4752f++;
            while (bVar3.b().compareTo(bVarE) < 0 && this.f4749c.contains(observer)) {
                l(bVar3.b());
                AbstractC0516e.a aVarB = AbstractC0516e.a.Companion.b(bVar3.b());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar3.b());
                }
                bVar3.a(iVar, aVarB);
                k();
                bVarE = e(observer);
            }
            if (!z2) {
                n();
            }
            this.f4752f--;
        }
    }

    @Override // androidx.lifecycle.AbstractC0516e
    public AbstractC0516e.b b() {
        return this.f4750d;
    }

    @Override // androidx.lifecycle.AbstractC0516e
    public void c(h observer) {
        kotlin.jvm.internal.m.e(observer, "observer");
        f("removeObserver");
        this.f4749c.n(observer);
    }

    public void h(AbstractC0516e.a event) {
        kotlin.jvm.internal.m.e(event, "event");
        f("handleLifecycleEvent");
        j(event.e());
    }

    public void m(AbstractC0516e.b state) {
        kotlin.jvm.internal.m.e(state, "state");
        f("setCurrentState");
        j(state);
    }

    private j(i iVar, boolean z2) {
        this.f4748b = z2;
        this.f4749c = new C0839a();
        this.f4750d = AbstractC0516e.b.INITIALIZED;
        this.f4755i = new ArrayList();
        this.f4751e = new WeakReference(iVar);
    }
}
