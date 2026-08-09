package com.google.android.gms.common.internal;

import M.C0413a;
import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Uri f5519a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    static Intent a(Context context, l0 l0Var) throws Y {
        Bundle bundleCall;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        String strA = l0Var.a();
        if (strA == null) {
            return new Intent().setComponent(l0Var.c());
        }
        Intent intent = null;
        if (l0Var.d()) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", strA);
            try {
                contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(f5519a);
            } catch (RemoteException e3) {
                e = e3;
                Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundleCall = null;
            } catch (IllegalArgumentException e4) {
                e = e4;
                Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundleCall = null;
            }
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                throw new RemoteException("Failed to acquire ContentProviderClient");
            }
            try {
                bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle);
                contentProviderClientAcquireUnstableContentProviderClient.release();
                if (bundleCall != null) {
                    Intent intent2 = (Intent) bundleCall.getParcelable("serviceResponseIntentKey");
                    if (intent2 != null) {
                        intent = intent2;
                    } else {
                        PendingIntent pendingIntent = (PendingIntent) bundleCall.getParcelable("serviceMissingResolutionIntentKey");
                        if (pendingIntent != null) {
                            StringBuilder sb = new StringBuilder(strA.length() + 72);
                            sb.append("Dynamic lookup for intent failed for action ");
                            sb.append(strA);
                            sb.append(" but has possible resolution");
                            Log.w("ServiceBindIntentUtils", sb.toString());
                            throw new Y(new C0413a(25, pendingIntent));
                        }
                    }
                }
                if (intent == null) {
                    Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action: ".concat(strA));
                }
            } catch (Throwable th) {
                contentProviderClientAcquireUnstableContentProviderClient.release();
                throw th;
            }
        }
        return intent == null ? new Intent(strA).setPackage(l0Var.b()) : intent;
    }
}
