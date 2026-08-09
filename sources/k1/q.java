package k1;

import b1.AbstractC0525b;
import c1.C0543a;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k1.q;
import l1.k;

/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l1.k f9580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f9581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k.c f9582c;

    class a implements k.c {
        a() {
        }

        private void c(l1.j jVar, k.d dVar) {
            try {
                q.this.f9581b.f(((Integer) jVar.a()).intValue());
                dVar.a(null);
            } catch (IllegalStateException e3) {
                dVar.b("error", q.c(e3), null);
            }
        }

        private void d(l1.j jVar, k.d dVar) {
            Map map = (Map) jVar.a();
            boolean z2 = false;
            boolean z3 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
            ByteBuffer byteBufferWrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
            try {
                if (z3) {
                    q.this.f9581b.g(new d(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), d.a.HYBRID_ONLY, byteBufferWrap));
                } else {
                    if (map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue()) {
                        z2 = true;
                    }
                    long jD = q.this.f9581b.d(new d(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), z2 ? d.a.TEXTURE_WITH_HYBRID_FALLBACK : d.a.TEXTURE_WITH_VIRTUAL_FALLBACK, byteBufferWrap));
                    if (jD != -2) {
                        dVar.a(Long.valueOf(jD));
                        return;
                    } else if (!z2) {
                        throw new AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                    }
                }
                dVar.a(null);
            } catch (IllegalStateException e3) {
                dVar.b("error", q.c(e3), null);
            }
        }

        private void e(l1.j jVar, k.d dVar) {
            try {
                q.this.f9581b.h(((Integer) ((Map) jVar.a()).get("id")).intValue());
                dVar.a(null);
            } catch (IllegalStateException e3) {
                dVar.b("error", q.c(e3), null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void f(k.d dVar, c cVar) {
            if (cVar == null) {
                dVar.b("error", "Failed to resize the platform view", null);
                return;
            }
            HashMap map = new HashMap();
            map.put("width", Double.valueOf(cVar.f9584a));
            map.put("height", Double.valueOf(cVar.f9585b));
            dVar.a(map);
        }

        private void g(l1.j jVar, k.d dVar) {
            Map map = (Map) jVar.a();
            try {
                q.this.f9581b.b(((Integer) map.get("id")).intValue(), ((Double) map.get("top")).doubleValue(), ((Double) map.get("left")).doubleValue());
                dVar.a(null);
            } catch (IllegalStateException e3) {
                dVar.b("error", q.c(e3), null);
            }
        }

        private void h(l1.j jVar, final k.d dVar) {
            Map map = (Map) jVar.a();
            try {
                q.this.f9581b.i(new e(((Integer) map.get("id")).intValue(), ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue()), new b() { // from class: k1.p
                    @Override // k1.q.b
                    public final void a(q.c cVar) {
                        q.a.f(dVar, cVar);
                    }
                });
            } catch (IllegalStateException e3) {
                dVar.b("error", q.c(e3), null);
            }
        }

        private void i(l1.j jVar, k.d dVar) {
            Map map = (Map) jVar.a();
            try {
                q.this.f9581b.c(((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue());
                dVar.a(null);
            } catch (IllegalStateException e3) {
                dVar.b("error", q.c(e3), null);
            }
        }

        private void j(l1.j jVar, k.d dVar) {
            try {
                q.this.f9581b.a(((Boolean) jVar.a()).booleanValue());
                dVar.a(null);
            } catch (IllegalStateException e3) {
                dVar.b("error", q.c(e3), null);
            }
        }

        private void k(l1.j jVar, k.d dVar) {
            k.d dVar2;
            List list = (List) jVar.a();
            try {
                q.this.f9581b.e(new f(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                dVar2 = dVar;
            } catch (IllegalStateException e3) {
                e = e3;
                dVar2 = dVar;
            }
            try {
                dVar2.a(null);
            } catch (IllegalStateException e4) {
                e = e4;
                dVar2.b("error", q.c(e), null);
            }
        }

        @Override // l1.k.c
        public void a(l1.j jVar, k.d dVar) {
            if (q.this.f9581b == null) {
            }
            AbstractC0525b.f("PlatformViewsChannel", "Received '" + jVar.f9778a + "' message.");
            String str = jVar.f9778a;
            str.hashCode();
            switch (str) {
                case "create":
                    d(jVar, dVar);
                    break;
                case "offset":
                    g(jVar, dVar);
                    break;
                case "resize":
                    h(jVar, dVar);
                    break;
                case "clearFocus":
                    c(jVar, dVar);
                    break;
                case "synchronizeToNativeViewHierarchy":
                    j(jVar, dVar);
                    break;
                case "touch":
                    k(jVar, dVar);
                    break;
                case "setDirection":
                    i(jVar, dVar);
                    break;
                case "dispose":
                    e(jVar, dVar);
                    break;
                default:
                    dVar.c();
                    break;
            }
        }
    }

    public interface b {
        void a(c cVar);
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9585b;

        public c(int i3, int i4) {
            this.f9584a = i3;
            this.f9585b = i4;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f9587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f9588c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final double f9589d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final double f9590e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final double f9591f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f9592g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final a f9593h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final ByteBuffer f9594i;

        public enum a {
            TEXTURE_WITH_VIRTUAL_FALLBACK,
            TEXTURE_WITH_HYBRID_FALLBACK,
            HYBRID_ONLY
        }

        public d(int i3, String str, double d3, double d4, double d5, double d6, int i4, a aVar, ByteBuffer byteBuffer) {
            this.f9586a = i3;
            this.f9587b = str;
            this.f9590e = d3;
            this.f9591f = d4;
            this.f9588c = d5;
            this.f9589d = d6;
            this.f9592g = i4;
            this.f9593h = aVar;
            this.f9594i = byteBuffer;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f9600b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f9601c;

        public e(int i3, double d3, double d4) {
            this.f9599a = i3;
            this.f9600b = d3;
            this.f9601c = d4;
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Number f9603b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Number f9604c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f9605d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f9606e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Object f9607f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Object f9608g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f9609h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f9610i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final float f9611j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final float f9612k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f9613l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f9614m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f9615n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f9616o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final long f9617p;

        public f(int i3, Number number, Number number2, int i4, int i5, Object obj, Object obj2, int i6, int i7, float f3, float f4, int i8, int i9, int i10, int i11, long j3) {
            this.f9602a = i3;
            this.f9603b = number;
            this.f9604c = number2;
            this.f9605d = i4;
            this.f9606e = i5;
            this.f9607f = obj;
            this.f9608g = obj2;
            this.f9609h = i6;
            this.f9610i = i7;
            this.f9611j = f3;
            this.f9612k = f4;
            this.f9613l = i8;
            this.f9614m = i9;
            this.f9615n = i10;
            this.f9616o = i11;
            this.f9617p = j3;
        }
    }

    public interface g {
        void a(boolean z2);

        void b(int i3, double d3, double d4);

        void c(int i3, int i4);

        long d(d dVar);

        void e(f fVar);

        void f(int i3);

        void g(d dVar);

        void h(int i3);

        void i(e eVar, b bVar);
    }

    public q(C0543a c0543a) {
        a aVar = new a();
        this.f9582c = aVar;
        l1.k kVar = new l1.k(c0543a, "flutter/platform_views", l1.p.f9793b);
        this.f9580a = kVar;
        kVar.e(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(Exception exc) {
        return AbstractC0525b.d(exc);
    }

    public void d(g gVar) {
        this.f9581b = gVar;
    }
}
