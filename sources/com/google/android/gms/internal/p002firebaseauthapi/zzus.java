package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* JADX INFO: loaded from: classes.dex */
public final class zzus extends zzalf<zzus, zza> implements zzamo {
    private static final zzus zzc;
    private static volatile zzamv<zzus> zzd;
    private int zze;
    private int zzf;

    public static final class zza extends zzalf.zzb<zzus, zza> implements zzamo {
        private zza() {
            super(zzus.zzc);
        }

        public final zza zza(int i3) {
            zzg();
            ((zzus) this.zza).zze = i3;
            return this;
        }
    }

    static {
        zzus zzusVar = new zzus();
        zzc = zzusVar;
        zzalf.zza((Class<zzus>) zzus.class, zzusVar);
    }

    private zzus() {
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzf;
    }

    public static zzus zza(zzajv zzajvVar, zzaku zzakuVar) {
        return (zzus) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    protected final Object zza(int i3, Object obj, Object obj2) {
        switch (zzuu.zza[i3 - 1]) {
            case 1:
                return new zzus();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzus> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zzus.class) {
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
