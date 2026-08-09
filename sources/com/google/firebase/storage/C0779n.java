package com.google.firebase.storage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC0643s;
import k0.C0999m;

/* JADX INFO: renamed from: com.google.firebase.storage.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0779n extends C0999m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Throwable f6581c;

    C0779n(int i3, Throwable th, int i4) {
        super(g(i3));
        this.f6581c = th;
        this.f6579a = i3;
        this.f6580b = i4;
        Log.e("StorageException", "StorageException has occurred.\n" + g(i3) + "\n Code: " + i3 + " HttpResult: " + i4);
        Throwable th2 = this.f6581c;
        if (th2 != null) {
            Log.e("StorageException", th2.getMessage(), this.f6581c);
        }
    }

    private static int a(Status status) {
        if (status.w()) {
            return -13040;
        }
        return status.equals(Status.f5315n) ? -13030 : -13000;
    }

    private static int b(Throwable th, int i3) {
        if (th instanceof C0766a) {
            return -13040;
        }
        if (i3 == -2) {
            return -13030;
        }
        if (i3 == 401) {
            return -13020;
        }
        if (i3 == 409) {
            return -13031;
        }
        if (i3 != 403) {
            return i3 != 404 ? -13000 : -13010;
        }
        return -13021;
    }

    public static C0779n c(Status status) {
        AbstractC0643s.k(status);
        AbstractC0643s.a(!status.x());
        return new C0779n(a(status), null, 0);
    }

    public static C0779n d(Throwable th) {
        return e(th, 0);
    }

    public static C0779n e(Throwable th, int i3) {
        if (th instanceof C0779n) {
            return (C0779n) th;
        }
        if (h(i3) && th == null) {
            return null;
        }
        return new C0779n(b(th, i3), th, i3);
    }

    static String g(int i3) {
        if (i3 == -13040) {
            return "The operation was cancelled.";
        }
        if (i3 == -13031) {
            return "Object has a checksum which does not match. Please retry the operation.";
        }
        if (i3 == -13030) {
            return "The operation retry limit has been exceeded.";
        }
        if (i3 == -13021) {
            return "User does not have permission to access this object.";
        }
        if (i3 == -13020) {
            return "User is not authenticated, please authenticate using Firebase Authentication and try again.";
        }
        switch (i3) {
            case -13013:
                return "Quota for bucket exceeded, please view quota on www.firebase.google.com/storage.";
            case -13012:
                return "Project does not exist.";
            case -13011:
                return "Bucket does not exist.";
            case -13010:
                return "Object does not exist at location.";
            default:
                return "An unknown error occurred, please check the HTTP result code and inner exception for server response.";
        }
    }

    private static boolean h(int i3) {
        return i3 == 0 || (i3 >= 200 && i3 < 300);
    }

    public int f() {
        return this.f6579a;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        Throwable th;
        th = this.f6581c;
        if (th == this) {
            return null;
        }
        return th;
    }
}
