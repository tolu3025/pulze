package com.google.android.recaptcha.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzln extends zzkw {
    private static final Logger zzb = Logger.getLogger(zzln.class.getName());
    private static final boolean zzc = zzps.zzx();
    zzlo zza;

    private zzln() {
        throw null;
    }

    public static int zzA(int i3) {
        return (352 - (Integer.numberOfLeadingZeros(i3) * 9)) >>> 6;
    }

    public static int zzB(long j3) {
        return (640 - (Long.numberOfLeadingZeros(j3) * 9)) >>> 6;
    }

    @Deprecated
    static int zzw(int i3, zzoi zzoiVar, zzow zzowVar) {
        int iZzA = zzA(i3 << 3);
        return iZzA + iZzA + ((zzko) zzoiVar).zza(zzowVar);
    }

    public static int zzx(zzoi zzoiVar) {
        int iZzo = zzoiVar.zzo();
        return zzA(iZzo) + iZzo;
    }

    static int zzy(zzoi zzoiVar, zzow zzowVar) {
        int iZza = ((zzko) zzoiVar).zza(zzowVar);
        return zzA(iZza) + iZza;
    }

    public static int zzz(String str) {
        int length;
        try {
            length = zzpv.zzc(str);
        } catch (zzpu unused) {
            length = str.getBytes(zznl.zza).length;
        }
        return zzA(length) + length;
    }

    public final void zzC() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void zzD(String str, zzpu zzpuVar) throws zzll {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzpuVar);
        byte[] bytes = str.getBytes(zznl.zza);
        try {
            int length = bytes.length;
            zzt(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e3) {
            throw new zzll(e3);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b3);

    public abstract void zzd(int i3, boolean z2);

    public abstract void zze(int i3, zzle zzleVar);

    public abstract void zzf(int i3, int i4);

    public abstract void zzg(int i3);

    public abstract void zzh(int i3, long j3);

    public abstract void zzi(long j3);

    public abstract void zzj(int i3, int i4);

    public abstract void zzk(int i3);

    public abstract void zzl(byte[] bArr, int i3, int i4);

    abstract void zzm(int i3, zzoi zzoiVar, zzow zzowVar);

    public abstract void zzn(int i3, zzoi zzoiVar);

    public abstract void zzo(int i3, zzle zzleVar);

    public abstract void zzp(int i3, String str);

    public abstract void zzr(int i3, int i4);

    public abstract void zzs(int i3, int i4);

    public abstract void zzt(int i3);

    public abstract void zzu(int i3, long j3);

    public abstract void zzv(long j3);

    /* synthetic */ zzln(zzlm zzlmVar) {
    }
}
