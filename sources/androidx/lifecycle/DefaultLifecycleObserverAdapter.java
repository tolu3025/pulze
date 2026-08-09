package androidx.lifecycle;

import androidx.lifecycle.AbstractC0516e;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DefaultLifecycleObserver f4699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f4700b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4701a;

        static {
            int[] iArr = new int[AbstractC0516e.a.values().length];
            try {
                iArr[AbstractC0516e.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC0516e.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC0516e.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC0516e.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC0516e.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC0516e.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC0516e.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f4701a = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(DefaultLifecycleObserver defaultLifecycleObserver, g gVar) {
        kotlin.jvm.internal.m.e(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f4699a = defaultLifecycleObserver;
        this.f4700b = gVar;
    }

    @Override // androidx.lifecycle.g
    public void d(i source, AbstractC0516e.a event) {
        kotlin.jvm.internal.m.e(source, "source");
        kotlin.jvm.internal.m.e(event, "event");
        switch (a.f4701a[event.ordinal()]) {
            case 1:
                this.f4699a.c(source);
                break;
            case 2:
                this.f4699a.g(source);
                break;
            case 3:
                this.f4699a.a(source);
                break;
            case 4:
                this.f4699a.f(source);
                break;
            case 5:
                this.f4699a.h(source);
                break;
            case 6:
                this.f4699a.b(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        g gVar = this.f4700b;
        if (gVar != null) {
            gVar.d(source, event);
        }
    }
}
