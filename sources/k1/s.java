package k1;

import b1.AbstractC0525b;
import c1.C0543a;
import java.util.HashMap;
import java.util.Map;
import l1.k;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f9624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private l1.k f9625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private k.d f9626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f9627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f9628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k.c f9629g;

    class b implements k.c {
        b() {
        }

        @Override // l1.k.c
        public void a(l1.j jVar, k.d dVar) {
            Map mapI;
            String str = jVar.f9778a;
            Object obj = jVar.f9779b;
            str.hashCode();
            if (str.equals("get")) {
                s.this.f9628f = true;
                if (!s.this.f9627e) {
                    s sVar = s.this;
                    if (sVar.f9623a) {
                        sVar.f9626d = dVar;
                        return;
                    }
                }
                s sVar2 = s.this;
                mapI = sVar2.i(sVar2.f9624b);
            } else if (!str.equals("put")) {
                dVar.c();
                return;
            } else {
                s.this.f9624b = (byte[]) obj;
                mapI = null;
            }
            dVar.a(mapI);
        }
    }

    public s(C0543a c0543a, boolean z2) {
        this(new l1.k(c0543a, "flutter/restoration", l1.p.f9793b), z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map i(byte[] bArr) {
        HashMap map = new HashMap();
        map.put("enabled", Boolean.TRUE);
        map.put("data", bArr);
        return map;
    }

    public void g() {
        this.f9624b = null;
    }

    public byte[] h() {
        return this.f9624b;
    }

    public void j(byte[] bArr) {
        this.f9627e = true;
        k.d dVar = this.f9626d;
        if (dVar != null) {
            dVar.a(i(bArr));
            this.f9626d = null;
        } else if (this.f9628f) {
            this.f9625c.d("push", i(bArr), new a(bArr));
            return;
        }
        this.f9624b = bArr;
    }

    s(l1.k kVar, boolean z2) {
        this.f9627e = false;
        this.f9628f = false;
        b bVar = new b();
        this.f9629g = bVar;
        this.f9625c = kVar;
        this.f9623a = z2;
        kVar.e(bVar);
    }

    class a implements k.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f9630a;

        a(byte[] bArr) {
            this.f9630a = bArr;
        }

        @Override // l1.k.d
        public void a(Object obj) {
            s.this.f9624b = this.f9630a;
        }

        @Override // l1.k.d
        public void b(String str, String str2, Object obj) {
            AbstractC0525b.b("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
        }

        @Override // l1.k.d
        public void c() {
        }
    }
}
