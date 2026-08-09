package t1;

import com.google.firebase.storage.C0779n;

/* JADX INFO: renamed from: t1.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1248w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1248w f11458a = new C1248w();

    private C1248w() {
    }

    public static final String a(int i3) {
        if (i3 == -13040) {
            return "canceled";
        }
        if (i3 == -13000) {
            return "unknown";
        }
        if (i3 == -13031) {
            return "invalid-checksum";
        }
        if (i3 == -13030) {
            return "retry-limit-exceeded";
        }
        if (i3 == -13021) {
            return "unauthorized";
        }
        if (i3 == -13020) {
            return "unauthenticated";
        }
        switch (i3) {
        }
        return "unknown";
    }

    public static final String b(int i3) {
        if (i3 == -13040) {
            return "User cancelled the operation.";
        }
        if (i3 == -13000) {
            return "An unknown error occurred";
        }
        if (i3 == -13031) {
            return "File on the client does not match the checksum of the file received by the server.";
        }
        if (i3 == -13030) {
            return "The maximum time limit on an operation (upload, download, delete, etc.) has been exceeded.";
        }
        if (i3 == -13021) {
            return "User is not authorized to perform the desired action.";
        }
        if (i3 == -13020) {
            return "User is unauthenticated. Authenticate and try again.";
        }
        switch (i3) {
        }
        return "An unknown error occurred";
    }

    public static final C1247v c(Exception exc) {
        String strA = "UNKNOWN";
        if (exc == null) {
            return new C1247v("UNKNOWN", "An unknown error occurred", null);
        }
        String strB = "An unknown error occurred:" + exc.getMessage();
        if (exc instanceof C0779n) {
            int iF = ((C0779n) exc).f();
            strA = a(iF);
            strB = b(iF);
        }
        return new C1247v(strA, strB, null);
    }
}
