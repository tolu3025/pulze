package K;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0619t;
import com.google.android.gms.common.internal.AbstractC0643s;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final P.a f2563c = new P.a("RevokeAccessOperation", new String[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0619t f2565b = new C0619t(null);

    public f(String str) {
        this.f2564a = AbstractC0643s.e(str);
    }

    public static com.google.android.gms.common.api.g a(String str) {
        if (str == null) {
            return com.google.android.gms.common.api.h.a(new Status(4), null);
        }
        f fVar = new f(str);
        new Thread(fVar).start();
        return fVar.f2565b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.f5314m;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f2564a).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f5312f;
            } else {
                f2563c.c("Unable to revoke access!", new Object[0]);
            }
            f2563c.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e3) {
            f2563c.c("IOException when revoking access: ".concat(String.valueOf(e3.toString())), new Object[0]);
        } catch (Exception e4) {
            f2563c.c("Exception when revoking access: ".concat(String.valueOf(e4.toString())), new Object[0]);
        }
        this.f2565b.setResult(status);
    }
}
