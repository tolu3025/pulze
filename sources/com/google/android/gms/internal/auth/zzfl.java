package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class zzfl extends zzdq implements RandomAccess, zzey, zzgd {
    private static final zzfl zza;
    private long[] zzb;
    private int zzc;

    static {
        zzfl zzflVar = new zzfl(new long[0], 0);
        zza = zzflVar;
        zzflVar.zzb();
    }

    zzfl() {
        this(new long[10], 0);
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
        long jLongValue = ((Long) obj).longValue();
        zza();
        if (i3 < 0 || i3 > (i4 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i3));
        }
        long[] jArr = this.zzb;
        if (i4 < jArr.length) {
            System.arraycopy(jArr, i3, jArr, i3 + 1, i4 - i3);
        } else {
            long[] jArr2 = new long[((i4 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i3);
            System.arraycopy(this.zzb, i3, jArr2, i3 + 1, this.zzc - i3);
            this.zzb = jArr2;
        }
        this.zzb[i3] = jLongValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        zzez.zze(collection);
        if (!(collection instanceof zzfl)) {
            return super.addAll(collection);
        }
        zzfl zzflVar = (zzfl) collection;
        int i3 = zzflVar.zzc;
        if (i3 == 0) {
            return false;
        }
        int i4 = this.zzc;
        if (a.e.API_PRIORITY_OTHER - i4 < i3) {
            throw new OutOfMemoryError();
        }
        int i5 = i4 + i3;
        long[] jArr = this.zzb;
        if (i5 > jArr.length) {
            this.zzb = Arrays.copyOf(jArr, i5);
        }
        System.arraycopy(zzflVar.zzb, 0, this.zzb, this.zzc, zzflVar.zzc);
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
        if (!(obj instanceof zzfl)) {
            return super.equals(obj);
        }
        zzfl zzflVar = (zzfl) obj;
        if (this.zzc != zzflVar.zzc) {
            return false;
        }
        long[] jArr = zzflVar.zzb;
        for (int i3 = 0; i3 < this.zzc; i3++) {
            if (this.zzb[i3] != jArr[i3]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i3) {
        zzg(i3);
        return Long.valueOf(this.zzb[i3]);
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZzc = 1;
        for (int i3 = 0; i3 < this.zzc; i3++) {
            iZzc = (iZzc * 31) + zzez.zzc(this.zzb[i3]);
        }
        return iZzc;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i3 = this.zzc;
        for (int i4 = 0; i4 < i3; i4++) {
            if (this.zzb[i4] == jLongValue) {
                return i4;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i3) {
        zza();
        zzg(i3);
        long[] jArr = this.zzb;
        long j3 = jArr[i3];
        if (i3 < this.zzc - 1) {
            System.arraycopy(jArr, i3 + 1, jArr, i3, (r3 - i3) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j3);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i3, int i4) {
        zza();
        if (i4 < i3) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zzb;
        System.arraycopy(jArr, i4, jArr, i3, this.zzc - i4);
        this.zzc -= i4 - i3;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i3, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        zza();
        zzg(i3);
        long[] jArr = this.zzb;
        long j3 = jArr[i3];
        jArr[i3] = jLongValue;
        return Long.valueOf(j3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.auth.zzey
    public final /* bridge */ /* synthetic */ zzey zzd(int i3) {
        if (i3 >= this.zzc) {
            return new zzfl(Arrays.copyOf(this.zzb, i3), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(long j3) {
        zza();
        int i3 = this.zzc;
        long[] jArr = this.zzb;
        if (i3 == jArr.length) {
            long[] jArr2 = new long[((i3 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i3);
            this.zzb = jArr2;
        }
        long[] jArr3 = this.zzb;
        int i4 = this.zzc;
        this.zzc = i4 + 1;
        jArr3[i4] = j3;
    }

    private zzfl(long[] jArr, int i3) {
        this.zzb = jArr;
        this.zzc = i3;
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Long) obj).longValue());
        return true;
    }
}
