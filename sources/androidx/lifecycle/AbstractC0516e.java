package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0516e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AtomicReference f4738a = new AtomicReference();

    /* JADX INFO: renamed from: androidx.lifecycle.e$a */
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static final C0092a Companion = new C0092a(null);

        /* JADX INFO: renamed from: androidx.lifecycle.e$a$a, reason: collision with other inner class name */
        public static final class C0092a {

            /* JADX INFO: renamed from: androidx.lifecycle.e$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0093a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f4739a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f4739a = iArr;
                }
            }

            private C0092a() {
            }

            public /* synthetic */ C0092a(kotlin.jvm.internal.h hVar) {
                this();
            }

            public final a a(b state) {
                kotlin.jvm.internal.m.e(state, "state");
                int i3 = C0093a.f4739a[state.ordinal()];
                if (i3 == 1) {
                    return a.ON_DESTROY;
                }
                if (i3 == 2) {
                    return a.ON_STOP;
                }
                if (i3 != 3) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            public final a b(b state) {
                kotlin.jvm.internal.m.e(state, "state");
                int i3 = C0093a.f4739a[state.ordinal()];
                if (i3 == 1) {
                    return a.ON_START;
                }
                if (i3 == 2) {
                    return a.ON_RESUME;
                }
                if (i3 != 5) {
                    return null;
                }
                return a.ON_CREATE;
            }
        }

        /* JADX INFO: renamed from: androidx.lifecycle.e$a$b */
        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f4740a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f4740a = iArr;
            }
        }

        public final b e() {
            switch (b.f4740a[ordinal()]) {
                case 1:
                case 2:
                    return b.CREATED;
                case 3:
                case 4:
                    return b.STARTED;
                case 5:
                    return b.RESUMED;
                case 6:
                    return b.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.e$b */
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean e(b state) {
            kotlin.jvm.internal.m.e(state, "state");
            return compareTo(state) >= 0;
        }
    }

    public abstract void a(h hVar);

    public abstract b b();

    public abstract void c(h hVar);
}
