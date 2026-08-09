package P0;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Runtime f2750f = Runtime.getRuntime();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f2751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f2752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2753c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f2755e = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f2754d = false;

    public b(InputStream inputStream, int i3) {
        this.f2751a = inputStream;
        this.f2752b = new byte[i3];
    }

    private int g(int i3) {
        int iMax = Math.max(this.f2752b.length * 2, i3);
        Runtime runtime = f2750f;
        long jMaxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        if (!this.f2755e || iMax >= jMaxMemory) {
            Log.w("AdaptiveStreamBuffer", "Turning off adaptive buffer resizing to conserve memory.");
        } else {
            try {
                byte[] bArr = new byte[iMax];
                System.arraycopy(this.f2752b, 0, bArr, 0, this.f2753c);
                this.f2752b = bArr;
            } catch (OutOfMemoryError unused) {
                Log.w("AdaptiveStreamBuffer", "Turning off adaptive buffer resizing due to low memory.");
                this.f2755e = false;
            }
        }
        return this.f2752b.length;
    }

    public int a(int i3) {
        int i4 = this.f2753c;
        int i5 = 0;
        if (i3 <= i4) {
            int i6 = i4 - i3;
            this.f2753c = i6;
            byte[] bArr = this.f2752b;
            System.arraycopy(bArr, i3, bArr, 0, i6);
            return i3;
        }
        this.f2753c = 0;
        while (i5 < i3) {
            int iSkip = (int) this.f2751a.skip(i3 - i5);
            if (iSkip > 0) {
                i5 += iSkip;
            } else if (iSkip != 0) {
                continue;
            } else {
                if (this.f2751a.read() == -1) {
                    break;
                }
                i5++;
            }
        }
        return i5;
    }

    public int b() {
        return this.f2753c;
    }

    public void c() throws IOException {
        this.f2751a.close();
    }

    public int d(int i3) throws IOException {
        if (i3 > this.f2752b.length) {
            i3 = Math.min(i3, g(i3));
        }
        while (true) {
            int i4 = this.f2753c;
            if (i4 >= i3) {
                break;
            }
            int i5 = this.f2751a.read(this.f2752b, i4, i3 - i4);
            if (i5 == -1) {
                this.f2754d = true;
                break;
            }
            this.f2753c += i5;
        }
        return this.f2753c;
    }

    public byte[] e() {
        return this.f2752b;
    }

    public boolean f() {
        return this.f2754d;
    }
}
