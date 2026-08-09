package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(androidx.versionedparcelable.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f3769a = (IconCompat) aVar.v(remoteActionCompat.f3769a, 1);
        remoteActionCompat.f3770b = aVar.l(remoteActionCompat.f3770b, 2);
        remoteActionCompat.f3771c = aVar.l(remoteActionCompat.f3771c, 3);
        remoteActionCompat.f3772d = (PendingIntent) aVar.r(remoteActionCompat.f3772d, 4);
        remoteActionCompat.f3773e = aVar.h(remoteActionCompat.f3773e, 5);
        remoteActionCompat.f3774f = aVar.h(remoteActionCompat.f3774f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f3769a, 1);
        aVar.D(remoteActionCompat.f3770b, 2);
        aVar.D(remoteActionCompat.f3771c, 3);
        aVar.H(remoteActionCompat.f3772d, 4);
        aVar.z(remoteActionCompat.f3773e, 5);
        aVar.z(remoteActionCompat.f3774f, 6);
    }
}
