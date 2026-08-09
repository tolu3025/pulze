package com.google.android.gms.internal.fido;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class zzbu extends zzbi {
    static final zzbu zzc;
    final transient zzaz zzd;

    static {
        int i3 = zzaz.zzd;
        zzc = new zzbu(zzbs.zza, zzbp.zza);
    }

    zzbu(zzaz zzazVar, Comparator comparator) {
        super(comparator);
        this.zzd = zzazVar;
    }

    @Override // com.google.android.gms.internal.fido.zzbi, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iZzt = zzt(obj, true);
        if (iZzt == this.zzd.size()) {
            return null;
        }
        return this.zzd.get(iZzt);
    }

    @Override // com.google.android.gms.internal.fido.zzav, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.zzd, obj, ((zzbi) this).zza) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof zzbo) {
            collection = ((zzbo) collection).zza();
        }
        if (!zzca.zza(((zzbi) this).zza, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        zzcc zzccVarListIterator = this.zzd.listIterator(0);
        Iterator it = collection.iterator();
        if (!zzccVarListIterator.hasNext()) {
            return false;
        }
        Object next = it.next();
        E next2 = zzccVarListIterator.next();
        while (true) {
            try {
                int iCompare = ((zzbi) this).zza.compare(next2, next);
                if (iCompare >= 0) {
                    if (iCompare != 0) {
                        break;
                    }
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else {
                    if (!zzccVarListIterator.hasNext()) {
                        return false;
                    }
                    next2 = zzccVarListIterator.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.fido.zzbc, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.zzd.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!zzca.zza(((zzbi) this).zza, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            zzcc zzccVarListIterator = this.zzd.listIterator(0);
            while (zzccVarListIterator.hasNext()) {
                E next = zzccVarListIterator.next();
                Object next2 = it.next();
                if (next2 == null || ((zzbi) this).zza.compare(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzbi, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.zzd.get(0);
    }

    @Override // com.google.android.gms.internal.fido.zzbi, java.util.NavigableSet
    public final Object floor(Object obj) {
        int iZzs = zzs(obj, true) - 1;
        if (iZzs == -1) {
            return null;
        }
        return this.zzd.get(iZzs);
    }

    @Override // com.google.android.gms.internal.fido.zzbi, java.util.NavigableSet
    public final Object higher(Object obj) {
        int iZzt = zzt(obj, false);
        if (iZzt == this.zzd.size()) {
            return null;
        }
        return this.zzd.get(iZzt);
    }

    @Override // com.google.android.gms.internal.fido.zzbi, com.google.android.gms.internal.fido.zzbc, com.google.android.gms.internal.fido.zzav, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzd.listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzbi, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.zzd.get(r0.size() - 1);
    }

    @Override // com.google.android.gms.internal.fido.zzbi, java.util.NavigableSet
    public final Object lower(Object obj) {
        int iZzs = zzs(obj, false) - 1;
        if (iZzs == -1) {
            return null;
        }
        return this.zzd.get(iZzs);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzd.size();
    }

    @Override // com.google.android.gms.internal.fido.zzav
    final int zza(Object[] objArr, int i3) {
        return this.zzd.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.fido.zzav
    final int zzb() {
        return this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.fido.zzav
    final int zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.fido.zzbi, com.google.android.gms.internal.fido.zzbc, com.google.android.gms.internal.fido.zzav
    /* JADX INFO: renamed from: zzd */
    public final zzcb iterator() {
        return this.zzd.listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzav
    final Object[] zze() {
        return this.zzd.zze();
    }

    @Override // com.google.android.gms.internal.fido.zzbi
    final zzbi zzf() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(((zzbi) this).zza);
        return isEmpty() ? zzbi.zzq(comparatorReverseOrder) : new zzbu(this.zzd.zzf(), comparatorReverseOrder);
    }

    @Override // com.google.android.gms.internal.fido.zzbc
    public final zzaz zzi() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.fido.zzbi
    final zzbi zzm(Object obj, boolean z2) {
        return zzu(0, zzs(obj, z2));
    }

    @Override // com.google.android.gms.internal.fido.zzbi
    final zzbi zzo(Object obj, boolean z2, Object obj2, boolean z3) {
        return zzp(obj, z2).zzm(obj2, z3);
    }

    @Override // com.google.android.gms.internal.fido.zzbi
    final zzbi zzp(Object obj, boolean z2) {
        return zzu(zzt(obj, z2), this.zzd.size());
    }

    @Override // com.google.android.gms.internal.fido.zzbi, java.util.NavigableSet
    /* JADX INFO: renamed from: zzr */
    public final zzcb descendingIterator() {
        return this.zzd.zzf().listIterator(0);
    }

    final int zzs(Object obj, boolean z2) {
        zzaz zzazVar = this.zzd;
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(zzazVar, obj, ((zzbi) this).zza);
        return iBinarySearch >= 0 ? z2 ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    final int zzt(Object obj, boolean z2) {
        zzaz zzazVar = this.zzd;
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(zzazVar, obj, ((zzbi) this).zza);
        return iBinarySearch >= 0 ? z2 ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    final zzbu zzu(int i3, int i4) {
        if (i3 == 0) {
            if (i4 == this.zzd.size()) {
                return this;
            }
            i3 = 0;
        }
        return i3 < i4 ? new zzbu(this.zzd.subList(i3, i4), ((zzbi) this).zza) : zzbi.zzq(((zzbi) this).zza);
    }
}
