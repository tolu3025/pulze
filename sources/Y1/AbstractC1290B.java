package y1;

import java.util.List;

/* JADX INFO: renamed from: y1.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1290B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static List f11752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f11753b;

    static synchronized List a() {
        f11753b = true;
        return f11752a;
    }
}
