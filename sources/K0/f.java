package K0;

import K0.j;
import android.content.Context;
import android.util.Base64OutputStream;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import k0.C0992f;
import l0.InterfaceC1013a;
import org.json.JSONArray;
import org.json.JSONObject;
import r0.C1200c;
import r0.F;
import r0.InterfaceC1202e;

/* JADX INFO: loaded from: classes.dex */
public class f implements i, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L0.b f2584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f2585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L0.b f2586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f2587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f2588e;

    f(L0.b bVar, Set set, Executor executor, L0.b bVar2, Context context) {
        this.f2584a = bVar;
        this.f2587d = set;
        this.f2588e = executor;
        this.f2586c = bVar2;
        this.f2585b = context;
    }

    public static C1200c g() {
        final F fA = F.a(InterfaceC1013a.class, Executor.class);
        return C1200c.d(f.class, i.class, j.class).b(r0.r.j(Context.class)).b(r0.r.j(C0992f.class)).b(r0.r.m(g.class)).b(r0.r.l(O0.i.class)).b(r0.r.k(fA)).e(new r0.h() { // from class: K0.b
            @Override // r0.h
            public final Object a(InterfaceC1202e interfaceC1202e) {
                return f.h(fA, interfaceC1202e);
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f h(F f3, InterfaceC1202e interfaceC1202e) {
        return new f((Context) interfaceC1202e.a(Context.class), ((C0992f) interfaceC1202e.a(C0992f.class)).s(), interfaceC1202e.d(g.class), interfaceC1202e.e(O0.i.class), (Executor) interfaceC1202e.g(f3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String i() {
        String string;
        synchronized (this) {
            try {
                w wVar = (w) this.f2584a.get();
                List listG = wVar.g();
                wVar.f();
                JSONArray jSONArray = new JSONArray();
                for (int i3 = 0; i3 < listG.size(); i3++) {
                    x xVar = (x) listG.get(i3);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", xVar.c());
                    jSONObject.put("dates", new JSONArray((Collection) xVar.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ w j(Context context, String str) {
        return new w(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void k() {
        synchronized (this) {
            ((w) this.f2584a.get()).s(System.currentTimeMillis(), ((O0.i) this.f2586c.get()).a());
        }
        return null;
    }

    @Override // K0.i
    public Task a() {
        return androidx.core.os.n.a(this.f2585b) ^ true ? Tasks.forResult("") : Tasks.call(this.f2588e, new Callable() { // from class: K0.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f2582a.i();
            }
        });
    }

    @Override // K0.j
    public synchronized j.a b(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        w wVar = (w) this.f2584a.get();
        if (!wVar.q(jCurrentTimeMillis)) {
            return j.a.NONE;
        }
        wVar.o();
        return j.a.GLOBAL;
    }

    public Task l() {
        return this.f2587d.size() <= 0 ? Tasks.forResult(null) : androidx.core.os.n.a(this.f2585b) ^ true ? Tasks.forResult(null) : Tasks.call(this.f2588e, new Callable() { // from class: K0.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f2583a.k();
            }
        });
    }

    private f(final Context context, final String str, Set set, L0.b bVar, Executor executor) {
        this(new r0.x(new L0.b() { // from class: K0.c
            @Override // L0.b
            public final Object get() {
                return f.j(context, str);
            }
        }), set, executor, bVar, context);
    }
}
