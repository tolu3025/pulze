package p1;

import com.google.firebase.auth.AbstractC0679h;
import com.google.firebase.auth.C0697q;
import com.google.firebase.auth.C0704u;
import com.google.firebase.auth.C0710x;
import com.google.firebase.auth.C0712y;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import k0.C0989c;
import k0.C1000n;
import k0.C1002p;
import p1.AbstractC1068c0;

/* JADX INFO: renamed from: p1.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1113w {
    static AbstractC1068c0.C1075g a() {
        return new AbstractC1068c0.C1075g("PROVIDER_ALREADY_LINKED", "User has already been linked to the given provider.", null);
    }

    static AbstractC1068c0.C1075g b() {
        return new AbstractC1068c0.C1075g("INVALID_CREDENTIAL", "The supplied auth credential is malformed, has expired or is not currently supported.", null);
    }

    static AbstractC1068c0.C1075g c() {
        return new AbstractC1068c0.C1075g("NO_SUCH_PROVIDER", "User was not linked to an account with the given provider.", null);
    }

    static AbstractC1068c0.C1075g d() {
        return new AbstractC1068c0.C1075g("NO_CURRENT_USER", "No user currently signed in.", null);
    }

    static AbstractC1068c0.C1075g e(Exception exc) {
        if (exc == null) {
            return new AbstractC1068c0.C1075g("UNKNOWN", null, null);
        }
        String message = exc.getMessage();
        HashMap map = new HashMap();
        if (exc instanceof C0704u) {
            C0704u c0704u = (C0704u) exc;
            HashMap map2 = new HashMap();
            com.google.firebase.auth.K kB = c0704u.b();
            List listT = kB.t();
            com.google.firebase.auth.L lU = kB.u();
            String string = UUID.randomUUID().toString();
            Y.f10367b.put(string, lU);
            String string2 = UUID.randomUUID().toString();
            Y.f10368c.put(string2, kB);
            List listD = j1.d(listT);
            map2.put("appName", c0704u.b().s().l().q());
            map2.put("multiFactorHints", listD);
            map2.put("multiFactorSessionId", string);
            map2.put("multiFactorResolverId", string2);
            return new AbstractC1068c0.C1075g(c0704u.a(), c0704u.getLocalizedMessage(), map2);
        }
        if ((exc instanceof C1000n) || (exc.getCause() != null && (exc.getCause() instanceof C1000n))) {
            return new AbstractC1068c0.C1075g("network-request-failed", "A network error (such as timeout, interrupted connection or unreachable host) has occurred.", null);
        }
        if ((exc instanceof C0989c) || (exc.getCause() != null && (exc.getCause() instanceof C0989c))) {
            return new AbstractC1068c0.C1075g("api-not-available", "The requested API is not available.", null);
        }
        if ((exc instanceof C1002p) || (exc.getCause() != null && (exc.getCause() instanceof C1002p))) {
            return new AbstractC1068c0.C1075g("too-many-requests", "We have blocked all requests from this device due to unusual activity. Try again later.", null);
        }
        if (exc.getMessage() != null && exc.getMessage().startsWith("Cannot create PhoneAuthCredential without either verificationProof")) {
            return new AbstractC1068c0.C1075g("invalid-verification-code", "The verification ID used to create the phone auth credential is invalid.", null);
        }
        if (message != null && message.contains("User has already been linked to the given provider.")) {
            return a();
        }
        String strA = exc instanceof C0697q ? ((C0697q) exc).a() : "UNKNOWN";
        if (exc instanceof C0712y) {
            message = ((C0712y) exc).b();
        }
        if (exc instanceof C0710x) {
            C0710x c0710x = (C0710x) exc;
            String strB = c0710x.b();
            if (strB != null) {
                map.put("email", strB);
            }
            AbstractC0679h abstractC0679hC = c0710x.c();
            if (abstractC0679hC != null) {
                map.put("authCredential", j1.h(abstractC0679hC));
            }
        }
        return new AbstractC1068c0.C1075g(strA, message, map);
    }
}
