package s;

import U1.l;
import android.content.Context;
import c2.N;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p.InterfaceC1055i;
import q.C1122b;
import t.C1223e;

/* JADX INFO: loaded from: classes.dex */
public final class c implements X1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1122b f11216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f11217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final N f11218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f11219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile InterfaceC1055i f11220f;

    static final class a extends n implements U1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f11221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f11222b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, c cVar) {
            super(0);
            this.f11221a = context;
            this.f11222b = cVar;
        }

        @Override // U1.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            Context applicationContext = this.f11221a;
            m.d(applicationContext, "applicationContext");
            return b.a(applicationContext, this.f11222b.f11215a);
        }
    }

    public c(String name, C1122b c1122b, l produceMigrations, N scope) {
        m.e(name, "name");
        m.e(produceMigrations, "produceMigrations");
        m.e(scope, "scope");
        this.f11215a = name;
        this.f11216b = c1122b;
        this.f11217c = produceMigrations;
        this.f11218d = scope;
        this.f11219e = new Object();
    }

    @Override // X1.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC1055i a(Context thisRef, Z1.i property) {
        InterfaceC1055i interfaceC1055i;
        m.e(thisRef, "thisRef");
        m.e(property, "property");
        InterfaceC1055i interfaceC1055i2 = this.f11220f;
        if (interfaceC1055i2 != null) {
            return interfaceC1055i2;
        }
        synchronized (this.f11219e) {
            try {
                if (this.f11220f == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    C1223e c1223e = C1223e.f11282a;
                    C1122b c1122b = this.f11216b;
                    l lVar = this.f11217c;
                    m.d(applicationContext, "applicationContext");
                    this.f11220f = c1223e.b(c1122b, (List) lVar.invoke(applicationContext), this.f11218d, new a(applicationContext, this));
                }
                interfaceC1055i = this.f11220f;
                m.b(interfaceC1055i);
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1055i;
    }
}
