package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzrr extends zznd implements zzoj {
    private static final zzrr zzb;
    private static volatile zzoq zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private zzml zzj;
    private zzpj zzk;
    private int zzl;
    private zzqz zzm;
    private String zzh = "";
    private String zzi = "";
    private zznk zzn = zznd.zzB();

    static {
        zzrr zzrrVar = new zzrr();
        zzb = zzrrVar;
        zznd.zzI(zzrr.class, zzrrVar);
    }

    private zzrr() {
    }

    public static zzrr zzg() {
        return zzb;
    }

    public static zzrr zzi(byte[] bArr) {
        return (zzrr) zznd.zzx(zzb, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zznd
    protected final Object zzh(int i3, Object obj, Object obj2) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return zznd.zzF(zzb, "\u0000\t\u0000\u0001\u0001\u000b\t\u0000\u0001\u0000\u0001\u0004\u0003ဉ\u0000\u0004ဉ\u0001\u0005\f\u0007\u001b\b\f\tȈ\nȈ\u000bဉ\u0002", new Object[]{"zze", "zzf", "zzj", "zzk", "zzl", "zzn", zzri.class, "zzg", "zzh", "zzi", "zzm"});
        }
        if (i4 == 3) {
            return new zzrr();
        }
        zzrq zzrqVar = null;
        if (i4 == 4) {
            return new zzrp(zzrqVar);
        }
        if (i4 == 5) {
            return zzb;
        }
        if (i4 != 6) {
            return null;
        }
        zzoq zzmyVar = zzd;
        if (zzmyVar == null) {
            synchronized (zzrr.class) {
                try {
                    zzmyVar = zzd;
                    if (zzmyVar == null) {
                        zzmyVar = new zzmy(zzb);
                        zzd = zzmyVar;
                    }
                } finally {
                }
            }
        }
        return zzmyVar;
    }
}
