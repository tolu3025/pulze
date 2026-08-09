package B1;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f726a = new String[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f727b = Charset.forName("UTF-8");

    public static List a(Object[] objArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    private static List b(Object[] objArr, Object[] objArr2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            int length = objArr2.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    Object obj2 = objArr2[i3];
                    if (obj.equals(obj2)) {
                        arrayList.add(obj2);
                        break;
                    }
                    i3++;
                }
            }
        }
        return arrayList;
    }

    public static Object[] c(Class cls, Object[] objArr, Object[] objArr2) {
        List listB = b(objArr, objArr2);
        return listB.toArray((Object[]) Array.newInstance((Class<?>) cls, listB.size()));
    }
}
