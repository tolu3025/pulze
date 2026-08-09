package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    static class a {
        static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(m mVar) {
            throw null;
        }

        static Bundle c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    static RemoteInput a(m mVar) {
        return a.b(mVar);
    }

    static RemoteInput[] b(m[] mVarArr) {
        if (mVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[mVarArr.length];
        for (int i3 = 0; i3 < mVarArr.length; i3++) {
            m mVar = mVarArr[i3];
            remoteInputArr[i3] = a(null);
        }
        return remoteInputArr;
    }
}
