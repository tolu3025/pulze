package b2;

import J1.AbstractC0399c;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class o extends n {
    public static String h(char[] cArr) {
        kotlin.jvm.internal.m.e(cArr, "<this>");
        return new String(cArr);
    }

    public static String i(char[] cArr, int i3, int i4) {
        kotlin.jvm.internal.m.e(cArr, "<this>");
        AbstractC0399c.f2538a.a(i3, i4, cArr.length);
        return new String(cArr, i3, i4 - i3);
    }

    public static final boolean j(String str, String suffix, boolean z2) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(suffix, "suffix");
        return !z2 ? str.endsWith(suffix) : l(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    public static /* synthetic */ boolean k(String str, String str2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        return j(str, str2, z2);
    }

    public static final boolean l(String str, int i3, String other, int i4, int i5, boolean z2) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(other, "other");
        return !z2 ? str.regionMatches(i3, other, i4, i5) : str.regionMatches(z2, i3, other, i4, i5);
    }

    public static final String m(String str, String oldValue, String newValue, boolean z2) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(oldValue, "oldValue");
        kotlin.jvm.internal.m.e(newValue, "newValue");
        int i3 = 0;
        int iW = p.w(str, oldValue, 0, z2);
        if (iW < 0) {
            return str;
        }
        int length = oldValue.length();
        int iA = Y1.i.a(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i3, iW);
            sb.append(newValue);
            i3 = iW + length;
            if (iW >= str.length()) {
                break;
            }
            iW = p.w(str, oldValue, iW + iA, z2);
        } while (iW > 0);
        sb.append((CharSequence) str, i3, str.length());
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String n(String str, String str2, String str3, boolean z2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return m(str, str2, str3, z2);
    }

    public static final boolean o(String str, String prefix, boolean z2) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(prefix, "prefix");
        return !z2 ? str.startsWith(prefix) : l(str, 0, prefix, 0, prefix.length(), z2);
    }

    public static /* synthetic */ boolean p(String str, String str2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        return o(str, str2, z2);
    }
}
