package q0;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC0643s;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static w0 f10794a = new w0();

    private w0() {
    }

    private static SharedPreferences a(Context context, String str) {
        return context.getSharedPreferences(String.format("com.google.firebase.auth.internal.browserSignInSessionStore.%s", str), 0);
    }

    public static w0 b() {
        return f10794a;
    }

    private static void f(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Iterator<String> it = sharedPreferences.getAll().keySet().iterator();
        while (it.hasNext()) {
            editorEdit.remove(it.next());
        }
        editorEdit.apply();
    }

    public final synchronized z0 c(Context context, String str, String str2) {
        AbstractC0643s.e(str);
        AbstractC0643s.e(str2);
        SharedPreferences sharedPreferencesA = a(context, str);
        String str3 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", str2);
        String str4 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2);
        String str5 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", str2);
        String str6 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", str2);
        String string = sharedPreferencesA.getString(str3, null);
        String string2 = sharedPreferencesA.getString(str4, null);
        String string3 = sharedPreferencesA.getString(str5, null);
        String string4 = sharedPreferencesA.getString("com.google.firebase.auth.api.gms.config.tenant.id", null);
        String string5 = sharedPreferencesA.getString(str6, null);
        SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
        editorEdit.remove(str3);
        editorEdit.remove(str4);
        editorEdit.remove(str5);
        editorEdit.remove(str6);
        editorEdit.apply();
        if (string == null || string2 == null || string3 == null) {
            return null;
        }
        return new z0(string, string2, string3, string4, string5);
    }

    public final synchronized void d(Context context, String str, String str2, String str3, String str4) {
        AbstractC0643s.e(str);
        AbstractC0643s.e(str2);
        SharedPreferences sharedPreferencesA = a(context, str);
        f(sharedPreferencesA);
        SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
        editorEdit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2), str3);
        editorEdit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", str2), str4);
        editorEdit.apply();
    }

    public final synchronized void e(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC0643s.e(str);
        AbstractC0643s.e(str2);
        AbstractC0643s.e(str3);
        AbstractC0643s.e(str7);
        SharedPreferences sharedPreferencesA = a(context, str);
        f(sharedPreferencesA);
        SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
        editorEdit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", str2), str3);
        editorEdit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2), str4);
        editorEdit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", str2), str5);
        editorEdit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", str2), str7);
        editorEdit.putString("com.google.firebase.auth.api.gms.config.tenant.id", str6);
        editorEdit.apply();
    }

    public final synchronized String g(Context context, String str, String str2) {
        String string;
        String string2;
        AbstractC0643s.e(str);
        AbstractC0643s.e(str2);
        SharedPreferences sharedPreferencesA = a(context, str);
        String str3 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2);
        string = sharedPreferencesA.getString(str3, null);
        String str4 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", str2);
        string2 = sharedPreferencesA.getString(str4, null);
        SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
        editorEdit.remove(str3);
        editorEdit.remove(str4);
        editorEdit.apply();
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string2;
    }
}
