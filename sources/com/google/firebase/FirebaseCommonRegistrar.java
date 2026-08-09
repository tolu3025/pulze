package com.google.firebase;

import K0.f;
import O0.c;
import O0.e;
import O0.h;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : (Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? i(installerPackageName) : "";
    }

    private static String i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.c());
        arrayList.add(f.g());
        arrayList.add(h.b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(h.b("fire-core", "22.0.1"));
        arrayList.add(h.b("device-name", i(Build.PRODUCT)));
        arrayList.add(h.b("device-model", i(Build.DEVICE)));
        arrayList.add(h.b("device-brand", i(Build.BRAND)));
        arrayList.add(h.c("android-target-sdk", new h.a() { // from class: k0.i
            @Override // O0.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.e((Context) obj);
            }
        }));
        arrayList.add(h.c("android-min-sdk", new h.a() { // from class: k0.j
            @Override // O0.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.f((Context) obj);
            }
        }));
        arrayList.add(h.c("android-platform", new h.a() { // from class: k0.k
            @Override // O0.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.g((Context) obj);
            }
        }));
        arrayList.add(h.c("android-installer", new h.a() { // from class: k0.l
            @Override // O0.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.h((Context) obj);
            }
        }));
        String strA = e.a();
        if (strA != null) {
            arrayList.add(h.b("kotlin", strA));
        }
        return arrayList;
    }
}
