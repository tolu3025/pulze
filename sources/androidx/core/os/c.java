package androidx.core.os;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    static class a {
        static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }

        static void b(Configuration configuration, e eVar) {
            configuration.setLocales((LocaleList) eVar.d());
        }
    }

    public static e a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? e.e(a.a(configuration)) : e.a(configuration.locale);
    }
}
