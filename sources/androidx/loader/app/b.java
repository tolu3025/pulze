package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.collection.g;
import androidx.lifecycle.A;
import androidx.lifecycle.C;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import androidx.loader.app.a;
import j.AbstractC0981b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import v.AbstractC1252a;
import w.AbstractC1259b;

/* JADX INFO: loaded from: classes.dex */
class b extends androidx.loader.app.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static boolean f4803c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f4804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f4805b;

    public static class a extends m implements AbstractC1259b.a {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f4806l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Bundle f4807m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final AbstractC1259b f4808n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private i f4809o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private C0098b f4810p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private AbstractC1259b f4811q;

        a(int i3, Bundle bundle, AbstractC1259b abstractC1259b, AbstractC1259b abstractC1259b2) {
            this.f4806l = i3;
            this.f4807m = bundle;
            this.f4808n = abstractC1259b;
            this.f4811q = abstractC1259b2;
            abstractC1259b.q(i3, this);
        }

        @Override // w.AbstractC1259b.a
        public void a(AbstractC1259b abstractC1259b, Object obj) {
            if (b.f4803c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                m(obj);
                return;
            }
            if (b.f4803c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            k(obj);
        }

        @Override // androidx.lifecycle.LiveData
        protected void i() {
            if (b.f4803c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f4808n.t();
        }

        @Override // androidx.lifecycle.LiveData
        protected void j() {
            if (b.f4803c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f4808n.u();
        }

        @Override // androidx.lifecycle.LiveData
        public void l(n nVar) {
            super.l(nVar);
            this.f4809o = null;
            this.f4810p = null;
        }

        @Override // androidx.lifecycle.m, androidx.lifecycle.LiveData
        public void m(Object obj) {
            super.m(obj);
            AbstractC1259b abstractC1259b = this.f4811q;
            if (abstractC1259b != null) {
                abstractC1259b.r();
                this.f4811q = null;
            }
        }

        AbstractC1259b n(boolean z2) {
            if (b.f4803c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f4808n.b();
            this.f4808n.a();
            C0098b c0098b = this.f4810p;
            if (c0098b != null) {
                l(c0098b);
                if (z2) {
                    c0098b.d();
                }
            }
            this.f4808n.v(this);
            if ((c0098b == null || c0098b.c()) && !z2) {
                return this.f4808n;
            }
            this.f4808n.r();
            return this.f4811q;
        }

        public void o(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f4806l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f4807m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f4808n);
            this.f4808n.g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f4810p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f4810p);
                this.f4810p.b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(p().d(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(g());
        }

        AbstractC1259b p() {
            return this.f4808n;
        }

        void q() {
            i iVar = this.f4809o;
            C0098b c0098b = this.f4810p;
            if (iVar == null || c0098b == null) {
                return;
            }
            super.l(c0098b);
            h(iVar, c0098b);
        }

        AbstractC1259b r(i iVar, a.InterfaceC0097a interfaceC0097a) {
            C0098b c0098b = new C0098b(this.f4808n, interfaceC0097a);
            h(iVar, c0098b);
            n nVar = this.f4810p;
            if (nVar != null) {
                l(nVar);
            }
            this.f4809o = iVar;
            this.f4810p = c0098b;
            return this.f4808n;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f4806l);
            sb.append(" : ");
            AbstractC0981b.a(this.f4808n, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: androidx.loader.app.b$b, reason: collision with other inner class name */
    static class C0098b implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC1259b f4812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a.InterfaceC0097a f4813b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f4814c = false;

        C0098b(AbstractC1259b abstractC1259b, a.InterfaceC0097a interfaceC0097a) {
            this.f4812a = abstractC1259b;
            this.f4813b = interfaceC0097a;
        }

        @Override // androidx.lifecycle.n
        public void a(Object obj) {
            if (b.f4803c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f4812a + ": " + this.f4812a.d(obj));
            }
            this.f4813b.a(this.f4812a, obj);
            this.f4814c = true;
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f4814c);
        }

        boolean c() {
            return this.f4814c;
        }

        void d() {
            if (this.f4814c) {
                if (b.f4803c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f4812a);
                }
                this.f4813b.b(this.f4812a);
            }
        }

        public String toString() {
            return this.f4813b.toString();
        }
    }

    static class c extends y {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final z.b f4815f = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private g f4816d = new g();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f4817e = false;

        static class a implements z.b {
            a() {
            }

            @Override // androidx.lifecycle.z.b
            public y a(Class cls) {
                return new c();
            }

            @Override // androidx.lifecycle.z.b
            public /* synthetic */ y b(Class cls, AbstractC1252a abstractC1252a) {
                return A.b(this, cls, abstractC1252a);
            }
        }

        c() {
        }

        static c h(C c3) {
            return (c) new z(c3, f4815f).a(c.class);
        }

        @Override // androidx.lifecycle.y
        protected void d() {
            super.d();
            int iK = this.f4816d.k();
            for (int i3 = 0; i3 < iK; i3++) {
                ((a) this.f4816d.l(i3)).n(true);
            }
            this.f4816d.a();
        }

        public void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f4816d.k() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i3 = 0; i3 < this.f4816d.k(); i3++) {
                    a aVar = (a) this.f4816d.l(i3);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f4816d.h(i3));
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.o(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void g() {
            this.f4817e = false;
        }

        a i(int i3) {
            return (a) this.f4816d.d(i3);
        }

        boolean j() {
            return this.f4817e;
        }

        void k() {
            int iK = this.f4816d.k();
            for (int i3 = 0; i3 < iK; i3++) {
                ((a) this.f4816d.l(i3)).q();
            }
        }

        void l(int i3, a aVar) {
            this.f4816d.i(i3, aVar);
        }

        void m() {
            this.f4817e = true;
        }
    }

    b(i iVar, C c3) {
        this.f4804a = iVar;
        this.f4805b = c.h(c3);
    }

    private AbstractC1259b e(int i3, Bundle bundle, a.InterfaceC0097a interfaceC0097a, AbstractC1259b abstractC1259b) {
        try {
            this.f4805b.m();
            AbstractC1259b abstractC1259bC = interfaceC0097a.c(i3, bundle);
            if (abstractC1259bC == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (abstractC1259bC.getClass().isMemberClass() && !Modifier.isStatic(abstractC1259bC.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + abstractC1259bC);
            }
            a aVar = new a(i3, bundle, abstractC1259bC, abstractC1259b);
            if (f4803c) {
                Log.v("LoaderManager", "  Created new loader " + aVar);
            }
            this.f4805b.l(i3, aVar);
            this.f4805b.g();
            return aVar.r(this.f4804a, interfaceC0097a);
        } catch (Throwable th) {
            this.f4805b.g();
            throw th;
        }
    }

    @Override // androidx.loader.app.a
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f4805b.f(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    public AbstractC1259b c(int i3, Bundle bundle, a.InterfaceC0097a interfaceC0097a) {
        if (this.f4805b.j()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a aVarI = this.f4805b.i(i3);
        if (f4803c) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (aVarI == null) {
            return e(i3, bundle, interfaceC0097a, null);
        }
        if (f4803c) {
            Log.v("LoaderManager", "  Re-using existing loader " + aVarI);
        }
        return aVarI.r(this.f4804a, interfaceC0097a);
    }

    @Override // androidx.loader.app.a
    public void d() {
        this.f4805b.k();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractC0981b.a(this.f4804a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
