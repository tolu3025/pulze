package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.AbstractC0604d;
import com.google.android.gms.common.api.internal.AbstractC0613m;
import com.google.android.gms.common.api.internal.AbstractC0615o;
import com.google.android.gms.common.api.internal.AbstractC0616p;
import com.google.android.gms.common.api.internal.AbstractC0620u;
import com.google.android.gms.common.api.internal.AbstractC0622w;
import com.google.android.gms.common.api.internal.C0601a;
import com.google.android.gms.common.api.internal.C0602b;
import com.google.android.gms.common.api.internal.C0607g;
import com.google.android.gms.common.api.internal.C0612l;
import com.google.android.gms.common.api.internal.C0624y;
import com.google.android.gms.common.api.internal.G;
import com.google.android.gms.common.api.internal.InterfaceC0618s;
import com.google.android.gms.common.api.internal.M;
import com.google.android.gms.common.api.internal.Z;
import com.google.android.gms.common.internal.AbstractC0629d;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.common.internal.C0630e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    protected final C0607g zaa;
    private final Context zab;
    private final String zac;
    private final T.a zad;
    private final com.google.android.gms.common.api.a zae;
    private final a.d zaf;
    private final C0602b zag;
    private final Looper zah;
    private final int zai;
    private final f zaj;
    private final InterfaceC0618s zak;

    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f5327c = new C0108a().a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC0618s f5328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Looper f5329b;

        /* JADX INFO: renamed from: com.google.android.gms.common.api.e$a$a, reason: collision with other inner class name */
        public static class C0108a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private InterfaceC0618s f5330a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Looper f5331b;

            /* JADX WARN: Multi-variable type inference failed */
            public a a() {
                if (this.f5330a == null) {
                    this.f5330a = new C0601a();
                }
                if (this.f5331b == null) {
                    this.f5331b = Looper.getMainLooper();
                }
                return new a(this.f5330a, null, this.f5331b, 0 == true ? 1 : 0);
            }

            public C0108a b(Looper looper) {
                AbstractC0643s.l(looper, "Looper must not be null.");
                this.f5331b = looper;
                return this;
            }

            public C0108a c(InterfaceC0618s interfaceC0618s) {
                AbstractC0643s.l(interfaceC0618s, "StatusExceptionMapper must not be null.");
                this.f5330a = interfaceC0618s;
                return this;
            }
        }

        private a(InterfaceC0618s interfaceC0618s, Account account, Looper looper) {
            this.f5328a = interfaceC0618s;
            this.f5329b = looper;
        }

        /* synthetic */ a(InterfaceC0618s interfaceC0618s, Account account, Looper looper, byte[] bArr) {
            this(interfaceC0618s, null, looper);
        }
    }

    public e(Activity activity, com.google.android.gms.common.api.a aVar, a.d dVar, a aVar2) {
        this(activity, activity, aVar, dVar, aVar2);
    }

    private final AbstractC0604d c(int i3, AbstractC0604d abstractC0604d) {
        abstractC0604d.zak();
        this.zaa.v(this, i3, abstractC0604d);
        return abstractC0604d;
    }

    private final Task d(int i3, AbstractC0620u abstractC0620u) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zaa.w(this, i3, abstractC0620u, taskCompletionSource, this.zak);
        return taskCompletionSource.getTask();
    }

    public f asGoogleApiClient() {
        return this.zaj;
    }

    protected C0630e.a createClientSettingsBuilder() {
        C0630e.a aVar = new C0630e.a();
        aVar.c(null);
        aVar.d(Collections.emptySet());
        Context context = this.zab;
        aVar.e(context.getClass().getName());
        aVar.b(context.getPackageName());
        return aVar;
    }

    protected Task<Boolean> disconnectService() {
        return this.zaa.u(this);
    }

    public <A extends a.b, T extends AbstractC0604d> T doBestEffortWrite(T t2) {
        c(2, t2);
        return t2;
    }

    public <A extends a.b, T extends AbstractC0604d> T doRead(T t2) {
        c(0, t2);
        return t2;
    }

    @Deprecated
    public <A extends a.b, T extends AbstractC0615o, U extends AbstractC0622w> Task<Void> doRegisterEventListener(T t2, U u2) {
        AbstractC0643s.k(t2);
        AbstractC0643s.k(u2);
        throw null;
    }

    public Task<Boolean> doUnregisterEventListener(C0612l.a aVar) {
        return doUnregisterEventListener(aVar, 0);
    }

    public <A extends a.b, T extends AbstractC0604d> T doWrite(T t2) {
        c(1, t2);
        return t2;
    }

    protected String getApiFallbackAttributionTag(Context context) {
        return null;
    }

    public final C0602b getApiKey() {
        return this.zag;
    }

    public a.d getApiOptions() {
        return this.zaf;
    }

    public Context getApplicationContext() {
        return this.zab;
    }

    protected String getContextAttributionTag() {
        return this.zac;
    }

    @Deprecated
    protected String getContextFeatureId() {
        return this.zac;
    }

    public Looper getLooper() {
        return this.zah;
    }

    public <L> C0612l registerListener(L l3, String str) {
        return AbstractC0613m.a(l3, this.zah, str);
    }

    public final int zab() {
        return this.zai;
    }

    public final Z zac(Context context, Handler handler) {
        return new Z(context, handler, createClientSettingsBuilder().a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a.f zaf(Looper looper, G g3) {
        C0630e c0630eA = createClientSettingsBuilder().a();
        a.f fVarBuildClient = ((a.AbstractC0106a) AbstractC0643s.k(this.zae.a())).buildClient(this.zab, looper, c0630eA, (Object) this.zaf, (f.a) g3, (f.b) g3);
        T.a aVar = this.zad;
        if (aVar != null && (fVarBuildClient instanceof AbstractC0629d)) {
            ((AbstractC0629d) fVarBuildClient).setAttributionSourceWrapper(aVar);
            return fVarBuildClient;
        }
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (fVarBuildClient instanceof AbstractC0629d)) {
            ((AbstractC0629d) fVarBuildClient).setAttributionTag(contextAttributionTag);
        }
        return fVarBuildClient;
    }

    public e(Activity activity, com.google.android.gms.common.api.a aVar, a.d dVar, InterfaceC0618s interfaceC0618s) {
        a.C0108a c0108a = new a.C0108a();
        c0108a.c(interfaceC0618s);
        c0108a.b(activity.getMainLooper());
        this(activity, aVar, dVar, c0108a.a());
    }

    public <TResult, A extends a.b> Task<TResult> doBestEffortWrite(AbstractC0620u abstractC0620u) {
        return d(2, abstractC0620u);
    }

    public <TResult, A extends a.b> Task<TResult> doRead(AbstractC0620u abstractC0620u) {
        return d(0, abstractC0620u);
    }

    public <A extends a.b> Task<Void> doRegisterEventListener(AbstractC0616p abstractC0616p) {
        AbstractC0643s.k(abstractC0616p);
        throw null;
    }

    public Task<Boolean> doUnregisterEventListener(C0612l.a aVar, int i3) {
        AbstractC0643s.l(aVar, "Listener key cannot be null.");
        return this.zaa.y(this, aVar, i3);
    }

    public <TResult, A extends a.b> Task<TResult> doWrite(AbstractC0620u abstractC0620u) {
        return d(1, abstractC0620u);
    }

    private e(Context context, Activity activity, com.google.android.gms.common.api.a aVar, a.d dVar, a aVar2) {
        AbstractC0643s.l(context, "Null context is not permitted.");
        AbstractC0643s.l(aVar, "Api must not be null.");
        AbstractC0643s.l(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) AbstractC0643s.l(context.getApplicationContext(), "The provided context did not have an application context.");
        this.zab = context2;
        int i3 = Build.VERSION.SDK_INT;
        String strC = i3 >= 30 ? androidx.core.content.a.c(context) : getApiFallbackAttributionTag(context);
        this.zac = strC;
        this.zad = i3 >= 31 ? new T.a(context.getAttributionSource()) : null;
        this.zae = aVar;
        this.zaf = dVar;
        this.zah = aVar2.f5329b;
        C0602b c0602bA = C0602b.a(aVar, dVar, strC);
        this.zag = c0602bA;
        this.zaj = new M(this);
        C0607g c0607gN = C0607g.n(context2);
        this.zaa = c0607gN;
        this.zai = c0607gN.o();
        this.zak = aVar2.f5328a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C0624y.i(activity, c0607gN, c0602bA);
        }
        c0607gN.p(this);
    }

    public e(Context context, com.google.android.gms.common.api.a aVar, a.d dVar, a aVar2) {
        this(context, null, aVar, dVar, aVar2);
    }
}
