package q0;

import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzahr;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import java.security.MessageDigest;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class m0 implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f10758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ IntegrityManager f10759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ C1126D f10760c;

    m0(C1126D c1126d, String str, IntegrityManager integrityManager) {
        this.f10758a = str;
        this.f10759b = integrityManager;
        Objects.requireNonNull(c1126d);
        this.f10760c = c1126d;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            this.f10760c.f10629a = ((zzahr) task.getResult()).zza();
            return this.f10759b.requestIntegrityToken(IntegrityTokenRequest.builder().setCloudProjectNumber(Long.parseLong(((zzahr) task.getResult()).zza())).setNonce(new String(Base64.encode(MessageDigest.getInstance("SHA-256").digest(this.f10758a.getBytes("UTF-8")), 11))).build());
        }
        Log.e(C1126D.f10627b, "Problem retrieving Play Integrity producer project:  " + task.getException().getMessage());
        return Tasks.forException(task.getException());
    }
}
