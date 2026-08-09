package J0;

/* JADX INFO: loaded from: classes.dex */
public abstract class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f2426a = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final V0.I a(Y0.h matcher) {
            String strE;
            kotlin.jvm.internal.m.e(matcher, "matcher");
            if (matcher.f() > 1) {
                throw new IllegalArgumentException("At most one capture group is supported");
            }
            if (matcher.f() == 0) {
                strE = matcher.d();
            } else {
                if (matcher.e(1) == null) {
                    return D0.z.f1310c;
                }
                strE = matcher.e(1);
            }
            kotlin.jvm.internal.m.d(strE, "group(...)");
            return D0.z.G(strE);
        }
    }
}
