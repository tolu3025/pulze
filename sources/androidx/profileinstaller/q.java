package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final androidx.concurrent.futures.c f4861a = androidx.concurrent.futures.c.v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f4862b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f4863c = null;

    private static class a {
        static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f4864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f4865b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f4866c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f4867d;

        b(int i3, int i4, long j3, long j4) {
            this.f4864a = i3;
            this.f4865b = i4;
            this.f4866c = j3;
            this.f4867d = j4;
        }

        static b a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        void b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f4864a);
                dataOutputStream.writeInt(this.f4865b);
                dataOutputStream.writeLong(this.f4866c);
                dataOutputStream.writeLong(this.f4867d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f4865b == bVar.f4865b && this.f4866c == bVar.f4866c && this.f4864a == bVar.f4864a && this.f4867d == bVar.f4867d;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f4865b), Long.valueOf(this.f4866c), Integer.valueOf(this.f4864a), Long.valueOf(this.f4867d));
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f4868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f4869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f4870c;

        c(int i3, boolean z2, boolean z3) {
            this.f4868a = i3;
            this.f4870c = z3;
            this.f4869b = z2;
        }
    }

    private static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return (Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context) : packageManager.getPackageInfo(context.getPackageName(), 0)).lastUpdateTime;
    }

    private static c b(int i3, boolean z2, boolean z3) {
        c cVar = new c(i3, z2, z3);
        f4863c = cVar;
        f4861a.r(cVar);
        return f4863c;
    }

    static c c(Context context, boolean z2) {
        b bVarA;
        int i3;
        c cVar;
        if (!z2 && (cVar = f4863c) != null) {
            return cVar;
        }
        synchronized (f4862b) {
            if (!z2) {
                try {
                    c cVar2 = f4863c;
                    if (cVar2 != null) {
                        return cVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i4 = Build.VERSION.SDK_INT;
            int i5 = 0;
            if (i4 >= 28 && i4 != 30) {
                File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length = file.length();
                boolean z3 = file.exists() && length > 0;
                File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                long length2 = file2.length();
                boolean z4 = file2.exists() && length2 > 0;
                try {
                    long jA = a(context);
                    File file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            bVarA = b.a(file3);
                        } catch (IOException unused) {
                            return b(131072, z3, z4);
                        }
                    } else {
                        bVarA = null;
                    }
                    if (bVarA != null && bVarA.f4866c == jA && (i3 = bVarA.f4865b) != 2) {
                        i5 = i3;
                    } else if (z3) {
                        i5 = 1;
                    } else if (z4) {
                        i5 = 2;
                    }
                    if (z2 && z4 && i5 != 1) {
                        i5 = 2;
                    }
                    if (bVarA != null && bVarA.f4865b == 2 && i5 == 1 && length < bVarA.f4867d) {
                        i5 = 3;
                    }
                    b bVar = new b(1, i5, jA, length2);
                    if (bVarA == null || !bVarA.equals(bVar)) {
                        try {
                            bVar.b(file3);
                        } catch (IOException unused2) {
                            i5 = 196608;
                        }
                    }
                    return b(i5, z3, z4);
                } catch (PackageManager.NameNotFoundException unused3) {
                    return b(65536, z3, z4);
                }
            }
            return b(262144, false, false);
        }
    }
}
