package k0;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.common.internal.C0646v;

/* JADX INFO: renamed from: k0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1001o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f9469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f9470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f9471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f9472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f9473g;

    /* JADX INFO: renamed from: k0.o$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f9474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f9475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f9476c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f9477d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f9478e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f9479f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f9480g;

        public C1001o a() {
            return new C1001o(this.f9475b, this.f9474a, this.f9476c, this.f9477d, this.f9478e, this.f9479f, this.f9480g);
        }

        public b b(String str) {
            this.f9474a = AbstractC0643s.f(str, "ApiKey must be set.");
            return this;
        }

        public b c(String str) {
            this.f9475b = AbstractC0643s.f(str, "ApplicationId must be set.");
            return this;
        }

        public b d(String str) {
            this.f9476c = str;
            return this;
        }

        public b e(String str) {
            this.f9477d = str;
            return this;
        }

        public b f(String str) {
            this.f9478e = str;
            return this;
        }

        public b g(String str) {
            this.f9480g = str;
            return this;
        }

        public b h(String str) {
            this.f9479f = str;
            return this;
        }
    }

    private C1001o(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC0643s.n(!com.google.android.gms.common.util.p.b(str), "ApplicationId must be set.");
        this.f9468b = str;
        this.f9467a = str2;
        this.f9469c = str3;
        this.f9470d = str4;
        this.f9471e = str5;
        this.f9472f = str6;
        this.f9473g = str7;
    }

    public static C1001o a(Context context) {
        C0646v c0646v = new C0646v(context);
        String strA = c0646v.a("google_app_id");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new C1001o(strA, c0646v.a("google_api_key"), c0646v.a("firebase_database_url"), c0646v.a("ga_trackingId"), c0646v.a("gcm_defaultSenderId"), c0646v.a("google_storage_bucket"), c0646v.a("project_id"));
    }

    public String b() {
        return this.f9467a;
    }

    public String c() {
        return this.f9468b;
    }

    public String d() {
        return this.f9469c;
    }

    public String e() {
        return this.f9470d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1001o)) {
            return false;
        }
        C1001o c1001o = (C1001o) obj;
        return AbstractC0642q.b(this.f9468b, c1001o.f9468b) && AbstractC0642q.b(this.f9467a, c1001o.f9467a) && AbstractC0642q.b(this.f9469c, c1001o.f9469c) && AbstractC0642q.b(this.f9470d, c1001o.f9470d) && AbstractC0642q.b(this.f9471e, c1001o.f9471e) && AbstractC0642q.b(this.f9472f, c1001o.f9472f) && AbstractC0642q.b(this.f9473g, c1001o.f9473g);
    }

    public String f() {
        return this.f9471e;
    }

    public String g() {
        return this.f9473g;
    }

    public String h() {
        return this.f9472f;
    }

    public int hashCode() {
        return AbstractC0642q.c(this.f9468b, this.f9467a, this.f9469c, this.f9470d, this.f9471e, this.f9472f, this.f9473g);
    }

    public String toString() {
        return AbstractC0642q.d(this).a("applicationId", this.f9468b).a("apiKey", this.f9467a).a("databaseUrl", this.f9469c).a("gcmSenderId", this.f9471e).a("storageBucket", this.f9472f).a("projectId", this.f9473g).toString();
    }
}
