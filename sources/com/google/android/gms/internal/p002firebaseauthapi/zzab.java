package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
abstract class zzab<E> extends zzax<E> {
    private final int zza;
    private int zzb;

    protected zzab(int i3, int i4) {
        zzu.zzb(i4, i3);
        this.zza = i3;
        this.zzb = i4;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.zzb < this.zza;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zzb > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = this.zzb;
        this.zzb = i3 + 1;
        return zza(i3);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zzb;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i3 = this.zzb - 1;
        this.zzb = i3;
        return zza(i3);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zzb - 1;
    }

    protected abstract E zza(int i3);
}
