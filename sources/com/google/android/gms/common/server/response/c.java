package com.google.android.gms.common.server.response;

import N.b;
import V0.I;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.common.server.response.a;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class c extends b {
    public static final Parcelable.Creator<c> CREATOR = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Parcel f5647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f5648c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h f5649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f5650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f5651f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f5652l;

    c(int i3, Parcel parcel, h hVar) {
        this.f5646a = i3;
        this.f5647b = (Parcel) AbstractC0643s.k(parcel);
        this.f5649d = hVar;
        this.f5650e = hVar == null ? null : hVar.u();
        this.f5651f = 2;
    }

    private final void h(a.C0110a c0110a) {
        if (c0110a.f5641l == -1) {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
        Parcel parcel = this.f5647b;
        if (parcel == null) {
            throw new IllegalStateException("Internal Parcel object is null.");
        }
        int i3 = this.f5651f;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
            }
        } else {
            this.f5652l = N.c.a(parcel);
            this.f5651f = 1;
        }
    }

    private final void i(StringBuilder sb, Map map, Parcel parcel) {
        Object objC;
        String strA;
        String str;
        Object objZaD;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((a.C0110a) entry.getValue()).y(), entry);
        }
        sb.append('{');
        int iK = N.b.K(parcel);
        boolean z2 = false;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            Map.Entry entry2 = (Map.Entry) sparseArray.get(N.b.v(iB));
            if (entry2 != null) {
                if (z2) {
                    sb.append(",");
                }
                String str2 = (String) entry2.getKey();
                a.C0110a c0110a = (a.C0110a) entry2.getValue();
                sb.append("\"");
                sb.append(str2);
                sb.append("\":");
                if (c0110a.A()) {
                    int i3 = c0110a.f5638d;
                    switch (i3) {
                        case 0:
                            objZaD = a.zaD(c0110a, Integer.valueOf(N.b.D(parcel, iB)));
                            break;
                        case 1:
                            objZaD = a.zaD(c0110a, N.b.c(parcel, iB));
                            break;
                        case 2:
                            objZaD = a.zaD(c0110a, Long.valueOf(N.b.F(parcel, iB)));
                            break;
                        case 3:
                            objZaD = a.zaD(c0110a, Float.valueOf(N.b.A(parcel, iB)));
                            break;
                        case 4:
                            objZaD = a.zaD(c0110a, Double.valueOf(N.b.y(parcel, iB)));
                            break;
                        case 5:
                            objZaD = a.zaD(c0110a, N.b.a(parcel, iB));
                            break;
                        case 6:
                            objZaD = a.zaD(c0110a, Boolean.valueOf(N.b.w(parcel, iB)));
                            break;
                        case 7:
                            objZaD = a.zaD(c0110a, N.b.p(parcel, iB));
                            break;
                        case 8:
                        case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                            objZaD = a.zaD(c0110a, N.b.g(parcel, iB));
                            break;
                        case I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                            Bundle bundleF = N.b.f(parcel, iB);
                            HashMap map2 = new HashMap();
                            for (String str3 : bundleF.keySet()) {
                                map2.put(str3, (String) AbstractC0643s.k(bundleF.getString(str3)));
                            }
                            objZaD = a.zaD(c0110a, map2);
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 25);
                            sb2.append("Unknown field out type = ");
                            sb2.append(i3);
                            throw new IllegalArgumentException(sb2.toString());
                    }
                    m(sb, c0110a, objZaD);
                } else {
                    if (c0110a.f5639e) {
                        sb.append("[");
                        switch (c0110a.f5638d) {
                            case 0:
                                com.google.android.gms.common.util.b.e(sb, N.b.k(parcel, iB));
                                break;
                            case 1:
                                com.google.android.gms.common.util.b.g(sb, N.b.d(parcel, iB));
                                break;
                            case 2:
                                com.google.android.gms.common.util.b.f(sb, N.b.l(parcel, iB));
                                break;
                            case 3:
                                com.google.android.gms.common.util.b.d(sb, N.b.j(parcel, iB));
                                break;
                            case 4:
                                com.google.android.gms.common.util.b.c(sb, N.b.i(parcel, iB));
                                break;
                            case 5:
                                com.google.android.gms.common.util.b.g(sb, N.b.b(parcel, iB));
                                break;
                            case 6:
                                com.google.android.gms.common.util.b.h(sb, N.b.e(parcel, iB));
                                break;
                            case 7:
                                com.google.android.gms.common.util.b.i(sb, N.b.q(parcel, iB));
                                break;
                            case 8:
                            case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                            case I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                                throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                            case 11:
                                Parcel[] parcelArrN = N.b.n(parcel, iB);
                                int length = parcelArrN.length;
                                for (int i4 = 0; i4 < length; i4++) {
                                    if (i4 > 0) {
                                        sb.append(",");
                                    }
                                    parcelArrN[i4].setDataPosition(0);
                                    i(sb, c0110a.D(), parcelArrN[i4]);
                                }
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out.");
                        }
                        str = "]";
                    } else {
                        switch (c0110a.f5638d) {
                            case 0:
                                sb.append(N.b.D(parcel, iB));
                                break;
                            case 1:
                                objC = N.b.c(parcel, iB);
                                sb.append(objC);
                                break;
                            case 2:
                                sb.append(N.b.F(parcel, iB));
                                break;
                            case 3:
                                sb.append(N.b.A(parcel, iB));
                                break;
                            case 4:
                                sb.append(N.b.y(parcel, iB));
                                break;
                            case 5:
                                objC = N.b.a(parcel, iB);
                                sb.append(objC);
                                break;
                            case 6:
                                sb.append(N.b.w(parcel, iB));
                                break;
                            case 7:
                                String strP = N.b.p(parcel, iB);
                                sb.append("\"");
                                strA = com.google.android.gms.common.util.j.a(strP);
                                sb.append(strA);
                                sb.append("\"");
                                break;
                            case 8:
                                byte[] bArrG = N.b.g(parcel, iB);
                                sb.append("\"");
                                strA = com.google.android.gms.common.util.c.c(bArrG);
                                sb.append(strA);
                                sb.append("\"");
                                break;
                            case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                                byte[] bArrG2 = N.b.g(parcel, iB);
                                sb.append("\"");
                                strA = com.google.android.gms.common.util.c.d(bArrG2);
                                sb.append(strA);
                                sb.append("\"");
                                break;
                            case I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                                Bundle bundleF2 = N.b.f(parcel, iB);
                                Set<String> setKeySet = bundleF2.keySet();
                                sb.append("{");
                                boolean z3 = true;
                                for (String str4 : setKeySet) {
                                    if (!z3) {
                                        sb.append(",");
                                    }
                                    sb.append("\"");
                                    sb.append(str4);
                                    sb.append("\":\"");
                                    sb.append(com.google.android.gms.common.util.j.a(bundleF2.getString(str4)));
                                    sb.append("\"");
                                    z3 = false;
                                }
                                str = "}";
                                break;
                            case 11:
                                Parcel parcelM = N.b.m(parcel, iB);
                                parcelM.setDataPosition(0);
                                i(sb, c0110a.D(), parcelM);
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out");
                        }
                    }
                    sb.append(str);
                }
                z2 = true;
            }
        }
        if (parcel.dataPosition() == iK) {
            sb.append('}');
            return;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(iK).length() + 26);
        sb3.append("Overread allowed size end=");
        sb3.append(iK);
        throw new b.a(sb3.toString(), parcel);
    }

    private static final void l(StringBuilder sb, int i3, Object obj) {
        switch (i3) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                sb.append(com.google.android.gms.common.util.j.a(AbstractC0643s.k(obj).toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(com.google.android.gms.common.util.c.c((byte[]) obj));
                sb.append("\"");
                return;
            case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                sb.append("\"");
                sb.append(com.google.android.gms.common.util.c.d((byte[]) obj));
                sb.append("\"");
                return;
            case I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                com.google.android.gms.common.util.k.a(sb, (HashMap) AbstractC0643s.k(obj));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 15);
                sb2.append("Unknown type = ");
                sb2.append(i3);
                throw new IllegalArgumentException(sb2.toString());
        }
    }

    private static final void m(StringBuilder sb, a.C0110a c0110a, Object obj) {
        if (!c0110a.f5637c) {
            l(sb, c0110a.f5636b, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb.append("[");
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 != 0) {
                sb.append(",");
            }
            l(sb, c0110a.f5636b, arrayList.get(i3));
        }
        sb.append("]");
    }

    @Override // com.google.android.gms.common.server.response.a
    public final void addConcreteTypeArrayInternal(a.C0110a c0110a, String str, ArrayList arrayList) {
        h(c0110a);
        ArrayList arrayList2 = new ArrayList();
        ((ArrayList) AbstractC0643s.k(arrayList)).size();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.add(((c) ((a) arrayList.get(i3))).f());
        }
        N.c.z(this.f5647b, c0110a.y(), arrayList2, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    public final void addConcreteTypeInternal(a.C0110a c0110a, String str, a aVar) {
        h(c0110a);
        N.c.y(this.f5647b, c0110a.y(), ((c) aVar).f(), true);
    }

    public final Parcel f() {
        Parcel parcel;
        int iA;
        int i3 = this.f5651f;
        if (i3 != 0) {
            if (i3 == 1) {
                parcel = this.f5647b;
                iA = this.f5652l;
            }
            return this.f5647b;
        }
        parcel = this.f5647b;
        iA = N.c.a(parcel);
        this.f5652l = iA;
        N.c.b(parcel, iA);
        this.f5651f = 2;
        return this.f5647b;
    }

    @Override // com.google.android.gms.common.server.response.a
    public final Map getFieldMappings() {
        h hVar = this.f5649d;
        if (hVar == null) {
            return null;
        }
        return hVar.t((String) AbstractC0643s.k(this.f5650e));
    }

    @Override // com.google.android.gms.common.server.response.b, com.google.android.gms.common.server.response.a
    public final Object getValueObject(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.b, com.google.android.gms.common.server.response.a
    public final boolean isPrimitiveFieldSet(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void setBooleanInternal(a.C0110a c0110a, String str, boolean z2) {
        h(c0110a);
        N.c.g(this.f5647b, c0110a.y(), z2);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void setDecodedBytesInternal(a.C0110a c0110a, String str, byte[] bArr) {
        h(c0110a);
        N.c.k(this.f5647b, c0110a.y(), bArr, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void setIntegerInternal(a.C0110a c0110a, String str, int i3) {
        h(c0110a);
        N.c.s(this.f5647b, c0110a.y(), i3);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void setLongInternal(a.C0110a c0110a, String str, long j3) {
        h(c0110a);
        N.c.v(this.f5647b, c0110a.y(), j3);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void setStringInternal(a.C0110a c0110a, String str, String str2) {
        h(c0110a);
        N.c.C(this.f5647b, c0110a.y(), str2, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void setStringMapInternal(a.C0110a c0110a, String str, Map map) {
        h(c0110a);
        Bundle bundle = new Bundle();
        for (String str2 : ((Map) AbstractC0643s.k(map)).keySet()) {
            bundle.putString(str2, (String) map.get(str2));
        }
        N.c.j(this.f5647b, c0110a.y(), bundle, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void setStringsInternal(a.C0110a c0110a, String str, ArrayList arrayList) {
        h(c0110a);
        int size = ((ArrayList) AbstractC0643s.k(arrayList)).size();
        String[] strArr = new String[size];
        for (int i3 = 0; i3 < size; i3++) {
            strArr[i3] = (String) arrayList.get(i3);
        }
        N.c.D(this.f5647b, c0110a.y(), strArr, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    public final String toString() {
        h hVar = this.f5649d;
        AbstractC0643s.l(hVar, "Cannot convert to JSON on client side.");
        Parcel parcelF = f();
        parcelF.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        i(sb, (Map) AbstractC0643s.k(hVar.t((String) AbstractC0643s.k(this.f5650e))), parcelF);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int i4 = this.f5646a;
        int iA = N.c.a(parcel);
        N.c.s(parcel, 1, i4);
        N.c.y(parcel, 2, f(), false);
        N.c.A(parcel, 3, this.f5648c != 0 ? this.f5649d : null, i3, false);
        N.c.b(parcel, iA);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void zaA(a.C0110a c0110a, String str, BigDecimal bigDecimal) {
        h(c0110a);
        N.c.c(this.f5647b, c0110a.y(), bigDecimal, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void zaB(a.C0110a c0110a, String str, ArrayList arrayList) {
        h(c0110a);
        int size = ((ArrayList) AbstractC0643s.k(arrayList)).size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i3 = 0; i3 < size; i3++) {
            bigDecimalArr[i3] = (BigDecimal) arrayList.get(i3);
        }
        N.c.d(this.f5647b, c0110a.y(), bigDecimalArr, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void zaC(a.C0110a c0110a, String str, ArrayList arrayList) {
        h(c0110a);
        int size = ((ArrayList) AbstractC0643s.k(arrayList)).size();
        boolean[] zArr = new boolean[size];
        for (int i3 = 0; i3 < size; i3++) {
            zArr[i3] = ((Boolean) arrayList.get(i3)).booleanValue();
        }
        N.c.h(this.f5647b, c0110a.y(), zArr, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void zas(a.C0110a c0110a, String str, ArrayList arrayList) {
        h(c0110a);
        int size = ((ArrayList) AbstractC0643s.k(arrayList)).size();
        int[] iArr = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        N.c.t(this.f5647b, c0110a.y(), iArr, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void zat(a.C0110a c0110a, String str, BigInteger bigInteger) {
        h(c0110a);
        N.c.e(this.f5647b, c0110a.y(), bigInteger, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void zau(a.C0110a c0110a, String str, ArrayList arrayList) {
        h(c0110a);
        int size = ((ArrayList) AbstractC0643s.k(arrayList)).size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i3 = 0; i3 < size; i3++) {
            bigIntegerArr[i3] = (BigInteger) arrayList.get(i3);
        }
        N.c.f(this.f5647b, c0110a.y(), bigIntegerArr, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void zav(a.C0110a c0110a, String str, ArrayList arrayList) {
        h(c0110a);
        int size = ((ArrayList) AbstractC0643s.k(arrayList)).size();
        long[] jArr = new long[size];
        for (int i3 = 0; i3 < size; i3++) {
            jArr[i3] = ((Long) arrayList.get(i3)).longValue();
        }
        N.c.w(this.f5647b, c0110a.y(), jArr, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void zaw(a.C0110a c0110a, String str, float f3) {
        h(c0110a);
        N.c.p(this.f5647b, c0110a.y(), f3);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void zax(a.C0110a c0110a, String str, ArrayList arrayList) {
        h(c0110a);
        int size = ((ArrayList) AbstractC0643s.k(arrayList)).size();
        float[] fArr = new float[size];
        for (int i3 = 0; i3 < size; i3++) {
            fArr[i3] = ((Float) arrayList.get(i3)).floatValue();
        }
        N.c.q(this.f5647b, c0110a.y(), fArr, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void zay(a.C0110a c0110a, String str, double d3) {
        h(c0110a);
        N.c.m(this.f5647b, c0110a.y(), d3);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void zaz(a.C0110a c0110a, String str, ArrayList arrayList) {
        h(c0110a);
        int size = ((ArrayList) AbstractC0643s.k(arrayList)).size();
        double[] dArr = new double[size];
        for (int i3 = 0; i3 < size; i3++) {
            dArr[i3] = ((Double) arrayList.get(i3)).doubleValue();
        }
        N.c.n(this.f5647b, c0110a.y(), dArr, true);
    }
}
