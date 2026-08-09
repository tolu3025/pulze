package p1;

import android.net.Uri;
import com.google.firebase.auth.AbstractC0672d0;
import com.google.firebase.auth.AbstractC0679h;
import com.google.firebase.auth.AbstractC0685k;
import com.google.firebase.auth.AbstractC0689m;
import com.google.firebase.auth.C0673e;
import com.google.firebase.auth.InterfaceC0674e0;
import com.google.firebase.auth.InterfaceC0677g;
import com.google.firebase.auth.InterfaceC0681i;
import com.google.firebase.auth.N;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p1.AbstractC1068c0;

/* JADX INFO: loaded from: classes.dex */
public abstract class j1 {
    static C0673e a(AbstractC1068c0.q qVar) {
        C0673e.a aVarZ = C0673e.z();
        aVarZ.g(qVar.i());
        if (qVar.e() != null) {
            aVarZ.c(qVar.e());
        }
        if (qVar.h() != null) {
            aVarZ.f(qVar.h());
        }
        aVarZ.d(qVar.f().booleanValue());
        if (qVar.d() != null) {
            aVarZ.b(qVar.d(), qVar.b().booleanValue(), qVar.c());
        }
        if (qVar.g() != null) {
            aVarZ.e(qVar.g());
        }
        return aVarZ.a();
    }

    static AbstractC0679h b(Map map) {
        String str;
        String str2;
        String str3;
        String str4;
        if (map.get("token") != null) {
            Integer num = (Integer) map.get("token");
            num.intValue();
            AbstractC0679h abstractC0679h = (AbstractC0679h) C1111v.f10594k.get(num);
            if (abstractC0679h != null) {
                return abstractC0679h;
            }
            throw AbstractC1113w.b();
        }
        Object obj = map.get("signInMethod");
        Objects.requireNonNull(obj);
        String str5 = (String) obj;
        str = (String) map.get("secret");
        str2 = (String) map.get("idToken");
        str3 = (String) map.get("accessToken");
        str4 = (String) map.get("rawNonce");
        switch (str5) {
            case "twitter.com":
                Objects.requireNonNull(str3);
                Objects.requireNonNull(str);
                return AbstractC0672d0.a(str3, str);
            case "playgames.google.com":
                Object obj2 = map.get("serverAuthCode");
                Objects.requireNonNull(obj2);
                return com.google.firebase.auth.W.a((String) obj2);
            case "google.com":
                return com.google.firebase.auth.G.a(str2, str3);
            case "facebook.com":
                Objects.requireNonNull(str3);
                return AbstractC0689m.a(str3);
            case "oauth":
                Object obj3 = map.get("providerId");
                Objects.requireNonNull(obj3);
                N.b bVarF = com.google.firebase.auth.N.f((String) obj3);
                if (str3 != null) {
                    bVarF.b(str3);
                }
                Objects.requireNonNull(str2);
                if (str4 == null) {
                    bVarF.c(str2);
                } else {
                    bVarF.d(str2, str4);
                }
                return bVarF.a();
            case "phone":
                Object obj4 = map.get("verificationId");
                Objects.requireNonNull(obj4);
                Object obj5 = map.get("smsCode");
                Objects.requireNonNull(obj5);
                return com.google.firebase.auth.Q.a((String) obj4, (String) obj5);
            case "password":
                Object obj6 = map.get("email");
                Objects.requireNonNull(obj6);
                Objects.requireNonNull(str);
                return AbstractC0685k.a((String) obj6, str);
            case "github.com":
                Objects.requireNonNull(str3);
                return com.google.firebase.auth.E.a(str3);
            case "emailLink":
                Object obj7 = map.get("email");
                Objects.requireNonNull(obj7);
                Object obj8 = map.get("emailLink");
                Objects.requireNonNull(obj8);
                return AbstractC0685k.b((String) obj7, (String) obj8);
            default:
                return null;
        }
    }

    static List c(AbstractC1068c0.B b3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(b3.c().n());
        arrayList.add(b3.b());
        return arrayList;
    }

    static List d(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = e(list).iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC1068c0.v) it.next()).g());
        }
        return arrayList;
    }

    static List e(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.firebase.auth.J j3 = (com.google.firebase.auth.J) it.next();
            arrayList.add((j3 instanceof com.google.firebase.auth.U ? new AbstractC1068c0.v.a().e(((com.google.firebase.auth.U) j3).i()) : new AbstractC1068c0.v.a()).b(j3.p()).c(Double.valueOf(j3.s())).f(j3.a()).d(j3.t()).a());
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0049 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static p1.AbstractC1068c0.o f(com.google.firebase.auth.InterfaceC0671d r7) {
        /*
            p1.c0$o$a r0 = new p1.c0$o$a
            r0.<init>()
            p1.c0$p$a r1 = new p1.c0$p$a
            r1.<init>()
            int r2 = r7.a()
            r3 = 5
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L32
            if (r2 == r5) goto L2f
            if (r2 == r4) goto L2c
            r6 = 4
            if (r2 == r6) goto L29
            if (r2 == r3) goto L26
            r6 = 6
            if (r2 == r6) goto L20
            goto L35
        L20:
            p1.c0$a r6 = p1.AbstractC1068c0.EnumC1069a.REVERT_SECOND_FACTOR_ADDITION
        L22:
            r0.c(r6)
            goto L35
        L26:
            p1.c0$a r6 = p1.AbstractC1068c0.EnumC1069a.VERIFY_AND_CHANGE_EMAIL
            goto L22
        L29:
            p1.c0$a r6 = p1.AbstractC1068c0.EnumC1069a.EMAIL_SIGN_IN
            goto L22
        L2c:
            p1.c0$a r6 = p1.AbstractC1068c0.EnumC1069a.RECOVER_EMAIL
            goto L22
        L2f:
            p1.c0$a r6 = p1.AbstractC1068c0.EnumC1069a.VERIFY_EMAIL
            goto L22
        L32:
            p1.c0$a r6 = p1.AbstractC1068c0.EnumC1069a.PASSWORD_RESET
            goto L22
        L35:
            com.google.firebase.auth.b r7 = r7.b()
            if (r7 == 0) goto L3d
            if (r2 == r5) goto L3f
        L3d:
            if (r2 != 0) goto L47
        L3f:
            java.lang.String r7 = r7.a()
            r1.b(r7)
            goto L5e
        L47:
            if (r2 == r4) goto L4b
            if (r2 != r3) goto L5e
        L4b:
            java.util.Objects.requireNonNull(r7)
            com.google.firebase.auth.a r7 = (com.google.firebase.auth.AbstractC0665a) r7
            java.lang.String r2 = r7.a()
            r1.b(r2)
            java.lang.String r7 = r7.b()
            r1.c(r7)
        L5e:
            p1.c0$p r7 = r1.a()
            r0.b(r7)
            p1.c0$o r7 = r0.a()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.j1.f(com.google.firebase.auth.d):p1.c0$o");
    }

    private static AbstractC1068c0.r g(InterfaceC0677g interfaceC0677g) {
        if (interfaceC0677g == null) {
            return null;
        }
        AbstractC1068c0.r.a aVar = new AbstractC1068c0.r.a();
        aVar.b(Boolean.valueOf(interfaceC0677g.o()));
        aVar.c(interfaceC0677g.g());
        aVar.d(interfaceC0677g.c());
        aVar.e(interfaceC0677g.n());
        return aVar.a();
    }

    static AbstractC1068c0.s h(AbstractC0679h abstractC0679h) {
        if (abstractC0679h == null) {
            return null;
        }
        int iHashCode = abstractC0679h.hashCode();
        C1111v.f10594k.put(Integer.valueOf(iHashCode), abstractC0679h);
        AbstractC1068c0.s.a aVar = new AbstractC1068c0.s.a();
        aVar.d(abstractC0679h.s());
        aVar.e(abstractC0679h.t());
        aVar.c(Long.valueOf(iHashCode));
        if (abstractC0679h instanceof com.google.firebase.auth.M) {
            aVar.b(((com.google.firebase.auth.M) abstractC0679h).v());
        }
        return aVar.a();
    }

    static AbstractC1068c0.A i(InterfaceC0681i interfaceC0681i) {
        AbstractC1068c0.A.a aVar = new AbstractC1068c0.A.a();
        aVar.b(g(interfaceC0681i.r()));
        aVar.c(h(interfaceC0681i.e()));
        aVar.d(j(interfaceC0681i.k()));
        return aVar.a();
    }

    static AbstractC1068c0.B j(com.google.firebase.auth.A a3) {
        if (a3 == null) {
            return null;
        }
        AbstractC1068c0.B.a aVar = new AbstractC1068c0.B.a();
        AbstractC1068c0.C.a aVar2 = new AbstractC1068c0.C.a();
        aVar2.c(a3.p());
        aVar2.d(a3.m());
        aVar2.f(Boolean.valueOf(a3.d()));
        aVar2.e(Boolean.valueOf(a3.y()));
        if (a3.u() != null) {
            aVar2.b(Long.valueOf(a3.u().j()));
            aVar2.g(Long.valueOf(a3.u().q()));
        }
        aVar2.h(a3.i());
        aVar2.i(k(a3.b()));
        aVar2.k(a3.a());
        aVar2.j(a3.x());
        aVar.c(aVar2.a());
        aVar.b(m(a3.w()));
        return aVar.a();
    }

    private static String k(Uri uri) {
        if (uri == null) {
            return null;
        }
        String string = uri.toString();
        if ("".equals(string)) {
            return null;
        }
        return string;
    }

    static AbstractC1068c0.u l(com.google.firebase.auth.C c3) {
        AbstractC1068c0.u.a aVar = new AbstractC1068c0.u.a();
        aVar.h(c3.g());
        aVar.f(c3.e());
        aVar.b(Long.valueOf(c3.a() * 1000));
        aVar.d(Long.valueOf(c3.c() * 1000));
        aVar.e(Long.valueOf(c3.d() * 1000));
        aVar.c(c3.b());
        aVar.g(c3.f());
        return aVar.a();
    }

    private static List m(List list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return null;
        }
        for (InterfaceC0674e0 interfaceC0674e0 : new ArrayList(list)) {
            if (interfaceC0674e0 != null && !"firebase".equals(interfaceC0674e0.c())) {
                arrayList.add(n(interfaceC0674e0));
            }
        }
        return arrayList;
    }

    private static Map n(InterfaceC0674e0 interfaceC0674e0) {
        HashMap map = new HashMap();
        map.put("displayName", interfaceC0674e0.p());
        map.put("email", interfaceC0674e0.m());
        map.put("isEmailVerified", Boolean.valueOf(interfaceC0674e0.d()));
        map.put("phoneNumber", interfaceC0674e0.i());
        map.put("photoUrl", k(interfaceC0674e0.b()));
        map.put("uid", interfaceC0674e0.a() == null ? "" : interfaceC0674e0.a());
        map.put("providerId", interfaceC0674e0.c());
        map.put("isAnonymous", Boolean.FALSE);
        return map;
    }
}
