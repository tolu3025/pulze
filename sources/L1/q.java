package l1;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class q implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Charset f9795a = Charset.forName("UTF8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f9796b = new q();

    private q() {
    }

    @Override // l1.i
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String b(ByteBuffer byteBuffer) {
        byte[] bArrArray;
        int iArrayOffset;
        if (byteBuffer == null) {
            return null;
        }
        int iRemaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArrArray = byteBuffer.array();
            iArrayOffset = byteBuffer.arrayOffset();
        } else {
            bArrArray = new byte[iRemaining];
            byteBuffer.get(bArrArray);
            iArrayOffset = 0;
        }
        return new String(bArrArray, iArrayOffset, iRemaining, f9795a);
    }

    @Override // l1.i
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ByteBuffer a(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(f9795a);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bytes.length);
        byteBufferAllocateDirect.put(bytes);
        return byteBufferAllocateDirect;
    }
}
