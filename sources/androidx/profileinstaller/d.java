package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.j;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AssetManager f4822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f4823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j.c f4824c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final File f4826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f4827f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f4828g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f4829h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private e[] f4831j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f4832k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f4830i = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f4825d = d();

    public d(AssetManager assetManager, Executor executor, j.c cVar, String str, String str2, String str3, File file) {
        this.f4822a = assetManager;
        this.f4823b = executor;
        this.f4824c = cVar;
        this.f4827f = str;
        this.f4828g = str2;
        this.f4829h = str3;
        this.f4826e = file;
    }

    private d b(e[] eVarArr, byte[] bArr) {
        j.c cVar;
        int i3;
        InputStream inputStreamH;
        try {
            inputStreamH = h(this.f4822a, this.f4829h);
        } catch (FileNotFoundException e3) {
            e = e3;
            cVar = this.f4824c;
            i3 = 9;
            cVar.b(i3, e);
        } catch (IOException e4) {
            e = e4;
            cVar = this.f4824c;
            i3 = 7;
            cVar.b(i3, e);
        } catch (IllegalStateException e5) {
            e = e5;
            this.f4831j = null;
            cVar = this.f4824c;
            i3 = 8;
            cVar.b(i3, e);
        }
        if (inputStreamH == null) {
            if (inputStreamH != null) {
                inputStreamH.close();
            }
            return null;
        }
        try {
            this.f4831j = p.q(inputStreamH, p.o(inputStreamH, p.f4860b), bArr, eVarArr);
            inputStreamH.close();
            return this;
        } catch (Throwable th) {
            try {
                inputStreamH.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private void c() {
        if (!this.f4830i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] d() {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 24 || i3 > 34) {
            return null;
        }
        switch (i3) {
            case 24:
            case 25:
                return r.f4875e;
            case 26:
                return r.f4874d;
            case 27:
                return r.f4873c;
            case 28:
            case 29:
            case 30:
                return r.f4872b;
            case 31:
            case 32:
            case 33:
            case 34:
                return r.f4871a;
            default:
                return null;
        }
    }

    private InputStream f(AssetManager assetManager) {
        j.c cVar;
        int i3;
        try {
            return h(assetManager, this.f4828g);
        } catch (FileNotFoundException e3) {
            e = e3;
            cVar = this.f4824c;
            i3 = 6;
            cVar.b(i3, e);
            return null;
        } catch (IOException e4) {
            e = e4;
            cVar = this.f4824c;
            i3 = 7;
            cVar.b(i3, e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(int i3, Object obj) {
        this.f4824c.b(i3, obj);
    }

    private InputStream h(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e3) {
            String message = e3.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f4824c.a(5, null);
            }
            return null;
        }
    }

    private e[] j(InputStream inputStream) {
        try {
            try {
                try {
                    try {
                        e[] eVarArrW = p.w(inputStream, p.o(inputStream, p.f4859a), this.f4827f);
                        try {
                            inputStream.close();
                            return eVarArrW;
                        } catch (IOException e3) {
                            this.f4824c.b(7, e3);
                            return eVarArrW;
                        }
                    } catch (IOException e4) {
                        this.f4824c.b(7, e4);
                        return null;
                    }
                } catch (IllegalStateException e5) {
                    this.f4824c.b(8, e5);
                    inputStream.close();
                    return null;
                }
            } catch (IOException e6) {
                this.f4824c.b(7, e6);
                inputStream.close();
                return null;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e7) {
                this.f4824c.b(7, e7);
            }
            throw th;
        }
    }

    private static boolean k() {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 24 || i3 > 34) {
            return false;
        }
        if (i3 != 24 && i3 != 25) {
            switch (i3) {
                case 31:
                case 32:
                case 33:
                case 34:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    private void l(final int i3, final Object obj) {
        this.f4823b.execute(new Runnable() { // from class: androidx.profileinstaller.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f4819a.g(i3, obj);
            }
        });
    }

    public boolean e() {
        if (this.f4825d == null) {
            l(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f4826e.exists()) {
            try {
                this.f4826e.createNewFile();
            } catch (IOException unused) {
                l(4, null);
                return false;
            }
        } else if (!this.f4826e.canWrite()) {
            l(4, null);
            return false;
        }
        this.f4830i = true;
        return true;
    }

    public d i() {
        d dVarB;
        c();
        if (this.f4825d == null) {
            return this;
        }
        InputStream inputStreamF = f(this.f4822a);
        if (inputStreamF != null) {
            this.f4831j = j(inputStreamF);
        }
        e[] eVarArr = this.f4831j;
        return (eVarArr == null || !k() || (dVarB = b(eVarArr, this.f4825d)) == null) ? this : dVarB;
    }

    public d m() {
        j.c cVar;
        int i3;
        ByteArrayOutputStream byteArrayOutputStream;
        e[] eVarArr = this.f4831j;
        byte[] bArr = this.f4825d;
        if (eVarArr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    p.E(byteArrayOutputStream, bArr);
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                cVar = this.f4824c;
                i3 = 7;
                cVar.b(i3, e);
            } catch (IllegalStateException e4) {
                e = e4;
                cVar = this.f4824c;
                i3 = 8;
                cVar.b(i3, e);
            }
            if (!p.B(byteArrayOutputStream, bArr, eVarArr)) {
                this.f4824c.b(5, null);
                this.f4831j = null;
                byteArrayOutputStream.close();
                return this;
            }
            this.f4832k = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.f4831j = null;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean n() {
        byte[] bArr = this.f4832k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f4826e);
                    try {
                        f.l(byteArrayInputStream, fileOutputStream);
                        l(1, null);
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        return true;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } finally {
                this.f4832k = null;
                this.f4831j = null;
            }
        } catch (FileNotFoundException e3) {
            l(6, e3);
            return false;
        } catch (IOException e4) {
            l(7, e4);
            return false;
        }
    }
}
