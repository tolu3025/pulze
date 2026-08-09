package A1;

import e0.AbstractC0829j;
import io.grpc.internal.S;
import io.grpc.internal.T0;
import java.util.ArrayList;
import java.util.List;
import y1.M;
import y1.Z;

/* JADX INFO: loaded from: classes.dex */
abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1.d f341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1.d f342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1.d f343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1.d f344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1.d f345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1.d f346f;

    static {
        m2.g gVar = C1.d.f1159g;
        f341a = new C1.d(gVar, "https");
        f342b = new C1.d(gVar, "http");
        m2.g gVar2 = C1.d.f1157e;
        f343c = new C1.d(gVar2, "POST");
        f344d = new C1.d(gVar2, "GET");
        f345e = new C1.d(S.f8660j.d(), "application/grpc");
        f346f = new C1.d("te", "trailers");
    }

    private static List a(List list, Z z2) {
        byte[][] bArrD = T0.d(z2);
        for (int i3 = 0; i3 < bArrD.length; i3 += 2) {
            m2.g gVarP = m2.g.p(bArrD[i3]);
            if (gVarP.u() != 0 && gVarP.h(0) != 58) {
                list.add(new C1.d(gVarP, m2.g.p(bArrD[i3 + 1])));
            }
        }
        return list;
    }

    public static List b(Z z2, String str, String str2, String str3, boolean z3, boolean z4) {
        AbstractC0829j.o(z2, "headers");
        AbstractC0829j.o(str, "defaultPath");
        AbstractC0829j.o(str2, "authority");
        c(z2);
        ArrayList arrayList = new ArrayList(M.a(z2) + 7);
        arrayList.add(z4 ? f342b : f341a);
        arrayList.add(z3 ? f344d : f343c);
        arrayList.add(new C1.d(C1.d.f1160h, str2));
        arrayList.add(new C1.d(C1.d.f1158f, str));
        arrayList.add(new C1.d(S.f8662l.d(), str3));
        arrayList.add(f345e);
        arrayList.add(f346f);
        return a(arrayList, z2);
    }

    private static void c(Z z2) {
        z2.e(S.f8660j);
        z2.e(S.f8661k);
        z2.e(S.f8662l);
    }
}
