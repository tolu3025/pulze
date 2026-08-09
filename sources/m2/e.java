package m2;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes.dex */
public interface e extends r, WritableByteChannel {
    e O(String str);

    @Override // m2.r, java.io.Flushable
    void flush();

    e m(int i3);

    e o(int i3);

    e v(int i3);

    e y(byte[] bArr);
}
