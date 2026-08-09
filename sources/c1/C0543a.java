package c1;

import android.content.res.AssetManager;
import b1.AbstractC0525b;
import b1.C0524a;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.List;
import l1.AbstractC1016b;
import l1.InterfaceC1017c;
import l1.q;

/* JADX INFO: renamed from: c1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0543a implements InterfaceC1017c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FlutterJNI f5005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AssetManager f5006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0545c f5007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC1017c f5008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f5009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f5010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC1017c.a f5011g;

    /* JADX INFO: renamed from: c1.a$a, reason: collision with other inner class name */
    class C0104a implements InterfaceC1017c.a {
        C0104a() {
        }

        @Override // l1.InterfaceC1017c.a
        public void a(ByteBuffer byteBuffer, InterfaceC1017c.b bVar) {
            C0543a.this.f5010f = q.f9796b.b(byteBuffer);
            C0543a.g(C0543a.this);
        }
    }

    /* JADX INFO: renamed from: c1.a$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f5014b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f5015c;

        public b(String str, String str2) {
            this.f5013a = str;
            this.f5014b = null;
            this.f5015c = str2;
        }

        public static b a() {
            e1.d dVarC = C0524a.e().c();
            if (dVarC.i()) {
                return new b(dVarC.g(), "main");
            }
            throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f5013a.equals(bVar.f5013a)) {
                return this.f5015c.equals(bVar.f5015c);
            }
            return false;
        }

        public int hashCode() {
            return (this.f5013a.hashCode() * 31) + this.f5015c.hashCode();
        }

        public String toString() {
            return "DartEntrypoint( bundle path: " + this.f5013a + ", function: " + this.f5015c + " )";
        }

        public b(String str, String str2, String str3) {
            this.f5013a = str;
            this.f5014b = str2;
            this.f5015c = str3;
        }
    }

    /* JADX INFO: renamed from: c1.a$c */
    private static class c implements InterfaceC1017c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0545c f5016a;

        private c(C0545c c0545c) {
            this.f5016a = c0545c;
        }

        @Override // l1.InterfaceC1017c
        public InterfaceC1017c.InterfaceC0146c a(InterfaceC1017c.d dVar) {
            return this.f5016a.a(dVar);
        }

        @Override // l1.InterfaceC1017c
        public void b(String str, InterfaceC1017c.a aVar) {
            this.f5016a.b(str, aVar);
        }

        @Override // l1.InterfaceC1017c
        public void c(String str, ByteBuffer byteBuffer, InterfaceC1017c.b bVar) {
            this.f5016a.c(str, byteBuffer, bVar);
        }

        @Override // l1.InterfaceC1017c
        public /* synthetic */ InterfaceC1017c.InterfaceC0146c d() {
            return AbstractC1016b.a(this);
        }

        @Override // l1.InterfaceC1017c
        public void e(String str, ByteBuffer byteBuffer) {
            this.f5016a.c(str, byteBuffer, null);
        }

        @Override // l1.InterfaceC1017c
        public void h(String str, InterfaceC1017c.a aVar, InterfaceC1017c.InterfaceC0146c interfaceC0146c) {
            this.f5016a.h(str, aVar, interfaceC0146c);
        }

        /* synthetic */ c(C0545c c0545c, C0104a c0104a) {
            this(c0545c);
        }
    }

    /* JADX INFO: renamed from: c1.a$d */
    public interface d {
    }

    public C0543a(FlutterJNI flutterJNI, AssetManager assetManager) {
        this.f5009e = false;
        C0104a c0104a = new C0104a();
        this.f5011g = c0104a;
        this.f5005a = flutterJNI;
        this.f5006b = assetManager;
        C0545c c0545c = new C0545c(flutterJNI);
        this.f5007c = c0545c;
        c0545c.b("flutter/isolate", c0104a);
        this.f5008d = new c(c0545c, null);
        if (flutterJNI.isAttached()) {
            this.f5009e = true;
        }
    }

    static /* synthetic */ d g(C0543a c0543a) {
        c0543a.getClass();
        return null;
    }

    @Override // l1.InterfaceC1017c
    public InterfaceC1017c.InterfaceC0146c a(InterfaceC1017c.d dVar) {
        return this.f5008d.a(dVar);
    }

    @Override // l1.InterfaceC1017c
    public void b(String str, InterfaceC1017c.a aVar) {
        this.f5008d.b(str, aVar);
    }

    @Override // l1.InterfaceC1017c
    public void c(String str, ByteBuffer byteBuffer, InterfaceC1017c.b bVar) {
        this.f5008d.c(str, byteBuffer, bVar);
    }

    @Override // l1.InterfaceC1017c
    public /* synthetic */ InterfaceC1017c.InterfaceC0146c d() {
        return AbstractC1016b.a(this);
    }

    @Override // l1.InterfaceC1017c
    public void e(String str, ByteBuffer byteBuffer) {
        this.f5008d.e(str, byteBuffer);
    }

    @Override // l1.InterfaceC1017c
    public void h(String str, InterfaceC1017c.a aVar, InterfaceC1017c.InterfaceC0146c interfaceC0146c) {
        this.f5008d.h(str, aVar, interfaceC0146c);
    }

    public void i(b bVar, List list) {
        if (this.f5009e) {
            AbstractC0525b.g("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        x1.f fVarR = x1.f.r("DartExecutor#executeDartEntrypoint");
        try {
            AbstractC0525b.f("DartExecutor", "Executing Dart entrypoint: " + bVar);
            this.f5005a.runBundleAndSnapshotFromLibrary(bVar.f5013a, bVar.f5015c, bVar.f5014b, this.f5006b, list);
            this.f5009e = true;
            if (fVarR != null) {
                fVarR.close();
            }
        } catch (Throwable th) {
            if (fVarR != null) {
                try {
                    fVarR.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public boolean j() {
        return this.f5009e;
    }

    public void k() {
        if (this.f5005a.isAttached()) {
            this.f5005a.notifyLowMemoryWarning();
        }
    }

    public void l() {
        AbstractC0525b.f("DartExecutor", "Attached to JNI. Registering the platform message handler for this Dart execution context.");
        this.f5005a.setPlatformMessageHandler(this.f5007c);
    }

    public void m() {
        AbstractC0525b.f("DartExecutor", "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.f5005a.setPlatformMessageHandler(null);
    }
}
