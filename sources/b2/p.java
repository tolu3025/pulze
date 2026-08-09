package b2;

import J1.AbstractC0406j;
import J1.AbstractC0407k;
import J1.AbstractC0411o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class p extends o {

    static final class a extends kotlin.jvm.internal.n implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ char[] f4972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f4973b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(char[] cArr, boolean z2) {
            super(2);
            this.f4972a = cArr;
            this.f4973b = z2;
        }

        public final I1.m b(CharSequence $receiver, int i3) {
            kotlin.jvm.internal.m.e($receiver, "$this$$receiver");
            int iB = p.B($receiver, this.f4972a, i3, this.f4973b);
            if (iB < 0) {
                return null;
            }
            return I1.q.a(Integer.valueOf(iB), 1);
        }

        @Override // U1.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    static final class b extends kotlin.jvm.internal.n implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f4974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f4975b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List list, boolean z2) {
            super(2);
            this.f4974a = list;
            this.f4975b = z2;
        }

        public final I1.m b(CharSequence $receiver, int i3) {
            kotlin.jvm.internal.m.e($receiver, "$this$$receiver");
            I1.m mVarT = p.t($receiver, this.f4974a, i3, this.f4975b, false);
            if (mVarT != null) {
                return I1.q.a(mVarT.c(), Integer.valueOf(((String) mVarT.d()).length()));
            }
            return null;
        }

        @Override // U1.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    static final class c extends kotlin.jvm.internal.n implements U1.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f4976a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CharSequence charSequence) {
            super(1);
            this.f4976a = charSequence;
        }

        @Override // U1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(Y1.f it) {
            kotlin.jvm.internal.m.e(it, "it");
            return p.Y(this.f4976a, it);
        }
    }

    public static /* synthetic */ int A(CharSequence charSequence, String str, int i3, boolean z2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        if ((i4 & 4) != 0) {
            z2 = false;
        }
        return w(charSequence, str, i3, z2);
    }

    public static final int B(CharSequence charSequence, char[] chars, int i3, boolean z2) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        kotlin.jvm.internal.m.e(chars, "chars");
        if (!z2 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(AbstractC0407k.P(chars), i3);
        }
        int iA = Y1.i.a(i3, 0);
        int iU = u(charSequence);
        if (iA > iU) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iA);
            for (char c3 : chars) {
                if (b2.b.d(c3, cCharAt, z2)) {
                    return iA;
                }
            }
            if (iA == iU) {
                return -1;
            }
            iA++;
        }
    }

    public static boolean C(CharSequence charSequence) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            if (!b2.a.c(charSequence.charAt(i3))) {
                return false;
            }
        }
        return true;
    }

    public static final int D(CharSequence charSequence, char c3, int i3, boolean z2) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        return (z2 || !(charSequence instanceof String)) ? H(charSequence, new char[]{c3}, i3, z2) : ((String) charSequence).lastIndexOf(c3, i3);
    }

    public static final int E(CharSequence charSequence, String string, int i3, boolean z2) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        kotlin.jvm.internal.m.e(string, "string");
        return (z2 || !(charSequence instanceof String)) ? x(charSequence, string, i3, 0, z2, true) : ((String) charSequence).lastIndexOf(string, i3);
    }

    public static /* synthetic */ int F(CharSequence charSequence, char c3, int i3, boolean z2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = u(charSequence);
        }
        if ((i4 & 4) != 0) {
            z2 = false;
        }
        return D(charSequence, c3, i3, z2);
    }

    public static /* synthetic */ int G(CharSequence charSequence, String str, int i3, boolean z2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = u(charSequence);
        }
        if ((i4 & 4) != 0) {
            z2 = false;
        }
        return E(charSequence, str, i3, z2);
    }

    public static final int H(CharSequence charSequence, char[] chars, int i3, boolean z2) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        kotlin.jvm.internal.m.e(chars, "chars");
        if (!z2 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(AbstractC0407k.P(chars), i3);
        }
        for (int iC = Y1.i.c(i3, u(charSequence)); -1 < iC; iC--) {
            char cCharAt = charSequence.charAt(iC);
            for (char c3 : chars) {
                if (b2.b.d(c3, cCharAt, z2)) {
                    return iC;
                }
            }
        }
        return -1;
    }

    public static final a2.c I(CharSequence charSequence) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        return X(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    public static final List J(CharSequence charSequence) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        return a2.k.i(I(charSequence));
    }

    public static final CharSequence K(CharSequence charSequence, int i3, char c3) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        if (i3 < 0) {
            throw new IllegalArgumentException("Desired length " + i3 + " is less than zero.");
        }
        if (i3 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i3);
        sb.append(charSequence);
        int length = i3 - charSequence.length();
        int i4 = 1;
        if (1 <= length) {
            while (true) {
                sb.append(c3);
                if (i4 == length) {
                    break;
                }
                i4++;
            }
        }
        return sb;
    }

    public static final String L(String str, int i3, char c3) {
        kotlin.jvm.internal.m.e(str, "<this>");
        return K(str, i3, c3).toString();
    }

    public static /* synthetic */ String M(String str, int i3, char c3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            c3 = ' ';
        }
        return L(str, i3, c3);
    }

    private static final a2.c N(CharSequence charSequence, char[] cArr, int i3, boolean z2, int i4) {
        S(i4);
        return new d(charSequence, i3, i4, new a(cArr, z2));
    }

    private static final a2.c O(CharSequence charSequence, String[] strArr, int i3, boolean z2, int i4) {
        S(i4);
        return new d(charSequence, i3, i4, new b(AbstractC0406j.c(strArr), z2));
    }

    static /* synthetic */ a2.c P(CharSequence charSequence, char[] cArr, int i3, boolean z2, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i3 = 0;
        }
        if ((i5 & 4) != 0) {
            z2 = false;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        return N(charSequence, cArr, i3, z2, i4);
    }

    static /* synthetic */ a2.c Q(CharSequence charSequence, String[] strArr, int i3, boolean z2, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i3 = 0;
        }
        if ((i5 & 4) != 0) {
            z2 = false;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        return O(charSequence, strArr, i3, z2, i4);
    }

    public static final boolean R(CharSequence charSequence, int i3, CharSequence other, int i4, int i5, boolean z2) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        kotlin.jvm.internal.m.e(other, "other");
        if (i4 < 0 || i3 < 0 || i3 > charSequence.length() - i5 || i4 > other.length() - i5) {
            return false;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            if (!b2.b.d(charSequence.charAt(i3 + i6), other.charAt(i4 + i6), z2)) {
                return false;
            }
        }
        return true;
    }

    public static final void S(int i3) {
        if (i3 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i3).toString());
    }

    public static final List T(CharSequence charSequence, char[] delimiters, boolean z2, int i3) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        kotlin.jvm.internal.m.e(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return U(charSequence, String.valueOf(delimiters[0]), z2, i3);
        }
        Iterable iterableG = a2.k.g(P(charSequence, delimiters, 0, z2, i3, 2, null));
        ArrayList arrayList = new ArrayList(J1.q.n(iterableG, 10));
        Iterator it = iterableG.iterator();
        while (it.hasNext()) {
            arrayList.add(Y(charSequence, (Y1.f) it.next()));
        }
        return arrayList;
    }

    private static final List U(CharSequence charSequence, String str, boolean z2, int i3) {
        S(i3);
        int length = 0;
        int iW = w(charSequence, str, 0, z2);
        if (iW == -1 || i3 == 1) {
            return AbstractC0411o.d(charSequence.toString());
        }
        boolean z3 = i3 > 0;
        ArrayList arrayList = new ArrayList(z3 ? Y1.i.c(i3, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iW).toString());
            length = str.length() + iW;
            if (z3 && arrayList.size() == i3 - 1) {
                break;
            }
            iW = w(charSequence, str, length, z2);
        } while (iW != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List V(CharSequence charSequence, char[] cArr, boolean z2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z2 = false;
        }
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        return T(charSequence, cArr, z2, i3);
    }

    public static final a2.c W(CharSequence charSequence, String[] delimiters, boolean z2, int i3) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        kotlin.jvm.internal.m.e(delimiters, "delimiters");
        return a2.k.h(Q(charSequence, delimiters, 0, z2, i3, 2, null), new c(charSequence));
    }

    public static /* synthetic */ a2.c X(CharSequence charSequence, String[] strArr, boolean z2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z2 = false;
        }
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        return W(charSequence, strArr, z2, i3);
    }

    public static final String Y(CharSequence charSequence, Y1.f range) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        kotlin.jvm.internal.m.e(range, "range");
        return charSequence.subSequence(range.n().intValue(), range.m().intValue() + 1).toString();
    }

    public static final String Z(String str, char c3, String missingDelimiterValue) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(missingDelimiterValue, "missingDelimiterValue");
        int iZ = z(str, c3, 0, false, 6, null);
        if (iZ == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iZ + 1, str.length());
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String a0(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(delimiter, "delimiter");
        kotlin.jvm.internal.m.e(missingDelimiterValue, "missingDelimiterValue");
        int iA = A(str, delimiter, 0, false, 6, null);
        if (iA == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iA + delimiter.length(), str.length());
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String b0(String str, char c3, String str2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str2 = str;
        }
        return Z(str, c3, str2);
    }

    public static /* synthetic */ String c0(String str, String str2, String str3, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str3 = str;
        }
        return a0(str, str2, str3);
    }

    public static String d0(String str, char c3, String missingDelimiterValue) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(missingDelimiterValue, "missingDelimiterValue");
        int iF = F(str, c3, 0, false, 6, null);
        if (iF == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iF + 1, str.length());
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String e0(String str, char c3, String str2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str2 = str;
        }
        return d0(str, c3, str2);
    }

    public static final String f0(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(delimiter, "delimiter");
        kotlin.jvm.internal.m.e(missingDelimiterValue, "missingDelimiterValue");
        int iA = A(str, delimiter, 0, false, 6, null);
        if (iA == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iA);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String g0(String str, String str2, String str3, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str3 = str;
        }
        return f0(str, str2, str3);
    }

    public static final boolean r(CharSequence charSequence, CharSequence other, boolean z2) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        kotlin.jvm.internal.m.e(other, "other");
        if (other instanceof String) {
            if (A(charSequence, (String) other, 0, z2, 2, null) < 0) {
                return false;
            }
        } else if (y(charSequence, other, 0, charSequence.length(), z2, false, 16, null) < 0) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ boolean s(CharSequence charSequence, CharSequence charSequence2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        return r(charSequence, charSequence2, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0091, code lost:
    
        return I1.q.a(java.lang.Integer.valueOf(r12), r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final I1.m t(java.lang.CharSequence r10, java.util.Collection r11, int r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.p.t(java.lang.CharSequence, java.util.Collection, int, boolean, boolean):I1.m");
    }

    public static final int u(CharSequence charSequence) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int v(CharSequence charSequence, char c3, int i3, boolean z2) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        return (z2 || !(charSequence instanceof String)) ? B(charSequence, new char[]{c3}, i3, z2) : ((String) charSequence).indexOf(c3, i3);
    }

    public static final int w(CharSequence charSequence, String string, int i3, boolean z2) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        kotlin.jvm.internal.m.e(string, "string");
        return (z2 || !(charSequence instanceof String)) ? y(charSequence, string, i3, charSequence.length(), z2, false, 16, null) : ((String) charSequence).indexOf(string, i3);
    }

    private static final int x(CharSequence charSequence, CharSequence charSequence2, int i3, int i4, boolean z2, boolean z3) {
        Y1.d fVar = !z3 ? new Y1.f(Y1.i.a(i3, 0), Y1.i.c(i4, charSequence.length())) : Y1.i.f(Y1.i.c(i3, u(charSequence)), Y1.i.a(i4, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iA = fVar.a();
            int iB = fVar.b();
            int iD = fVar.d();
            if ((iD <= 0 || iA > iB) && (iD >= 0 || iB > iA)) {
                return -1;
            }
            while (!o.l((String) charSequence2, 0, (String) charSequence, iA, charSequence2.length(), z2)) {
                if (iA == iB) {
                    return -1;
                }
                iA += iD;
            }
            return iA;
        }
        int iA2 = fVar.a();
        int iB2 = fVar.b();
        int iD2 = fVar.d();
        if ((iD2 <= 0 || iA2 > iB2) && (iD2 >= 0 || iB2 > iA2)) {
            return -1;
        }
        while (!R(charSequence2, 0, charSequence, iA2, charSequence2.length(), z2)) {
            if (iA2 == iB2) {
                return -1;
            }
            iA2 += iD2;
        }
        return iA2;
    }

    static /* synthetic */ int y(CharSequence charSequence, CharSequence charSequence2, int i3, int i4, boolean z2, boolean z3, int i5, Object obj) {
        if ((i5 & 16) != 0) {
            z3 = false;
        }
        return x(charSequence, charSequence2, i3, i4, z2, z3);
    }

    public static /* synthetic */ int z(CharSequence charSequence, char c3, int i3, boolean z2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        if ((i4 & 4) != 0) {
            z2 = false;
        }
        return v(charSequence, c3, i3, z2);
    }
}
