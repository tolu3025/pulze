package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zzav {
    static int zza(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i3 = ~(~(i3 + (next != null ? next.hashCode() : 0)));
        }
        return i3;
    }

    static boolean zza(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
