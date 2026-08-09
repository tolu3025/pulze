package K;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.AbstractC0643s;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Lock f2559c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static c f2560d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lock f2561a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f2562b;

    c(Context context) {
        this.f2562b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static c b(Context context) {
        AbstractC0643s.k(context);
        Lock lock = f2559c;
        lock.lock();
        try {
            if (f2560d == null) {
                f2560d = new c(context.getApplicationContext());
            }
            c cVar = f2560d;
            lock.unlock();
            return cVar;
        } catch (Throwable th) {
            f2559c.unlock();
            throw th;
        }
    }

    private static final String i(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    public void a() {
        this.f2561a.lock();
        try {
            this.f2562b.edit().clear().apply();
        } finally {
            this.f2561a.unlock();
        }
    }

    public GoogleSignInAccount c() {
        String strH;
        String strH2 = h("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strH2) || (strH = h(i("googleSignInAccount", strH2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.y(strH);
        } catch (JSONException unused) {
            return null;
        }
    }

    public GoogleSignInOptions d() {
        String strH;
        String strH2 = h("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strH2) || (strH = h(i("googleSignInOptions", strH2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.A(strH);
        } catch (JSONException unused) {
            return null;
        }
    }

    public String e() {
        return h("refreshToken");
    }

    public void f(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        AbstractC0643s.k(googleSignInAccount);
        AbstractC0643s.k(googleSignInOptions);
        g("defaultGoogleSignInAccount", googleSignInAccount.A());
        AbstractC0643s.k(googleSignInAccount);
        AbstractC0643s.k(googleSignInOptions);
        String strA = googleSignInAccount.A();
        g(i("googleSignInAccount", strA), googleSignInAccount.B());
        g(i("googleSignInOptions", strA), googleSignInOptions.B());
    }

    protected final void g(String str, String str2) {
        this.f2561a.lock();
        try {
            this.f2562b.edit().putString(str, str2).apply();
        } finally {
            this.f2561a.unlock();
        }
    }

    protected final String h(String str) {
        this.f2561a.lock();
        try {
            return this.f2562b.getString(str, null);
        } finally {
            this.f2561a.unlock();
        }
    }
}
