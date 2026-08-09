package R0;

import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public class b implements a {
    @Override // R0.a
    public HttpURLConnection a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }
}
