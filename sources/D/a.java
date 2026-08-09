package D;

import K.h;
import android.os.Bundle;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.internal.p000authapi.zbl;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.google.android.gms.common.api.a f1224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.google.android.gms.common.api.a f1225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.google.android.gms.common.api.a f1226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final I.a f1227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final F.a f1228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final J.a f1229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a.g f1230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a.g f1231h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a.AbstractC0106a f1232i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final a.AbstractC0106a f1233j;

    /* JADX INFO: renamed from: D.a$a, reason: collision with other inner class name */
    public static class C0005a implements a.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0005a f1234d = new C0005a(new C0006a());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f1235a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f1236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f1237c;

        /* JADX INFO: renamed from: D.a$a$a, reason: collision with other inner class name */
        public static class C0006a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            protected Boolean f1238a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            protected String f1239b;

            public C0006a() {
                this.f1238a = Boolean.FALSE;
            }

            public final C0006a a(String str) {
                this.f1239b = str;
                return this;
            }

            public C0006a(C0005a c0005a) {
                this.f1238a = Boolean.FALSE;
                C0005a.b(c0005a);
                this.f1238a = Boolean.valueOf(c0005a.f1236b);
                this.f1239b = c0005a.f1237c;
            }
        }

        public C0005a(C0006a c0006a) {
            this.f1236b = c0006a.f1238a.booleanValue();
            this.f1237c = c0006a.f1239b;
        }

        static /* bridge */ /* synthetic */ String b(C0005a c0005a) {
            String str = c0005a.f1235a;
            return null;
        }

        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", null);
            bundle.putBoolean("force_save_dialog", this.f1236b);
            bundle.putString("log_session_id", this.f1237c);
            return bundle;
        }

        public final String d() {
            return this.f1237c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0005a)) {
                return false;
            }
            C0005a c0005a = (C0005a) obj;
            String str = c0005a.f1235a;
            return AbstractC0642q.b(null, null) && this.f1236b == c0005a.f1236b && AbstractC0642q.b(this.f1237c, c0005a.f1237c);
        }

        public int hashCode() {
            return AbstractC0642q.c(null, Boolean.valueOf(this.f1236b), this.f1237c);
        }
    }

    static {
        a.g gVar = new a.g();
        f1230g = gVar;
        a.g gVar2 = new a.g();
        f1231h = gVar2;
        d dVar = new d();
        f1232i = dVar;
        e eVar = new e();
        f1233j = eVar;
        f1224a = b.f1240a;
        f1225b = new com.google.android.gms.common.api.a("Auth.CREDENTIALS_API", dVar, gVar);
        f1226c = new com.google.android.gms.common.api.a("Auth.GOOGLE_SIGN_IN_API", eVar, gVar2);
        f1227d = b.f1241b;
        f1228e = new zbl();
        f1229f = new h();
    }
}
