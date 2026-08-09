package J0;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.C0760x;
import com.google.firebase.firestore.T;
import com.google.protobuf.AbstractC0791i;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.SortedSet;
import y1.l0;
import y1.m0;
import y1.n0;

/* JADX INFO: loaded from: classes.dex */
public abstract class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Random f2433a = new SecureRandom();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Continuation f2434b = new Continuation() { // from class: J0.H
        @Override // com.google.android.gms.tasks.Continuation
        public final Object then(Task task) {
            return L.t(task);
        }
    };

    private static Object e(Iterator it) {
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static List f(int i3, Object obj, Object obj2, Object... objArr) {
        if (objArr.length % 2 == 1) {
            throw new IllegalArgumentException("Missing value in call to update().  There must be an even number of arguments that alternate between field names and values");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        arrayList.add(obj2);
        Collections.addAll(arrayList, objArr);
        for (int i4 = 0; i4 < arrayList.size(); i4 += 2) {
            Object obj3 = arrayList.get(i4);
            if (!(obj3 instanceof String) && !(obj3 instanceof C0760x)) {
                throw new IllegalArgumentException("Excepted field name at argument position " + (i4 + i3 + 1) + " but got " + obj3 + " in call to update.  The arguments to update should alternate between field names and values");
            }
        }
        return arrayList;
    }

    public static int g(byte[] bArr, byte[] bArr2) {
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i3 = 0; i3 < iMin; i3++) {
            int i4 = bArr[i3] & 255;
            int i5 = bArr2[i3] & 255;
            if (i4 < i5) {
                return -1;
            }
            if (i4 > i5) {
                return 1;
            }
        }
        return Integer.compare(bArr.length, bArr2.length);
    }

    public static int h(AbstractC0791i abstractC0791i, AbstractC0791i abstractC0791i2) {
        int iMin = Math.min(abstractC0791i.size(), abstractC0791i2.size());
        for (int i3 = 0; i3 < iMin; i3++) {
            int iF = abstractC0791i.f(i3) & 255;
            int iF2 = abstractC0791i2.f(i3) & 255;
            if (iF < iF2) {
                return -1;
            }
            if (iF > iF2) {
                return 1;
            }
        }
        return Integer.compare(abstractC0791i.size(), abstractC0791i2.size());
    }

    public static int i(String str, String str2) {
        if (str == str2) {
            return 0;
        }
        int iMin = Math.min(str.length(), str2.length());
        for (int i3 = 0; i3 < iMin; i3++) {
            char cCharAt = str.charAt(i3);
            char cCharAt2 = str2.charAt(i3);
            if (cCharAt != cCharAt2) {
                return Character.isSurrogate(cCharAt) == Character.isSurrogate(cCharAt2) ? Character.compare(cCharAt, cCharAt2) : Character.isSurrogate(cCharAt) ? 1 : -1;
            }
        }
        return Integer.compare(str.length(), str2.length());
    }

    private static Exception j(Exception exc) {
        l0 l0VarA;
        if (exc instanceof m0) {
            l0VarA = ((m0) exc).a();
        } else {
            if (!(exc instanceof n0)) {
                return exc;
            }
            l0VarA = ((n0) exc).a();
        }
        return o(l0VarA);
    }

    public static void k(final RuntimeException runtimeException) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: J0.I
            @Override // java.lang.Runnable
            public final void run() {
                L.q(runtimeException);
            }
        });
    }

    public static void l(Collection collection, Collection collection2, Comparator comparator, n nVar, n nVar2) {
        ArrayList arrayList = new ArrayList(collection);
        Collections.sort(arrayList, comparator);
        ArrayList arrayList2 = new ArrayList(collection2);
        Collections.sort(arrayList2, comparator);
        m(arrayList.iterator(), arrayList2.iterator(), comparator, nVar, nVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m(java.util.Iterator r6, java.util.Iterator r7, java.util.Comparator r8, J0.n r9, J0.n r10) {
        /*
        L0:
            java.lang.Object r0 = e(r6)
        L4:
            java.lang.Object r1 = e(r7)
        L8:
            if (r0 != 0) goto Le
            if (r1 == 0) goto Ld
            goto Le
        Ld:
            return
        Le:
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L20
            if (r1 == 0) goto L20
            int r4 = r8.compare(r0, r1)
            if (r4 >= 0) goto L1b
            goto L26
        L1b:
            if (r4 <= 0) goto L1e
            goto L23
        L1e:
            r3 = r2
            goto L26
        L20:
            if (r0 == 0) goto L23
            goto L26
        L23:
            r5 = r3
            r3 = r2
            r2 = r5
        L26:
            if (r2 == 0) goto L2c
            r9.accept(r1)
            goto L4
        L2c:
            if (r3 == 0) goto L0
            r10.accept(r0)
            java.lang.Object r0 = e(r6)
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: J0.L.m(java.util.Iterator, java.util.Iterator, java.util.Comparator, J0.n, J0.n):void");
    }

    public static void n(SortedSet sortedSet, SortedSet sortedSet2, n nVar, n nVar2) {
        m(sortedSet.iterator(), sortedSet2.iterator(), sortedSet.comparator() != null ? sortedSet.comparator() : new Comparator() { // from class: J0.J
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Comparable) obj).compareTo((Comparable) obj2);
            }
        }, nVar, nVar2);
    }

    public static T o(l0 l0Var) {
        m0 m0VarC = l0Var.c();
        return new T(m0VarC.getMessage(), T.a.g(l0Var.m().g()), m0VarC);
    }

    public static Map p(Map map, int i3, final Comparator comparator) {
        if (map.size() <= i3) {
            return map;
        }
        ArrayList arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, new Comparator() { // from class: J0.K
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return L.s(comparator, (Map.Entry) obj, (Map.Entry) obj2);
            }
        });
        HashMap map2 = new HashMap();
        for (int i4 = 0; i4 < i3; i4++) {
            map2.put(((Map.Entry) arrayList.get(i4)).getKey(), ((Map.Entry) arrayList.get(i4)).getValue());
        }
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int s(Comparator comparator, Map.Entry entry, Map.Entry entry2) {
        return comparator.compare(entry.getValue(), entry2.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void t(Task task) throws Exception {
        if (task.isSuccessful()) {
            return (Void) task.getResult();
        }
        Exception excJ = j(task.getException());
        if (excJ instanceof T) {
            throw excJ;
        }
        throw new T(excJ.getMessage(), T.a.UNKNOWN, excJ);
    }

    public static StringBuilder u(CharSequence charSequence, int i3, CharSequence charSequence2) {
        StringBuilder sb = new StringBuilder();
        if (i3 != 0) {
            sb.append(charSequence);
            for (int i4 = 1; i4 < i3; i4++) {
                sb.append(charSequence2);
                sb.append(charSequence);
            }
        }
        return sb;
    }

    public static String v(AbstractC0791i abstractC0791i) {
        int size = abstractC0791i.size();
        StringBuilder sb = new StringBuilder(size * 2);
        for (int i3 = 0; i3 < size; i3++) {
            byte bF = abstractC0791i.f(i3);
            sb.append(Character.forDigit((bF & 255) >>> 4, 16));
            sb.append(Character.forDigit(bF & 15, 16));
        }
        return sb.toString();
    }

    public static String w(Object obj) {
        return obj == null ? "null" : obj.getClass().getName();
    }

    public static Continuation x() {
        return f2434b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(RuntimeException runtimeException) {
        throw runtimeException;
    }
}
