package o;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: o.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1039a {
    public static final File a(Context context, String fileName) {
        m.e(context, "<this>");
        m.e(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/" + fileName);
    }
}
