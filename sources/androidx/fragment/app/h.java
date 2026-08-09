package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f4510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f4511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f4512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f4513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final j f4514e;

    h(Activity activity, Context context, Handler handler, int i3) {
        this.f4514e = new j();
        this.f4510a = activity;
        this.f4511b = (Context) j.e.c(context, "context == null");
        this.f4512c = (Handler) j.e.c(handler, "handler == null");
        this.f4513d = i3;
    }

    Activity f() {
        return this.f4510a;
    }

    Context g() {
        return this.f4511b;
    }

    Handler h() {
        return this.f4512c;
    }

    abstract void i(Fragment fragment);

    public abstract void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract Object m();

    public abstract LayoutInflater n();

    public abstract int o();

    public abstract boolean p();

    public abstract boolean q(Fragment fragment);

    public abstract void r(Fragment fragment, Intent intent, int i3, Bundle bundle);

    public abstract void s();

    h(d dVar) {
        this(dVar, dVar, new Handler(), 0);
    }
}
