package androidx.core.app;

import android.os.Bundle;
import androidx.core.app.g;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f3852a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f3853b = new Object();

    static Bundle a(g.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatD = aVar.d();
        bundle.putInt("icon", iconCompatD != null ? iconCompatD.c() : 0);
        bundle.putCharSequence("title", aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    private static Bundle b(m mVar) {
        new Bundle();
        throw null;
    }

    private static Bundle[] c(m[] mVarArr) {
        if (mVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[mVarArr.length];
        for (int i3 = 0; i3 < mVarArr.length; i3++) {
            m mVar = mVarArr[i3];
            bundleArr[i3] = b(null);
        }
        return bundleArr;
    }
}
