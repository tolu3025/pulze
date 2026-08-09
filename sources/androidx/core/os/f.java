package androidx.core.os;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class f implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Locale[] f3891c = new Locale[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Locale f3892d = new Locale("en", "XA");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Locale f3893e = new Locale("ar", "XB");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Locale f3894f = e.b("en-Latn");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Locale[] f3895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3896b;

    f(Locale... localeArr) {
        String string;
        if (localeArr.length == 0) {
            this.f3895a = f3891c;
            string = "";
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            StringBuilder sb = new StringBuilder();
            for (int i3 = 0; i3 < localeArr.length; i3++) {
                Locale locale = localeArr[i3];
                if (locale == null) {
                    throw new NullPointerException("list[" + i3 + "] is null");
                }
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    b(sb, locale2);
                    if (i3 < localeArr.length - 1) {
                        sb.append(',');
                    }
                    hashSet.add(locale2);
                }
            }
            this.f3895a = (Locale[]) arrayList.toArray(new Locale[0]);
            string = sb.toString();
        }
        this.f3896b = string;
    }

    static void b(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb.append('-');
        sb.append(locale.getCountry());
    }

    @Override // androidx.core.os.g
    public Object a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        Locale[] localeArr = ((f) obj).f3895a;
        if (this.f3895a.length != localeArr.length) {
            return false;
        }
        int i3 = 0;
        while (true) {
            Locale[] localeArr2 = this.f3895a;
            if (i3 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i3].equals(localeArr[i3])) {
                return false;
            }
            i3++;
        }
    }

    @Override // androidx.core.os.g
    public Locale get(int i3) {
        if (i3 >= 0) {
            Locale[] localeArr = this.f3895a;
            if (i3 < localeArr.length) {
                return localeArr[i3];
            }
        }
        return null;
    }

    public int hashCode() {
        int iHashCode = 1;
        for (Locale locale : this.f3895a) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i3 = 0;
        while (true) {
            Locale[] localeArr = this.f3895a;
            if (i3 >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i3]);
            if (i3 < this.f3895a.length - 1) {
                sb.append(',');
            }
            i3++;
        }
    }
}
