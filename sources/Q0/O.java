package q0;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.internal.p002firebaseauthapi.zzaen;
import com.google.android.gms.internal.p002firebaseauthapi.zzah;
import com.google.android.gms.internal.p002firebaseauthapi.zzajb;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f10658d = 3600000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final zzah f10659e = zzah.zza("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final O f10660f = new O();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Task f10661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Task f10662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f10663c = 0;

    private O() {
    }

    public static void b(Context context, Status status) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putInt("statusCode", status.t());
        editorEdit.putString("statusMessage", status.u());
        editorEdit.putLong("timestamp", com.google.android.gms.common.util.f.c().a());
        editorEdit.commit();
    }

    public static void c(Context context, zzajb zzajbVar, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putString("verifyAssertionRequest", N.e.f(zzajbVar));
        editorEdit.putString("operation", str);
        editorEdit.putString("tenantId", str2);
        editorEdit.putLong("timestamp", com.google.android.gms.common.util.f.c().a());
        editorEdit.commit();
    }

    public static void d(Context context, FirebaseAuth firebaseAuth) {
        AbstractC0643s.k(context);
        AbstractC0643s.k(firebaseAuth);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putString("firebaseAppName", firebaseAuth.l().q());
        editorEdit.commit();
    }

    public static void e(Context context, FirebaseAuth firebaseAuth, com.google.firebase.auth.A a3) {
        AbstractC0643s.k(context);
        AbstractC0643s.k(firebaseAuth);
        AbstractC0643s.k(a3);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putString("firebaseAppName", firebaseAuth.l().q());
        editorEdit.putString("firebaseUserUid", a3.a());
        editorEdit.commit();
    }

    public static void f(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putString("recaptchaToken", str);
        editorEdit.putString("operation", str2);
        editorEdit.putLong("timestamp", com.google.android.gms.common.util.f.c().a());
        editorEdit.commit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void g(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        zzah zzahVar = f10659e;
        int size = zzahVar.size();
        int i3 = 0;
        while (i3 < size) {
            E e3 = zzahVar.get(i3);
            i3++;
            editorEdit.remove((String) e3);
        }
        editorEdit.commit();
    }

    public static O j() {
        return f10660f;
    }

    public final void a(Context context) {
        AbstractC0643s.k(context);
        g(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        this.f10661a = null;
        this.f10663c = 0L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void h(FirebaseAuth firebaseAuth) {
        zzajb zzajbVar;
        String string;
        Task taskU0;
        AbstractC0643s.k(firebaseAuth);
        SharedPreferences sharedPreferences = firebaseAuth.l().m().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0);
        if (firebaseAuth.l().q().equals(sharedPreferences.getString("firebaseAppName", ""))) {
            if (!sharedPreferences.contains("verifyAssertionRequest")) {
                if (sharedPreferences.contains("recaptchaToken")) {
                    String string2 = sharedPreferences.getString("recaptchaToken", "");
                    String string3 = sharedPreferences.getString("operation", "");
                    this.f10663c = sharedPreferences.getLong("timestamp", 0L);
                    string3.hashCode();
                    this.f10662b = string3.equals("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA") ? Tasks.forResult(string2) : null;
                    g(sharedPreferences);
                    return;
                }
                if (sharedPreferences.contains("statusCode")) {
                    Status status = new Status(sharedPreferences.getInt("statusCode", 17062), sharedPreferences.getString("statusMessage", ""));
                    this.f10663c = sharedPreferences.getLong("timestamp", 0L);
                    g(sharedPreferences);
                    this.f10661a = Tasks.forException(zzaen.zza(status));
                    return;
                }
                return;
            }
            zzajbVar = (zzajb) N.e.c(sharedPreferences.getString("verifyAssertionRequest", ""), zzajb.CREATOR);
            String string4 = sharedPreferences.getString("operation", "");
            String string5 = sharedPreferences.getString("tenantId", null);
            string = sharedPreferences.getString("firebaseUserUid", "");
            this.f10663c = sharedPreferences.getLong("timestamp", 0L);
            if (string5 != null) {
                firebaseAuth.z(string5);
                zzajbVar.zzb(string5);
            }
            string4.hashCode();
            switch (string4) {
                case "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE":
                    if (firebaseAuth.m().a().equals(string)) {
                        taskU0 = firebaseAuth.u0(firebaseAuth.m(), com.google.firebase.auth.E0.z(zzajbVar));
                        this.f10661a = taskU0;
                        break;
                    }
                    this.f10661a = null;
                    break;
                case "com.google.firebase.auth.internal.NONGMSCORE_LINK":
                    if (firebaseAuth.m().a().equals(string)) {
                        taskU0 = firebaseAuth.P(firebaseAuth.m(), com.google.firebase.auth.E0.z(zzajbVar));
                        this.f10661a = taskU0;
                        break;
                    }
                    this.f10661a = null;
                    break;
                case "com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN":
                    taskU0 = firebaseAuth.B(com.google.firebase.auth.E0.z(zzajbVar));
                    this.f10661a = taskU0;
                    break;
                default:
                    this.f10661a = null;
                    break;
            }
            g(sharedPreferences);
        }
    }

    public final Task i() {
        if (com.google.android.gms.common.util.f.c().a() - this.f10663c < f10658d) {
            return this.f10662b;
        }
        return null;
    }
}
