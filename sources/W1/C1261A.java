package w1;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: renamed from: w1.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1261A extends l1.o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1261A f11561d = new C1261A();

    private C1261A() {
    }

    @Override // l1.o
    protected Object g(byte b3, ByteBuffer buffer) {
        kotlin.jvm.internal.m.e(buffer, "buffer");
        if (b3 != -128) {
            return super.g(b3, buffer);
        }
        Object objF = f(buffer);
        List list = objF instanceof List ? (List) objF : null;
        if (list != null) {
            return C1263C.f11562b.a(list);
        }
        return null;
    }

    @Override // l1.o
    protected void p(ByteArrayOutputStream stream, Object obj) {
        kotlin.jvm.internal.m.e(stream, "stream");
        if (!(obj instanceof C1263C)) {
            super.p(stream, obj);
        } else {
            stream.write(128);
            p(stream, ((C1263C) obj).a());
        }
    }
}
