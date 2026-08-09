package z0;

import J0.A;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Charset f12085g = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f12086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InputStream f12087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InputStreamReader f12088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    e f12089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ByteBuffer f12090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f12091f;

    public f(g gVar, InputStream inputStream) {
        this.f12086a = gVar;
        this.f12087b = inputStream;
        this.f12088c = new InputStreamReader(inputStream);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1024);
        this.f12090e = byteBufferAllocate;
        byteBufferAllocate.flip();
    }

    private IllegalArgumentException a(String str) throws IOException {
        b();
        throw new IllegalArgumentException("Invalid bundle: " + str);
    }

    private c c(String str) {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("metadata")) {
            e eVarB = this.f12086a.b(jSONObject.getJSONObject("metadata"));
            A.a("BundleElement", "BundleMetadata element loaded", new Object[0]);
            return eVarB;
        }
        if (jSONObject.has("namedQuery")) {
            j jVarQ = this.f12086a.q(jSONObject.getJSONObject("namedQuery"));
            A.a("BundleElement", "Query loaded: " + jVarQ.b(), new Object[0]);
            return jVarQ;
        }
        if (jSONObject.has("documentMetadata")) {
            h hVarC = this.f12086a.c(jSONObject.getJSONObject("documentMetadata"));
            A.a("BundleElement", "Document metadata loaded: " + hVarC.b(), new Object[0]);
            return hVarC;
        }
        if (!jSONObject.has("document")) {
            throw a("Cannot decode unknown Bundle element: " + str);
        }
        b bVarF = this.f12086a.f(jSONObject.getJSONObject("document"));
        A.a("BundleElement", "Document loaded: " + bVarF.b(), new Object[0]);
        return bVarF;
    }

    private int g() {
        this.f12090e.mark();
        for (int i3 = 0; i3 < this.f12090e.remaining(); i3++) {
            try {
                if (this.f12090e.get() == 123) {
                    return i3;
                }
            } finally {
                this.f12090e.reset();
            }
        }
        this.f12090e.reset();
        return -1;
    }

    private boolean h() throws IOException {
        this.f12090e.compact();
        int i3 = this.f12087b.read(this.f12090e.array(), this.f12090e.arrayOffset() + this.f12090e.position(), this.f12090e.remaining());
        boolean z2 = i3 > 0;
        if (z2) {
            ByteBuffer byteBuffer = this.f12090e;
            byteBuffer.position(byteBuffer.position() + i3);
        }
        this.f12090e.flip();
        return z2;
    }

    private String i(int i3) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (i3 > 0) {
            if (this.f12090e.remaining() == 0 && !h()) {
                throw a("Reached the end of bundle when more data was expected.");
            }
            int iMin = Math.min(i3, this.f12090e.remaining());
            byteArrayOutputStream.write(this.f12090e.array(), this.f12090e.arrayOffset() + this.f12090e.position(), iMin);
            ByteBuffer byteBuffer = this.f12090e;
            byteBuffer.position(byteBuffer.position() + iMin);
            i3 -= iMin;
        }
        return byteArrayOutputStream.toString(f12085g.name());
    }

    private String j() {
        int iG;
        do {
            iG = g();
            if (iG != -1) {
                break;
            }
        } while (h());
        if (this.f12090e.remaining() == 0) {
            return null;
        }
        if (iG == -1) {
            throw a("Reached the end of bundle when a length string is expected.");
        }
        byte[] bArr = new byte[iG];
        this.f12090e.get(bArr);
        return f12085g.decode(ByteBuffer.wrap(bArr)).toString();
    }

    private c k() {
        String strJ = j();
        if (strJ == null) {
            return null;
        }
        int i3 = Integer.parseInt(strJ);
        String strI = i(i3);
        this.f12091f += (long) (strJ.getBytes(f12085g).length + i3);
        return c(strI);
    }

    public void b() throws IOException {
        this.f12087b.close();
    }

    public e d() {
        e eVar = this.f12089d;
        if (eVar != null) {
            return eVar;
        }
        c cVarK = k();
        if (!(cVarK instanceof e)) {
            throw a("Expected first element in bundle to be a metadata object");
        }
        e eVar2 = (e) cVarK;
        this.f12089d = eVar2;
        this.f12091f = 0L;
        return eVar2;
    }

    public long e() {
        return this.f12091f;
    }

    public c f() {
        d();
        return k();
    }
}
