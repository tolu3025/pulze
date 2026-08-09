package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class zzpe {
    public static final zzaaj zza = zzaaj.zza(new byte[0]);

    public static final zzaaj zza(int i3) {
        return zzaaj.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(i3).array());
    }

    public static final zzaaj zzb(int i3) {
        return zzaaj.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(i3).array());
    }
}
