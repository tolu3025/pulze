package androidx.lifecycle;

import J1.G;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f4764f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Class[] f4765g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f4766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f4767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f4768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f4769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a.c f4770e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final s a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new s();
                }
                HashMap map = new HashMap();
                for (String key : bundle2.keySet()) {
                    kotlin.jvm.internal.m.d(key, "key");
                    map.put(key, bundle2.get(key));
                }
                return new s(map);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = parcelableArrayList.get(i3);
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i3));
            }
            return new s(linkedHashMap);
        }

        public final boolean b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : s.f4765g) {
                kotlin.jvm.internal.m.b(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    public s() {
        this.f4766a = new LinkedHashMap();
        this.f4767b = new LinkedHashMap();
        this.f4768c = new LinkedHashMap();
        this.f4769d = new LinkedHashMap();
        this.f4770e = new a.c() { // from class: androidx.lifecycle.r
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                return s.d(this.f4763a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle d(s this$0) {
        kotlin.jvm.internal.m.e(this$0, "this$0");
        for (Map.Entry entry : G.m(this$0.f4767b).entrySet()) {
            this$0.e((String) entry.getKey(), ((a.c) entry.getValue()).a());
        }
        Set<String> setKeySet = this$0.f4766a.keySet();
        ArrayList arrayList = new ArrayList(setKeySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : setKeySet) {
            arrayList.add(str);
            arrayList2.add(this$0.f4766a.get(str));
        }
        return androidx.core.os.b.a(I1.q.a("keys", arrayList), I1.q.a("values", arrayList2));
    }

    public final a.c c() {
        return this.f4770e;
    }

    public final void e(String key, Object obj) {
        kotlin.jvm.internal.m.e(key, "key");
        if (!f4764f.b(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't put value with type ");
            kotlin.jvm.internal.m.b(obj);
            sb.append(obj.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        Object obj2 = this.f4768c.get(key);
        m mVar = obj2 instanceof m ? (m) obj2 : null;
        if (mVar != null) {
            mVar.m(obj);
        } else {
            this.f4766a.put(key, obj);
        }
        f2.l lVar = (f2.l) this.f4769d.get(key);
        if (lVar == null) {
            return;
        }
        lVar.setValue(obj);
    }

    public s(Map initialState) {
        kotlin.jvm.internal.m.e(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f4766a = linkedHashMap;
        this.f4767b = new LinkedHashMap();
        this.f4768c = new LinkedHashMap();
        this.f4769d = new LinkedHashMap();
        this.f4770e = new a.c() { // from class: androidx.lifecycle.r
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                return s.d(this.f4763a);
            }
        };
        linkedHashMap.putAll(initialState);
    }
}
