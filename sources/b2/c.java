package b2;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f4951a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f4952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f4953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f4954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f4955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f4956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Charset f4957g;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        kotlin.jvm.internal.m.d(charsetForName, "forName(...)");
        f4952b = charsetForName;
        Charset charsetForName2 = Charset.forName("UTF-16");
        kotlin.jvm.internal.m.d(charsetForName2, "forName(...)");
        f4953c = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16BE");
        kotlin.jvm.internal.m.d(charsetForName3, "forName(...)");
        f4954d = charsetForName3;
        Charset charsetForName4 = Charset.forName("UTF-16LE");
        kotlin.jvm.internal.m.d(charsetForName4, "forName(...)");
        f4955e = charsetForName4;
        Charset charsetForName5 = Charset.forName("US-ASCII");
        kotlin.jvm.internal.m.d(charsetForName5, "forName(...)");
        f4956f = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        kotlin.jvm.internal.m.d(charsetForName6, "forName(...)");
        f4957g = charsetForName6;
    }

    private c() {
    }
}
