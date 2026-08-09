package Q0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.C0779n;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k0.C0992f;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Uri f2783k = Uri.parse("https://firebasestorage.googleapis.com/v0");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static R0.a f2784l = new R0.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Exception f2785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private P0.h f2786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f2787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f2788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f2789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f2790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f2791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InputStream f2792h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private HttpURLConnection f2793i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map f2794j = new HashMap();

    public e(P0.h hVar, C0992f c0992f) {
        AbstractC0643s.k(hVar);
        AbstractC0643s.k(c0992f);
        this.f2786b = hVar;
        this.f2787c = c0992f.m();
        G("x-firebase-gmpid", c0992f.r().c());
    }

    private final void A(String str, String str2) {
        D(str, str2);
        try {
            E();
        } catch (IOException e3) {
            Log.w("NetworkRequest", "error sending network request " + e() + " " + u(), e3);
            this.f2785a = e3;
            this.f2789e = -2;
        }
        C();
    }

    private void E() throws IOException {
        if (v()) {
            z(this.f2792h);
        } else {
            w(this.f2792h);
        }
    }

    private void b(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        byte[] bArrH;
        int i3;
        String string;
        AbstractC0643s.k(httpURLConnection);
        if (TextUtils.isEmpty(str)) {
            Log.w("NetworkRequest", "no auth token for request");
        } else {
            httpURLConnection.setRequestProperty("Authorization", "Firebase " + str);
        }
        if (TextUtils.isEmpty(str2)) {
            Log.w("NetworkRequest", "No App Check token for request.");
        } else {
            httpURLConnection.setRequestProperty("x-firebase-appcheck", str2);
        }
        httpURLConnection.setRequestProperty("X-Firebase-Storage-Version", "Android/22.0.1");
        for (Map.Entry entry : this.f2794j.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        JSONObject jSONObjectG = g();
        if (jSONObjectG != null) {
            bArrH = jSONObjectG.toString().getBytes("UTF-8");
            i3 = bArrH.length;
        } else {
            bArrH = h();
            i3 = i();
            if (i3 == 0 && bArrH != null) {
                i3 = bArrH.length;
            }
        }
        if (bArrH == null || bArrH.length <= 0) {
            string = "0";
        } else {
            if (jSONObjectG != null) {
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
            }
            httpURLConnection.setDoOutput(true);
            string = Integer.toString(i3);
        }
        httpURLConnection.setRequestProperty("Content-Length", string);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if (bArrH == null || bArrH.length <= 0) {
            return;
        }
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream == null) {
            Log.e("NetworkRequest", "Unable to write to the http request!");
            return;
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        try {
            bufferedOutputStream.write(bArrH, 0, i3);
        } finally {
            bufferedOutputStream.close();
        }
    }

    private HttpURLConnection c() {
        Uri uriU = u();
        Map mapL = l();
        if (mapL != null) {
            Uri.Builder builderBuildUpon = uriU.buildUpon();
            for (Map.Entry entry : mapL.entrySet()) {
                builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            uriU = builderBuildUpon.build();
        }
        return f2784l.a(new URL(uriU.toString()));
    }

    private boolean d(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        this.f2785a = new SocketException("Network subsystem is unavailable");
        this.f2789e = -2;
        return false;
    }

    private static String k(Uri uri) {
        String path = uri.getPath();
        return path == null ? "" : path.startsWith("/") ? path.substring(1) : path;
    }

    private void x(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        if (inputStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    } else {
                        sb.append(line);
                    }
                } finally {
                    bufferedReader.close();
                }
            }
        }
        this.f2790f = sb.toString();
        if (v()) {
            return;
        }
        this.f2785a = new IOException(this.f2790f);
    }

    private void y(HttpURLConnection httpURLConnection) {
        AbstractC0643s.k(httpURLConnection);
        this.f2789e = httpURLConnection.getResponseCode();
        this.f2788d = httpURLConnection.getHeaderFields();
        this.f2791g = httpURLConnection.getContentLength();
        this.f2792h = v() ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
    }

    public void B(String str, String str2, Context context) {
        if (d(context)) {
            A(str, str2);
        }
    }

    public void C() {
        HttpURLConnection httpURLConnection = this.f2793i;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public void D(String str, String str2) {
        if (this.f2785a != null) {
            this.f2789e = -1;
            return;
        }
        if (Log.isLoggable("NetworkRequest", 3)) {
            Log.d("NetworkRequest", "sending network request " + e() + " " + u());
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f2787c.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            this.f2789e = -2;
            this.f2785a = new SocketException("Network subsystem is unavailable");
            return;
        }
        try {
            HttpURLConnection httpURLConnectionC = c();
            this.f2793i = httpURLConnectionC;
            httpURLConnectionC.setRequestMethod(e());
            b(this.f2793i, str, str2);
            y(this.f2793i);
            if (Log.isLoggable("NetworkRequest", 3)) {
                Log.d("NetworkRequest", "network request result " + this.f2789e);
            }
        } catch (IOException e3) {
            Log.w("NetworkRequest", "error sending network request " + e() + " " + u(), e3);
            this.f2785a = e3;
            this.f2789e = -2;
        }
    }

    public final void F() {
        this.f2785a = null;
        this.f2789e = 0;
    }

    public void G(String str, String str2) {
        this.f2794j.put(str, str2);
    }

    public void a(TaskCompletionSource taskCompletionSource, Object obj) {
        Exception excF = f();
        if (v() && excF == null) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(C0779n.e(excF, o()));
        }
    }

    protected abstract String e();

    public Exception f() {
        return this.f2785a;
    }

    protected JSONObject g() {
        return null;
    }

    protected byte[] h() {
        return null;
    }

    protected int i() {
        return 0;
    }

    String j() {
        return k(this.f2786b.a());
    }

    protected Map l() {
        return null;
    }

    public String m() {
        return this.f2790f;
    }

    public JSONObject n() {
        if (TextUtils.isEmpty(this.f2790f)) {
            return new JSONObject();
        }
        try {
            return new JSONObject(this.f2790f);
        } catch (JSONException e3) {
            Log.e("NetworkRequest", "error parsing result into JSON:" + this.f2790f, e3);
            return new JSONObject();
        }
    }

    public int o() {
        return this.f2789e;
    }

    public Map p() {
        return this.f2788d;
    }

    public String q(String str) {
        List list;
        Map mapP = p();
        if (mapP == null || (list = (List) mapP.get(str)) == null || list.size() <= 0) {
            return null;
        }
        return (String) list.get(0);
    }

    public int r() {
        return this.f2791g;
    }

    protected P0.h s() {
        return this.f2786b;
    }

    public InputStream t() {
        return this.f2792h;
    }

    public Uri u() {
        return this.f2786b.c();
    }

    public boolean v() {
        int i3 = this.f2789e;
        return i3 >= 200 && i3 < 300;
    }

    protected void w(InputStream inputStream) throws IOException {
        x(inputStream);
    }

    protected void z(InputStream inputStream) throws IOException {
        x(inputStream);
    }
}
