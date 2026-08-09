package S1;

import b2.p;
import java.io.File;
import kotlin.jvm.internal.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends g {
    public static String c(File file) {
        m.e(file, "<this>");
        String name = file.getName();
        m.d(name, "getName(...)");
        return p.d0(name, '.', "");
    }
}
