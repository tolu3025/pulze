package p;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class o implements E {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f10188d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Set f10189e = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f10190f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1046A f10191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final U1.l f10192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final U1.a f10193c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a extends kotlin.jvm.internal.n implements U1.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f10194a = new a();

        a() {
            super(1);
        }

        @Override // U1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t invoke(File it) {
            kotlin.jvm.internal.m.e(it, "it");
            return v.a(it);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final Set a() {
            return o.f10189e;
        }

        public final Object b() {
            return o.f10190f;
        }
    }

    static final class c extends kotlin.jvm.internal.n implements U1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f10195a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(File file) {
            super(0);
            this.f10195a = file;
        }

        public final void b() {
            b bVar = o.f10188d;
            Object objB = bVar.b();
            File file = this.f10195a;
            synchronized (objB) {
                bVar.a().remove(file.getAbsolutePath());
                I1.u uVar = I1.u.f2419a;
            }
        }

        @Override // U1.a
        public /* bridge */ /* synthetic */ Object invoke() {
            b();
            return I1.u.f2419a;
        }
    }

    public o(InterfaceC1046A serializer, U1.l coordinatorProducer, U1.a produceFile) {
        kotlin.jvm.internal.m.e(serializer, "serializer");
        kotlin.jvm.internal.m.e(coordinatorProducer, "coordinatorProducer");
        kotlin.jvm.internal.m.e(produceFile, "produceFile");
        this.f10191a = serializer;
        this.f10192b = coordinatorProducer;
        this.f10193c = produceFile;
    }

    @Override // p.E
    public F a() throws IOException {
        File file = ((File) this.f10193c.invoke()).getCanonicalFile();
        synchronized (f10190f) {
            String path = file.getAbsolutePath();
            Set set = f10189e;
            if (!(!set.contains(path))) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            kotlin.jvm.internal.m.d(path, "path");
            set.add(path);
        }
        kotlin.jvm.internal.m.d(file, "file");
        return new p(file, this.f10191a, (t) this.f10192b.invoke(file), new c(file));
    }

    public /* synthetic */ o(InterfaceC1046A interfaceC1046A, U1.l lVar, U1.a aVar, int i3, kotlin.jvm.internal.h hVar) {
        this(interfaceC1046A, (i3 & 2) != 0 ? a.f10194a : lVar, aVar);
    }
}
