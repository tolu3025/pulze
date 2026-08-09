package P;

import android.util.Log;
import com.google.android.gms.common.internal.C0635j;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f2740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0635j f2741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f2742d;

    public a(String str, String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append("] ");
            string = sb.toString();
        }
        this.f2740b = string;
        this.f2739a = str;
        this.f2741c = new C0635j(str);
        int i3 = 2;
        while (i3 <= 7 && !Log.isLoggable(this.f2739a, i3)) {
            i3++;
        }
        this.f2742d = i3;
    }

    public void a(String str, Object... objArr) {
        if (f(3)) {
            Log.d(this.f2739a, d(str, objArr));
        }
    }

    public void b(String str, Throwable th, Object... objArr) {
        Log.e(this.f2739a, d(str, objArr), th);
    }

    public void c(String str, Object... objArr) {
        Log.e(this.f2739a, d(str, objArr));
    }

    protected String d(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f2740b.concat(str);
    }

    public void e(String str, Object... objArr) {
        Log.i(this.f2739a, d(str, objArr));
    }

    public boolean f(int i3) {
        return this.f2742d <= i3;
    }

    public void g(String str, Object... objArr) {
        if (f(2)) {
            Log.v(this.f2739a, d(str, objArr));
        }
    }

    public void h(String str, Object... objArr) {
        Log.w(this.f2739a, d(str, objArr));
    }

    public void i(String str, Throwable th, Object... objArr) {
        Log.wtf(this.f2739a, d(str, objArr), th);
    }

    public void j(Throwable th) {
        Log.wtf(this.f2739a, th);
    }
}
