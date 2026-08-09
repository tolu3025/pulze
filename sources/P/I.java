package p;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class I extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileOutputStream f10000a;

    public I(FileOutputStream fileOutputStream) {
        kotlin.jvm.internal.m.e(fileOutputStream, "fileOutputStream");
        this.f10000a = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f10000a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i3) throws IOException {
        this.f10000a.write(i3);
    }

    @Override // java.io.OutputStream
    public void write(byte[] b3) throws IOException {
        kotlin.jvm.internal.m.e(b3, "b");
        this.f10000a.write(b3);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bytes, int i3, int i4) throws IOException {
        kotlin.jvm.internal.m.e(bytes, "bytes");
        this.f10000a.write(bytes, i3, i4);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
