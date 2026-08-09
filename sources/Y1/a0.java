package y1;

import e0.AbstractC0825f;
import e0.AbstractC0829j;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f11861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f11863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f11864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f11865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f11866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f11867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f11868h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f11869i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicReferenceArray f11870j;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c f11871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f11872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private d f11873c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f11874d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f11875e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f11876f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Object f11877g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f11878h;

        private b() {
        }

        public a0 a() {
            return new a0(this.f11873c, this.f11874d, this.f11871a, this.f11872b, this.f11877g, this.f11875e, this.f11876f, this.f11878h);
        }

        public b b(String str) {
            this.f11874d = str;
            return this;
        }

        public b c(c cVar) {
            this.f11871a = cVar;
            return this;
        }

        public b d(c cVar) {
            this.f11872b = cVar;
            return this;
        }

        public b e(boolean z2) {
            this.f11878h = z2;
            return this;
        }

        public b f(d dVar) {
            this.f11873c = dVar;
            return this;
        }
    }

    public interface c {
        InputStream a(Object obj);

        Object b(InputStream inputStream);
    }

    public enum d {
        UNARY,
        CLIENT_STREAMING,
        SERVER_STREAMING,
        BIDI_STREAMING,
        UNKNOWN;

        public final boolean c() {
            return this == UNARY || this == SERVER_STREAMING;
        }
    }

    private a0(d dVar, String str, c cVar, c cVar2, Object obj, boolean z2, boolean z3, boolean z4) {
        this.f11870j = new AtomicReferenceArray(2);
        this.f11861a = (d) AbstractC0829j.o(dVar, "type");
        this.f11862b = (String) AbstractC0829j.o(str, "fullMethodName");
        this.f11863c = a(str);
        this.f11864d = (c) AbstractC0829j.o(cVar, "requestMarshaller");
        this.f11865e = (c) AbstractC0829j.o(cVar2, "responseMarshaller");
        this.f11866f = obj;
        this.f11867g = z2;
        this.f11868h = z3;
        this.f11869i = z4;
    }

    public static String a(String str) {
        int iLastIndexOf = ((String) AbstractC0829j.o(str, "fullMethodName")).lastIndexOf(47);
        if (iLastIndexOf == -1) {
            return null;
        }
        return str.substring(0, iLastIndexOf);
    }

    public static String b(String str, String str2) {
        return ((String) AbstractC0829j.o(str, "fullServiceName")) + "/" + ((String) AbstractC0829j.o(str2, "methodName"));
    }

    public static b g() {
        return h(null, null);
    }

    public static b h(c cVar, c cVar2) {
        return new b().c(cVar).d(cVar2);
    }

    public String c() {
        return this.f11862b;
    }

    public String d() {
        return this.f11863c;
    }

    public d e() {
        return this.f11861a;
    }

    public boolean f() {
        return this.f11868h;
    }

    public Object i(InputStream inputStream) {
        return this.f11865e.b(inputStream);
    }

    public InputStream j(Object obj) {
        return this.f11864d.a(obj);
    }

    public String toString() {
        return AbstractC0825f.b(this).d("fullMethodName", this.f11862b).d("type", this.f11861a).e("idempotent", this.f11867g).e("safe", this.f11868h).e("sampledToLocalTracing", this.f11869i).d("requestMarshaller", this.f11864d).d("responseMarshaller", this.f11865e).d("schemaDescriptor", this.f11866f).k().toString();
    }
}
