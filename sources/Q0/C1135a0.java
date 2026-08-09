package q0;

import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.internal.p002firebaseauthapi.zzac;
import com.google.android.gms.internal.p002firebaseauthapi.zzahs;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.Map;
import k0.C0992f;

/* JADX INFO: renamed from: q0.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1135a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f10677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f10678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private zzahs f10679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    C0992f f10680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private FirebaseAuth f10681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    V f10682f;

    public C1135a0(C0992f c0992f, FirebaseAuth firebaseAuth) {
        this(c0992f, firebaseAuth, new Y());
    }

    static /* synthetic */ void c(C1135a0 c1135a0, zzahs zzahsVar, Task task, String str) {
        synchronized (c1135a0.f10677a) {
            c1135a0.f10679c = zzahsVar;
            c1135a0.f10678b.put(str, task);
        }
    }

    private final Task f(String str) {
        Task task;
        synchronized (this.f10677a) {
            task = (Task) this.f10678b.get(str);
        }
        return task;
    }

    private static String g(String str) {
        return zzac.zzc(str) ? "*" : str;
    }

    public final Task a(String str, Boolean bool) {
        Task taskF;
        String strG = g(str);
        return (bool.booleanValue() || (taskF = f(strG)) == null) ? this.f10681e.X("RECAPTCHA_ENTERPRISE").continueWithTask(new Z(this, strG)) : taskF;
    }

    public final Task b(String str, Boolean bool, RecaptchaAction recaptchaAction) {
        String strG = g(str);
        Task taskF = f(strG);
        if (bool.booleanValue() || taskF == null) {
            taskF = a(strG, bool);
        }
        return taskF.continueWithTask(new C1139c0(this, recaptchaAction));
    }

    public final boolean d(String str) {
        String strZzb;
        AbstractC0643s.k(str);
        zzahs zzahsVar = this.f10679c;
        if (zzahsVar == null || (strZzb = zzahsVar.zzb(str)) == null) {
            return false;
        }
        return strZzb.equals("AUDIT");
    }

    public final boolean e(String str) {
        boolean z2;
        synchronized (this.f10677a) {
            try {
                zzahs zzahsVar = this.f10679c;
                z2 = zzahsVar != null && zzahsVar.zzc(str);
            } finally {
            }
        }
        return z2;
    }

    private C1135a0(C0992f c0992f, FirebaseAuth firebaseAuth, V v2) {
        this.f10677a = new Object();
        this.f10678b = new HashMap();
        this.f10680d = c0992f;
        this.f10681e = firebaseAuth;
        this.f10682f = v2;
    }
}
