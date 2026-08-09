package J1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC1009c;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: J1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0407k extends AbstractC0406j {

    /* JADX INFO: renamed from: J1.k$a */
    public static final class a implements a2.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object[] f2552a;

        public a(Object[] objArr) {
            this.f2552a = objArr;
        }

        @Override // a2.c
        public Iterator iterator() {
            return AbstractC1009c.a(this.f2552a);
        }
    }

    public static final Appendable A(short[] sArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i3, CharSequence truncated, U1.l lVar) throws IOException {
        kotlin.jvm.internal.m.e(sArr, "<this>");
        kotlin.jvm.internal.m.e(buffer, "buffer");
        kotlin.jvm.internal.m.e(separator, "separator");
        kotlin.jvm.internal.m.e(prefix, "prefix");
        kotlin.jvm.internal.m.e(postfix, "postfix");
        kotlin.jvm.internal.m.e(truncated, "truncated");
        buffer.append(prefix);
        int i4 = 0;
        for (short s2 : sArr) {
            i4++;
            if (i4 > 1) {
                buffer.append(separator);
            }
            if (i3 >= 0 && i4 > i3) {
                break;
            }
            buffer.append(lVar != null ? (CharSequence) lVar.invoke(Short.valueOf(s2)) : String.valueOf((int) s2));
        }
        if (i3 >= 0 && i4 > i3) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final String B(byte[] bArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i3, CharSequence truncated, U1.l lVar) {
        kotlin.jvm.internal.m.e(bArr, "<this>");
        kotlin.jvm.internal.m.e(separator, "separator");
        kotlin.jvm.internal.m.e(prefix, "prefix");
        kotlin.jvm.internal.m.e(postfix, "postfix");
        kotlin.jvm.internal.m.e(truncated, "truncated");
        String string = ((StringBuilder) u(bArr, new StringBuilder(), separator, prefix, postfix, i3, truncated, lVar)).toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    public static final String C(double[] dArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i3, CharSequence truncated, U1.l lVar) {
        kotlin.jvm.internal.m.e(dArr, "<this>");
        kotlin.jvm.internal.m.e(separator, "separator");
        kotlin.jvm.internal.m.e(prefix, "prefix");
        kotlin.jvm.internal.m.e(postfix, "postfix");
        kotlin.jvm.internal.m.e(truncated, "truncated");
        String string = ((StringBuilder) v(dArr, new StringBuilder(), separator, prefix, postfix, i3, truncated, lVar)).toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    public static final String D(float[] fArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i3, CharSequence truncated, U1.l lVar) {
        kotlin.jvm.internal.m.e(fArr, "<this>");
        kotlin.jvm.internal.m.e(separator, "separator");
        kotlin.jvm.internal.m.e(prefix, "prefix");
        kotlin.jvm.internal.m.e(postfix, "postfix");
        kotlin.jvm.internal.m.e(truncated, "truncated");
        String string = ((StringBuilder) w(fArr, new StringBuilder(), separator, prefix, postfix, i3, truncated, lVar)).toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    public static final String E(int[] iArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i3, CharSequence truncated, U1.l lVar) {
        kotlin.jvm.internal.m.e(iArr, "<this>");
        kotlin.jvm.internal.m.e(separator, "separator");
        kotlin.jvm.internal.m.e(prefix, "prefix");
        kotlin.jvm.internal.m.e(postfix, "postfix");
        kotlin.jvm.internal.m.e(truncated, "truncated");
        String string = ((StringBuilder) x(iArr, new StringBuilder(), separator, prefix, postfix, i3, truncated, lVar)).toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    public static final String F(long[] jArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i3, CharSequence truncated, U1.l lVar) {
        kotlin.jvm.internal.m.e(jArr, "<this>");
        kotlin.jvm.internal.m.e(separator, "separator");
        kotlin.jvm.internal.m.e(prefix, "prefix");
        kotlin.jvm.internal.m.e(postfix, "postfix");
        kotlin.jvm.internal.m.e(truncated, "truncated");
        String string = ((StringBuilder) y(jArr, new StringBuilder(), separator, prefix, postfix, i3, truncated, lVar)).toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    public static final String G(Object[] objArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i3, CharSequence truncated, U1.l lVar) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        kotlin.jvm.internal.m.e(separator, "separator");
        kotlin.jvm.internal.m.e(prefix, "prefix");
        kotlin.jvm.internal.m.e(postfix, "postfix");
        kotlin.jvm.internal.m.e(truncated, "truncated");
        String string = ((StringBuilder) z(objArr, new StringBuilder(), separator, prefix, postfix, i3, truncated, lVar)).toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    public static final String H(short[] sArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i3, CharSequence truncated, U1.l lVar) {
        kotlin.jvm.internal.m.e(sArr, "<this>");
        kotlin.jvm.internal.m.e(separator, "separator");
        kotlin.jvm.internal.m.e(prefix, "prefix");
        kotlin.jvm.internal.m.e(postfix, "postfix");
        kotlin.jvm.internal.m.e(truncated, "truncated");
        String string = ((StringBuilder) A(sArr, new StringBuilder(), separator, prefix, postfix, i3, truncated, lVar)).toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String I(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i3, CharSequence charSequence4, U1.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i4 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i4 & 4) == 0 ? charSequence3 : "";
        if ((i4 & 8) != 0) {
            i3 = -1;
        }
        int i5 = i3;
        if ((i4 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i4 & 32) != 0) {
            lVar = null;
        }
        return B(bArr, charSequence, charSequence5, charSequence6, i5, charSequence7, lVar);
    }

    public static /* synthetic */ String J(double[] dArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i3, CharSequence charSequence4, U1.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i4 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i4 & 4) == 0 ? charSequence3 : "";
        if ((i4 & 8) != 0) {
            i3 = -1;
        }
        int i5 = i3;
        if ((i4 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i4 & 32) != 0) {
            lVar = null;
        }
        return C(dArr, charSequence, charSequence5, charSequence6, i5, charSequence7, lVar);
    }

    public static /* synthetic */ String K(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i3, CharSequence charSequence4, U1.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i4 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i4 & 4) == 0 ? charSequence3 : "";
        if ((i4 & 8) != 0) {
            i3 = -1;
        }
        int i5 = i3;
        if ((i4 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i4 & 32) != 0) {
            lVar = null;
        }
        return D(fArr, charSequence, charSequence5, charSequence6, i5, charSequence7, lVar);
    }

    public static /* synthetic */ String L(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i3, CharSequence charSequence4, U1.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i4 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i4 & 4) == 0 ? charSequence3 : "";
        if ((i4 & 8) != 0) {
            i3 = -1;
        }
        int i5 = i3;
        if ((i4 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i4 & 32) != 0) {
            lVar = null;
        }
        return E(iArr, charSequence, charSequence5, charSequence6, i5, charSequence7, lVar);
    }

    public static /* synthetic */ String M(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i3, CharSequence charSequence4, U1.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i4 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i4 & 4) == 0 ? charSequence3 : "";
        if ((i4 & 8) != 0) {
            i3 = -1;
        }
        int i5 = i3;
        if ((i4 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i4 & 32) != 0) {
            lVar = null;
        }
        return F(jArr, charSequence, charSequence5, charSequence6, i5, charSequence7, lVar);
    }

    public static /* synthetic */ String N(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i3, CharSequence charSequence4, U1.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i4 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i4 & 4) == 0 ? charSequence3 : "";
        if ((i4 & 8) != 0) {
            i3 = -1;
        }
        int i5 = i3;
        if ((i4 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i4 & 32) != 0) {
            lVar = null;
        }
        return G(objArr, charSequence, charSequence5, charSequence6, i5, charSequence7, lVar);
    }

    public static /* synthetic */ String O(short[] sArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i3, CharSequence charSequence4, U1.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i4 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i4 & 4) == 0 ? charSequence3 : "";
        if ((i4 & 8) != 0) {
            i3 = -1;
        }
        int i5 = i3;
        if ((i4 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i4 & 32) != 0) {
            lVar = null;
        }
        return H(sArr, charSequence, charSequence5, charSequence6, i5, charSequence7, lVar);
    }

    public static char P(char[] cArr) {
        kotlin.jvm.internal.m.e(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Object Q(Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    public static List R(Comparable[] comparableArr) {
        kotlin.jvm.internal.m.e(comparableArr, "<this>");
        return AbstractC0406j.c(S(comparableArr));
    }

    public static final Comparable[] S(Comparable[] comparableArr) {
        kotlin.jvm.internal.m.e(comparableArr, "<this>");
        if (comparableArr.length == 0) {
            return comparableArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(comparableArr, comparableArr.length);
        kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
        Comparable[] comparableArr2 = (Comparable[]) objArrCopyOf;
        AbstractC0406j.l(comparableArr2);
        return comparableArr2;
    }

    public static final Collection T(Object[] objArr, Collection destination) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        kotlin.jvm.internal.m.e(destination, "destination");
        for (Object obj : objArr) {
            destination.add(obj);
        }
        return destination;
    }

    public static List U(byte[] bArr) {
        kotlin.jvm.internal.m.e(bArr, "<this>");
        int length = bArr.length;
        return length != 0 ? length != 1 ? b0(bArr) : AbstractC0411o.d(Byte.valueOf(bArr[0])) : AbstractC0412p.h();
    }

    public static List V(double[] dArr) {
        kotlin.jvm.internal.m.e(dArr, "<this>");
        int length = dArr.length;
        return length != 0 ? length != 1 ? c0(dArr) : AbstractC0411o.d(Double.valueOf(dArr[0])) : AbstractC0412p.h();
    }

    public static List W(float[] fArr) {
        kotlin.jvm.internal.m.e(fArr, "<this>");
        int length = fArr.length;
        return length != 0 ? length != 1 ? d0(fArr) : AbstractC0411o.d(Float.valueOf(fArr[0])) : AbstractC0412p.h();
    }

    public static List X(int[] iArr) {
        kotlin.jvm.internal.m.e(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? e0(iArr) : AbstractC0411o.d(Integer.valueOf(iArr[0])) : AbstractC0412p.h();
    }

    public static List Y(long[] jArr) {
        kotlin.jvm.internal.m.e(jArr, "<this>");
        int length = jArr.length;
        return length != 0 ? length != 1 ? f0(jArr) : AbstractC0411o.d(Long.valueOf(jArr[0])) : AbstractC0412p.h();
    }

    public static List Z(Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? g0(objArr) : AbstractC0411o.d(objArr[0]) : AbstractC0412p.h();
    }

    public static List a0(short[] sArr) {
        kotlin.jvm.internal.m.e(sArr, "<this>");
        int length = sArr.length;
        return length != 0 ? length != 1 ? h0(sArr) : AbstractC0411o.d(Short.valueOf(sArr[0])) : AbstractC0412p.h();
    }

    public static final List b0(byte[] bArr) {
        kotlin.jvm.internal.m.e(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b3 : bArr) {
            arrayList.add(Byte.valueOf(b3));
        }
        return arrayList;
    }

    public static final List c0(double[] dArr) {
        kotlin.jvm.internal.m.e(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d3 : dArr) {
            arrayList.add(Double.valueOf(d3));
        }
        return arrayList;
    }

    public static final List d0(float[] fArr) {
        kotlin.jvm.internal.m.e(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f3 : fArr) {
            arrayList.add(Float.valueOf(f3));
        }
        return arrayList;
    }

    public static final List e0(int[] iArr) {
        kotlin.jvm.internal.m.e(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i3 : iArr) {
            arrayList.add(Integer.valueOf(i3));
        }
        return arrayList;
    }

    public static final List f0(long[] jArr) {
        kotlin.jvm.internal.m.e(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j3 : jArr) {
            arrayList.add(Long.valueOf(j3));
        }
        return arrayList;
    }

    public static final List g0(Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        return new ArrayList(AbstractC0412p.g(objArr));
    }

    public static final List h0(short[] sArr) {
        kotlin.jvm.internal.m.e(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s2 : sArr) {
            arrayList.add(Short.valueOf(s2));
        }
        return arrayList;
    }

    public static final Set i0(Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? (Set) T(objArr, new LinkedHashSet(F.a(objArr.length))) : M.a(objArr[0]) : N.b();
    }

    public static a2.c n(Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        return objArr.length == 0 ? a2.i.e() : new a(objArr);
    }

    public static boolean o(Object[] objArr, Object obj) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        return t(objArr, obj) >= 0;
    }

    public static final List p(Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        return (List) q(objArr, new ArrayList());
    }

    public static final Collection q(Object[] objArr, Collection destination) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        kotlin.jvm.internal.m.e(destination, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static final int r(Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        return objArr.length - 1;
    }

    public static Object s(Object[] objArr, int i3) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        if (i3 < 0 || i3 >= objArr.length) {
            return null;
        }
        return objArr[i3];
    }

    public static final int t(Object[] objArr, Object obj) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        int i3 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i3 < length) {
                if (objArr[i3] == null) {
                    return i3;
                }
                i3++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i3 < length2) {
            if (kotlin.jvm.internal.m.a(obj, objArr[i3])) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public static final Appendable u(byte[] bArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i3, CharSequence truncated, U1.l lVar) throws IOException {
        kotlin.jvm.internal.m.e(bArr, "<this>");
        kotlin.jvm.internal.m.e(buffer, "buffer");
        kotlin.jvm.internal.m.e(separator, "separator");
        kotlin.jvm.internal.m.e(prefix, "prefix");
        kotlin.jvm.internal.m.e(postfix, "postfix");
        kotlin.jvm.internal.m.e(truncated, "truncated");
        buffer.append(prefix);
        int i4 = 0;
        for (byte b3 : bArr) {
            i4++;
            if (i4 > 1) {
                buffer.append(separator);
            }
            if (i3 >= 0 && i4 > i3) {
                break;
            }
            buffer.append(lVar != null ? (CharSequence) lVar.invoke(Byte.valueOf(b3)) : String.valueOf((int) b3));
        }
        if (i3 >= 0 && i4 > i3) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final Appendable v(double[] dArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i3, CharSequence truncated, U1.l lVar) throws IOException {
        kotlin.jvm.internal.m.e(dArr, "<this>");
        kotlin.jvm.internal.m.e(buffer, "buffer");
        kotlin.jvm.internal.m.e(separator, "separator");
        kotlin.jvm.internal.m.e(prefix, "prefix");
        kotlin.jvm.internal.m.e(postfix, "postfix");
        kotlin.jvm.internal.m.e(truncated, "truncated");
        buffer.append(prefix);
        int i4 = 0;
        for (double d3 : dArr) {
            i4++;
            if (i4 > 1) {
                buffer.append(separator);
            }
            if (i3 >= 0 && i4 > i3) {
                break;
            }
            buffer.append(lVar != null ? (CharSequence) lVar.invoke(Double.valueOf(d3)) : String.valueOf(d3));
        }
        if (i3 >= 0 && i4 > i3) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final Appendable w(float[] fArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i3, CharSequence truncated, U1.l lVar) throws IOException {
        kotlin.jvm.internal.m.e(fArr, "<this>");
        kotlin.jvm.internal.m.e(buffer, "buffer");
        kotlin.jvm.internal.m.e(separator, "separator");
        kotlin.jvm.internal.m.e(prefix, "prefix");
        kotlin.jvm.internal.m.e(postfix, "postfix");
        kotlin.jvm.internal.m.e(truncated, "truncated");
        buffer.append(prefix);
        int i4 = 0;
        for (float f3 : fArr) {
            i4++;
            if (i4 > 1) {
                buffer.append(separator);
            }
            if (i3 >= 0 && i4 > i3) {
                break;
            }
            buffer.append(lVar != null ? (CharSequence) lVar.invoke(Float.valueOf(f3)) : String.valueOf(f3));
        }
        if (i3 >= 0 && i4 > i3) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final Appendable x(int[] iArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i3, CharSequence truncated, U1.l lVar) throws IOException {
        kotlin.jvm.internal.m.e(iArr, "<this>");
        kotlin.jvm.internal.m.e(buffer, "buffer");
        kotlin.jvm.internal.m.e(separator, "separator");
        kotlin.jvm.internal.m.e(prefix, "prefix");
        kotlin.jvm.internal.m.e(postfix, "postfix");
        kotlin.jvm.internal.m.e(truncated, "truncated");
        buffer.append(prefix);
        int i4 = 0;
        for (int i5 : iArr) {
            i4++;
            if (i4 > 1) {
                buffer.append(separator);
            }
            if (i3 >= 0 && i4 > i3) {
                break;
            }
            buffer.append(lVar != null ? (CharSequence) lVar.invoke(Integer.valueOf(i5)) : String.valueOf(i5));
        }
        if (i3 >= 0 && i4 > i3) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final Appendable y(long[] jArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i3, CharSequence truncated, U1.l lVar) throws IOException {
        kotlin.jvm.internal.m.e(jArr, "<this>");
        kotlin.jvm.internal.m.e(buffer, "buffer");
        kotlin.jvm.internal.m.e(separator, "separator");
        kotlin.jvm.internal.m.e(prefix, "prefix");
        kotlin.jvm.internal.m.e(postfix, "postfix");
        kotlin.jvm.internal.m.e(truncated, "truncated");
        buffer.append(prefix);
        int i4 = 0;
        for (long j3 : jArr) {
            i4++;
            if (i4 > 1) {
                buffer.append(separator);
            }
            if (i3 >= 0 && i4 > i3) {
                break;
            }
            buffer.append(lVar != null ? (CharSequence) lVar.invoke(Long.valueOf(j3)) : String.valueOf(j3));
        }
        if (i3 >= 0 && i4 > i3) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final Appendable z(Object[] objArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i3, CharSequence truncated, U1.l lVar) throws IOException {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        kotlin.jvm.internal.m.e(buffer, "buffer");
        kotlin.jvm.internal.m.e(separator, "separator");
        kotlin.jvm.internal.m.e(prefix, "prefix");
        kotlin.jvm.internal.m.e(postfix, "postfix");
        kotlin.jvm.internal.m.e(truncated, "truncated");
        buffer.append(prefix);
        int i4 = 0;
        for (Object obj : objArr) {
            i4++;
            if (i4 > 1) {
                buffer.append(separator);
            }
            if (i3 >= 0 && i4 > i3) {
                break;
            }
            b2.g.a(buffer, obj, lVar);
        }
        if (i3 >= 0 && i4 > i3) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }
}
