package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final androidx.collection.f f5486a = new androidx.collection.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Locale f5487b;

    public static String a(Context context, int i3) {
        String string;
        Resources resources = context.getResources();
        switch (i3) {
            case 1:
                return resources.getString(L.b.f2631f);
            case 2:
                return resources.getString(L.b.f2637l);
            case 3:
                return resources.getString(L.b.f2628c);
            case 4:
            case 6:
            case V0.I.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return h(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return h(context, "common_google_play_services_network_error_title");
            case 8:
                string = "Internal error occurred. Please see logs for detailed information";
                break;
            case V0.I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                string = "Google Play services is invalid. Cannot recover.";
                break;
            case V0.I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                string = "Developer error occurred. Please see logs for detailed information";
                break;
            case 11:
                string = "The application is not licensed to the user.";
                break;
            case V0.F.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
            case 13:
            case 14:
            case 15:
            case V0.I.FIELD_REFERENCE_VALUE_FIELD_NUMBER /* 19 */:
            default:
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 22);
                sb.append("Unexpected error code ");
                sb.append(i3);
                string = sb.toString();
                break;
            case 16:
                string = "One of the API components you attempted to connect to is not available.";
                break;
            case V0.I.STRING_VALUE_FIELD_NUMBER /* 17 */:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return h(context, "common_google_play_services_sign_in_failed_title");
            case V0.I.FUNCTION_VALUE_FIELD_NUMBER /* 20 */:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return h(context, "common_google_play_services_restricted_profile_title");
        }
        Log.e("GoogleApiAvailability", string);
        return null;
    }

    public static String b(Context context, int i3) {
        String strH = i3 == 6 ? h(context, "common_google_play_services_resolution_required_title") : a(context, i3);
        return strH == null ? context.getResources().getString(L.b.f2633h) : strH;
    }

    public static String c(Context context, int i3) {
        Resources resources = context.getResources();
        String strF = f(context);
        if (i3 == 1) {
            return resources.getString(L.b.f2630e, strF);
        }
        if (i3 == 2) {
            return com.google.android.gms.common.util.g.d(context) ? resources.getString(L.b.f2639n) : resources.getString(L.b.f2636k, strF);
        }
        if (i3 == 3) {
            return resources.getString(L.b.f2627b, strF);
        }
        if (i3 == 5) {
            return g(context, "common_google_play_services_invalid_account_text", strF);
        }
        if (i3 == 7) {
            return g(context, "common_google_play_services_network_error_text", strF);
        }
        if (i3 == 9) {
            return resources.getString(L.b.f2634i, strF);
        }
        if (i3 == 20) {
            return g(context, "common_google_play_services_restricted_profile_text", strF);
        }
        switch (i3) {
            case 16:
                return g(context, "common_google_play_services_api_unavailable_text", strF);
            case V0.I.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return g(context, "common_google_play_services_sign_in_failed_text", strF);
            case V0.I.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return resources.getString(L.b.f2638m, strF);
            default:
                return resources.getString(M.s.f2686a, strF);
        }
    }

    public static String d(Context context, int i3) {
        return (i3 == 6 || i3 == 19) ? g(context, "common_google_play_services_resolution_required_text", f(context)) : c(context, i3);
    }

    public static String e(Context context, int i3) {
        return context.getResources().getString(i3 != 1 ? i3 != 2 ? i3 != 3 ? R.string.ok : L.b.f2626a : L.b.f2635j : L.b.f2629d);
    }

    public static String f(Context context) {
        String packageName = context.getPackageName();
        try {
            return T.e.a(context).b(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    private static String g(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strH = h(context, str);
        if (strH == null) {
            strH = resources.getString(M.s.f2686a);
        }
        return String.format(resources.getConfiguration().locale, strH, str2);
    }

    private static String h(Context context, String str) {
        androidx.collection.f fVar = f5486a;
        synchronized (fVar) {
            try {
                Locale localeC = androidx.core.os.c.a(context.getResources().getConfiguration()).c(0);
                if (!localeC.equals(f5487b)) {
                    fVar.clear();
                    f5487b = localeC;
                }
                String str2 = (String) fVar.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources resourcesD = M.m.d(context);
                if (resourcesD == null) {
                    return null;
                }
                int identifier = resourcesD.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    StringBuilder sb = new StringBuilder(str.length() + 18);
                    sb.append("Missing resource: ");
                    sb.append(str);
                    Log.w("GoogleApiAvailability", sb.toString());
                    return null;
                }
                String string = resourcesD.getString(identifier);
                if (!TextUtils.isEmpty(string)) {
                    fVar.put(str, string);
                    return string;
                }
                StringBuilder sb2 = new StringBuilder(str.length() + 20);
                sb2.append("Got empty resource: ");
                sb2.append(str);
                Log.w("GoogleApiAvailability", sb2.toString());
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
