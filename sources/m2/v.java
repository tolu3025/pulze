package m2;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    public static final byte[] a(String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        byte[] bytes = str.getBytes(b2.c.f4952b);
        kotlin.jvm.internal.m.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final String b(byte[] bArr) {
        kotlin.jvm.internal.m.e(bArr, "<this>");
        return new String(bArr, b2.c.f4952b);
    }
}
