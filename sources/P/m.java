package p;

import android.os.Build;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static final boolean a(File file, File toFile) {
        kotlin.jvm.internal.m.e(file, "<this>");
        kotlin.jvm.internal.m.e(toFile, "toFile");
        return Build.VERSION.SDK_INT >= 26 ? C1047a.f10006a.a(file, toFile) : file.renameTo(toFile);
    }
}
