package androidx.fragment.app;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final g f4515b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f4516a = null;

    public abstract n a();

    public abstract void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract boolean c();

    public abstract Fragment d(String str);

    public g e() {
        if (this.f4516a == null) {
            this.f4516a = f4515b;
        }
        return this.f4516a;
    }

    public abstract List f();

    public abstract void g(int i3, int i4);

    public abstract boolean h();

    public void i(g gVar) {
        this.f4516a = gVar;
    }
}
