package io.flutter.embedding.engine;

import android.content.Context;
import b1.C0524a;
import c1.C0543a;
import io.flutter.embedding.engine.a;
import io.flutter.plugin.platform.r;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f7724a = new ArrayList();

    class a implements a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.flutter.embedding.engine.a f7725a;

        a(io.flutter.embedding.engine.a aVar) {
            this.f7725a = aVar;
        }

        @Override // io.flutter.embedding.engine.a.b
        public void a() {
            d.this.f7724a.remove(this.f7725a);
        }

        @Override // io.flutter.embedding.engine.a.b
        public void b() {
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f7727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private C0543a.b f7728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f7729c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List f7730d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private r f7731e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f7732f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f7733g = false;

        public b(Context context) {
            this.f7727a = context;
        }

        public boolean a() {
            return this.f7732f;
        }

        public Context b() {
            return this.f7727a;
        }

        public C0543a.b c() {
            return this.f7728b;
        }

        public List d() {
            return this.f7730d;
        }

        public String e() {
            return this.f7729c;
        }

        public r f() {
            return this.f7731e;
        }

        public boolean g() {
            return this.f7733g;
        }

        public b h(boolean z2) {
            this.f7732f = z2;
            return this;
        }

        public b i(C0543a.b bVar) {
            this.f7728b = bVar;
            return this;
        }

        public b j(List list) {
            this.f7730d = list;
            return this;
        }

        public b k(String str) {
            this.f7729c = str;
            return this;
        }

        public b l(boolean z2) {
            this.f7733g = z2;
            return this;
        }
    }

    public d(Context context, String[] strArr) {
        e1.d dVarC = C0524a.e().c();
        if (dVarC.i()) {
            return;
        }
        dVarC.k(context.getApplicationContext());
        dVarC.f(context.getApplicationContext(), strArr);
    }

    public io.flutter.embedding.engine.a a(b bVar) {
        io.flutter.embedding.engine.a aVarA;
        Context contextB = bVar.b();
        C0543a.b bVarC = bVar.c();
        String strE = bVar.e();
        List listD = bVar.d();
        r rVarF = bVar.f();
        if (rVarF == null) {
            rVarF = new r();
        }
        r rVar = rVarF;
        boolean zA = bVar.a();
        boolean zG = bVar.g();
        C0543a.b bVarA = bVarC == null ? C0543a.b.a() : bVarC;
        if (this.f7724a.size() == 0) {
            aVarA = b(contextB, rVar, zA, zG);
            if (strE != null) {
                aVarA.o().c(strE);
            }
            aVarA.k().i(bVarA, listD);
        } else {
            aVarA = ((io.flutter.embedding.engine.a) this.f7724a.get(0)).A(contextB, bVarA, strE, listD, rVar, zA, zG);
        }
        this.f7724a.add(aVarA);
        aVarA.e(new a(aVarA));
        return aVarA;
    }

    io.flutter.embedding.engine.a b(Context context, r rVar, boolean z2, boolean z3) {
        return new io.flutter.embedding.engine.a(context, null, null, rVar, null, z2, z3, this);
    }
}
