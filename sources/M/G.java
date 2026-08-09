package M;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
abstract class G extends E {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final WeakReference f2643c = new WeakReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference f2644b;

    G(byte[] bArr) {
        super(bArr);
        this.f2644b = f2643c;
    }

    @Override // M.E
    final byte[] a() {
        byte[] bArrF;
        synchronized (this) {
            try {
                bArrF = (byte[]) this.f2644b.get();
                if (bArrF == null) {
                    bArrF = f();
                    this.f2644b = new WeakReference(bArrF);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrF;
    }

    protected abstract byte[] f();
}
