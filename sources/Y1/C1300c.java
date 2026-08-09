package y1;

import e0.AbstractC0825f;
import e0.AbstractC0829j;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import y1.AbstractC1308k;

/* JADX INFO: renamed from: y1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1300c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C1300c f11885k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1316t f11886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f11887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f11888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AbstractC1299b f11889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f11890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object[][] f11891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f11892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Boolean f11893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Integer f11894i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Integer f11895j;

    /* JADX INFO: renamed from: y1.c$b */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        C1316t f11896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Executor f11897b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f11898c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        AbstractC1299b f11899d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f11900e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object[][] f11901f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        List f11902g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Boolean f11903h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Integer f11904i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Integer f11905j;

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C1300c b() {
            return new C1300c(this);
        }
    }

    /* JADX INFO: renamed from: y1.c$c, reason: collision with other inner class name */
    public static final class C0193c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f11906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f11907b;

        private C0193c(String str, Object obj) {
            this.f11906a = str;
            this.f11907b = obj;
        }

        public static C0193c b(String str) {
            AbstractC0829j.o(str, "debugString");
            return new C0193c(str, null);
        }

        public String toString() {
            return this.f11906a;
        }
    }

    static {
        b bVar = new b();
        bVar.f11901f = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        bVar.f11902g = Collections.emptyList();
        f11885k = bVar.b();
    }

    private C1300c(b bVar) {
        this.f11886a = bVar.f11896a;
        this.f11887b = bVar.f11897b;
        this.f11888c = bVar.f11898c;
        this.f11889d = bVar.f11899d;
        this.f11890e = bVar.f11900e;
        this.f11891f = bVar.f11901f;
        this.f11892g = bVar.f11902g;
        this.f11893h = bVar.f11903h;
        this.f11894i = bVar.f11904i;
        this.f11895j = bVar.f11905j;
    }

    private static b k(C1300c c1300c) {
        b bVar = new b();
        bVar.f11896a = c1300c.f11886a;
        bVar.f11897b = c1300c.f11887b;
        bVar.f11898c = c1300c.f11888c;
        bVar.f11899d = c1300c.f11889d;
        bVar.f11900e = c1300c.f11890e;
        bVar.f11901f = c1300c.f11891f;
        bVar.f11902g = c1300c.f11892g;
        bVar.f11903h = c1300c.f11893h;
        bVar.f11904i = c1300c.f11894i;
        bVar.f11905j = c1300c.f11895j;
        return bVar;
    }

    public String a() {
        return this.f11888c;
    }

    public String b() {
        return this.f11890e;
    }

    public AbstractC1299b c() {
        return this.f11889d;
    }

    public C1316t d() {
        return this.f11886a;
    }

    public Executor e() {
        return this.f11887b;
    }

    public Integer f() {
        return this.f11894i;
    }

    public Integer g() {
        return this.f11895j;
    }

    public Object h(C0193c c0193c) {
        AbstractC0829j.o(c0193c, "key");
        int i3 = 0;
        while (true) {
            Object[][] objArr = this.f11891f;
            if (i3 >= objArr.length) {
                return c0193c.f11907b;
            }
            if (c0193c.equals(objArr[i3][0])) {
                return this.f11891f[i3][1];
            }
            i3++;
        }
    }

    public List i() {
        return this.f11892g;
    }

    public boolean j() {
        return Boolean.TRUE.equals(this.f11893h);
    }

    public C1300c l(AbstractC1299b abstractC1299b) {
        b bVarK = k(this);
        bVarK.f11899d = abstractC1299b;
        return bVarK.b();
    }

    public C1300c m(C1316t c1316t) {
        b bVarK = k(this);
        bVarK.f11896a = c1316t;
        return bVarK.b();
    }

    public C1300c n(Executor executor) {
        b bVarK = k(this);
        bVarK.f11897b = executor;
        return bVarK.b();
    }

    public C1300c o(int i3) {
        AbstractC0829j.h(i3 >= 0, "invalid maxsize %s", i3);
        b bVarK = k(this);
        bVarK.f11904i = Integer.valueOf(i3);
        return bVarK.b();
    }

    public C1300c p(int i3) {
        AbstractC0829j.h(i3 >= 0, "invalid maxsize %s", i3);
        b bVarK = k(this);
        bVarK.f11905j = Integer.valueOf(i3);
        return bVarK.b();
    }

    public C1300c q(C0193c c0193c, Object obj) {
        AbstractC0829j.o(c0193c, "key");
        AbstractC0829j.o(obj, "value");
        b bVarK = k(this);
        int i3 = 0;
        while (true) {
            Object[][] objArr = this.f11891f;
            if (i3 >= objArr.length) {
                i3 = -1;
                break;
            }
            if (c0193c.equals(objArr[i3][0])) {
                break;
            }
            i3++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, this.f11891f.length + (i3 == -1 ? 1 : 0), 2);
        bVarK.f11901f = objArr2;
        Object[][] objArr3 = this.f11891f;
        System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
        if (i3 == -1) {
            bVarK.f11901f[this.f11891f.length] = new Object[]{c0193c, obj};
        } else {
            bVarK.f11901f[i3] = new Object[]{c0193c, obj};
        }
        return bVarK.b();
    }

    public C1300c r(AbstractC1308k.a aVar) {
        ArrayList arrayList = new ArrayList(this.f11892g.size() + 1);
        arrayList.addAll(this.f11892g);
        arrayList.add(aVar);
        b bVarK = k(this);
        bVarK.f11902g = Collections.unmodifiableList(arrayList);
        return bVarK.b();
    }

    public C1300c s() {
        b bVarK = k(this);
        bVarK.f11903h = Boolean.TRUE;
        return bVarK.b();
    }

    public C1300c t() {
        b bVarK = k(this);
        bVarK.f11903h = Boolean.FALSE;
        return bVarK.b();
    }

    public String toString() {
        AbstractC0825f.b bVarD = AbstractC0825f.b(this).d("deadline", this.f11886a).d("authority", this.f11888c).d("callCredentials", this.f11889d);
        Executor executor = this.f11887b;
        return bVarD.d("executor", executor != null ? executor.getClass() : null).d("compressorName", this.f11890e).d("customOptions", Arrays.deepToString(this.f11891f)).e("waitForReady", j()).d("maxInboundMessageSize", this.f11894i).d("maxOutboundMessageSize", this.f11895j).d("streamTracerFactories", this.f11892g).toString();
    }
}
