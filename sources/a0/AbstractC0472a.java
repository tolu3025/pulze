package a0;

import M.j;
import M.k;
import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: a0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0472a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j f3583a = j.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f3584b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f3585c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f3586d = false;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0014, B:7:0x001b, B:14:0x0040, B:15:0x0045, B:12:0x002c, B:17:0x0047, B:28:0x0092, B:29:0x0097, B:31:0x0099, B:32:0x00a7, B:20:0x0054, B:22:0x0058, B:25:0x0082), top: B:37:0x0014, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092 A[Catch: all -> 0x0028, TryCatch #1 {, blocks: (B:4:0x0014, B:7:0x001b, B:14:0x0040, B:15:0x0045, B:12:0x002c, B:17:0x0047, B:28:0x0092, B:29:0x0097, B:31:0x0099, B:32:0x00a7, B:20:0x0054, B:22:0x0058, B:25:0x0082), top: B:37:0x0014, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099 A[Catch: all -> 0x0028, TryCatch #1 {, blocks: (B:4:0x0014, B:7:0x001b, B:14:0x0040, B:15:0x0045, B:12:0x002c, B:17:0x0047, B:28:0x0092, B:29:0x0097, B:31:0x0099, B:32:0x00a7, B:20:0x0054, B:22:0x0058, B:25:0x0082), top: B:37:0x0014, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.content.Context r14) throws M.l, M.k {
        /*
            java.lang.String r0 = "Context must not be null"
            com.google.android.gms.common.internal.AbstractC0643s.l(r14, r0)
            M.j r0 = a0.AbstractC0472a.f3583a
            r1 = 11925000(0xb5f608, float:1.6710484E-38)
            r0.j(r14, r1)
            long r0 = android.os.SystemClock.uptimeMillis()
            java.lang.Object r2 = a0.AbstractC0472a.f3584b
            monitor-enter(r2)
            boolean r3 = a0.AbstractC0472a.f3586d     // Catch: java.lang.Throwable -> L28
            r4 = 0
            if (r3 != 0) goto L47
            java.lang.String r3 = "Failed to load providerinstaller module: "
            com.google.android.gms.dynamite.DynamiteModule$b r5 = com.google.android.gms.dynamite.DynamiteModule.f5682f     // Catch: java.lang.Throwable -> L28 com.google.android.gms.dynamite.DynamiteModule.a -> L2b
            java.lang.String r6 = "com.google.android.gms.providerinstaller.dynamite"
            com.google.android.gms.dynamite.DynamiteModule r5 = com.google.android.gms.dynamite.DynamiteModule.c(r14, r5, r6)     // Catch: java.lang.Throwable -> L28 com.google.android.gms.dynamite.DynamiteModule.a -> L2b
            android.content.Context r3 = r5.b()     // Catch: java.lang.Throwable -> L28 com.google.android.gms.dynamite.DynamiteModule.a -> L2b
            goto L3e
        L28:
            r14 = move-exception
            goto La8
        L2b:
            r5 = move-exception
            java.lang.String r6 = "ProviderInstaller"
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = r3.concat(r5)     // Catch: java.lang.Throwable -> L28
            android.util.Log.w(r6, r3)     // Catch: java.lang.Throwable -> L28
            r3 = r4
        L3e:
            if (r3 == 0) goto L47
            java.lang.String r0 = "com.google.android.gms.providerinstaller.ProviderInstallerImpl"
            b(r3, r14, r0)     // Catch: java.lang.Throwable -> L28
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L28
            return
        L47:
            boolean r3 = a0.AbstractC0472a.f3586d     // Catch: java.lang.Throwable -> L28
            r5 = 1
            r3 = r3 ^ r5
            java.lang.String r6 = "Failed to report request stats: "
            android.content.Context r7 = M.n.c(r14)     // Catch: java.lang.Throwable -> L28
            if (r7 != 0) goto L54
            goto L90
        L54:
            a0.AbstractC0472a.f3586d = r5     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L8f
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L81
            java.lang.String r8 = "com.google.android.gms.common.security.ProviderInstallerImpl"
            java.lang.String r9 = "reportRequestStats2"
            java.lang.ClassLoader r10 = r7.getClassLoader()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L81
            r11 = 3
            com.google.android.gms.internal.common.zzi[] r11 = new com.google.android.gms.internal.common.zzi[r11]     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L81
            java.lang.Class<android.content.Context> r12 = android.content.Context.class
            com.google.android.gms.internal.common.zzi r12 = com.google.android.gms.internal.common.zzi.zzb(r12, r14)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L81
            r13 = 0
            r11[r13] = r12     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L81
            com.google.android.gms.internal.common.zzh r0 = com.google.android.gms.internal.common.zzh.zza(r0)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L81
            r11[r5] = r0     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L81
            com.google.android.gms.internal.common.zzh r0 = com.google.android.gms.internal.common.zzh.zza(r3)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L81
            r1 = 2
            r11[r1] = r0     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L81
            com.google.android.gms.internal.common.zzj.zzb(r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L81
            goto L8f
        L81:
            r0 = move-exception
            java.lang.String r1 = "ProviderInstaller"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L28
            java.lang.String r0 = r6.concat(r0)     // Catch: java.lang.Throwable -> L28
            android.util.Log.w(r1, r0)     // Catch: java.lang.Throwable -> L28
        L8f:
            r4 = r7
        L90:
            if (r4 == 0) goto L99
            java.lang.String r0 = "com.google.android.gms.common.security.ProviderInstallerImpl"
            b(r4, r14, r0)     // Catch: java.lang.Throwable -> L28
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L28
            return
        L99:
            java.lang.String r14 = "ProviderInstaller"
            java.lang.String r0 = "Failed to get remote context"
            android.util.Log.e(r14, r0)     // Catch: java.lang.Throwable -> L28
            M.k r14 = new M.k     // Catch: java.lang.Throwable -> L28
            r0 = 8
            r14.<init>(r0)     // Catch: java.lang.Throwable -> L28
            throw r14     // Catch: java.lang.Throwable -> L28
        La8:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L28
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.AbstractC0472a.a(android.content.Context):void");
    }

    private static void b(Context context, Context context2, String str) throws k {
        try {
            if (f3585c == null) {
                f3585c = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            f3585c.invoke(null, context);
        } catch (Exception e3) {
            Throwable cause = e3.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e3.toString() : cause.toString())));
            }
            throw new k(8);
        }
    }
}
