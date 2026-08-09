package q0;

import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.internal.p002firebaseauthapi.zzajb;
import com.google.firebase.auth.AbstractC0679h;
import com.google.firebase.auth.C0670c0;
import com.google.firebase.auth.C0687l;

/* JADX INFO: loaded from: classes.dex */
public abstract class s0 {
    public static zzajb a(AbstractC0679h abstractC0679h, String str) {
        AbstractC0643s.k(abstractC0679h);
        if (abstractC0679h instanceof com.google.firebase.auth.F) {
            return com.google.firebase.auth.F.v((com.google.firebase.auth.F) abstractC0679h, str);
        }
        if (abstractC0679h instanceof C0687l) {
            return C0687l.v((C0687l) abstractC0679h, str);
        }
        if (abstractC0679h instanceof C0670c0) {
            return C0670c0.v((C0670c0) abstractC0679h, str);
        }
        if (abstractC0679h instanceof com.google.firebase.auth.D) {
            return com.google.firebase.auth.D.v((com.google.firebase.auth.D) abstractC0679h, str);
        }
        if (abstractC0679h instanceof com.google.firebase.auth.V) {
            return com.google.firebase.auth.V.v((com.google.firebase.auth.V) abstractC0679h, str);
        }
        if (abstractC0679h instanceof com.google.firebase.auth.E0) {
            return com.google.firebase.auth.E0.y((com.google.firebase.auth.E0) abstractC0679h, str);
        }
        throw new IllegalArgumentException("Unsupported credential type.");
    }
}
