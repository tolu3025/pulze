package m1;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k1.l;

/* JADX INFO: renamed from: m1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1034f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f9840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f9841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final l.b f9842c;

    /* JADX INFO: renamed from: m1.f$a */
    class a implements l.b {
        a() {
        }

        @Override // k1.l.b
        public String a(String str, String str2) {
            Context contextCreateConfigurationContext = C1034f.this.f9841b;
            if (str2 != null) {
                Locale localeB = C1034f.b(str2);
                Configuration configuration = new Configuration(C1034f.this.f9841b.getResources().getConfiguration());
                configuration.setLocale(localeB);
                contextCreateConfigurationContext = C1034f.this.f9841b.createConfigurationContext(configuration);
            }
            int identifier = contextCreateConfigurationContext.getResources().getIdentifier(str, "string", C1034f.this.f9841b.getPackageName());
            if (identifier != 0) {
                return contextCreateConfigurationContext.getResources().getString(identifier);
            }
            return null;
        }
    }

    public C1034f(Context context, l lVar) {
        a aVar = new a();
        this.f9842c = aVar;
        this.f9841b = context;
        this.f9840a = lVar;
        lVar.c(aVar);
    }

    public static Locale b(String str) {
        String str2;
        String[] strArrSplit = str.replace('_', '-').split("-", -1);
        String str3 = strArrSplit[0];
        String str4 = "";
        int i3 = 1;
        if (strArrSplit.length <= 1 || strArrSplit[1].length() != 4) {
            str2 = "";
        } else {
            str2 = strArrSplit[1];
            i3 = 2;
        }
        if (strArrSplit.length > i3 && strArrSplit[i3].length() >= 2 && strArrSplit[i3].length() <= 3) {
            str4 = strArrSplit[i3];
        }
        return new Locale(str3, str4, str2);
    }

    public Locale c(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            ArrayList arrayList = new ArrayList();
            LocaleList locales = this.f9841b.getResources().getConfiguration().getLocales();
            int size = locales.size();
            for (int i4 = 0; i4 < size; i4++) {
                Locale locale = locales.get(i4);
                String language = locale.getLanguage();
                if (!locale.getScript().isEmpty()) {
                    language = language + "-" + locale.getScript();
                }
                if (!locale.getCountry().isEmpty()) {
                    language = language + "-" + locale.getCountry();
                }
                arrayList.add(AbstractC1032d.a(language));
                AbstractC1033e.a();
                arrayList.add(AbstractC1032d.a(locale.getLanguage()));
                AbstractC1033e.a();
                arrayList.add(AbstractC1032d.a(locale.getLanguage() + "-*"));
            }
            Locale localeLookup = Locale.lookup(arrayList, list);
            if (localeLookup != null) {
                return localeLookup;
            }
        } else if (i3 >= 24) {
            LocaleList locales2 = this.f9841b.getResources().getConfiguration().getLocales();
            for (int i5 = 0; i5 < locales2.size(); i5++) {
                Locale locale2 = locales2.get(i5);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Locale locale3 = (Locale) it.next();
                    if (locale2.equals(locale3)) {
                        return locale3;
                    }
                }
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Locale locale4 = (Locale) it2.next();
                    if (locale2.getLanguage().equals(locale4.toLanguageTag())) {
                        return locale4;
                    }
                }
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    Locale locale5 = (Locale) it3.next();
                    if (locale2.getLanguage().equals(locale5.getLanguage())) {
                        return locale5;
                    }
                }
            }
        } else {
            Locale locale6 = this.f9841b.getResources().getConfiguration().locale;
            if (locale6 != null) {
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    Locale locale7 = (Locale) it4.next();
                    if (locale6.equals(locale7)) {
                        return locale7;
                    }
                }
                Iterator it5 = list.iterator();
                while (it5.hasNext()) {
                    Locale locale8 = (Locale) it5.next();
                    if (locale6.getLanguage().equals(locale8.toString())) {
                        return locale8;
                    }
                }
            }
        }
        return (Locale) list.get(0);
    }

    public void d(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList locales = configuration.getLocales();
            int size = locales.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(locales.get(i3));
            }
        } else {
            arrayList.add(configuration.locale);
        }
        this.f9840a.b(arrayList);
    }
}
