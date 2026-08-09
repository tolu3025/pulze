package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* JADX INFO: loaded from: classes.dex */
public final class zzum extends zzalf<zzum, zza> implements zzamo {
    private static final zzum zzc;
    private static volatile zzamv<zzum> zzd;
    private int zze;
    private int zzf;

    public static final class zza extends zzalf.zzb<zzum, zza> implements zzamo {
        private zza() {
            super(zzum.zzc);
        }

        public final zza zza(int i3) {
            zzg();
            ((zzum) this.zza).zze = i3;
            return this;
        }
    }

    static {
        zzum zzumVar = new zzum();
        zzc = zzumVar;
        zzalf.zza((Class<zzum>) zzum.class, zzumVar);
    }

    private zzum() {
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

    public static zzum zza(zzajv zzajvVar, zzaku zzakuVar) {
        return (zzum) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    protected final Object zza(int i3, Object obj, Object obj2) {
        switch (zzuo.zza[i3 - 1]) {
            case 1:
                return new zzum();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzum> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zzum.class) {
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
