package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzsp extends zznd implements zzoj {
    private static final zzsp zzb;
    private static volatile zzoq zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private zzsi zzm;

    static {
        zzsp zzspVar = new zzsp();
        zzb = zzspVar;
        zznd.zzI(zzsp.class, zzspVar);
    }

    private zzsp() {
    }

    static /* synthetic */ void zzM(zzsp zzspVar, String str) {
        str.getClass();
        zzspVar.zze |= 4;
        zzspVar.zzh = str;
    }

    public static zzso zzf() {
        return (zzso) zzb.zzq();
    }

    static /* synthetic */ void zzi(zzsp zzspVar, String str) {
        str.getClass();
        zzspVar.zze |= 8;
        zzspVar.zzi = str;
    }

    static /* synthetic */ void zzj(zzsp zzspVar, String str) {
        str.getClass();
        zzspVar.zze |= 2;
        zzspVar.zzg = str;
    }

    static /* synthetic */ void zzk(zzsp zzspVar, String str) {
        str.getClass();
        zzspVar.zze |= 1;
        zzspVar.zzf = str;
    }

    static /* synthetic */ void zzl(zzsp zzspVar, zzsi zzsiVar) {
        zzsiVar.getClass();
        zzspVar.zzm = zzsiVar;
        zzspVar.zze |= 128;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    protected final Object zzh(int i3, Object obj, Object obj2) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return zznd.zzF(zzb, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bဉ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i4 == 3) {
            return new zzsp();
        }
        zzsu zzsuVar = null;
        if (i4 == 4) {
            return new zzso(zzsuVar);
        }
        if (i4 == 5) {
            return zzb;
        }
        if (i4 != 6) {
            return null;
        }
        zzoq zzmyVar = zzd;
        if (zzmyVar == null) {
            synchronized (zzsp.class) {
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
