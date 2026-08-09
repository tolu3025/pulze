package M;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.common.internal.s0;
import com.google.android.gms.common.internal.t0;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
abstract class E extends s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f2641a;

    protected E(byte[] bArr) {
        AbstractC0643s.a(bArr.length == 25);
        this.f2641a = Arrays.hashCode(bArr);
    }

    protected static byte[] b(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e3) {
            throw new AssertionError(e3);
        }
    }

    abstract byte[] a();

    public final boolean equals(Object obj) {
        U.a aVarZzd;
        if (!(obj instanceof t0)) {
            return false;
        }
        try {
            t0 t0Var = (t0) obj;
            if (t0Var.zze() == this.f2641a && (aVarZzd = t0Var.zzd()) != null) {
                return Arrays.equals(a(), (byte[]) U.b.b(aVarZzd));
            }
            return false;
        } catch (RemoteException e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            return false;
        }
    }

    public final int hashCode() {
        return this.f2641a;
    }

    @Override // com.google.android.gms.common.internal.t0
    public final U.a zzd() {
        return U.b.f(a());
    }

    @Override // com.google.android.gms.common.internal.t0
    public final int zze() {
        return this.f2641a;
    }
}
