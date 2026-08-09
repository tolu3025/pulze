package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends androidx.core.content.a {

    /* JADX INFO: renamed from: androidx.core.app.a$a, reason: collision with other inner class name */
    static class C0079a {
        static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        static void b(Activity activity, String[] strArr, int i3) {
            activity.requestPermissions(strArr, i3);
        }

        static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    public interface b {
    }

    public interface c {
        void b(int i3);
    }

    public static b k() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void l(Activity activity, String[] strArr, int i3) {
        HashSet hashSet = new HashSet();
        for (int i4 = 0; i4 < strArr.length; i4++) {
            if (TextUtils.isEmpty(strArr[i4])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i4], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i4));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i5 = 0;
            for (int i6 = 0; i6 < strArr.length; i6++) {
                if (!hashSet.contains(Integer.valueOf(i6))) {
                    strArr2[i5] = strArr[i6];
                    i5++;
                }
            }
        }
        if (activity instanceof c) {
            ((c) activity).b(i3);
        }
        C0079a.b(activity, strArr, i3);
    }

    public static void m(Activity activity, Intent intent, int i3, Bundle bundle) {
        activity.startActivityForResult(intent, i3, bundle);
    }
}
