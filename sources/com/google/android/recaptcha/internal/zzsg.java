package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzsg extends zznd implements zzoj {
    private static final zzsg zzb;
    private static volatile zzoq zzd;
    private int zze;
    private String zzf = "";

    static {
        zzsg zzsgVar = new zzsg();
        zzb = zzsgVar;
        zznd.zzI(zzsg.class, zzsgVar);
    }

    private zzsg() {
    }

    public static zzsf zzf() {
        return (zzsf) zzb.zzq();
    }

    static /* synthetic */ void zzi(zzsg zzsgVar, String str) {
        zzsgVar.zze |= 1;
        zzsgVar.zzf = str;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    protected final Object zzh(int i3, Object obj, Object obj2) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return zznd.zzF(zzb, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zze", "zzf"});
        }
        if (i4 == 3) {
            return new zzsg();
        }
        zzsn zzsnVar = null;
        if (i4 == 4) {
            return new zzsf(zzsnVar);
        }
        if (i4 == 5) {
            return zzb;
        }
        if (i4 != 6) {
            return null;
        }
        zzoq zzmyVar = zzd;
        if (zzmyVar == null) {
            synchronized (zzsg.class) {
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
