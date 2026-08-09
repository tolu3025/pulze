package kotlin.jvm.internal;

import J1.AbstractC0412p;
import J1.F;
import J1.G;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Z1.c, e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9737b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f9738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final HashMap f9739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final HashMap f9740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final HashMap f9741f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Map f9742l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f9743a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
        
            if (r2 == null) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String a(java.lang.Class r7) {
            /*
                r6 = this;
                java.lang.String r0 = "jClass"
                kotlin.jvm.internal.m.e(r7, r0)
                boolean r0 = r7.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto Le
                goto Laf
            Le:
                boolean r0 = r7.isLocalClass()
                if (r0 == 0) goto L66
                java.lang.String r0 = r7.getSimpleName()
                java.lang.reflect.Method r2 = r7.getEnclosingMethod()
                r3 = 2
                r4 = 36
                if (r2 == 0) goto L40
                kotlin.jvm.internal.m.b(r0)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r2 = r2.getName()
                r5.append(r2)
                r5.append(r4)
                java.lang.String r2 = r5.toString()
                java.lang.String r2 = b2.f.c0(r0, r2, r1, r3, r1)
                if (r2 != 0) goto L3e
                goto L40
            L3e:
                r1 = r2
                goto Laf
            L40:
                java.lang.reflect.Constructor r7 = r7.getEnclosingConstructor()
                kotlin.jvm.internal.m.b(r0)
                if (r7 == 0) goto L61
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r7 = r7.getName()
                r2.append(r7)
                r2.append(r4)
                java.lang.String r7 = r2.toString()
                java.lang.String r1 = b2.f.c0(r0, r7, r1, r3, r1)
                goto Laf
            L61:
                java.lang.String r1 = b2.f.b0(r0, r4, r1, r3, r1)
                goto Laf
            L66:
                boolean r0 = r7.isArray()
                if (r0 == 0) goto L9a
                java.lang.Class r7 = r7.getComponentType()
                boolean r0 = r7.isPrimitive()
                java.lang.String r2 = "Array"
                if (r0 == 0) goto L97
                java.util.Map r0 = kotlin.jvm.internal.f.d()
                java.lang.String r7 = r7.getName()
                java.lang.Object r7 = r0.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                if (r7 == 0) goto L97
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                r0.append(r2)
                java.lang.String r1 = r0.toString()
            L97:
                if (r1 != 0) goto Laf
                goto L3e
            L9a:
                java.util.Map r0 = kotlin.jvm.internal.f.d()
                java.lang.String r1 = r7.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto Laf
                java.lang.String r1 = r7.getSimpleName()
            Laf:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.f.a.a(java.lang.Class):java.lang.String");
        }
    }

    static {
        int i3 = 0;
        List listJ = AbstractC0412p.j(U1.a.class, U1.l.class, U1.p.class, U1.q.class, U1.r.class, U1.s.class, U1.t.class, U1.u.class, U1.v.class, U1.w.class, U1.b.class, U1.c.class, U1.d.class, U1.e.class, U1.f.class, U1.g.class, U1.h.class, U1.i.class, U1.j.class, U1.k.class, U1.m.class, U1.n.class, U1.o.class);
        ArrayList arrayList = new ArrayList(J1.q.n(listJ, 10));
        for (Object obj : listJ) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                AbstractC0412p.m();
            }
            arrayList.add(I1.q.a((Class) obj, Integer.valueOf(i3)));
            i3 = i4;
        }
        f9738c = G.k(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        f9739d = map;
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        f9740e = map2;
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        m.d(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            m.b(str);
            sb.append(b2.p.e0(str, '.', null, 2, null));
            sb.append("CompanionObject");
            I1.m mVarA = I1.q.a(sb.toString(), str + ".Companion");
            map3.put(mVarA.c(), mVarA.d());
        }
        for (Map.Entry entry : f9738c.entrySet()) {
            map3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + ((Number) entry.getValue()).intValue());
        }
        f9741f = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(F.a(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), b2.p.e0((String) entry2.getValue(), '.', null, 2, null));
        }
        f9742l = linkedHashMap;
    }

    public f(Class jClass) {
        m.e(jClass, "jClass");
        this.f9743a = jClass;
    }

    @Override // Z1.c
    public String b() {
        return f9737b.a(c());
    }

    @Override // kotlin.jvm.internal.e
    public Class c() {
        return this.f9743a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && m.a(T1.a.b(this), T1.a.b((Z1.c) obj));
    }

    public int hashCode() {
        return T1.a.b(this).hashCode();
    }

    public String toString() {
        return c().toString() + " (Kotlin reflection is not available)";
    }
}
