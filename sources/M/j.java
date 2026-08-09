package M;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f2674a = n.f2679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final j f2675b = new j();

    j() {
    }

    public static j e() {
        return f2675b;
    }

    public Intent a(Context context, int i3, String str) {
        if (i3 != 1 && i3 != 2) {
            if (i3 != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && com.google.android.gms.common.util.g.d(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f2674a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(T.e.a(context).c(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public PendingIntent b(Context context, int i3, int i4) {
        return c(context, i3, i4, null);
    }

    public PendingIntent c(Context context, int i3, int i4, String str) {
        Intent intentA = a(context, i3, str);
        if (intentA == null) {
            return null;
        }
        return androidx.core.app.k.b(context, i4, intentA, 134217728, false);
    }

    public String d(int i3) {
        return n.b(i3);
    }

    public int f(Context context) {
        return g(context, f2674a);
    }

    public int g(Context context, int i3) {
        int iF = n.f(context, i3);
        if (n.g(context, iF)) {
            return 18;
        }
        return iF;
    }

    public boolean h(Context context, String str) {
        return n.j(context, str);
    }

    public boolean i(int i3) {
        return n.i(i3);
    }

    public void j(Context context, int i3) throws l, k {
        n.a(context, i3);
    }
}
