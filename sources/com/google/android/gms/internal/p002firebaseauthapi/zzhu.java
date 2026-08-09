package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes.dex */
abstract class zzhu {
    int[] zza;
    private final int zzb;

    public zzhu(byte[] bArr, int i3) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = zzhp.zza(bArr);
        this.zzb = i3;
    }

    abstract int zza();

    final ByteBuffer zza(byte[] bArr, int i3) {
        int[] iArrZza = zza(zzhp.zza(bArr), i3);
        int[] iArr = (int[]) iArrZza.clone();
        zzhp.zza(iArr);
        for (int i4 = 0; i4 < iArrZza.length; i4++) {
            iArrZza[i4] = iArrZza[i4] + iArr[i4];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrZza, 0, 16);
        return byteBufferOrder;
    }

    abstract int[] zza(int[] iArr, int i3);

    public void zza(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        zza(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
    }

    private final void zza(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != zza()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + zza());
        }
        int iRemaining = byteBuffer2.remaining();
        int i3 = iRemaining / 64;
        int i4 = i3 + 1;
        for (int i5 = 0; i5 < i4; i5++) {
            ByteBuffer byteBufferZza = zza(bArr, this.zzb + i5);
            int i6 = 64;
            if (i5 == i3) {
                i6 = iRemaining % 64;
            }
            zzyz.zza(byteBuffer, byteBuffer2, byteBufferZza, i6);
        }
    }

    public byte[] zza(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        zza(bArr, byteBufferAllocate, byteBuffer);
        return byteBufferAllocate.array();
    }
}
