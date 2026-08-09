package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0507v extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private J f4285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f4286b;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v$a */
    public static class a extends C0507v {
        public a(String str) {
            super(str);
        }
    }

    public C0507v(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f4285a = null;
    }

    static C0507v b() {
        return new C0507v("Protocol message end-group tag did not match expected tag.");
    }

    static C0507v c() {
        return new C0507v("Protocol message contained an invalid tag (zero).");
    }

    static C0507v d() {
        return new C0507v("Protocol message had invalid UTF-8.");
    }

    static a e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    static C0507v f() {
        return new C0507v("CodedInputStream encountered a malformed varint.");
    }

    static C0507v g() {
        return new C0507v("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static C0507v h() {
        return new C0507v("Failed to parse the message.");
    }

    static C0507v i() {
        return new C0507v("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    static C0507v l() {
        return new C0507v("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static C0507v m() {
        return new C0507v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    boolean a() {
        return this.f4286b;
    }

    void j() {
        this.f4286b = true;
    }

    public C0507v k(J j3) {
        this.f4285a = j3;
        return this;
    }

    public C0507v(String str) {
        super(str);
        this.f4285a = null;
    }
}
