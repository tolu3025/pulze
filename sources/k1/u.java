package k1;

import b1.AbstractC0525b;
import c1.C0543a;
import java.util.ArrayList;
import l1.k;

/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1.k f9650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f9651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k.c f9652c;

    class a implements k.c {
        a() {
        }

        @Override // l1.k.c
        public void a(l1.j jVar, k.d dVar) {
            if (u.this.f9651b == null) {
                AbstractC0525b.f("SpellCheckChannel", "No SpellCheckeMethodHandler registered, call not forwarded to spell check API.");
                return;
            }
            String str = jVar.f9778a;
            Object obj = jVar.f9779b;
            AbstractC0525b.f("SpellCheckChannel", "Received '" + str + "' message.");
            str.hashCode();
            if (!str.equals("SpellCheck.initiateSpellCheck")) {
                dVar.c();
                return;
            }
            try {
                ArrayList arrayList = (ArrayList) obj;
                u.this.f9651b.a((String) arrayList.get(0), (String) arrayList.get(1), dVar);
            } catch (IllegalStateException e3) {
                dVar.b("error", e3.getMessage(), null);
            }
        }
    }

    public interface b {
        void a(String str, String str2, k.d dVar);
    }

    public u(C0543a c0543a) {
        a aVar = new a();
        this.f9652c = aVar;
        l1.k kVar = new l1.k(c0543a, "flutter/spellcheck", l1.p.f9793b);
        this.f9650a = kVar;
        kVar.e(aVar);
    }

    public void b(b bVar) {
        this.f9651b = bVar;
    }
}
