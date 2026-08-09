package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* JADX INFO: loaded from: classes.dex */
public final class zztr extends zzalf<zztr, zza> implements zzamo {
    private static final zztr zzc;
    private static volatile zzamv<zztr> zzd;
    private int zze;

    public static final class zza extends zzalf.zzb<zztr, zza> implements zzamo {
        private zza() {
            super(zztr.zzc);
        }

        public final zza zza(int i3) {
            zzg();
            ((zztr) this.zza).zze = i3;
            return this;
        }
    }

    static {
        zztr zztrVar = new zztr();
        zzc = zztrVar;
        zzalf.zza((Class<zztr>) zztr.class, zztrVar);
    }

    private zztr() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zztr zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    protected final Object zza(int i3, Object obj, Object obj2) {
        switch (zztt.zza[i3 - 1]) {
            case 1:
                return new zztr();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzamv<zztr> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zztr.class) {
                        try {
                            zzaVar = zzd;
                            if (zzaVar == null) {
                                zzaVar = new zzalf.zza<>(zzc);
                                zzd = zzaVar;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return zzaVar;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }
}
