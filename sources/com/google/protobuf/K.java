package com.google.protobuf;

import com.google.protobuf.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final K f6703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final K f6704b;

    private static final class b extends K {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Class f6705c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static List f(Object obj, long j3) {
            return (List) z0.G(obj, j3);
        }

        private static List g(Object obj, long j3, int i3) {
            List listE;
            List list;
            List listF = f(obj, j3);
            if (!listF.isEmpty()) {
                if (f6705c.isAssignableFrom(listF.getClass())) {
                    ArrayList arrayList = new ArrayList(listF.size() + i3);
                    arrayList.addAll(listF);
                    list = arrayList;
                } else if (listF instanceof y0) {
                    I i4 = new I(listF.size() + i3);
                    i4.addAll((y0) listF);
                    list = i4;
                } else {
                    if (!(listF instanceof g0) || !(listF instanceof C.e)) {
                        return listF;
                    }
                    C.e eVar = (C.e) listF;
                    if (eVar.g()) {
                        return listF;
                    }
                    listE = eVar.e(listF.size() + i3);
                }
                z0.V(obj, j3, list);
                return list;
            }
            listE = listF instanceof J ? new I(i3) : ((listF instanceof g0) && (listF instanceof C.e)) ? ((C.e) listF).e(i3) : new ArrayList(i3);
            z0.V(obj, j3, listE);
            return listE;
        }

        @Override // com.google.protobuf.K
        void c(Object obj, long j3) {
            Object objUnmodifiableList;
            List list = (List) z0.G(obj, j3);
            if (list instanceof J) {
                objUnmodifiableList = ((J) list).i();
            } else {
                if (f6705c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof g0) && (list instanceof C.e)) {
                    C.e eVar = (C.e) list;
                    if (eVar.g()) {
                        eVar.c();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            z0.V(obj, j3, objUnmodifiableList);
        }

        @Override // com.google.protobuf.K
        void d(Object obj, Object obj2, long j3) {
            List listF = f(obj2, j3);
            List listG = g(obj, j3, listF.size());
            int size = listG.size();
            int size2 = listF.size();
            if (size > 0 && size2 > 0) {
                listG.addAll(listF);
            }
            if (size > 0) {
                listF = listG;
            }
            z0.V(obj, j3, listF);
        }

        @Override // com.google.protobuf.K
        List e(Object obj, long j3) {
            return g(obj, j3, 10);
        }
    }

    private static final class c extends K {
        private c() {
            super();
        }

        static C.e f(Object obj, long j3) {
            return (C.e) z0.G(obj, j3);
        }

        @Override // com.google.protobuf.K
        void c(Object obj, long j3) {
            f(obj, j3).c();
        }

        @Override // com.google.protobuf.K
        void d(Object obj, Object obj2, long j3) {
            C.e eVarF = f(obj, j3);
            C.e eVarF2 = f(obj2, j3);
            int size = eVarF.size();
            int size2 = eVarF2.size();
            if (size > 0 && size2 > 0) {
                if (!eVarF.g()) {
                    eVarF = eVarF.e(size2 + size);
                }
                eVarF.addAll(eVarF2);
            }
            if (size > 0) {
                eVarF2 = eVarF;
            }
            z0.V(obj, j3, eVarF2);
        }

        @Override // com.google.protobuf.K
        List e(Object obj, long j3) {
            C.e eVarF = f(obj, j3);
            if (eVarF.g()) {
                return eVarF;
            }
            int size = eVarF.size();
            C.e eVarE = eVarF.e(size == 0 ? 10 : size * 2);
            z0.V(obj, j3, eVarE);
            return eVarE;
        }
    }

    static {
        f6703a = new b();
        f6704b = new c();
    }

    private K() {
    }

    static K a() {
        return f6703a;
    }

    static K b() {
        return f6704b;
    }

    abstract void c(Object obj, long j3);

    abstract void d(Object obj, Object obj2, long j3);

    abstract List e(Object obj, long j3);
}
