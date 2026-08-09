package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* JADX INFO: loaded from: classes.dex */
public final class zzwe extends zzalf<zzwe, zza> implements zzamo {
    private static final zzwe zzc;
    private static volatile zzamv<zzwe> zzd;
    private int zze;
    private zzwh zzf;
    private int zzg;
    private int zzh;

    public static final class zza extends zzalf.zzb<zzwe, zza> implements zzamo {
        private zza() {
            super(zzwe.zzc);
        }

        public final zza zza(int i3) {
            zzg();
            ((zzwe) this.zza).zzg = i3;
            return this;
        }

        public final zza zza(zzwh zzwhVar) {
            zzg();
            zzwe.zza((zzwe) this.zza, zzwhVar);
            return this;
        }
    }

    static {
        zzwe zzweVar = new zzwe();
        zzc = zzweVar;
        zzalf.zza((Class<zzwe>) zzwe.class, zzweVar);
    }

    private zzwe() {
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public static zzwe zze() {
        return zzc;
    }

    public final int zza() {
        return this.zzg;
    }

    public final int zzb() {
        return this.zzh;
    }

    public final zzwh zzf() {
        zzwh zzwhVar = this.zzf;
        return zzwhVar == null ? zzwh.zze() : zzwhVar;
    }

    public static zzwe zza(zzajv zzajvVar, zzaku zzakuVar) {
        return (zzwe) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    protected final Object zza(int i3, Object obj, Object obj2) {
        switch (zzwd.zza[i3 - 1]) {
            case 1:
                return new zzwe();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzwe> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zzwe.class) {
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

    static /* synthetic */ void zza(zzwe zzweVar, zzwh zzwhVar) {
        zzwhVar.getClass();
        zzweVar.zzf = zzwhVar;
        zzweVar.zze |= 1;
    }
}
