package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC0643s;
import java.util.concurrent.atomic.AtomicBoolean;
import k0.AbstractC1003q;
import k0.C0992f;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseInitProvider extends ContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AbstractC1003q f6434a = AbstractC1003q.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static AtomicBoolean f6435b = new AtomicBoolean(false);

    private static void a(ProviderInfo providerInfo) {
        AbstractC0643s.l(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if ("com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
    }

    public static AbstractC1003q b() {
        return f6434a;
    }

    public static boolean c() {
        return f6435b.get();
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        a(providerInfo);
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        try {
            f6435b.set(true);
            Log.i("FirebaseInitProvider", C0992f.u(getContext()) == null ? "FirebaseApp initialization unsuccessful" : "FirebaseApp initialization successful");
            f6435b.set(false);
            return false;
        } catch (Throwable th) {
            f6435b.set(false);
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
