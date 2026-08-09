package com.google.android.gms.common.internal;

import M.C0413a;
import M.C0415c;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.AttributionSource;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0629d {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private volatile String zzA;
    private volatile T.a zzB;
    q0 zza;
    final Handler zzb;
    protected c zzc;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private final Context zzl;
    private final Looper zzm;
    private final AbstractC0634i zzn;
    private final M.j zzo;
    private InterfaceC0639n zzr;
    private IInterface zzs;
    private e0 zzu;
    private final a zzw;
    private final b zzx;
    private final int zzy;
    private final String zzz;
    private static final C0415c[] zze = new C0415c[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};
    private volatile String zzk = null;
    private final Object zzp = new Object();
    private final Object zzq = new Object();
    private final ArrayList zzt = new ArrayList();
    private int zzv = 1;
    private C0413a zzC = null;
    private boolean zzD = false;
    private volatile h0 zzE = null;
    protected AtomicInteger zzd = new AtomicInteger(0);

    /* JADX INFO: renamed from: com.google.android.gms.common.internal.d$a */
    public interface a {
        void a(int i3);

        void f(Bundle bundle);
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.internal.d$b */
    public interface b {
        void b(C0413a c0413a);
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.internal.d$c */
    public interface c {
        void b(C0413a c0413a);
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.internal.d$d, reason: collision with other inner class name */
    protected class C0109d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC0629d f5524a;

        public C0109d(AbstractC0629d abstractC0629d) {
            Objects.requireNonNull(abstractC0629d);
            this.f5524a = abstractC0629d;
        }

        @Override // com.google.android.gms.common.internal.AbstractC0629d.c
        public final void b(C0413a c0413a) {
            if (c0413a.x()) {
                AbstractC0629d abstractC0629d = this.f5524a;
                abstractC0629d.getRemoteService(null, abstractC0629d.getScopes());
            } else {
                AbstractC0629d abstractC0629d2 = this.f5524a;
                if (abstractC0629d2.zzl() != null) {
                    abstractC0629d2.zzl().b(c0413a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.internal.d$e */
    public interface e {
        void a();
    }

    protected AbstractC0629d(Context context, Looper looper, AbstractC0634i abstractC0634i, M.j jVar, int i3, a aVar, b bVar, String str) {
        AbstractC0643s.l(context, "Context must not be null");
        this.zzl = context;
        AbstractC0643s.l(looper, "Looper must not be null");
        this.zzm = looper;
        AbstractC0643s.l(abstractC0634i, "Supervisor must not be null");
        this.zzn = abstractC0634i;
        AbstractC0643s.l(jVar, "API availability must not be null");
        this.zzo = jVar;
        this.zzb = new b0(this, looper);
        this.zzy = i3;
        this.zzw = aVar;
        this.zzx = bVar;
        this.zzz = str;
    }

    private final void c(int i3, IInterface iInterface) {
        q0 q0Var;
        AbstractC0643s.a((i3 == 4) == (iInterface != null));
        synchronized (this.zzp) {
            try {
                this.zzv = i3;
                this.zzs = iInterface;
                Bundle bundle = null;
                if (i3 == 1) {
                    e0 e0Var = this.zzu;
                    if (e0Var != null) {
                        AbstractC0634i abstractC0634i = this.zzn;
                        String strA = this.zza.a();
                        AbstractC0643s.k(strA);
                        abstractC0634i.d(strA, this.zza.b(), 4225, e0Var, zza(), this.zza.c());
                        this.zzu = null;
                    }
                } else if (i3 == 2 || i3 == 3) {
                    e0 e0Var2 = this.zzu;
                    if (e0Var2 != null && (q0Var = this.zza) != null) {
                        String strA2 = q0Var.a();
                        String strB = q0Var.b();
                        StringBuilder sb = new StringBuilder(String.valueOf(strA2).length() + 70 + String.valueOf(strB).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(strA2);
                        sb.append(" on ");
                        sb.append(strB);
                        Log.e("GmsClient", sb.toString());
                        AbstractC0634i abstractC0634i2 = this.zzn;
                        String strA3 = this.zza.a();
                        AbstractC0643s.k(strA3);
                        abstractC0634i2.d(strA3, this.zza.b(), 4225, e0Var2, zza(), this.zza.c());
                        this.zzd.incrementAndGet();
                    }
                    e0 e0Var3 = new e0(this, this.zzd.get());
                    this.zzu = e0Var3;
                    q0 q0Var2 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new q0(getStartServicePackage(), getStartServiceAction(), false, 4225, getUseDynamicLookup()) : new q0(getContext().getPackageName(), getLocalStartServiceAction(), true, 4225, false);
                    this.zza = q0Var2;
                    if (q0Var2.c() && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.a())));
                    }
                    AbstractC0634i abstractC0634i3 = this.zzn;
                    String strA4 = this.zza.a();
                    AbstractC0643s.k(strA4);
                    C0413a c0413aC = abstractC0634i3.c(new l0(strA4, this.zza.b(), 4225, this.zza.c()), e0Var3, zza(), getBindServiceExecutor());
                    if (!c0413aC.x()) {
                        String strA5 = this.zza.a();
                        String strB2 = this.zza.b();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(strA5).length() + 34 + String.valueOf(strB2).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(strA5);
                        sb2.append(" on ");
                        sb2.append(strB2);
                        Log.w("GmsClient", sb2.toString());
                        int iT = c0413aC.t() == -1 ? 16 : c0413aC.t();
                        if (c0413aC.v() != null) {
                            bundle = new Bundle();
                            bundle.putParcelable(KEY_PENDING_INTENT, c0413aC.v());
                        }
                        zzb(iT, bundle, this.zzd.get());
                    }
                } else if (i3 == 4) {
                    AbstractC0643s.k(iInterface);
                    onConnectedLocked(iInterface);
                }
            } finally {
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int iG = this.zzo.g(this.zzl, getMinApkVersion());
        if (iG == 0) {
            connect(new C0109d(this));
        } else {
            c(1, null);
            triggerNotAvailable(new C0109d(this), iG, null);
        }
    }

    protected final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(c cVar) {
        AbstractC0643s.l(cVar, "Connection progress callbacks cannot be null.");
        this.zzc = cVar;
        c(2, null);
    }

    protected abstract IInterface createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        ArrayList arrayList = this.zzt;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((c0) arrayList.get(i3)).d();
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        c(1, null);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i3;
        IInterface iInterface;
        InterfaceC0639n interfaceC0639n;
        synchronized (this.zzp) {
            i3 = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            interfaceC0639n = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        printWriter.print(i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? "UNKNOWN" : "DISCONNECTING" : "CONNECTED" : "LOCAL_CONNECTING" : "REMOTE_CONNECTING" : "DISCONNECTED");
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (interfaceC0639n == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(interfaceC0639n.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j3 = this.zzh;
            String str2 = simpleDateFormat.format(new Date(j3));
            StringBuilder sb = new StringBuilder(String.valueOf(j3).length() + 1 + String.valueOf(str2).length());
            sb.append(j3);
            sb.append(" ");
            sb.append(str2);
            printWriterAppend.println(sb.toString());
        }
        if (this.zzg > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i4 = this.zzf;
            printWriter.append((CharSequence) (i4 != 1 ? i4 != 2 ? i4 != 3 ? String.valueOf(i4) : "CAUSE_DEAD_OBJECT_EXCEPTION" : "CAUSE_NETWORK_LOST" : "CAUSE_SERVICE_DISCONNECTED"));
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j4 = this.zzg;
            String str3 = simpleDateFormat.format(new Date(j4));
            StringBuilder sb2 = new StringBuilder(String.valueOf(j4).length() + 1 + String.valueOf(str3).length());
            sb2.append(j4);
            sb2.append(" ");
            sb2.append(str3);
            printWriterAppend2.println(sb2.toString());
        }
        if (this.zzj > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) com.google.android.gms.common.api.c.a(this.zzi));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j5 = this.zzj;
            String str4 = simpleDateFormat.format(new Date(j5));
            StringBuilder sb3 = new StringBuilder(String.valueOf(j5).length() + 1 + String.valueOf(str4).length());
            sb3.append(j5);
            sb3.append(" ");
            sb3.append(str4);
            printWriterAppend3.println(sb3.toString());
        }
    }

    protected boolean enableLocalFallback() {
        return false;
    }

    public abstract Account getAccount();

    public C0415c[] getApiFeatures() {
        return zze;
    }

    public T.a getAttributionSourceWrapper() {
        return this.zzB;
    }

    public final C0415c[] getAvailableFeatures() {
        h0 h0Var = this.zzE;
        if (h0Var == null) {
            return null;
        }
        return h0Var.f5570b;
    }

    protected abstract Executor getBindServiceExecutor();

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public String getEndpointPackageName() {
        q0 q0Var;
        if (!isConnected() || (q0Var = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return q0Var.b();
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    protected Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    protected String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    public abstract int getMinApkVersion();

    public void getRemoteService(InterfaceC0636k interfaceC0636k, Set<Scope> set) {
        AttributionSource attributionSourceA;
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String attributionTag = (Build.VERSION.SDK_INT < 31 || this.zzB == null || (attributionSourceA = this.zzB.a()) == null || attributionSourceA.getAttributionTag() == null) ? this.zzA : attributionSourceA.getAttributionTag();
        int i3 = this.zzy;
        int i4 = M.j.f2674a;
        Scope[] scopeArr = C0632g.f5552t;
        Bundle bundle = new Bundle();
        C0415c[] c0415cArr = C0632g.f5553u;
        C0632g c0632g = new C0632g(6, i3, i4, null, null, scopeArr, bundle, null, c0415cArr, c0415cArr, true, 0, false, attributionTag);
        c0632g.f5557d = this.zzl.getPackageName();
        c0632g.f5560l = getServiceRequestExtraArgs;
        if (set != null) {
            c0632g.f5559f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            c0632g.f5561m = account;
            if (interfaceC0636k != null) {
                c0632g.f5558e = interfaceC0636k.asBinder();
            }
        } else if (requiresAccount()) {
            c0632g.f5561m = getAccount();
        }
        c0632g.f5562n = zze;
        c0632g.f5563o = getApiFeatures();
        if (usesClientTelemetry()) {
            c0632g.f5566r = true;
        }
        try {
            synchronized (this.zzq) {
                try {
                    InterfaceC0639n interfaceC0639n = this.zzr;
                    if (interfaceC0639n != null) {
                        interfaceC0639n.k(new d0(this, this.zzd.get()), c0632g);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            triggerConnectionSuspended(3);
        } catch (RemoteException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (SecurityException e5) {
            throw e5;
        } catch (RuntimeException e6) {
            e = e6;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    protected abstract Set getScopes();

    public final IInterface getService() {
        IInterface iInterface;
        synchronized (this.zzp) {
            try {
                if (this.zzv == 5) {
                    throw new DeadObjectException();
                }
                checkConnected();
                iInterface = this.zzs;
                AbstractC0643s.l(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            try {
                InterfaceC0639n interfaceC0639n = this.zzr;
                if (interfaceC0639n == null) {
                    return null;
                }
                return interfaceC0639n.asBinder();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    protected abstract String getStartServiceAction();

    protected String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public C0631f getTelemetryConfiguration() {
        h0 h0Var = this.zzE;
        if (h0Var == null) {
            return null;
        }
        return h0Var.f5572d;
    }

    protected boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzE != null;
    }

    public boolean isConnected() {
        boolean z2;
        synchronized (this.zzp) {
            z2 = this.zzv == 4;
        }
        return z2;
    }

    public boolean isConnecting() {
        boolean z2;
        synchronized (this.zzp) {
            int i3 = this.zzv;
            z2 = true;
            if (i3 != 2 && i3 != 3) {
                z2 = false;
            }
        }
        return z2;
    }

    protected void onConnectedLocked(IInterface iInterface) {
        this.zzh = System.currentTimeMillis();
    }

    protected void onConnectionFailed(C0413a c0413a) {
        this.zzi = c0413a.t();
        this.zzj = System.currentTimeMillis();
    }

    protected void onConnectionSuspended(int i3) {
        this.zzf = i3;
        this.zzg = System.currentTimeMillis();
    }

    protected void onPostInitHandler(int i3, IBinder iBinder, Bundle bundle, int i4) {
        f0 f0Var = new f0(this, i3, iBinder, bundle);
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(1, i4, -1, f0Var));
    }

    public void onUserSignOut(e eVar) {
        eVar.a();
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionSourceWrapper(T.a aVar) {
        this.zzB = aVar;
    }

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i3) {
        int i4 = this.zzd.get();
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(6, i4, i3));
    }

    protected void triggerNotAvailable(c cVar, int i3, PendingIntent pendingIntent) {
        AbstractC0643s.l(cVar, "Connection progress callbacks cannot be null.");
        this.zzc = cVar;
        int i4 = this.zzd.get();
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(3, i4, i3, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    protected final String zza() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    protected final void zzb(int i3, Bundle bundle, int i4) {
        g0 g0Var = new g0(this, i3, bundle);
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(7, i4, -1, g0Var));
    }

    final /* synthetic */ void zzc(h0 h0Var) {
        this.zzE = h0Var;
        if (usesClientTelemetry()) {
            C0631f c0631f = h0Var.f5572d;
            C0644t.b().c(c0631f == null ? null : c0631f.x());
        }
    }

    final /* synthetic */ void zzd(int i3, IInterface iInterface) {
        c(i3, null);
    }

    final /* synthetic */ boolean zze(int i3, int i4, IInterface iInterface) {
        synchronized (this.zzp) {
            try {
                if (this.zzv != i3) {
                    return false;
                }
                c(i4, iInterface);
                return true;
            } finally {
            }
        }
    }

    final /* synthetic */ void zzf(int i3) {
        int i4;
        int i5;
        synchronized (this.zzp) {
            i4 = this.zzv;
        }
        if (i4 == 3) {
            this.zzD = true;
            i5 = 5;
        } else {
            i5 = 4;
        }
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(i5, this.zzd.get(), 16));
    }

    final /* synthetic */ boolean zzg() {
        if (this.zzD || TextUtils.isEmpty(getServiceDescriptor()) || TextUtils.isEmpty(getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    final /* synthetic */ Object zzh() {
        return this.zzq;
    }

    final /* synthetic */ void zzi(InterfaceC0639n interfaceC0639n) {
        this.zzr = interfaceC0639n;
    }

    final /* synthetic */ ArrayList zzj() {
        return this.zzt;
    }

    final /* synthetic */ a zzk() {
        return this.zzw;
    }

    final /* synthetic */ b zzl() {
        return this.zzx;
    }

    final /* synthetic */ C0413a zzm() {
        return this.zzC;
    }

    final /* synthetic */ void zzn(C0413a c0413a) {
        this.zzC = c0413a;
    }

    final /* synthetic */ boolean zzo() {
        return this.zzD;
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }
}
