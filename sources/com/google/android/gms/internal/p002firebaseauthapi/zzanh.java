package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzanh extends zzanm {
    private final /* synthetic */ zzang zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzanh(zzang zzangVar) {
        super(zzangVar);
        Objects.requireNonNull(zzangVar);
        this.zza = zzangVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzani(this.zza);
    }
}
