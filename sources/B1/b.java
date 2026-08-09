package B1;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final B1.a[] f659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f662h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String[] f664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f666d;

    /* JADX INFO: renamed from: B1.b$b, reason: collision with other inner class name */
    public static final class C0003b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String[] f668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String[] f669c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f670d;

        public C0003b(b bVar) {
            this.f667a = bVar.f663a;
            this.f668b = bVar.f664b;
            this.f669c = bVar.f665c;
            this.f670d = bVar.f666d;
        }

        public b e() {
            return new b(this);
        }

        public C0003b f(B1.a... aVarArr) {
            if (!this.f667a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[aVarArr.length];
            for (int i3 = 0; i3 < aVarArr.length; i3++) {
                strArr[i3] = aVarArr[i3].f658a;
            }
            this.f668b = strArr;
            return this;
        }

        public C0003b g(String... strArr) {
            if (!this.f667a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (strArr == null) {
                this.f668b = null;
            } else {
                this.f668b = (String[]) strArr.clone();
            }
            return this;
        }

        public C0003b h(boolean z2) {
            if (!this.f667a) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.f670d = z2;
            return this;
        }

        public C0003b i(k... kVarArr) {
            if (!this.f667a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (kVarArr.length == 0) {
                throw new IllegalArgumentException("At least one TlsVersion is required");
            }
            String[] strArr = new String[kVarArr.length];
            for (int i3 = 0; i3 < kVarArr.length; i3++) {
                strArr[i3] = kVarArr[i3].f725a;
            }
            this.f669c = strArr;
            return this;
        }

        public C0003b j(String... strArr) {
            if (!this.f667a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr == null) {
                this.f669c = null;
            } else {
                this.f669c = (String[]) strArr.clone();
            }
            return this;
        }

        public C0003b(boolean z2) {
            this.f667a = z2;
        }
    }

    static {
        B1.a[] aVarArr = {B1.a.TLS_AES_128_GCM_SHA256, B1.a.TLS_AES_256_GCM_SHA384, B1.a.TLS_CHACHA20_POLY1305_SHA256, B1.a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, B1.a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, B1.a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, B1.a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, B1.a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, B1.a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, B1.a.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, B1.a.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, B1.a.TLS_RSA_WITH_AES_128_GCM_SHA256, B1.a.TLS_RSA_WITH_AES_256_GCM_SHA384, B1.a.TLS_RSA_WITH_AES_128_CBC_SHA, B1.a.TLS_RSA_WITH_AES_256_CBC_SHA, B1.a.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f659e = aVarArr;
        C0003b c0003bF = new C0003b(true).f(aVarArr);
        k kVar = k.TLS_1_3;
        k kVar2 = k.TLS_1_2;
        b bVarE = c0003bF.i(kVar, kVar2).h(true).e();
        f660f = bVarE;
        f661g = new C0003b(bVarE).i(kVar, kVar2, k.TLS_1_1, k.TLS_1_0).h(true).e();
        f662h = new C0003b(false).e();
    }

    private b(C0003b c0003b) {
        this.f663a = c0003b.f667a;
        this.f664b = c0003b.f668b;
        this.f665c = c0003b.f669c;
        this.f666d = c0003b.f670d;
    }

    private b e(SSLSocket sSLSocket, boolean z2) {
        String[] enabledCipherSuites;
        if (this.f664b != null) {
            enabledCipherSuites = (String[]) l.c(String.class, this.f664b, sSLSocket.getEnabledCipherSuites());
        } else {
            enabledCipherSuites = null;
        }
        if (z2 && Arrays.asList(sSLSocket.getSupportedCipherSuites()).contains("TLS_FALLBACK_SCSV")) {
            if (enabledCipherSuites == null) {
                enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            }
            int length = enabledCipherSuites.length;
            String[] strArr = new String[length + 1];
            System.arraycopy(enabledCipherSuites, 0, strArr, 0, enabledCipherSuites.length);
            strArr[length] = "TLS_FALLBACK_SCSV";
            enabledCipherSuites = strArr;
        }
        return new C0003b(this).g(enabledCipherSuites).j((String[]) l.c(String.class, this.f665c, sSLSocket.getEnabledProtocols())).e();
    }

    public void c(SSLSocket sSLSocket, boolean z2) {
        b bVarE = e(sSLSocket, z2);
        sSLSocket.setEnabledProtocols(bVarE.f665c);
        String[] strArr = bVarE.f664b;
        if (strArr != null) {
            sSLSocket.setEnabledCipherSuites(strArr);
        }
    }

    public List d() {
        String[] strArr = this.f664b;
        if (strArr == null) {
            return null;
        }
        B1.a[] aVarArr = new B1.a[strArr.length];
        int i3 = 0;
        while (true) {
            String[] strArr2 = this.f664b;
            if (i3 >= strArr2.length) {
                return l.a(aVarArr);
            }
            aVarArr[i3] = B1.a.c(strArr2[i3]);
            i3++;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        b bVar = (b) obj;
        boolean z2 = this.f663a;
        if (z2 != bVar.f663a) {
            return false;
        }
        return !z2 || (Arrays.equals(this.f664b, bVar.f664b) && Arrays.equals(this.f665c, bVar.f665c) && this.f666d == bVar.f666d);
    }

    public boolean f() {
        return this.f666d;
    }

    public List g() {
        k[] kVarArr = new k[this.f665c.length];
        int i3 = 0;
        while (true) {
            String[] strArr = this.f665c;
            if (i3 >= strArr.length) {
                return l.a(kVarArr);
            }
            kVarArr[i3] = k.c(strArr[i3]);
            i3++;
        }
    }

    public int hashCode() {
        if (this.f663a) {
            return ((((527 + Arrays.hashCode(this.f664b)) * 31) + Arrays.hashCode(this.f665c)) * 31) + (!this.f666d ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f663a) {
            return "ConnectionSpec()";
        }
        List listD = d();
        return "ConnectionSpec(cipherSuites=" + (listD == null ? "[use default]" : listD.toString()) + ", tlsVersions=" + g() + ", supportsTlsExtensions=" + this.f666d + ")";
    }
}
