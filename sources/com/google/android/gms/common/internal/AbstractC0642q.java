package com.google.android.gms.common.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0642q {

    /* JADX INFO: renamed from: com.google.android.gms.common.internal.q$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f5614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f5615b;

        /* synthetic */ a(Object obj, byte[] bArr) {
            AbstractC0643s.k(obj);
            this.f5615b = obj;
            this.f5614a = new ArrayList();
        }

        public a a(String str, Object obj) {
            AbstractC0643s.k(str);
            int length = str.length();
            String strValueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(length + 1 + strValueOf.length());
            sb.append(str);
            sb.append("=");
            sb.append(strValueOf);
            this.f5614a.add(sb.toString());
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f5615b.getClass().getSimpleName());
            sb.append('{');
            List list = this.f5614a;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                sb.append((String) list.get(i3));
                if (i3 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean a(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == bundle2;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> setKeySet = bundle.keySet();
        if (!setKeySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            if (!b(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int c(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a d(Object obj) {
        return new a(obj, null);
    }
}
