package S1;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
final class c extends ByteArrayOutputStream {
    public c(int i3) {
        super(i3);
    }

    public final byte[] b() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        m.d(buf, "buf");
        return buf;
    }
}
