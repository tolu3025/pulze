package C1;

import C1.b;
import C1.f;
import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import m2.t;

/* JADX INFO: loaded from: classes.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f1192a = Logger.getLogger(b.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final m2.g f1193b = m2.g.g("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String[] f1200a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String[] f1201b = new String[64];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String[] f1202c = new String[256];

        static {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                String[] strArr = f1202c;
                if (i4 >= strArr.length) {
                    break;
                }
                strArr[i4] = String.format("%8s", Integer.toBinaryString(i4)).replace(' ', '0');
                i4++;
            }
            String[] strArr2 = f1201b;
            strArr2[0] = "";
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            int i5 = iArr[0];
            strArr2[i5 | 8] = strArr2[i5] + "|PADDED";
            strArr2[4] = "END_HEADERS";
            strArr2[32] = "PRIORITY";
            strArr2[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i6 = 0; i6 < 3; i6++) {
                int i7 = iArr2[i6];
                int i8 = iArr[0];
                String[] strArr3 = f1201b;
                int i9 = i8 | i7;
                strArr3[i9] = strArr3[i8] + '|' + strArr3[i7];
                strArr3[i9 | 8] = strArr3[i8] + '|' + strArr3[i7] + "|PADDED";
            }
            while (true) {
                String[] strArr4 = f1201b;
                if (i3 >= strArr4.length) {
                    return;
                }
                if (strArr4[i3] == null) {
                    strArr4[i3] = f1202c[i3];
                }
                i3++;
            }
        }

        static String a(byte b3, byte b4) {
            if (b4 == 0) {
                return "";
            }
            if (b3 != 2 && b3 != 3) {
                if (b3 == 4 || b3 == 6) {
                    return b4 == 1 ? "ACK" : f1202c[b4];
                }
                if (b3 != 7 && b3 != 8) {
                    String[] strArr = f1201b;
                    String str = b4 < strArr.length ? strArr[b4] : f1202c[b4];
                    return (b3 != 5 || (b4 & 4) == 0) ? (b3 != 0 || (b4 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED") : str.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            return f1202c[b4];
        }

        static String b(boolean z2, int i3, int i4, byte b3, byte b4) {
            String[] strArr = f1200a;
            String str = b3 < strArr.length ? strArr[b3] : String.format("0x%02x", Byte.valueOf(b3));
            String strA = a(b3, b4);
            Locale locale = Locale.US;
            Object[] objArr = new Object[5];
            objArr[0] = z2 ? "<<" : ">>";
            objArr[1] = Integer.valueOf(i3);
            objArr[2] = Integer.valueOf(i4);
            objArr[3] = str;
            objArr[4] = strA;
            return String.format(locale, "%s 0x%08x %5d %-13s %s", objArr);
        }
    }

    static final class c implements C1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m2.f f1203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f1204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f1205c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final f.a f1206d;

        c(m2.f fVar, int i3, boolean z2) {
            this.f1203a = fVar;
            this.f1205c = z2;
            a aVar = new a(fVar);
            this.f1204b = aVar;
            this.f1206d = new f.a(i3, aVar);
        }

        private void B(b.a aVar, int i3, byte b3, int i4) throws IOException {
            if (i3 != 4) {
                throw g.k("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i3));
            }
            if (i4 == 0) {
                throw g.k("TYPE_RST_STREAM streamId == 0", new Object[0]);
            }
            int i5 = this.f1203a.readInt();
            C1.a aVarC = C1.a.c(i5);
            if (aVarC == null) {
                throw g.k("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i5));
            }
            aVar.d(i4, aVarC);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private void K(b.a aVar, int i3, byte b3, int i4) throws IOException {
            if (i4 != 0) {
                throw g.k("TYPE_SETTINGS streamId != 0", new Object[0]);
            }
            if ((b3 & 1) != 0) {
                if (i3 != 0) {
                    throw g.k("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                }
                aVar.i();
                return;
            }
            if (i3 % 6 != 0) {
                throw g.k("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i3));
            }
            i iVar = new i();
            for (int i5 = 0; i5 < i3; i5 += 6) {
                short s2 = this.f1203a.readShort();
                int i6 = this.f1203a.readInt();
                switch (s2) {
                    case 1:
                    case 6:
                        iVar.e(s2, 0, i6);
                        break;
                    case 2:
                        if (i6 != 0 && i6 != 1) {
                            throw g.k("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                        }
                        iVar.e(s2, 0, i6);
                        break;
                    case 3:
                        s2 = 4;
                        iVar.e(s2, 0, i6);
                        break;
                    case 4:
                        if (i6 < 0) {
                            throw g.k("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        }
                        s2 = 7;
                        iVar.e(s2, 0, i6);
                        break;
                        break;
                    case 5:
                        if (i6 < 16384 || i6 > 16777215) {
                            throw g.k("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i6));
                        }
                        iVar.e(s2, 0, i6);
                        break;
                    default:
                        break;
                }
            }
            aVar.k(false, iVar);
            if (iVar.b() >= 0) {
                this.f1206d.g(iVar.b());
            }
        }

        private void L(b.a aVar, int i3, byte b3, int i4) throws IOException {
            if (i3 != 4) {
                throw g.k("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i3));
            }
            long j3 = ((long) this.f1203a.readInt()) & 2147483647L;
            if (j3 == 0) {
                throw g.k("windowSizeIncrement was 0", new Object[0]);
            }
            aVar.g(i4, j3);
        }

        private void b(b.a aVar, int i3, byte b3, int i4) throws IOException {
            boolean z2 = (b3 & 1) != 0;
            if ((b3 & 32) != 0) {
                throw g.k("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            }
            short s2 = (b3 & 8) != 0 ? (short) (this.f1203a.readByte() & 255) : (short) 0;
            aVar.m(z2, i4, this.f1203a, g.l(i3, b3, s2), i3);
            this.f1203a.k(s2);
        }

        private void c(b.a aVar, int i3, byte b3, int i4) throws IOException {
            if (i3 < 8) {
                throw g.k("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i3));
            }
            if (i4 != 0) {
                throw g.k("TYPE_GOAWAY streamId != 0", new Object[0]);
            }
            int i5 = this.f1203a.readInt();
            int i6 = this.f1203a.readInt();
            int i7 = i3 - 8;
            C1.a aVarC = C1.a.c(i6);
            if (aVarC == null) {
                throw g.k("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i6));
            }
            m2.g gVarH = m2.g.f9871e;
            if (i7 > 0) {
                gVarH = this.f1203a.h(i7);
            }
            aVar.h(i5, aVarC, gVarH);
        }

        private List f(int i3, short s2, byte b3, int i4) throws IOException {
            a aVar = this.f1204b;
            aVar.f1198e = i3;
            aVar.f1195b = i3;
            aVar.f1199f = s2;
            aVar.f1196c = b3;
            aVar.f1197d = i4;
            this.f1206d.l();
            return this.f1206d.e();
        }

        private void l(b.a aVar, int i3, byte b3, int i4) throws IOException {
            if (i4 == 0) {
                throw g.k("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            }
            boolean z2 = (b3 & 1) != 0;
            short s2 = (b3 & 8) != 0 ? (short) (this.f1203a.readByte() & 255) : (short) 0;
            if ((b3 & 32) != 0) {
                r(aVar, i4);
                i3 -= 5;
            }
            aVar.n(false, z2, i4, -1, f(g.l(i3, b3, s2), s2, b3, i4), e.HTTP_20_HEADERS);
        }

        private void q(b.a aVar, int i3, byte b3, int i4) throws IOException {
            if (i3 != 8) {
                throw g.k("TYPE_PING length != 8: %s", Integer.valueOf(i3));
            }
            if (i4 != 0) {
                throw g.k("TYPE_PING streamId != 0", new Object[0]);
            }
            aVar.e((b3 & 1) != 0, this.f1203a.readInt(), this.f1203a.readInt());
        }

        private void r(b.a aVar, int i3) {
            int i4 = this.f1203a.readInt();
            aVar.j(i3, i4 & a.e.API_PRIORITY_OTHER, (this.f1203a.readByte() & 255) + 1, (Integer.MIN_VALUE & i4) != 0);
        }

        private void u(b.a aVar, int i3, byte b3, int i4) throws IOException {
            if (i3 != 5) {
                throw g.k("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i3));
            }
            if (i4 == 0) {
                throw g.k("TYPE_PRIORITY streamId == 0", new Object[0]);
            }
            r(aVar, i4);
        }

        private void z(b.a aVar, int i3, byte b3, int i4) throws IOException {
            if (i4 == 0) {
                throw g.k("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            }
            short s2 = (b3 & 8) != 0 ? (short) (this.f1203a.readByte() & 255) : (short) 0;
            aVar.l(i4, this.f1203a.readInt() & a.e.API_PRIORITY_OTHER, f(g.l(i3 - 4, b3, s2), s2, b3, i4));
        }

        @Override // C1.b
        public boolean C(b.a aVar) throws IOException {
            try {
                this.f1203a.M(9L);
                int iM = g.m(this.f1203a);
                if (iM < 0 || iM > 16384) {
                    throw g.k("FRAME_SIZE_ERROR: %s", Integer.valueOf(iM));
                }
                byte b3 = (byte) (this.f1203a.readByte() & 255);
                byte b4 = (byte) (this.f1203a.readByte() & 255);
                int i3 = this.f1203a.readInt() & a.e.API_PRIORITY_OTHER;
                if (g.f1192a.isLoggable(Level.FINE)) {
                    g.f1192a.fine(b.b(true, i3, iM, b3, b4));
                }
                switch (b3) {
                    case 0:
                        b(aVar, iM, b4, i3);
                        return true;
                    case 1:
                        l(aVar, iM, b4, i3);
                        return true;
                    case 2:
                        u(aVar, iM, b4, i3);
                        return true;
                    case 3:
                        B(aVar, iM, b4, i3);
                        return true;
                    case 4:
                        K(aVar, iM, b4, i3);
                        return true;
                    case 5:
                        z(aVar, iM, b4, i3);
                        return true;
                    case 6:
                        q(aVar, iM, b4, i3);
                        return true;
                    case 7:
                        c(aVar, iM, b4, i3);
                        return true;
                    case 8:
                        L(aVar, iM, b4, i3);
                        return true;
                    default:
                        this.f1203a.k(iM);
                        return true;
                }
            } catch (IOException unused) {
                return false;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f1203a.close();
        }
    }

    static final class d implements C1.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m2.e f1207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f1208b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final m2.d f1209c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final f.b f1210d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f1211e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f1212f;

        d(m2.e eVar, boolean z2) {
            this.f1207a = eVar;
            this.f1208b = z2;
            m2.d dVar = new m2.d();
            this.f1209c = dVar;
            this.f1210d = new f.b(dVar);
            this.f1211e = 16384;
        }

        private void l(int i3, long j3) {
            while (j3 > 0) {
                int iMin = (int) Math.min(this.f1211e, j3);
                long j4 = iMin;
                j3 -= j4;
                c(i3, iMin, (byte) 9, j3 == 0 ? (byte) 4 : (byte) 0);
                this.f1207a.T(this.f1209c, j4);
            }
        }

        @Override // C1.c
        public synchronized void D(boolean z2, int i3, m2.d dVar, int i4) {
            if (this.f1212f) {
                throw new IOException("closed");
            }
            b(i3, z2 ? (byte) 1 : (byte) 0, dVar, i4);
        }

        @Override // C1.c
        public synchronized void G(int i3, C1.a aVar, byte[] bArr) {
            try {
                if (this.f1212f) {
                    throw new IOException("closed");
                }
                if (aVar.f1153a == -1) {
                    throw g.j("errorCode.httpCode == -1", new Object[0]);
                }
                c(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.f1207a.o(i3);
                this.f1207a.o(aVar.f1153a);
                if (bArr.length > 0) {
                    this.f1207a.y(bArr);
                }
                this.f1207a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // C1.c
        public int I() {
            return this.f1211e;
        }

        @Override // C1.c
        public synchronized void J(boolean z2, boolean z3, int i3, int i4, List list) {
            if (z3) {
                throw new UnsupportedOperationException();
            }
            if (this.f1212f) {
                throw new IOException("closed");
            }
            f(z2, i3, list);
        }

        void b(int i3, byte b3, m2.d dVar, int i4) {
            c(i3, i4, (byte) 0, b3);
            if (i4 > 0) {
                this.f1207a.T(dVar, i4);
            }
        }

        void c(int i3, int i4, byte b3, byte b4) {
            if (g.f1192a.isLoggable(Level.FINE)) {
                g.f1192a.fine(b.b(false, i3, i4, b3, b4));
            }
            int i5 = this.f1211e;
            if (i4 > i5) {
                throw g.j("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i5), Integer.valueOf(i4));
            }
            if ((Integer.MIN_VALUE & i3) != 0) {
                throw g.j("reserved bit set: %s", Integer.valueOf(i3));
            }
            g.n(this.f1207a, i4);
            this.f1207a.v(b3 & 255);
            this.f1207a.v(b4 & 255);
            this.f1207a.o(i3 & a.e.API_PRIORITY_OTHER);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            this.f1212f = true;
            this.f1207a.close();
        }

        @Override // C1.c
        public synchronized void d(int i3, C1.a aVar) {
            if (this.f1212f) {
                throw new IOException("closed");
            }
            if (aVar.f1153a == -1) {
                throw new IllegalArgumentException();
            }
            c(i3, 4, (byte) 3, (byte) 0);
            this.f1207a.o(aVar.f1153a);
            this.f1207a.flush();
        }

        @Override // C1.c
        public synchronized void e(boolean z2, int i3, int i4) {
            if (this.f1212f) {
                throw new IOException("closed");
            }
            c(0, 8, (byte) 6, z2 ? (byte) 1 : (byte) 0);
            this.f1207a.o(i3);
            this.f1207a.o(i4);
            this.f1207a.flush();
        }

        void f(boolean z2, int i3, List list) throws IOException {
            if (this.f1212f) {
                throw new IOException("closed");
            }
            this.f1210d.e(list);
            long jB0 = this.f1209c.b0();
            int iMin = (int) Math.min(this.f1211e, jB0);
            long j3 = iMin;
            byte b3 = jB0 == j3 ? (byte) 4 : (byte) 0;
            if (z2) {
                b3 = (byte) (b3 | 1);
            }
            c(i3, iMin, (byte) 1, b3);
            this.f1207a.T(this.f1209c, j3);
            if (jB0 > j3) {
                l(i3, jB0 - j3);
            }
        }

        @Override // C1.c
        public synchronized void flush() {
            if (this.f1212f) {
                throw new IOException("closed");
            }
            this.f1207a.flush();
        }

        @Override // C1.c
        public synchronized void g(int i3, long j3) {
            if (this.f1212f) {
                throw new IOException("closed");
            }
            if (j3 == 0 || j3 > 2147483647L) {
                throw g.j("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j3));
            }
            c(i3, 4, (byte) 8, (byte) 0);
            this.f1207a.o((int) j3);
            this.f1207a.flush();
        }

        @Override // C1.c
        public synchronized void j(i iVar) {
            if (this.f1212f) {
                throw new IOException("closed");
            }
            this.f1211e = iVar.c(this.f1211e);
            c(0, 0, (byte) 4, (byte) 1);
            this.f1207a.flush();
        }

        @Override // C1.c
        public synchronized void n(i iVar) {
            try {
                if (this.f1212f) {
                    throw new IOException("closed");
                }
                int i3 = 0;
                c(0, iVar.f() * 6, (byte) 4, (byte) 0);
                while (i3 < 10) {
                    if (iVar.d(i3)) {
                        this.f1207a.m(i3 == 4 ? 3 : i3 == 7 ? 4 : i3);
                        this.f1207a.o(iVar.a(i3));
                    }
                    i3++;
                }
                this.f1207a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // C1.c
        public synchronized void w() {
            try {
                if (this.f1212f) {
                    throw new IOException("closed");
                }
                if (this.f1208b) {
                    if (g.f1192a.isLoggable(Level.FINE)) {
                        g.f1192a.fine(String.format(">> CONNECTION %s", g.f1193b.m()));
                    }
                    this.f1207a.y(g.f1193b.x());
                    this.f1207a.flush();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IllegalArgumentException j(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IOException k(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(Locale.US, str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(int i3, byte b3, short s2) throws IOException {
        if ((b3 & 8) != 0) {
            i3--;
        }
        if (s2 <= i3) {
            return (short) (i3 - s2);
        }
        throw k("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s2), Integer.valueOf(i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(m2.f fVar) {
        return (fVar.readByte() & 255) | ((fVar.readByte() & 255) << 16) | ((fVar.readByte() & 255) << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(m2.e eVar, int i3) {
        eVar.v((i3 >>> 16) & 255);
        eVar.v((i3 >>> 8) & 255);
        eVar.v(i3 & 255);
    }

    @Override // C1.j
    public C1.b a(m2.f fVar, boolean z2) {
        return new c(fVar, 4096, z2);
    }

    @Override // C1.j
    public C1.c b(m2.e eVar, boolean z2) {
        return new d(eVar, z2);
    }

    static final class a implements t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m2.f f1194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        byte f1196c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f1197d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1198e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        short f1199f;

        public a(m2.f fVar) {
            this.f1194a = fVar;
        }

        private void b() throws IOException {
            int i3 = this.f1197d;
            int iM = g.m(this.f1194a);
            this.f1198e = iM;
            this.f1195b = iM;
            byte b3 = (byte) (this.f1194a.readByte() & 255);
            this.f1196c = (byte) (this.f1194a.readByte() & 255);
            if (g.f1192a.isLoggable(Level.FINE)) {
                g.f1192a.fine(b.b(true, this.f1197d, this.f1195b, b3, this.f1196c));
            }
            int i4 = this.f1194a.readInt() & a.e.API_PRIORITY_OTHER;
            this.f1197d = i4;
            if (b3 != 9) {
                throw g.k("%s != TYPE_CONTINUATION", Byte.valueOf(b3));
            }
            if (i4 != i3) {
                throw g.k("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        @Override // m2.t
        public long A(m2.d dVar, long j3) throws IOException {
            while (true) {
                int i3 = this.f1198e;
                if (i3 != 0) {
                    long jA = this.f1194a.A(dVar, Math.min(j3, i3));
                    if (jA == -1) {
                        return -1L;
                    }
                    this.f1198e -= (int) jA;
                    return jA;
                }
                this.f1194a.k(this.f1199f);
                this.f1199f = (short) 0;
                if ((this.f1196c & 4) != 0) {
                    return -1L;
                }
                b();
            }
        }

        @Override // m2.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
