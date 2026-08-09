package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes.dex */
public final class zzj {
    public static Object zza(Class cls, String str, zzi... zziVarArr) {
        return zzc(cls, "isIsolated", null, false, zziVarArr);
    }

    public static Object zzb(String str, String str2, ClassLoader classLoader, zzi... zziVarArr) {
        return zzc(classLoader.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", null, false, zziVarArr);
    }

    private static Object zzc(Class cls, String str, Object obj, boolean z2, zzi... zziVarArr) {
        int length = zziVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i3 = 0; i3 < zziVarArr.length; i3++) {
            zzi zziVar = zziVarArr[i3];
            zziVar.getClass();
            clsArr[i3] = zziVar.zzc();
            objArr[i3] = zziVarArr[i3].zzd();
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }
}
