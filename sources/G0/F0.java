package G0;

import V0.I;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final U1.l f1643a = b.f1645a;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1644a;

        static {
            int[] iArr = new int[I.c.values().length];
            try {
                iArr[I.c.NULL_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[I.c.ARRAY_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[I.c.TIMESTAMP_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[I.c.STRING_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[I.c.INTEGER_VALUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[I.c.DOUBLE_VALUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f1644a = iArr;
        }
    }

    static final class b implements U1.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f1645a = new b();

        b() {
        }

        @Override // U1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Void invoke(List list) {
            kotlin.jvm.internal.m.e(list, "<unused var>");
            throw new I1.l(null, 1, null);
        }
    }

    public static final U1.l a() {
        return f1643a;
    }
}
