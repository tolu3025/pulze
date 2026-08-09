package C1;

import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m2.t;

/* JADX INFO: loaded from: classes.dex */
abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final m2.g f1171a = m2.g.g(":");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d[] f1172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f1173c;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f1174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final m2.f f1175b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f1176c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f1177d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        d[] f1178e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f1179f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f1180g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f1181h;

        a(int i3, int i4, t tVar) {
            this.f1174a = new ArrayList();
            this.f1178e = new d[8];
            this.f1179f = r0.length - 1;
            this.f1180g = 0;
            this.f1181h = 0;
            this.f1176c = i3;
            this.f1177d = i4;
            this.f1175b = m2.i.b(tVar);
        }

        private void a() {
            int i3 = this.f1177d;
            int i4 = this.f1181h;
            if (i3 < i4) {
                if (i3 == 0) {
                    b();
                } else {
                    d(i4 - i3);
                }
            }
        }

        private void b() {
            Arrays.fill(this.f1178e, (Object) null);
            this.f1179f = this.f1178e.length - 1;
            this.f1180g = 0;
            this.f1181h = 0;
        }

        private int c(int i3) {
            return this.f1179f + 1 + i3;
        }

        private int d(int i3) {
            int i4;
            int i5 = 0;
            if (i3 > 0) {
                int length = this.f1178e.length;
                while (true) {
                    length--;
                    i4 = this.f1179f;
                    if (length < i4 || i3 <= 0) {
                        break;
                    }
                    int i6 = this.f1178e[length].f1165c;
                    i3 -= i6;
                    this.f1181h -= i6;
                    this.f1180g--;
                    i5++;
                }
                d[] dVarArr = this.f1178e;
                System.arraycopy(dVarArr, i4 + 1, dVarArr, i4 + 1 + i5, this.f1180g);
                this.f1179f += i5;
            }
            return i5;
        }

        private m2.g f(int i3) throws IOException {
            d dVar;
            if (!i(i3)) {
                int iC = c(i3 - f.f1172b.length);
                if (iC >= 0) {
                    d[] dVarArr = this.f1178e;
                    if (iC < dVarArr.length) {
                        dVar = dVarArr[iC];
                    }
                }
                throw new IOException("Header index too large " + (i3 + 1));
            }
            dVar = f.f1172b[i3];
            return dVar.f1163a;
        }

        private void h(int i3, d dVar) {
            this.f1174a.add(dVar);
            int i4 = dVar.f1165c;
            if (i3 != -1) {
                i4 -= this.f1178e[c(i3)].f1165c;
            }
            int i5 = this.f1177d;
            if (i4 > i5) {
                b();
                return;
            }
            int iD = d((this.f1181h + i4) - i5);
            if (i3 == -1) {
                int i6 = this.f1180g + 1;
                d[] dVarArr = this.f1178e;
                if (i6 > dVarArr.length) {
                    d[] dVarArr2 = new d[dVarArr.length * 2];
                    System.arraycopy(dVarArr, 0, dVarArr2, dVarArr.length, dVarArr.length);
                    this.f1179f = this.f1178e.length - 1;
                    this.f1178e = dVarArr2;
                }
                int i7 = this.f1179f;
                this.f1179f = i7 - 1;
                this.f1178e[i7] = dVar;
                this.f1180g++;
            } else {
                this.f1178e[i3 + c(i3) + iD] = dVar;
            }
            this.f1181h += i4;
        }

        private boolean i(int i3) {
            return i3 >= 0 && i3 <= f.f1172b.length - 1;
        }

        private int j() {
            return this.f1175b.readByte() & 255;
        }

        private void m(int i3) throws IOException {
            if (i(i3)) {
                this.f1174a.add(f.f1172b[i3]);
                return;
            }
            int iC = c(i3 - f.f1172b.length);
            if (iC >= 0) {
                d[] dVarArr = this.f1178e;
                if (iC <= dVarArr.length - 1) {
                    this.f1174a.add(dVarArr[iC]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i3 + 1));
        }

        private void o(int i3) {
            h(-1, new d(f(i3), k()));
        }

        private void p() {
            h(-1, new d(f.e(k()), k()));
        }

        private void q(int i3) throws IOException {
            this.f1174a.add(new d(f(i3), k()));
        }

        private void r() throws IOException {
            this.f1174a.add(new d(f.e(k()), k()));
        }

        public List e() {
            ArrayList arrayList = new ArrayList(this.f1174a);
            this.f1174a.clear();
            return arrayList;
        }

        void g(int i3) {
            this.f1176c = i3;
            this.f1177d = i3;
            a();
        }

        m2.g k() {
            int iJ = j();
            boolean z2 = (iJ & 128) == 128;
            int iN = n(iJ, 127);
            return z2 ? m2.g.p(h.f().c(this.f1175b.x(iN))) : this.f1175b.h(iN);
        }

        void l() throws IOException {
            while (!this.f1175b.t()) {
                byte b3 = this.f1175b.readByte();
                int i3 = b3 & 255;
                if (i3 == 128) {
                    throw new IOException("index == 0");
                }
                if ((b3 & 128) == 128) {
                    m(n(i3, 127) - 1);
                } else if (i3 == 64) {
                    p();
                } else if ((b3 & 64) == 64) {
                    o(n(i3, 63) - 1);
                } else if ((b3 & 32) == 32) {
                    int iN = n(i3, 31);
                    this.f1177d = iN;
                    if (iN < 0 || iN > this.f1176c) {
                        throw new IOException("Invalid dynamic table size update " + this.f1177d);
                    }
                    a();
                } else if (i3 == 16 || i3 == 0) {
                    r();
                } else {
                    q(n(i3, 15) - 1);
                }
            }
        }

        int n(int i3, int i4) {
            int i5 = i3 & i4;
            if (i5 < i4) {
                return i5;
            }
            int i6 = 0;
            while (true) {
                int iJ = j();
                if ((iJ & 128) == 0) {
                    return i4 + (iJ << i6);
                }
                i4 += (iJ & 127) << i6;
                i6 += 7;
            }
        }

        a(int i3, t tVar) {
            this(i3, i3, tVar);
        }
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m2.d f1182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f1183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f1184c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f1185d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f1186e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f1187f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        d[] f1188g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f1189h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f1190i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f1191j;

        b(int i3, boolean z2, m2.d dVar) {
            this.f1185d = a.e.API_PRIORITY_OTHER;
            this.f1188g = new d[8];
            this.f1190i = r0.length - 1;
            this.f1184c = i3;
            this.f1187f = i3;
            this.f1183b = z2;
            this.f1182a = dVar;
        }

        private void a() {
            Arrays.fill(this.f1188g, (Object) null);
            this.f1190i = this.f1188g.length - 1;
            this.f1189h = 0;
            this.f1191j = 0;
        }

        private int b(int i3) {
            int i4;
            int i5 = 0;
            if (i3 > 0) {
                int length = this.f1188g.length;
                while (true) {
                    length--;
                    i4 = this.f1190i;
                    if (length < i4 || i3 <= 0) {
                        break;
                    }
                    int i6 = this.f1188g[length].f1165c;
                    i3 -= i6;
                    this.f1191j -= i6;
                    this.f1189h--;
                    i5++;
                }
                d[] dVarArr = this.f1188g;
                System.arraycopy(dVarArr, i4 + 1, dVarArr, i4 + 1 + i5, this.f1189h);
                this.f1190i += i5;
            }
            return i5;
        }

        private void c(d dVar) {
            int i3 = dVar.f1165c;
            int i4 = this.f1187f;
            if (i3 > i4) {
                a();
                return;
            }
            b((this.f1191j + i3) - i4);
            int i5 = this.f1189h + 1;
            d[] dVarArr = this.f1188g;
            if (i5 > dVarArr.length) {
                d[] dVarArr2 = new d[dVarArr.length * 2];
                System.arraycopy(dVarArr, 0, dVarArr2, dVarArr.length, dVarArr.length);
                this.f1190i = this.f1188g.length - 1;
                this.f1188g = dVarArr2;
            }
            int i6 = this.f1190i;
            this.f1190i = i6 - 1;
            this.f1188g[i6] = dVar;
            this.f1189h++;
            this.f1191j += i3;
        }

        void d(m2.g gVar) throws IOException {
            int iU;
            int i3;
            if (!this.f1183b || h.f().e(gVar.x()) >= gVar.u()) {
                iU = gVar.u();
                i3 = 0;
            } else {
                m2.d dVar = new m2.d();
                h.f().d(gVar.x(), dVar.K());
                gVar = dVar.R();
                iU = gVar.u();
                i3 = 128;
            }
            f(iU, 127, i3);
            this.f1182a.f0(gVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void e(java.util.List r14) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 240
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: C1.f.b.e(java.util.List):void");
        }

        void f(int i3, int i4, int i5) {
            int i6;
            m2.d dVar;
            if (i3 < i4) {
                dVar = this.f1182a;
                i6 = i3 | i5;
            } else {
                this.f1182a.v(i5 | i4);
                i6 = i3 - i4;
                while (i6 >= 128) {
                    this.f1182a.v(128 | (i6 & 127));
                    i6 >>>= 7;
                }
                dVar = this.f1182a;
            }
            dVar.v(i6);
        }

        b(m2.d dVar) {
            this(4096, false, dVar);
        }
    }

    static {
        d dVar = new d(d.f1160h, "");
        m2.g gVar = d.f1157e;
        d dVar2 = new d(gVar, "GET");
        d dVar3 = new d(gVar, "POST");
        m2.g gVar2 = d.f1158f;
        d dVar4 = new d(gVar2, "/");
        d dVar5 = new d(gVar2, "/index.html");
        m2.g gVar3 = d.f1159g;
        d dVar6 = new d(gVar3, "http");
        d dVar7 = new d(gVar3, "https");
        m2.g gVar4 = d.f1156d;
        f1172b = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, new d(gVar4, "200"), new d(gVar4, "204"), new d(gVar4, "206"), new d(gVar4, "304"), new d(gVar4, "400"), new d(gVar4, "404"), new d(gVar4, "500"), new d("accept-charset", ""), new d("accept-encoding", "gzip, deflate"), new d("accept-language", ""), new d("accept-ranges", ""), new d("accept", ""), new d("access-control-allow-origin", ""), new d("age", ""), new d("allow", ""), new d("authorization", ""), new d("cache-control", ""), new d("content-disposition", ""), new d("content-encoding", ""), new d("content-language", ""), new d("content-length", ""), new d("content-location", ""), new d("content-range", ""), new d("content-type", ""), new d("cookie", ""), new d("date", ""), new d("etag", ""), new d("expect", ""), new d("expires", ""), new d("from", ""), new d("host", ""), new d("if-match", ""), new d("if-modified-since", ""), new d("if-none-match", ""), new d("if-range", ""), new d("if-unmodified-since", ""), new d("last-modified", ""), new d("link", ""), new d("location", ""), new d("max-forwards", ""), new d("proxy-authenticate", ""), new d("proxy-authorization", ""), new d("range", ""), new d("referer", ""), new d("refresh", ""), new d("retry-after", ""), new d("server", ""), new d("set-cookie", ""), new d("strict-transport-security", ""), new d("transfer-encoding", ""), new d("user-agent", ""), new d("vary", ""), new d("via", ""), new d("www-authenticate", "")};
        f1173c = f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static m2.g e(m2.g gVar) throws IOException {
        int iU = gVar.u();
        for (int i3 = 0; i3 < iU; i3++) {
            byte bH = gVar.h(i3);
            if (bH >= 65 && bH <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + gVar.y());
            }
        }
        return gVar;
    }

    private static Map f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f1172b.length);
        int i3 = 0;
        while (true) {
            d[] dVarArr = f1172b;
            if (i3 >= dVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(dVarArr[i3].f1163a)) {
                linkedHashMap.put(dVarArr[i3].f1163a, Integer.valueOf(i3));
            }
            i3++;
        }
    }
}
