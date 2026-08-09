package A;

import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
abstract class d {
    public static void a(String str, int i3) {
        Trace.beginAsyncSection(str, i3);
    }

    public static void b(String str, int i3) {
        Trace.endAsyncSection(str, i3);
    }
}
