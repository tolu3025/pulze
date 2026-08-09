package io.flutter.plugins.imagepicker;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.MediaStore;
import com.google.android.gms.common.api.a;
import d.C0812e;
import io.flutter.plugins.imagepicker.p;
import java.util.Arrays;
import p1.h1;

/* JADX INFO: loaded from: classes.dex */
abstract class n {
    static int a(p.e eVar) {
        Long lC = eVar.c();
        int iB = b();
        return (lC == null || lC.longValue() >= ((long) iB)) ? iB : h1.a(lC.longValue());
    }

    static int b() {
        return C0812e.b() ? MediaStore.getPickImagesMaxLimit() : a.e.API_PRIORITY_OTHER;
    }

    private static PackageInfo c(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 4096);
    }

    private static boolean d(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return Arrays.asList((Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(4096L)) : c(packageManager, context.getPackageName())).requestedPermissions).contains(str);
        } catch (PackageManager.NameNotFoundException e3) {
            e3.printStackTrace();
            return false;
        }
    }

    static boolean e(Context context) {
        return d(context, "android.permission.CAMERA");
    }
}
