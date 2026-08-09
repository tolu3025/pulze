package com.google.android.gms.internal.fido;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
final class zzca {
    public static boolean zza(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = zzbp.zza;
            }
        } else {
            if (!(iterable instanceof zzbz)) {
                return false;
            }
            comparator2 = ((zzbz) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
