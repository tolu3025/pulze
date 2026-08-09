package B1;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static String a(String str, String str2) {
        try {
            return "Basic " + m2.g.p((str + ":" + str2).getBytes("ISO-8859-1")).c();
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }
}
