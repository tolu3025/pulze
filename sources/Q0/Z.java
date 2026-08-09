package q0;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.internal.p002firebaseauthapi.zzac;
import com.google.android.gms.internal.p002firebaseauthapi.zzahs;
import com.google.android.gms.internal.p002firebaseauthapi.zzt;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class Z implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f10675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C1135a0 f10676b;

    Z(C1135a0 c1135a0, String str) {
        this.f10675a = str;
        Objects.requireNonNull(c1135a0);
        this.f10676b = c1135a0;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        if (!task.isSuccessful()) {
            return Tasks.forException(new X((String) AbstractC0643s.k(((Exception) AbstractC0643s.k(task.getException())).getMessage())));
        }
        zzahs zzahsVar = (zzahs) task.getResult();
        String strZza = zzahsVar.zza();
        if (zzac.zzc(strZza)) {
            return Tasks.forException(new X("No Recaptcha Enterprise siteKey configured for tenant/project " + this.f10675a));
        }
        List<String> listZza = zzt.zza('/').zza((CharSequence) strZza);
        String str = listZza.size() != 4 ? null : listZza.get(3);
        if (TextUtils.isEmpty(str)) {
            return Tasks.forException(new Exception("Invalid siteKey format " + strZza));
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Successfully obtained site key for tenant " + this.f10675a);
        }
        C1135a0 c1135a0 = this.f10676b;
        Task taskA = c1135a0.f10682f.a((Application) c1135a0.f10680d.m(), str);
        C1135a0.c(this.f10676b, zzahsVar, taskA, this.f10675a);
        return taskA;
    }
}
