package q0;

/* JADX INFO: loaded from: classes.dex */
final class v0 extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f10791c;

    private v0(String str, String str2, String str3) {
        this.f10789a = str;
        this.f10790b = str2;
        this.f10791c = str3;
    }

    @Override // q0.r0
    public final String b() {
        return this.f10790b;
    }

    @Override // q0.r0
    public final String c() {
        return this.f10791c;
    }

    @Override // q0.r0
    public final String d() {
        return this.f10789a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r0) {
            r0 r0Var = (r0) obj;
            String str = this.f10789a;
            if (str != null ? str.equals(r0Var.d()) : r0Var.d() == null) {
                String str2 = this.f10790b;
                if (str2 != null ? str2.equals(r0Var.b()) : r0Var.b() == null) {
                    String str3 = this.f10791c;
                    String strC = r0Var.c();
                    if (str3 != null ? str3.equals(strC) : strC == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f10789a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f10790b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f10791c;
        return iHashCode2 ^ (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "AttestationResult{recaptchaV2Token=" + this.f10789a + ", playIntegrityToken=" + this.f10790b + ", recaptchaEnterpriseToken=" + this.f10791c + "}";
    }
}
