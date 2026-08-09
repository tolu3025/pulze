package p1;

import java.util.ArrayList;
import l1.C1015a;
import l1.InterfaceC1017c;
import p1.AbstractC1068c0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class Y0 {

    class a implements AbstractC1068c0.F {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f10370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1015a.e f10371b;

        a(ArrayList arrayList, C1015a.e eVar) {
            this.f10370a = arrayList;
            this.f10371b = eVar;
        }

        @Override // p1.AbstractC1068c0.F
        public void b(Throwable th) {
            this.f10371b.a(AbstractC1068c0.a(th));
        }

        @Override // p1.AbstractC1068c0.F
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(String str) {
            this.f10370a.add(0, str);
            this.f10371b.a(this.f10370a);
        }
    }

    class b implements AbstractC1068c0.G {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f10372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1015a.e f10373b;

        b(ArrayList arrayList, C1015a.e eVar) {
            this.f10372a = arrayList;
            this.f10373b = eVar;
        }

        @Override // p1.AbstractC1068c0.G
        public void a() {
            this.f10372a.add(0, null);
            this.f10373b.a(this.f10372a);
        }

        @Override // p1.AbstractC1068c0.G
        public void b(Throwable th) {
            this.f10373b.a(AbstractC1068c0.a(th));
        }
    }

    public static l1.i a() {
        return new l1.o();
    }

    public static /* synthetic */ void b(AbstractC1068c0.l lVar, Object obj, C1015a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        lVar.b((String) arrayList.get(0), (String) arrayList.get(1), (String) arrayList.get(2), new a(new ArrayList(), eVar));
    }

    public static /* synthetic */ void c(AbstractC1068c0.l lVar, Object obj, C1015a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        lVar.a((String) arrayList.get(0), (String) arrayList.get(1), new b(new ArrayList(), eVar));
    }

    public static void d(InterfaceC1017c interfaceC1017c, String str, final AbstractC1068c0.l lVar) {
        String str2;
        if (str.isEmpty()) {
            str2 = "";
        } else {
            str2 = "." + str;
        }
        C1015a c1015a = new C1015a(interfaceC1017c, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpSecretHostApi.generateQrCodeUrl" + str2, a());
        if (lVar != null) {
            c1015a.e(new C1015a.d() { // from class: p1.W0
                @Override // l1.C1015a.d
                public final void a(Object obj, C1015a.e eVar) {
                    Y0.b(lVar, obj, eVar);
                }
            });
        } else {
            c1015a.e(null);
        }
        C1015a c1015a2 = new C1015a(interfaceC1017c, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpSecretHostApi.openInOtpApp" + str2, a());
        if (lVar != null) {
            c1015a2.e(new C1015a.d() { // from class: p1.X0
                @Override // l1.C1015a.d
                public final void a(Object obj, C1015a.e eVar) {
                    Y0.c(lVar, obj, eVar);
                }
            });
        } else {
            c1015a2.e(null);
        }
    }

    public static void e(InterfaceC1017c interfaceC1017c, AbstractC1068c0.l lVar) {
        d(interfaceC1017c, "", lVar);
    }
}
