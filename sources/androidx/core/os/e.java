package androidx.core.os;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e f3889b = a(new Locale[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f3890a;

    static class a {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    private e(g gVar) {
        this.f3890a = gVar;
    }

    public static e a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? e(a.a(localeArr)) : new e(new f(localeArr));
    }

    static Locale b(String str) {
        if (str.contains("-")) {
            String[] strArrSplit = str.split("-", -1);
            if (strArrSplit.length > 2) {
                return new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
            }
            if (strArrSplit.length > 1) {
                return new Locale(strArrSplit[0], strArrSplit[1]);
            }
            if (strArrSplit.length == 1) {
                return new Locale(strArrSplit[0]);
            }
        } else {
            if (!str.contains("_")) {
                return new Locale(str);
            }
            String[] strArrSplit2 = str.split("_", -1);
            if (strArrSplit2.length > 2) {
                return new Locale(strArrSplit2[0], strArrSplit2[1], strArrSplit2[2]);
            }
            if (strArrSplit2.length > 1) {
                return new Locale(strArrSplit2[0], strArrSplit2[1]);
            }
            if (strArrSplit2.length == 1) {
                return new Locale(strArrSplit2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    public static e e(LocaleList localeList) {
        return new e(new m(localeList));
    }

    public Locale c(int i3) {
        return this.f3890a.get(i3);
    }

    public Object d() {
        return this.f3890a.a();
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && this.f3890a.equals(((e) obj).f3890a);
    }

    public int hashCode() {
        return this.f3890a.hashCode();
    }

    public String toString() {
        return this.f3890a.toString();
    }
}
