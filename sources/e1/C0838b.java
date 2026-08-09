package e1;

/* JADX INFO: renamed from: e1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0838b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f7101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final boolean f7102g;

    public C0838b(String str, String str2, String str3, String str4, String str5, String str6, boolean z2) {
        this.f7096a = str == null ? "libapp.so" : str;
        this.f7097b = str2 == null ? "vm_snapshot_data" : str2;
        this.f7098c = str3 == null ? "isolate_snapshot_data" : str3;
        this.f7099d = str4 == null ? "flutter_assets" : str4;
        this.f7101f = str6;
        this.f7100e = str5 == null ? "" : str5;
        this.f7102g = z2;
    }
}
