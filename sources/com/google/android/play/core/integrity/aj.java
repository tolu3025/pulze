package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.integrity.internal.A;
import com.google.android.play.integrity.internal.AbstractC0660j;
import com.google.android.play.integrity.internal.C0656f;
import com.google.android.play.integrity.internal.G;
import com.google.android.play.integrity.internal.N;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class aj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C0656f f5749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G f5750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final at f5752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f5753e;

    aj(Context context, G g3, at atVar, k kVar) {
        this.f5751c = context.getPackageName();
        this.f5750b = g3;
        this.f5752d = atVar;
        this.f5753e = kVar;
        if (AbstractC0660j.b(context)) {
            this.f5749a = new C0656f(context, g3, "IntegrityService", ak.f5754a, new N() { // from class: com.google.android.play.core.integrity.ae
                @Override // com.google.android.play.integrity.internal.N
                public final Object a(IBinder iBinder) {
                    return A.b(iBinder);
                }
            }, null);
        } else {
            g3.b("Phonesky is not installed.", new Object[0]);
            this.f5749a = null;
        }
    }

    static /* bridge */ /* synthetic */ Bundle a(aj ajVar, byte[] bArr, Long l3, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", ajVar.f5751c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l3 != null) {
            bundle.putLong("cloud.prj", l3.longValue());
        }
        ArrayList arrayList = new ArrayList();
        com.google.android.play.integrity.internal.r.b(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(com.google.android.play.integrity.internal.r.a(arrayList)));
        return bundle;
    }

    final Task b(Activity activity, Bundle bundle) {
        if (this.f5749a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        int i3 = bundle.getInt("dialog.intent.type");
        this.f5750b.d("requestAndShowDialog(%s, %s)", this.f5751c, Integer.valueOf(i3));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f5749a.t(new ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i3), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f5749a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long lCloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            if (integrityTokenRequest instanceof ao) {
            }
            this.f5750b.d("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f5749a.t(new af(this, taskCompletionSource, bArrDecode, lCloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e3) {
            return Tasks.forException(new IntegrityServiceException(-13, e3));
        }
    }
}
