package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class zzdu extends zzdq implements RandomAccess, zzey, zzgd {
    private static final zzdu zza;
    private boolean[] zzb;
    private int zzc;

    static {
        zzdu zzduVar = new zzdu(new boolean[0], 0);
        zza = zzduVar;
        zzduVar.zzb();
    }

    zzdu() {
        this(new boolean[10], 0);
    }

    private final String zzf(int i3) {
        return "Index:" + i3 + ", Size:" + this.zzc;
    }

    private final void zzg(int i3) {
        if (i3 < 0 || i3 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i3));
        }
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i3, Object obj) {
        int i4;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i3 < 0 || i3 > (i4 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i3));
        }
        boolean[] zArr = this.zzb;
        if (i4 < zArr.length) {
            System.arraycopy(zArr, i3, zArr, i3 + 1, i4 - i3);
        } else {
            boolean[] zArr2 = new boolean[((i4 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i3);
            System.arraycopy(this.zzb, i3, zArr2, i3 + 1, this.zzc - i3);
            this.zzb = zArr2;
        }
        this.zzb[i3] = zBooleanValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        zzez.zze(collection);
        if (!(collection instanceof zzdu)) {
            return super.addAll(collection);
        }
        zzdu zzduVar = (zzdu) collection;
        int i3 = zzduVar.zzc;
        if (i3 == 0) {
            return false;
        }
        int i4 = this.zzc;
        if (a.e.API_PRIORITY_OTHER - i4 < i3) {
            throw new OutOfMemoryError();
        }
        int i5 = i4 + i3;
        boolean[] zArr = this.zzb;
        if (i5 > zArr.length) {
            this.zzb = Arrays.copyOf(zArr, i5);
        }
        System.arraycopy(zzduVar.zzb, 0, this.zzb, this.zzc, zzduVar.zzc);
        this.zzc = i5;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdu)) {
            return super.equals(obj);
        }
        zzdu zzduVar = (zzdu) obj;
        if (this.zzc != zzduVar.zzc) {
            return false;
        }
        boolean[] zArr = zzduVar.zzb;
        for (int i3 = 0; i3 < this.zzc; i3++) {
            if (this.zzb[i3] != zArr[i3]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i3) {
        zzg(i3);
        return Boolean.valueOf(this.zzb[i3]);
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i3 = 0; i3 < this.zzc; i3++) {
            iZza = (iZza * 31) + zzez.zza(this.zzb[i3]);
        }
        return iZza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i3 = this.zzc;
        for (int i4 = 0; i4 < i3; i4++) {
            if (this.zzb[i4] == zBooleanValue) {
                return i4;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i3) {
        zza();
        zzg(i3);
        boolean[] zArr = this.zzb;
        boolean z2 = zArr[i3];
        if (i3 < this.zzc - 1) {
            System.arraycopy(zArr, i3 + 1, zArr, i3, (r2 - i3) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z2);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i3, int i4) {
        zza();
        if (i4 < i3) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzb;
        System.arraycopy(zArr, i4, zArr, i3, this.zzc - i4);
        this.zzc -= i4 - i3;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i3, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        zzg(i3);
        boolean[] zArr = this.zzb;
        boolean z2 = zArr[i3];
        zArr[i3] = zBooleanValue;
        return Boolean.valueOf(z2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.auth.zzey
    public final /* bridge */ /* synthetic */ zzey zzd(int i3) {
        if (i3 >= this.zzc) {
            return new zzdu(Arrays.copyOf(this.zzb, i3), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(boolean z2) {
        zza();
        int i3 = this.zzc;
        boolean[] zArr = this.zzb;
        if (i3 == zArr.length) {
            boolean[] zArr2 = new boolean[((i3 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i3);
            this.zzb = zArr2;
        }
        boolean[] zArr3 = this.zzb;
        int i4 = this.zzc;
        this.zzc = i4 + 1;
        zArr3[i4] = z2;
    }

    private zzdu(boolean[] zArr, int i3) {
        this.zzb = zArr;
        this.zzc = i3;
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Boolean) obj).booleanValue());
        return true;
    }
}
