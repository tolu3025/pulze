package p1;

import java.util.ArrayList;
import l1.C1015a;
import l1.InterfaceC1017c;
import p1.AbstractC1068c0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class R0 {

    class a implements AbstractC1068c0.F {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f10347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1015a.e f10348b;

        a(ArrayList arrayList, C1015a.e eVar) {
            this.f10347a = arrayList;
            this.f10348b = eVar;
        }

        @Override // p1.AbstractC1068c0.F
        public void b(Throwable th) {
            this.f10348b.a(AbstractC1068c0.a(th));
        }

        @Override // p1.AbstractC1068c0.F
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC1068c0.A a3) {
            this.f10347a.add(0, a3);
            this.f10348b.a(this.f10347a);
        }
    }

    public static l1.i a() {
        return AbstractC1068c0.i.f10446d;
    }

    public static /* synthetic */ void b(AbstractC1068c0.h hVar, Object obj, C1015a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        hVar.f((String) arrayList.get(0), (AbstractC1068c0.x) arrayList.get(1), (String) arrayList.get(2), new a(new ArrayList(), eVar));
    }

    public static void c(InterfaceC1017c interfaceC1017c, String str, final AbstractC1068c0.h hVar) {
        String str2;
        if (str.isEmpty()) {
            str2 = "";
        } else {
            str2 = "." + str;
        }
        new C1015a(interfaceC1017c, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactoResolverHostApi.resolveSignIn" + str2, a()).e(hVar != null ? new C1015a.d() { // from class: p1.Q0
            @Override // l1.C1015a.d
            public final void a(Object obj, C1015a.e eVar) {
                R0.b(hVar, obj, eVar);
            }
        } : null);
    }

    public static void d(InterfaceC1017c interfaceC1017c, AbstractC1068c0.h hVar) {
        c(interfaceC1017c, "", hVar);
    }
}
