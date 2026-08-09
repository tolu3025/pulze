package b2;

import J1.AbstractC0412p;
import J1.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends g {

    static final class a extends kotlin.jvm.internal.n implements U1.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f4970a = new a();

        a() {
            super(1);
        }

        @Override // U1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(String line) {
            kotlin.jvm.internal.m.e(line, "line");
            return line;
        }
    }

    static final class b extends kotlin.jvm.internal.n implements U1.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4971a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f4971a = str;
        }

        @Override // U1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(String line) {
            kotlin.jvm.internal.m.e(line, "line");
            return this.f4971a + line;
        }
    }

    private static final U1.l b(String str) {
        return str.length() == 0 ? a.f4970a : new b(str);
    }

    private static final int c(String str) {
        int length = str.length();
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                i3 = -1;
                break;
            }
            if (!b2.a.c(str.charAt(i3))) {
                break;
            }
            i3++;
        }
        return i3 == -1 ? str.length() : i3;
    }

    public static final String d(String str, String newIndent) {
        String str2;
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(newIndent, "newIndent");
        List listJ = p.J(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listJ) {
            if (!p.C((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(J1.q.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(c((String) it.next())));
        }
        Integer num = (Integer) x.I(arrayList2);
        int i3 = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * listJ.size());
        U1.l lVarB = b(newIndent);
        int i4 = AbstractC0412p.i(listJ);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listJ) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                AbstractC0412p.m();
            }
            String str3 = (String) obj2;
            if ((i3 == 0 || i3 == i4) && p.C(str3)) {
                str3 = null;
            } else {
                String strH0 = r.h0(str3, iIntValue);
                if (strH0 != null && (str2 = (String) lVarB.invoke(strH0)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i3 = i5;
        }
        String string = ((StringBuilder) x.E(arrayList3, new StringBuilder(length), "\n", null, null, 0, null, null, 124, null)).toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    public static String e(String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        return d(str, "");
    }
}
