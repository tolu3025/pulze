package E1;

import com.google.android.gms.common.api.a;
import com.google.protobuf.AbstractC0792j;
import com.google.protobuf.C0799q;
import com.google.protobuf.D;
import com.google.protobuf.V;
import com.google.protobuf.f0;
import e0.AbstractC0829j;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import y1.Q;
import y1.a0;
import y1.l0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static volatile C0799q f1412a = C0799q.b();

    private static final class a implements a0.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final ThreadLocal f1413d = new ThreadLocal();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f0 f1414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final V f1415b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f1416c;

        a(V v2, int i3) {
            this.f1415b = (V) AbstractC0829j.o(v2, "defaultInstance cannot be null");
            this.f1414a = v2.j();
            this.f1416c = i3;
        }

        private V d(AbstractC0792j abstractC0792j) throws D {
            V v2 = (V) this.f1414a.a(abstractC0792j, b.f1412a);
            try {
                abstractC0792j.a(0);
                return v2;
            } catch (D e3) {
                e3.k(v2);
                throw e3;
            }
        }

        @Override // y1.a0.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public V b(InputStream inputStream) {
            AbstractC0792j abstractC0792jG;
            byte[] bArr;
            if ((inputStream instanceof E1.a) && ((E1.a) inputStream).f() == this.f1414a) {
                try {
                    return ((E1.a) inputStream).c();
                } catch (IllegalStateException unused) {
                }
            }
            try {
                if (inputStream instanceof Q) {
                    int iAvailable = inputStream.available();
                    if (iAvailable <= 0 || iAvailable > 4194304) {
                        if (iAvailable == 0) {
                            return this.f1415b;
                        }
                        abstractC0792jG = null;
                    } else {
                        ThreadLocal threadLocal = f1413d;
                        Reference reference = (Reference) threadLocal.get();
                        if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < iAvailable) {
                            bArr = new byte[iAvailable];
                            threadLocal.set(new WeakReference(bArr));
                        }
                        int i3 = iAvailable;
                        while (i3 > 0) {
                            int i4 = inputStream.read(bArr, iAvailable - i3, i3);
                            if (i4 == -1) {
                                break;
                            }
                            i3 -= i4;
                        }
                        if (i3 != 0) {
                            throw new RuntimeException("size inaccurate: " + iAvailable + " != " + (iAvailable - i3));
                        }
                        abstractC0792jG = AbstractC0792j.l(bArr, 0, iAvailable);
                    }
                } else {
                    abstractC0792jG = null;
                }
                if (abstractC0792jG == null) {
                    abstractC0792jG = AbstractC0792j.g(inputStream);
                }
                abstractC0792jG.I(a.e.API_PRIORITY_OTHER);
                int i5 = this.f1416c;
                if (i5 >= 0) {
                    abstractC0792jG.H(i5);
                }
                try {
                    return d(abstractC0792jG);
                } catch (D e3) {
                    throw l0.f11974s.q("Invalid protobuf byte sequence").p(e3).d();
                }
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        }

        @Override // y1.a0.c
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public InputStream a(V v2) {
            return new E1.a(v2, this.f1414a);
        }
    }

    static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        AbstractC0829j.o(inputStream, "inputStream cannot be null!");
        AbstractC0829j.o(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j3 = 0;
        while (true) {
            int i3 = inputStream.read(bArr);
            if (i3 == -1) {
                return j3;
            }
            outputStream.write(bArr, 0, i3);
            j3 += (long) i3;
        }
    }

    public static a0.c b(V v2) {
        return new a(v2, -1);
    }
}
