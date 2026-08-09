package com.google.android.gms.common.server.response;

import V0.I;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: com.google.android.gms.common.server.response.a$a, reason: collision with other inner class name */
    public static class C0110a extends N.a {
        public static final d CREATOR = new d();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f5635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final int f5636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final boolean f5637c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final int f5638d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected final boolean f5639e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        protected final String f5640f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        protected final int f5641l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        protected final Class f5642m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        protected final String f5643n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private h f5644o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final b f5645p;

        C0110a(int i3, int i4, boolean z2, int i5, boolean z3, String str, int i6, String str2, Q.b bVar) {
            this.f5635a = i3;
            this.f5636b = i4;
            this.f5637c = z2;
            this.f5638d = i5;
            this.f5639e = z3;
            this.f5640f = str;
            this.f5641l = i6;
            if (str2 == null) {
                this.f5642m = null;
                this.f5643n = null;
            } else {
                this.f5642m = c.class;
                this.f5643n = str2;
            }
            if (bVar == null) {
                this.f5645p = null;
            } else {
                this.f5645p = bVar.t();
            }
        }

        public static C0110a s(String str, int i3) {
            return new C0110a(8, false, 8, false, str, i3, null, null);
        }

        public static C0110a t(String str, int i3, Class cls) {
            return new C0110a(11, false, 11, false, str, i3, cls, null);
        }

        public static C0110a u(String str, int i3, Class cls) {
            return new C0110a(11, true, 11, true, str, i3, cls, null);
        }

        public static C0110a v(String str, int i3) {
            return new C0110a(0, false, 0, false, str, i3, null, null);
        }

        public static C0110a w(String str, int i3) {
            return new C0110a(7, false, 7, false, str, i3, null, null);
        }

        public static C0110a x(String str, int i3) {
            return new C0110a(7, true, 7, true, str, i3, null, null);
        }

        public final boolean A() {
            return this.f5645p != null;
        }

        public final void B(h hVar) {
            this.f5644o = hVar;
        }

        final Q.b C() {
            b bVar = this.f5645p;
            if (bVar == null) {
                return null;
            }
            return Q.b.s(bVar);
        }

        public final Map D() {
            String str = this.f5643n;
            AbstractC0643s.k(str);
            AbstractC0643s.k(this.f5644o);
            return (Map) AbstractC0643s.k(this.f5644o.t(str));
        }

        public final Object E(Object obj) {
            b bVar = this.f5645p;
            AbstractC0643s.k(bVar);
            return AbstractC0643s.k(bVar.h(obj));
        }

        public final Object F(Object obj) {
            b bVar = this.f5645p;
            AbstractC0643s.k(bVar);
            return bVar.l(obj);
        }

        final /* synthetic */ b G() {
            return this.f5645p;
        }

        public final String toString() {
            AbstractC0642q.a aVarA = AbstractC0642q.d(this).a("versionCode", Integer.valueOf(this.f5635a)).a("typeIn", Integer.valueOf(this.f5636b)).a("typeInArray", Boolean.valueOf(this.f5637c)).a("typeOut", Integer.valueOf(this.f5638d)).a("typeOutArray", Boolean.valueOf(this.f5639e)).a("outputFieldName", this.f5640f).a("safeParcelFieldId", Integer.valueOf(this.f5641l)).a("concreteTypeName", z());
            Class cls = this.f5642m;
            if (cls != null) {
                aVarA.a("concreteType.class", cls.getCanonicalName());
            }
            b bVar = this.f5645p;
            if (bVar != null) {
                aVarA.a("converterName", bVar.getClass().getCanonicalName());
            }
            return aVarA.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i3) {
            int i4 = this.f5635a;
            int iA = N.c.a(parcel);
            N.c.s(parcel, 1, i4);
            N.c.s(parcel, 2, this.f5636b);
            N.c.g(parcel, 3, this.f5637c);
            N.c.s(parcel, 4, this.f5638d);
            N.c.g(parcel, 5, this.f5639e);
            N.c.C(parcel, 6, this.f5640f, false);
            N.c.s(parcel, 7, y());
            N.c.C(parcel, 8, z(), false);
            N.c.A(parcel, 9, C(), i3, false);
            N.c.b(parcel, iA);
        }

        public int y() {
            return this.f5641l;
        }

        final String z() {
            String str = this.f5643n;
            if (str == null) {
                return null;
            }
            return str;
        }

        protected C0110a(int i3, boolean z2, int i4, boolean z3, String str, int i5, Class cls, b bVar) {
            this.f5635a = 1;
            this.f5636b = i3;
            this.f5637c = z2;
            this.f5638d = i4;
            this.f5639e = z3;
            this.f5640f = str;
            this.f5641l = i5;
            this.f5642m = cls;
            this.f5643n = cls == null ? null : cls.getCanonicalName();
            this.f5645p = bVar;
        }
    }

    public interface b {
        Object h(Object obj);

        Object l(Object obj);
    }

    private final void a(C0110a c0110a, Object obj) {
        int i3 = c0110a.f5638d;
        Object objE = c0110a.E(obj);
        String str = c0110a.f5640f;
        switch (i3) {
            case 0:
                if (objE != null) {
                    setIntegerInternal(c0110a, str, ((Integer) objE).intValue());
                    return;
                } else {
                    d(str);
                    return;
                }
            case 1:
                zat(c0110a, str, (BigInteger) objE);
                return;
            case 2:
                if (objE != null) {
                    setLongInternal(c0110a, str, ((Long) objE).longValue());
                    return;
                } else {
                    d(str);
                    return;
                }
            case 3:
            default:
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 33);
                sb.append("Unsupported type for conversion: ");
                sb.append(i3);
                throw new IllegalStateException(sb.toString());
            case 4:
                if (objE != null) {
                    zay(c0110a, str, ((Double) objE).doubleValue());
                    return;
                } else {
                    d(str);
                    return;
                }
            case 5:
                zaA(c0110a, str, (BigDecimal) objE);
                return;
            case 6:
                if (objE != null) {
                    setBooleanInternal(c0110a, str, ((Boolean) objE).booleanValue());
                    return;
                } else {
                    d(str);
                    return;
                }
            case 7:
                setStringInternal(c0110a, str, (String) objE);
                return;
            case 8:
            case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                if (objE != null) {
                    setDecodedBytesInternal(c0110a, str, (byte[]) objE);
                    return;
                } else {
                    d(str);
                    return;
                }
        }
    }

    private static final void b(StringBuilder sb, C0110a c0110a, Object obj) {
        String string;
        int i3 = c0110a.f5636b;
        if (i3 == 11) {
            Class cls = c0110a.f5642m;
            AbstractC0643s.k(cls);
            string = ((a) cls.cast(obj)).toString();
        } else if (i3 != 7) {
            sb.append(obj);
            return;
        } else {
            string = "\"";
            sb.append("\"");
            sb.append(com.google.android.gms.common.util.j.a((String) obj));
        }
        sb.append(string);
    }

    private static final void d(String str) {
        if (Log.isLoggable("FastJsonResponse", 6)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 58);
            sb.append("Output field (");
            sb.append(str);
            sb.append(") has a null value, but expected a primitive");
            Log.e("FastJsonResponse", sb.toString());
        }
    }

    protected static final Object zaD(C0110a c0110a, Object obj) {
        return c0110a.G() != null ? c0110a.F(obj) : obj;
    }

    public <T extends a> void addConcreteTypeArrayInternal(C0110a c0110a, String str, ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    public <T extends a> void addConcreteTypeInternal(C0110a c0110a, String str, T t2) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    public abstract Map<String, C0110a> getFieldMappings();

    protected Object getFieldValue(C0110a c0110a) {
        String str = c0110a.f5640f;
        if (c0110a.f5642m == null) {
            return getValueObject(str);
        }
        AbstractC0643s.o(getValueObject(str) == null, "Concrete field shouldn't be value object: %s", str);
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String strSubstring = str.substring(1);
            StringBuilder sb = new StringBuilder(String.valueOf(upperCase).length() + 3 + String.valueOf(strSubstring).length());
            sb.append("get");
            sb.append(upperCase);
            sb.append(strSubstring);
            return getClass().getMethod(sb.toString(), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }

    protected abstract Object getValueObject(String str);

    protected boolean isFieldSet(C0110a c0110a) {
        if (c0110a.f5638d != 11) {
            return isPrimitiveFieldSet(c0110a.f5640f);
        }
        if (c0110a.f5639e) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    protected abstract boolean isPrimitiveFieldSet(String str);

    protected void setBooleanInternal(C0110a c0110a, String str, boolean z2) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    protected void setDecodedBytesInternal(C0110a c0110a, String str, byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    protected void setIntegerInternal(C0110a c0110a, String str, int i3) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    protected void setLongInternal(C0110a c0110a, String str, long j3) {
        throw new UnsupportedOperationException("Long not supported");
    }

    protected void setStringInternal(C0110a c0110a, String str, String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    protected void setStringMapInternal(C0110a c0110a, String str, Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    protected void setStringsInternal(C0110a c0110a, String str, ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    public String toString() {
        String str;
        String strC;
        Map<String, C0110a> fieldMappings = getFieldMappings();
        StringBuilder sb = new StringBuilder(100);
        for (String str2 : fieldMappings.keySet()) {
            C0110a c0110a = fieldMappings.get(str2);
            if (isFieldSet(c0110a)) {
                Object objZaD = zaD(c0110a, getFieldValue(c0110a));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str2);
                sb.append("\":");
                if (objZaD != null) {
                    switch (c0110a.f5638d) {
                        case 8:
                            sb.append("\"");
                            strC = com.google.android.gms.common.util.c.c((byte[]) objZaD);
                            sb.append(strC);
                            sb.append("\"");
                            break;
                        case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                            sb.append("\"");
                            strC = com.google.android.gms.common.util.c.d((byte[]) objZaD);
                            sb.append(strC);
                            sb.append("\"");
                            break;
                        case I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                            com.google.android.gms.common.util.k.a(sb, (HashMap) objZaD);
                            break;
                        default:
                            if (c0110a.f5637c) {
                                ArrayList arrayList = (ArrayList) objZaD;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i3 = 0; i3 < size; i3++) {
                                    if (i3 > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i3);
                                    if (obj != null) {
                                        b(sb, c0110a, obj);
                                    }
                                }
                                str = "]";
                            } else {
                                b(sb, c0110a, objZaD);
                            }
                            break;
                    }
                } else {
                    str = "null";
                }
                sb.append(str);
            }
        }
        sb.append(sb.length() > 0 ? "}" : "{}");
        return sb.toString();
    }

    protected void zaA(C0110a c0110a, String str, BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    protected void zaB(C0110a c0110a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    protected void zaC(C0110a c0110a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final void zaa(C0110a c0110a, int i3) {
        if (c0110a.G() != null) {
            a(c0110a, Integer.valueOf(i3));
        } else {
            setIntegerInternal(c0110a, c0110a.f5640f, i3);
        }
    }

    public final void zab(C0110a c0110a, ArrayList arrayList) {
        if (c0110a.G() != null) {
            a(c0110a, arrayList);
        } else {
            zas(c0110a, c0110a.f5640f, arrayList);
        }
    }

    public final void zac(C0110a c0110a, BigInteger bigInteger) {
        if (c0110a.G() != null) {
            a(c0110a, bigInteger);
        } else {
            zat(c0110a, c0110a.f5640f, bigInteger);
        }
    }

    public final void zad(C0110a c0110a, ArrayList arrayList) {
        if (c0110a.G() != null) {
            a(c0110a, arrayList);
        } else {
            zau(c0110a, c0110a.f5640f, arrayList);
        }
    }

    public final void zae(C0110a c0110a, long j3) {
        if (c0110a.G() != null) {
            a(c0110a, Long.valueOf(j3));
        } else {
            setLongInternal(c0110a, c0110a.f5640f, j3);
        }
    }

    public final void zaf(C0110a c0110a, ArrayList arrayList) {
        if (c0110a.G() != null) {
            a(c0110a, arrayList);
        } else {
            zav(c0110a, c0110a.f5640f, arrayList);
        }
    }

    public final void zag(C0110a c0110a, float f3) {
        if (c0110a.G() != null) {
            a(c0110a, Float.valueOf(f3));
        } else {
            zaw(c0110a, c0110a.f5640f, f3);
        }
    }

    public final void zah(C0110a c0110a, ArrayList arrayList) {
        if (c0110a.G() != null) {
            a(c0110a, arrayList);
        } else {
            zax(c0110a, c0110a.f5640f, arrayList);
        }
    }

    public final void zai(C0110a c0110a, double d3) {
        if (c0110a.G() != null) {
            a(c0110a, Double.valueOf(d3));
        } else {
            zay(c0110a, c0110a.f5640f, d3);
        }
    }

    public final void zaj(C0110a c0110a, ArrayList arrayList) {
        if (c0110a.G() != null) {
            a(c0110a, arrayList);
        } else {
            zaz(c0110a, c0110a.f5640f, arrayList);
        }
    }

    public final void zak(C0110a c0110a, BigDecimal bigDecimal) {
        if (c0110a.G() != null) {
            a(c0110a, bigDecimal);
        } else {
            zaA(c0110a, c0110a.f5640f, bigDecimal);
        }
    }

    public final void zal(C0110a c0110a, ArrayList arrayList) {
        if (c0110a.G() != null) {
            a(c0110a, arrayList);
        } else {
            zaB(c0110a, c0110a.f5640f, arrayList);
        }
    }

    public final void zam(C0110a c0110a, boolean z2) {
        if (c0110a.G() != null) {
            a(c0110a, Boolean.valueOf(z2));
        } else {
            setBooleanInternal(c0110a, c0110a.f5640f, z2);
        }
    }

    public final void zan(C0110a c0110a, ArrayList arrayList) {
        if (c0110a.G() != null) {
            a(c0110a, arrayList);
        } else {
            zaC(c0110a, c0110a.f5640f, arrayList);
        }
    }

    public final void zao(C0110a c0110a, String str) {
        if (c0110a.G() != null) {
            a(c0110a, str);
        } else {
            setStringInternal(c0110a, c0110a.f5640f, str);
        }
    }

    public final void zap(C0110a c0110a, ArrayList arrayList) {
        if (c0110a.G() != null) {
            a(c0110a, arrayList);
        } else {
            setStringsInternal(c0110a, c0110a.f5640f, arrayList);
        }
    }

    public final void zaq(C0110a c0110a, byte[] bArr) {
        if (c0110a.G() != null) {
            a(c0110a, bArr);
        } else {
            setDecodedBytesInternal(c0110a, c0110a.f5640f, bArr);
        }
    }

    public final void zar(C0110a c0110a, Map map) {
        if (c0110a.G() != null) {
            a(c0110a, map);
        } else {
            setStringMapInternal(c0110a, c0110a.f5640f, map);
        }
    }

    protected void zas(C0110a c0110a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    protected void zat(C0110a c0110a, String str, BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    protected void zau(C0110a c0110a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    protected void zav(C0110a c0110a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }

    protected void zaw(C0110a c0110a, String str, float f3) {
        throw new UnsupportedOperationException("Float not supported");
    }

    protected void zax(C0110a c0110a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    protected void zay(C0110a c0110a, String str, double d3) {
        throw new UnsupportedOperationException("Double not supported");
    }

    protected void zaz(C0110a c0110a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }
}
