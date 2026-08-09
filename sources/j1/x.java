package J1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class x extends w {
    public static final Object B(Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        if (iterable instanceof List) {
            return C((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object C(List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static final Appendable D(Iterable iterable, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i3, CharSequence truncated, U1.l lVar) throws IOException {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        kotlin.jvm.internal.m.e(buffer, "buffer");
        kotlin.jvm.internal.m.e(separator, "separator");
        kotlin.jvm.internal.m.e(prefix, "prefix");
        kotlin.jvm.internal.m.e(postfix, "postfix");
        kotlin.jvm.internal.m.e(truncated, "truncated");
        buffer.append(prefix);
        int i4 = 0;
        for (Object obj : iterable) {
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

    public static /* synthetic */ Appendable E(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i3, CharSequence charSequence4, U1.l lVar, int i4, Object obj) {
        return D(iterable, appendable, (charSequence & 2) != 0 ? ", " : charSequence, (charSequence & 4) != 0 ? "" : charSequence2, (charSequence & 8) == 0 ? charSequence3 : "", (charSequence & 16) != 0 ? -1 : i3, (charSequence & 32) != 0 ? "..." : charSequence4, (charSequence & 64) != 0 ? null : lVar);
    }

    public static final String F(Iterable iterable, CharSequence separator, CharSequence prefix, CharSequence postfix, int i3, CharSequence truncated, U1.l lVar) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        kotlin.jvm.internal.m.e(separator, "separator");
        kotlin.jvm.internal.m.e(prefix, "prefix");
        kotlin.jvm.internal.m.e(postfix, "postfix");
        kotlin.jvm.internal.m.e(truncated, "truncated");
        String string = ((StringBuilder) D(iterable, new StringBuilder(), separator, prefix, postfix, i3, truncated, lVar)).toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String G(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i3, CharSequence charSequence4, U1.l lVar, int i4, Object obj) {
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
        return F(iterable, charSequence, charSequence5, charSequence6, i5, charSequence7, lVar);
    }

    public static Object H(List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC0412p.i(list));
    }

    public static Comparable I(Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static List J(Collection collection, Iterable elements) {
        kotlin.jvm.internal.m.e(collection, "<this>");
        kotlin.jvm.internal.m.e(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            u.r(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static List K(Collection collection, Object obj) {
        kotlin.jvm.internal.m.e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List L(Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return V(iterable);
        }
        List listX = X(iterable);
        w.A(listX);
        return listX;
    }

    public static Object M(Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        if (iterable instanceof List) {
            return N((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static final Object N(List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static List O(Iterable iterable, Comparator comparator) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        kotlin.jvm.internal.m.e(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List listX = X(iterable);
            t.q(listX, comparator);
            return listX;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return V(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        AbstractC0406j.m(array, comparator);
        return AbstractC0406j.c(array);
    }

    public static List P(Iterable iterable, int i3) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        if (i3 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i3 + " is less than zero.").toString());
        }
        if (i3 == 0) {
            return AbstractC0412p.h();
        }
        if (iterable instanceof Collection) {
            if (i3 >= ((Collection) iterable).size()) {
                return V(iterable);
            }
            if (i3 == 1) {
                return AbstractC0411o.d(B(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i3);
        Iterator it = iterable.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i4++;
            if (i4 == i3) {
                break;
            }
        }
        return AbstractC0412p.l(arrayList);
    }

    public static List Q(List list, int i3) {
        kotlin.jvm.internal.m.e(list, "<this>");
        if (i3 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i3 + " is less than zero.").toString());
        }
        if (i3 == 0) {
            return AbstractC0412p.h();
        }
        int size = list.size();
        if (i3 >= size) {
            return V(list);
        }
        if (i3 == 1) {
            return AbstractC0411o.d(H(list));
        }
        ArrayList arrayList = new ArrayList(i3);
        if (list instanceof RandomAccess) {
            for (int i4 = size - i3; i4 < size; i4++) {
                arrayList.add(list.get(i4));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i3);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static byte[] R(Collection collection) {
        kotlin.jvm.internal.m.e(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator it = collection.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            bArr[i3] = ((Number) it.next()).byteValue();
            i3++;
        }
        return bArr;
    }

    public static final Collection S(Iterable iterable, Collection destination) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        kotlin.jvm.internal.m.e(destination, "destination");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static HashSet T(Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        return (HashSet) S(iterable, new HashSet(F.a(q.n(iterable, 12))));
    }

    public static int[] U(Collection collection) {
        kotlin.jvm.internal.m.e(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            iArr[i3] = ((Number) it.next()).intValue();
            i3++;
        }
        return iArr;
    }

    public static List V(Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return AbstractC0412p.l(X(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return AbstractC0412p.h();
        }
        if (size != 1) {
            return Y(collection);
        }
        return AbstractC0411o.d(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static long[] W(Collection collection) {
        kotlin.jvm.internal.m.e(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            jArr[i3] = ((Number) it.next()).longValue();
            i3++;
        }
        return jArr;
    }

    public static final List X(Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        return iterable instanceof Collection ? Y((Collection) iterable) : (List) S(iterable, new ArrayList());
    }

    public static final List Y(Collection collection) {
        kotlin.jvm.internal.m.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set Z(Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) S(iterable, new LinkedHashSet());
    }

    public static Set a0(Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return N.c((Set) S(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return N.b();
        }
        if (size != 1) {
            return (Set) S(iterable, new LinkedHashSet(F.a(collection.size())));
        }
        return M.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static List b0(Iterable iterable, int i3, int i4, boolean z2) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        P.a(i3, i4);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itB = P.b(iterable.iterator(), i3, i4, z2, false);
            while (itB.hasNext()) {
                arrayList.add((List) itB.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i4) + (size % i4 == 0 ? 0 : 1));
        int i5 = 0;
        while (i5 >= 0 && i5 < size) {
            int iC = Y1.i.c(i3, size - i5);
            if (iC < i3 && !z2) {
                break;
            }
            ArrayList arrayList3 = new ArrayList(iC);
            for (int i6 = 0; i6 < iC; i6++) {
                arrayList3.add(list.get(i6 + i5));
            }
            arrayList2.add(arrayList3);
            i5 += i4;
        }
        return arrayList2;
    }
}
