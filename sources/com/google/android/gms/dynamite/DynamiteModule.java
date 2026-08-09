package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class DynamiteModule {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Boolean f5684h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f5685i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f5686j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f5687k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static Boolean f5688l;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static n f5694r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static o f5695s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5696a;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final ThreadLocal f5689m = new ThreadLocal();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ThreadLocal f5690n = new c();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final b.a f5691o = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f5678b = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f5679c = new f();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f5680d = new g();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f5681e = new h();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f5682f = new i();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f5683g = new j();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f5692p = new k();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f5693q = new com.google.android.gms.dynamite.a();

    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        /* synthetic */ a(String str, Throwable th, byte[] bArr) {
            super(str, th);
        }

        /* synthetic */ a(String str, byte[] bArr) {
            super(str);
        }
    }

    public interface b {

        public interface a {
            int a(Context context, String str, boolean z2);

            int b(Context context, String str);
        }

        /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b, reason: collision with other inner class name */
        public static class C0111b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f5697a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f5698b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f5699c = 0;
        }

        C0111b a(Context context, String str, a aVar);
    }

    private DynamiteModule(Context context) {
        AbstractC0643s.k(context);
        this.f5696a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (AbstractC0642q.b(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 50 + String.valueOf(str).length() + 1);
            sb2.append("Module descriptor id '");
            sb2.append(strValueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e3) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e3.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02d5 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02db A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02e4 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cc A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #0 {all -> 0x00c1, blocks: (B:5:0x0043, B:9:0x00ba, B:16:0x00c6, B:19:0x00cc, B:32:0x00ea, B:109:0x027b, B:110:0x0286, B:118:0x0296, B:120:0x02be, B:122:0x02cd, B:132:0x02ed, B:133:0x02f5, B:113:0x0289, B:114:0x028a, B:115:0x0292, B:134:0x02f6, B:135:0x0317, B:136:0x0318, B:137:0x0368), top: B:149:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e6  */
    /* JADX WARN: Type inference failed for: r30v0, types: [com.google.android.gms.dynamite.DynamiteModule$b] */
    /* JADX WARN: Type inference failed for: r4v10, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.dynamite.DynamiteModule c(android.content.Context r29, com.google.android.gms.dynamite.DynamiteModule.b r30, java.lang.String r31) throws com.google.android.gms.dynamite.DynamiteModule.a {
        /*
            Method dump skipped, instruction units count: 910
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.c(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$b, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0177 A[PHI: r0
      0x0177: PHI (r0v5 ??) = (r0v16 ??), (r0v17 ??) binds: [B:92:0x016a, B:94:0x0170] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0188 A[Catch: all -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x00f2, blocks: (B:4:0x0006, B:65:0x00e7, B:67:0x00ed, B:74:0x0119, B:102:0x017a, B:106:0x0188, B:124:0x01e2, B:125:0x01e5, B:119:0x01da, B:72:0x00f6, B:127:0x01e7, B:5:0x0007, B:8:0x000d, B:9:0x0029, B:63:0x00e4, B:22:0x004d, B:46:0x00a4, B:49:0x00a7, B:56:0x00bd, B:64:0x00e6, B:62:0x00c3), top: B:139:0x0006, inners: #5, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1 A[Catch: all -> 0x003a, TryCatch #10 {, blocks: (B:10:0x002a, B:12:0x0036, B:53:0x00ba, B:17:0x003f, B:19:0x0046, B:21:0x004c, B:26:0x0052, B:28:0x0056, B:32:0x0060, B:34:0x0068, B:37:0x006f, B:44:0x009b, B:45:0x00a3, B:40:0x0076, B:42:0x007c, B:43:0x008d, B:48:0x00a6, B:51:0x00a9, B:52:0x00b1, B:18:0x0042), top: B:142:0x002a, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int d(android.content.Context r12, java.lang.String r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.d(android.content.Context, java.lang.String, boolean):int");
    }

    private static boolean e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f5688l)) {
            return true;
        }
        boolean z2 = false;
        if (f5688l == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != com.google.android.gms.common.util.l.e() ? 0 : 268435456);
            if (M.j.e().g(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z2 = true;
            }
            f5688l = Boolean.valueOf(z2);
            if (z2 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f5686j = true;
            }
        }
        if (!z2) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0145: MOVE (r2 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:93:0x0145 */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int f(android.content.Context r15, java.lang.String r16, boolean r17, boolean r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.f(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static boolean g(Cursor cursor) {
        l lVar = (l) f5689m.get();
        if (lVar == null || lVar.f5700a != null) {
            return false;
        }
        lVar.f5700a = cursor;
        return true;
    }

    private static DynamiteModule h(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    private static void i(ClassLoader classLoader) throws a {
        o oVar;
        byte[] bArr = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                oVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                oVar = iInterfaceQueryLocalInterface instanceof o ? (o) iInterfaceQueryLocalInterface : new o(iBinder);
            }
            f5695s = oVar;
        } catch (ClassNotFoundException e3) {
            e = e3;
            throw new a("Failed to instantiate dynamite loader", e, bArr);
        } catch (IllegalAccessException e4) {
            e = e4;
            throw new a("Failed to instantiate dynamite loader", e, bArr);
        } catch (InstantiationException e5) {
            e = e5;
            throw new a("Failed to instantiate dynamite loader", e, bArr);
        } catch (NoSuchMethodException e6) {
            e = e6;
            throw new a("Failed to instantiate dynamite loader", e, bArr);
        } catch (InvocationTargetException e7) {
            e = e7;
            throw new a("Failed to instantiate dynamite loader", e, bArr);
        }
    }

    private static n j(Context context) {
        n nVar;
        synchronized (DynamiteModule.class) {
            n nVar2 = f5694r;
            if (nVar2 != null) {
                return nVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    nVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    nVar = iInterfaceQueryLocalInterface instanceof n ? (n) iInterfaceQueryLocalInterface : new n(iBinder);
                }
                if (nVar != null) {
                    f5694r = nVar;
                    return nVar;
                }
            } catch (Exception e3) {
                String message = e3.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 45);
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
                Log.e("DynamiteModule", sb.toString());
            }
            return null;
        }
    }

    public Context b() {
        return this.f5696a;
    }
}
