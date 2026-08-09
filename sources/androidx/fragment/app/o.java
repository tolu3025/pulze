package androidx.fragment.app;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC0484k;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC0481h;
import androidx.fragment.app.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f4633a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final q f4634b = new p();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final q f4635c = w();

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f4636a;

        a(ArrayList arrayList) {
            this.f4636a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            o.A(this.f4636a, 4);
        }
    }

    static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f4637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f4638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f4639c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Fragment f4640d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f4641e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f4642f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ ArrayList f4643l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Object f4644m;

        b(Object obj, q qVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f4637a = obj;
            this.f4638b = qVar;
            this.f4639c = view;
            this.f4640d = fragment;
            this.f4641e = arrayList;
            this.f4642f = arrayList2;
            this.f4643l = arrayList3;
            this.f4644m = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f4637a;
            if (obj != null) {
                this.f4638b.p(obj, this.f4639c);
                this.f4642f.addAll(o.k(this.f4638b, this.f4637a, this.f4640d, this.f4641e, this.f4639c));
            }
            if (this.f4643l != null) {
                if (this.f4644m != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f4639c);
                    this.f4638b.q(this.f4644m, this.f4643l, arrayList);
                }
                this.f4643l.clear();
                this.f4643l.add(this.f4639c);
            }
        }
    }

    static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f4645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f4646b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f4647c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f4648d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ View f4649e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ q f4650f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ Rect f4651l;

        c(Fragment fragment, Fragment fragment2, boolean z2, androidx.collection.a aVar, View view, q qVar, Rect rect) {
            this.f4645a = fragment;
            this.f4646b = fragment2;
            this.f4647c = z2;
            this.f4648d = aVar;
            this.f4649e = view;
            this.f4650f = qVar;
            this.f4651l = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            o.f(this.f4645a, this.f4646b, this.f4647c, this.f4648d, false);
            View view = this.f4649e;
            if (view != null) {
                this.f4650f.k(view, this.f4651l);
            }
        }
    }

    static class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f4652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f4653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f4654c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f4655d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f4656e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f4657f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ Fragment f4658l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Fragment f4659m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f4660n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ ArrayList f4661o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Object f4662p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Rect f4663q;

        d(q qVar, androidx.collection.a aVar, Object obj, e eVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z2, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f4652a = qVar;
            this.f4653b = aVar;
            this.f4654c = obj;
            this.f4655d = eVar;
            this.f4656e = arrayList;
            this.f4657f = view;
            this.f4658l = fragment;
            this.f4659m = fragment2;
            this.f4660n = z2;
            this.f4661o = arrayList2;
            this.f4662p = obj2;
            this.f4663q = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.collection.a aVarH = o.h(this.f4652a, this.f4653b, this.f4654c, this.f4655d);
            if (aVarH != null) {
                this.f4656e.addAll(aVarH.values());
                this.f4656e.add(this.f4657f);
            }
            o.f(this.f4658l, this.f4659m, this.f4660n, aVarH, false);
            Object obj = this.f4654c;
            if (obj != null) {
                this.f4652a.z(obj, this.f4661o, this.f4656e);
                View viewS = o.s(aVarH, this.f4655d, this.f4662p, this.f4660n);
                if (viewS != null) {
                    this.f4652a.k(viewS, this.f4663q);
                }
            }
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Fragment f4664a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f4665b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public androidx.fragment.app.a f4666c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Fragment f4667d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f4668e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public androidx.fragment.app.a f4669f;

        e() {
        }
    }

    static void A(ArrayList arrayList, int i3) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((View) arrayList.get(size)).setVisibility(i3);
        }
    }

    static void B(j jVar, ArrayList arrayList, ArrayList arrayList2, int i3, int i4, boolean z2) {
        if (jVar.f4545u < 1) {
            return;
        }
        SparseArray sparseArray = new SparseArray();
        for (int i5 = i3; i5 < i4; i5++) {
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) arrayList.get(i5);
            if (((Boolean) arrayList2.get(i5)).booleanValue()) {
                e(aVar, sparseArray, z2);
            } else {
                c(aVar, sparseArray, z2);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(jVar.f4546v.g());
            int size = sparseArray.size();
            for (int i6 = 0; i6 < size; i6++) {
                int iKeyAt = sparseArray.keyAt(i6);
                androidx.collection.a aVarD = d(iKeyAt, arrayList, arrayList2, i3, i4);
                e eVar = (e) sparseArray.valueAt(i6);
                if (z2) {
                    o(jVar, iKeyAt, eVar, view, aVarD);
                } else {
                    n(jVar, iKeyAt, eVar, view, aVarD);
                }
            }
        }
    }

    private static void a(ArrayList arrayList, androidx.collection.a aVar, Collection collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View view = (View) aVar.l(size);
            if (collection.contains(AbstractC0484k.e(view))) {
                arrayList.add(view);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(androidx.fragment.app.a r16, androidx.fragment.app.n.a r17, android.util.SparseArray r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.o.b(androidx.fragment.app.a, androidx.fragment.app.n$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(androidx.fragment.app.a aVar, SparseArray sparseArray, boolean z2) {
        int size = aVar.f4607a.size();
        for (int i3 = 0; i3 < size; i3++) {
            b(aVar, (n.a) aVar.f4607a.get(i3), sparseArray, false, z2);
        }
    }

    private static androidx.collection.a d(int i3, ArrayList arrayList, ArrayList arrayList2, int i4, int i5) {
        ArrayList arrayList3;
        ArrayList arrayList4;
        androidx.collection.a aVar = new androidx.collection.a();
        for (int i6 = i5 - 1; i6 >= i4; i6--) {
            androidx.fragment.app.a aVar2 = (androidx.fragment.app.a) arrayList.get(i6);
            if (aVar2.p(i3)) {
                boolean zBooleanValue = ((Boolean) arrayList2.get(i6)).booleanValue();
                ArrayList arrayList5 = aVar2.f4621o;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (zBooleanValue) {
                        arrayList3 = aVar2.f4621o;
                        arrayList4 = aVar2.f4622p;
                    } else {
                        ArrayList arrayList6 = aVar2.f4621o;
                        arrayList3 = aVar2.f4622p;
                        arrayList4 = arrayList6;
                    }
                    for (int i7 = 0; i7 < size; i7++) {
                        String str = (String) arrayList4.get(i7);
                        String str2 = (String) arrayList3.get(i7);
                        String str3 = (String) aVar.remove(str2);
                        if (str3 != null) {
                            aVar.put(str, str3);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    public static void e(androidx.fragment.app.a aVar, SparseArray sparseArray, boolean z2) {
        if (aVar.f4467s.f4547w.d()) {
            for (int size = aVar.f4607a.size() - 1; size >= 0; size--) {
                b(aVar, (n.a) aVar.f4607a.get(size), sparseArray, true, z2);
            }
        }
    }

    static void f(Fragment fragment, Fragment fragment2, boolean z2, androidx.collection.a aVar, boolean z3) {
        if (z2) {
            fragment2.t();
        } else {
            fragment.t();
        }
    }

    private static boolean g(q qVar, List list) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (!qVar.e(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    static androidx.collection.a h(q qVar, androidx.collection.a aVar, Object obj, e eVar) {
        ArrayList arrayList;
        Fragment fragment = eVar.f4664a;
        View viewL = fragment.L();
        if (aVar.isEmpty() || obj == null || viewL == null) {
            aVar.clear();
            return null;
        }
        androidx.collection.a aVar2 = new androidx.collection.a();
        qVar.j(aVar2, viewL);
        androidx.fragment.app.a aVar3 = eVar.f4666c;
        if (eVar.f4665b) {
            fragment.v();
            arrayList = aVar3.f4621o;
        } else {
            fragment.t();
            arrayList = aVar3.f4622p;
        }
        if (arrayList != null) {
            aVar2.n(arrayList);
            aVar2.n(aVar.values());
        }
        x(aVar, aVar2);
        return aVar2;
    }

    private static androidx.collection.a i(q qVar, androidx.collection.a aVar, Object obj, e eVar) {
        ArrayList arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = eVar.f4667d;
        androidx.collection.a aVar2 = new androidx.collection.a();
        qVar.j(aVar2, fragment.c1());
        androidx.fragment.app.a aVar3 = eVar.f4669f;
        if (eVar.f4668e) {
            fragment.t();
            arrayList = aVar3.f4622p;
        } else {
            fragment.v();
            arrayList = aVar3.f4621o;
        }
        aVar2.n(arrayList);
        aVar.n(aVar2.keySet());
        return aVar2;
    }

    private static q j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object objU = fragment.u();
            if (objU != null) {
                arrayList.add(objU);
            }
            Object objG = fragment.G();
            if (objG != null) {
                arrayList.add(objG);
            }
            Object objI = fragment.I();
            if (objI != null) {
                arrayList.add(objI);
            }
        }
        if (fragment2 != null) {
            Object objS = fragment2.s();
            if (objS != null) {
                arrayList.add(objS);
            }
            Object objD = fragment2.D();
            if (objD != null) {
                arrayList.add(objD);
            }
            Object objH = fragment2.H();
            if (objH != null) {
                arrayList.add(objH);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        q qVar = f4634b;
        if (qVar != null && g(qVar, arrayList)) {
            return qVar;
        }
        q qVar2 = f4635c;
        if (qVar2 != null && g(qVar2, arrayList)) {
            return qVar2;
        }
        if (qVar == null && qVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    static ArrayList k(q qVar, Object obj, Fragment fragment, ArrayList arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        View viewL = fragment.L();
        if (viewL != null) {
            qVar.f(arrayList2, viewL);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        qVar.b(obj, arrayList2);
        return arrayList2;
    }

    private static Object l(q qVar, ViewGroup viewGroup, View view, androidx.collection.a aVar, e eVar, ArrayList arrayList, ArrayList arrayList2, Object obj, Object obj2) {
        Object objT;
        androidx.collection.a aVar2;
        Object obj3;
        Rect rect;
        Fragment fragment = eVar.f4664a;
        Fragment fragment2 = eVar.f4667d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z2 = eVar.f4665b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            objT = null;
        } else {
            objT = t(qVar, fragment, fragment2, z2);
            aVar2 = aVar;
        }
        androidx.collection.a aVarI = i(qVar, aVar2, objT, eVar);
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(aVarI.values());
            obj3 = objT;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z2, aVarI, true);
        if (obj3 != null) {
            rect = new Rect();
            qVar.y(obj3, view, arrayList);
            z(qVar, obj3, obj2, aVarI, eVar.f4668e, eVar.f4669f);
            if (obj != null) {
                qVar.u(obj, rect);
            }
        } else {
            rect = null;
        }
        ViewTreeObserverOnPreDrawListenerC0481h.a(viewGroup, new d(qVar, aVar, obj3, eVar, arrayList2, view, fragment, fragment2, z2, arrayList, obj, rect));
        return obj3;
    }

    private static Object m(q qVar, ViewGroup viewGroup, View view, androidx.collection.a aVar, e eVar, ArrayList arrayList, ArrayList arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = eVar.f4664a;
        Fragment fragment2 = eVar.f4667d;
        if (fragment != null) {
            fragment.c1().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z2 = eVar.f4665b;
        Object objT = aVar.isEmpty() ? null : t(qVar, fragment, fragment2, z2);
        androidx.collection.a aVarI = i(qVar, aVar, objT, eVar);
        androidx.collection.a aVarH = h(qVar, aVar, objT, eVar);
        if (aVar.isEmpty()) {
            if (aVarI != null) {
                aVarI.clear();
            }
            if (aVarH != null) {
                aVarH.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, aVarI, aVar.keySet());
            a(arrayList2, aVarH, aVar.values());
            obj3 = objT;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z2, aVarI, true);
        if (obj3 != null) {
            arrayList2.add(view);
            qVar.y(obj3, view, arrayList);
            z(qVar, obj3, obj2, aVarI, eVar.f4668e, eVar.f4669f);
            Rect rect2 = new Rect();
            View viewS = s(aVarH, eVar, obj, z2);
            if (viewS != null) {
                qVar.u(obj, rect2);
            }
            rect = rect2;
            view2 = viewS;
        } else {
            view2 = null;
            rect = null;
        }
        ViewTreeObserverOnPreDrawListenerC0481h.a(viewGroup, new c(fragment, fragment2, z2, aVarH, view2, qVar, rect));
        return obj3;
    }

    private static void n(j jVar, int i3, e eVar, View view, androidx.collection.a aVar) {
        Fragment fragment;
        Fragment fragment2;
        q qVarJ;
        Object obj;
        ViewGroup viewGroup = jVar.f4547w.d() ? (ViewGroup) jVar.f4547w.c(i3) : null;
        if (viewGroup == null || (qVarJ = j((fragment2 = eVar.f4667d), (fragment = eVar.f4664a))) == null) {
            return;
        }
        boolean z2 = eVar.f4665b;
        boolean z3 = eVar.f4668e;
        Object objQ = q(qVarJ, fragment, z2);
        Object objR = r(qVarJ, fragment2, z3);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Object objL = l(qVarJ, viewGroup, view, aVar, eVar, arrayList, arrayList2, objQ, objR);
        if (objQ == null && objL == null) {
            obj = objR;
            if (obj == null) {
                return;
            }
        } else {
            obj = objR;
        }
        ArrayList arrayListK = k(qVarJ, obj, fragment2, arrayList, view);
        Object obj2 = (arrayListK == null || arrayListK.isEmpty()) ? null : obj;
        qVarJ.a(objQ, view);
        Object objU = u(qVarJ, objQ, obj2, objL, fragment, eVar.f4665b);
        if (objU != null) {
            ArrayList arrayList3 = new ArrayList();
            qVarJ.t(objU, objQ, arrayList3, obj2, arrayListK, objL, arrayList2);
            y(qVarJ, viewGroup, fragment, view, arrayList2, objQ, arrayList3, obj2, arrayListK);
            qVarJ.w(viewGroup, arrayList2, aVar);
            qVarJ.c(viewGroup, objU);
            qVarJ.s(viewGroup, arrayList2, aVar);
        }
    }

    private static void o(j jVar, int i3, e eVar, View view, androidx.collection.a aVar) {
        Fragment fragment;
        Fragment fragment2;
        q qVarJ;
        Object obj;
        ViewGroup viewGroup = jVar.f4547w.d() ? (ViewGroup) jVar.f4547w.c(i3) : null;
        if (viewGroup == null || (qVarJ = j((fragment2 = eVar.f4667d), (fragment = eVar.f4664a))) == null) {
            return;
        }
        boolean z2 = eVar.f4665b;
        boolean z3 = eVar.f4668e;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Object objQ = q(qVarJ, fragment, z2);
        Object objR = r(qVarJ, fragment2, z3);
        Object objM = m(qVarJ, viewGroup, view, aVar, eVar, arrayList2, arrayList, objQ, objR);
        if (objQ == null && objM == null) {
            obj = objR;
            if (obj == null) {
                return;
            }
        } else {
            obj = objR;
        }
        ArrayList arrayListK = k(qVarJ, obj, fragment2, arrayList2, view);
        ArrayList arrayListK2 = k(qVarJ, objQ, fragment, arrayList, view);
        A(arrayListK2, 4);
        Object objU = u(qVarJ, objQ, obj, objM, fragment, z2);
        if (objU != null) {
            v(qVarJ, obj, fragment2, arrayListK);
            ArrayList arrayListO = qVarJ.o(arrayList);
            qVarJ.t(objU, objQ, arrayListK2, obj, arrayListK, objM, arrayList);
            qVarJ.c(viewGroup, objU);
            qVarJ.x(viewGroup, arrayList2, arrayList, arrayListO, aVar);
            A(arrayListK2, 0);
            qVarJ.z(objM, arrayList2, arrayList);
        }
    }

    private static e p(e eVar, SparseArray sparseArray, int i3) {
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        sparseArray.put(i3, eVar2);
        return eVar2;
    }

    private static Object q(q qVar, Fragment fragment, boolean z2) {
        if (fragment == null) {
            return null;
        }
        return qVar.g(z2 ? fragment.D() : fragment.s());
    }

    private static Object r(q qVar, Fragment fragment, boolean z2) {
        if (fragment == null) {
            return null;
        }
        return qVar.g(z2 ? fragment.G() : fragment.u());
    }

    static View s(androidx.collection.a aVar, e eVar, Object obj, boolean z2) {
        ArrayList arrayList;
        androidx.fragment.app.a aVar2 = eVar.f4666c;
        if (obj == null || aVar == null || (arrayList = aVar2.f4621o) == null || arrayList.isEmpty()) {
            return null;
        }
        return (View) aVar.get((String) (z2 ? aVar2.f4621o : aVar2.f4622p).get(0));
    }

    private static Object t(q qVar, Fragment fragment, Fragment fragment2, boolean z2) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return qVar.A(qVar.g(z2 ? fragment2.I() : fragment.H()));
    }

    private static Object u(q qVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z2) {
        if (obj != null && obj2 != null && fragment != null) {
            if (!(z2 ? fragment.n() : fragment.m())) {
                return qVar.m(obj2, obj, obj3);
            }
        }
        return qVar.n(obj2, obj, obj3);
    }

    private static void v(q qVar, Object obj, Fragment fragment, ArrayList arrayList) {
        if (fragment != null && obj != null && fragment.f4435p && fragment.f4400D && fragment.f4415S) {
            fragment.i1(true);
            qVar.r(obj, fragment.L(), arrayList);
            ViewTreeObserverOnPreDrawListenerC0481h.a(fragment.f4407K, new a(arrayList));
        }
    }

    private static q w() {
        try {
            return (q) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void x(androidx.collection.a aVar, androidx.collection.a aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey((String) aVar.l(size))) {
                aVar.j(size);
            }
        }
    }

    private static void y(q qVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList arrayList, Object obj, ArrayList arrayList2, Object obj2, ArrayList arrayList3) {
        ViewTreeObserverOnPreDrawListenerC0481h.a(viewGroup, new b(obj, qVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    private static void z(q qVar, Object obj, Object obj2, androidx.collection.a aVar, boolean z2, androidx.fragment.app.a aVar2) {
        ArrayList arrayList = aVar2.f4621o;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = (View) aVar.get((String) (z2 ? aVar2.f4622p : aVar2.f4621o).get(0));
        qVar.v(obj, view);
        if (obj2 != null) {
            qVar.v(obj2, view);
        }
    }
}
