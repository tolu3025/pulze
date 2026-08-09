package w;

import android.content.Context;
import j.AbstractC0981b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: w.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1259b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f11530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a f11531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Context f11532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f11533d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f11534e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f11535f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f11536g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f11537h = false;

    /* JADX INFO: renamed from: w.b$a */
    public interface a {
        void a(AbstractC1259b abstractC1259b, Object obj);
    }

    public AbstractC1259b(Context context) {
        this.f11532c = context.getApplicationContext();
    }

    public void a() {
        this.f11534e = true;
        j();
    }

    public boolean b() {
        return k();
    }

    public void c() {
        this.f11537h = false;
    }

    public String d(Object obj) {
        StringBuilder sb = new StringBuilder(64);
        AbstractC0981b.a(obj, sb);
        sb.append("}");
        return sb.toString();
    }

    public void f(Object obj) {
        a aVar = this.f11531b;
        if (aVar != null) {
            aVar.a(this, obj);
        }
    }

    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f11530a);
        printWriter.print(" mListener=");
        printWriter.println(this.f11531b);
        if (this.f11533d || this.f11536g || this.f11537h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f11533d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f11536g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f11537h);
        }
        if (this.f11534e || this.f11535f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f11534e);
            printWriter.print(" mReset=");
            printWriter.println(this.f11535f);
        }
    }

    public void h() {
        m();
    }

    public boolean i() {
        return this.f11534e;
    }

    protected abstract boolean k();

    public void l() {
        if (this.f11533d) {
            h();
        } else {
            this.f11536g = true;
        }
    }

    protected abstract void o();

    public void q(int i3, a aVar) {
        if (this.f11531b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f11531b = aVar;
        this.f11530a = i3;
    }

    public void r() {
        n();
        this.f11535f = true;
        this.f11533d = false;
        this.f11534e = false;
        this.f11536g = false;
        this.f11537h = false;
    }

    public void s() {
        if (this.f11537h) {
            l();
        }
    }

    public final void t() {
        this.f11533d = true;
        this.f11535f = false;
        this.f11534e = false;
        o();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        AbstractC0981b.a(this, sb);
        sb.append(" id=");
        sb.append(this.f11530a);
        sb.append("}");
        return sb.toString();
    }

    public void u() {
        this.f11533d = false;
        p();
    }

    public void v(a aVar) {
        a aVar2 = this.f11531b;
        if (aVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (aVar2 != aVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f11531b = null;
    }

    public void e() {
    }

    protected void j() {
    }

    protected void m() {
    }

    protected void n() {
    }

    protected void p() {
    }
}
