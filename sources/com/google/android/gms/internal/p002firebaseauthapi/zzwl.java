package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* JADX INFO: loaded from: classes.dex */
public final class zzwl extends zzalf<zzwl, zza> implements zzamo {
    private static final zzwl zzc;
    private static volatile zzamv<zzwl> zzd;
    private int zze;
    private zzwo zzf;

    public static final class zza extends zzalf.zzb<zzwl, zza> implements zzamo {
        private zza() {
            super(zzwl.zzc);
        }

        public final zza zza(zzwo zzwoVar) {
            zzg();
            zzwl.zza((zzwl) this.zza, zzwoVar);
            return this;
        }
    }

    static {
        zzwl zzwlVar = new zzwl();
        zzc = zzwlVar;
        zzalf.zza((Class<zzwl>) zzwl.class, zzwlVar);
    }

    private zzwl() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public final zzwo zzc() {
        zzwo zzwoVar = this.zzf;
        return zzwoVar == null ? zzwo.zzf() : zzwoVar;
    }

    public static zzwl zza(zzajv zzajvVar, zzaku zzakuVar) {
        return (zzwl) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    protected final Object zza(int i3, Object obj, Object obj2) {
        switch (zzwn.zza[i3 - 1]) {
            case 1:
                return new zzwl();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzwl> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zzwl.class) {
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

    static /* synthetic */ void zza(zzwl zzwlVar, zzwo zzwoVar) {
        zzwoVar.getClass();
        zzwlVar.zzf = zzwoVar;
        zzwlVar.zze |= 1;
    }
}
