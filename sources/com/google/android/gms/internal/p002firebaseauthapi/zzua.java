package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* JADX INFO: loaded from: classes.dex */
public final class zzua extends zzalf<zzua, zza> implements zzamo {
    private static final zzua zzc;
    private static volatile zzamv<zzua> zzd;
    private int zze;

    public static final class zza extends zzalf.zzb<zzua, zza> implements zzamo {
        private zza() {
            super(zzua.zzc);
        }

        public final zza zza(int i3) {
            zzg();
            ((zzua) this.zza).zze = i3;
            return this;
        }
    }

    static {
        zzua zzuaVar = new zzua();
        zzc = zzuaVar;
        zzalf.zza((Class<zzua>) zzua.class, zzuaVar);
    }

    private zzua() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzua zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    protected final Object zza(int i3, Object obj, Object obj2) {
        switch (zzuc.zza[i3 - 1]) {
            case 1:
                return new zzua();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzua> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zzua.class) {
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
