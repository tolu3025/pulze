package j;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public class c extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private StringBuilder f9374b = new StringBuilder(128);

    public c(String str) {
        this.f9373a = str;
    }

    private void b() {
        if (this.f9374b.length() > 0) {
            Log.d(this.f9373a, this.f9374b.toString());
            StringBuilder sb = this.f9374b;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        b();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            char c3 = cArr[i3 + i5];
            if (c3 == '\n') {
                b();
            } else {
                this.f9374b.append(c3);
            }
        }
    }
}
