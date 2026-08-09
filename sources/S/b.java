package s;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.m;
import o.AbstractC1039a;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final File a(Context context, String name) {
        m.e(context, "<this>");
        m.e(name, "name");
        return AbstractC1039a.a(context, name + ".preferences_pb");
    }
}
