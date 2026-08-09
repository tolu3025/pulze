package m2;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: loaded from: classes.dex */
public interface r extends Closeable, Flushable {
    void T(d dVar, long j3);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();
}
