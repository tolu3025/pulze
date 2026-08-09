package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
public enum zzxc implements zzalk {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);

    private final int zzg;

    zzxc(int i3) {
        this.zzg = i3;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(zzxc.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb.append(" number=");
            sb.append(zza());
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalk
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzg;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static zzxc zza(int i3) {
        if (i3 == 0) {
            return UNKNOWN_STATUS;
        }
        if (i3 == 1) {
            return ENABLED;
        }
        if (i3 == 2) {
            return DISABLED;
        }
        if (i3 != 3) {
            return null;
        }
        return DESTROYED;
    }
}
