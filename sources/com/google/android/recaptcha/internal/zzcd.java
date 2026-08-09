package com.google.android.recaptcha.internal;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class zzcd {
    public zzcd(Context context) {
    }

    public static final byte[] zza(File file) {
        return S1.f.a(file);
    }

    public static final void zzb(File file, byte[] bArr) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException("Unable to delete existing encrypted file");
        }
        S1.f.b(file, bArr);
    }
}
