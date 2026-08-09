package t1;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: renamed from: t1.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1246u extends l1.o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1246u f11454d = new C1246u();

    private C1246u() {
    }

    @Override // l1.o
    protected Object g(byte b3, ByteBuffer buffer) {
        kotlin.jvm.internal.m.e(buffer, "buffer");
        if (b3 == -128) {
            Object objF = f(buffer);
            List list = objF instanceof List ? (List) objF : null;
            if (list != null) {
                return J.f11358b.a(list);
            }
            return null;
        }
        if (b3 == -127) {
            Object objF2 = f(buffer);
            List list2 = objF2 instanceof List ? (List) objF2 : null;
            if (list2 != null) {
                return K.f11360c.a(list2);
            }
            return null;
        }
        if (b3 == -126) {
            Object objF3 = f(buffer);
            List list3 = objF3 instanceof List ? (List) objF3 : null;
            if (list3 != null) {
                return L.f11363d.a(list3);
            }
            return null;
        }
        if (b3 == -125) {
            Object objF4 = f(buffer);
            List list4 = objF4 instanceof List ? (List) objF4 : null;
            if (list4 != null) {
                return M.f11367g.a(list4);
            }
            return null;
        }
        if (b3 == -124) {
            Object objF5 = f(buffer);
            List list5 = objF5 instanceof List ? (List) objF5 : null;
            if (list5 != null) {
                return N.f11374d.a(list5);
            }
            return null;
        }
        if (b3 != -123) {
            return super.g(b3, buffer);
        }
        Object objF6 = f(buffer);
        List list6 = objF6 instanceof List ? (List) objF6 : null;
        if (list6 != null) {
            return O.f11378d.a(list6);
        }
        return null;
    }

    @Override // l1.o
    protected void p(ByteArrayOutputStream stream, Object obj) {
        List listC;
        kotlin.jvm.internal.m.e(stream, "stream");
        if (obj instanceof J) {
            stream.write(128);
            listC = ((J) obj).a();
        } else if (obj instanceof K) {
            stream.write(129);
            listC = ((K) obj).c();
        } else if (obj instanceof L) {
            stream.write(130);
            listC = ((L) obj).a();
        } else if (obj instanceof M) {
            stream.write(131);
            listC = ((M) obj).g();
        } else {
            if (!(obj instanceof N)) {
                if (!(obj instanceof O)) {
                    super.p(stream, obj);
                    return;
                } else {
                    stream.write(133);
                    p(stream, ((O) obj).b());
                    return;
                }
            }
            stream.write(132);
            listC = ((N) obj).c();
        }
        p(stream, listC);
    }
}
