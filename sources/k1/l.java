package k1;

import b1.AbstractC0525b;
import c1.C0543a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l1.k;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1.k f9518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f9519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k.c f9520c;

    class a implements k.c {
        a() {
        }

        @Override // l1.k.c
        public void a(l1.j jVar, k.d dVar) {
            if (l.this.f9519b == null) {
                return;
            }
            String str = jVar.f9778a;
            str.hashCode();
            if (!str.equals("Localization.getStringResource")) {
                dVar.c();
                return;
            }
            JSONObject jSONObject = (JSONObject) jVar.a();
            try {
                dVar.a(l.this.f9519b.a(jSONObject.getString("key"), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
            } catch (JSONException e3) {
                dVar.b("error", e3.getMessage(), null);
            }
        }
    }

    public interface b {
        String a(String str, String str2);
    }

    public l(C0543a c0543a) {
        a aVar = new a();
        this.f9520c = aVar;
        l1.k kVar = new l1.k(c0543a, "flutter/localization", l1.g.f9777a);
        this.f9518a = kVar;
        kVar.e(aVar);
    }

    public void b(List list) {
        AbstractC0525b.f("LocalizationChannel", "Sending Locales to Flutter.");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Locale locale = (Locale) it.next();
            AbstractC0525b.f("LocalizationChannel", "Locale (Language: " + locale.getLanguage() + ", Country: " + locale.getCountry() + ", Variant: " + locale.getVariant() + ")");
            arrayList.add(locale.getLanguage());
            arrayList.add(locale.getCountry());
            arrayList.add(locale.getScript());
            arrayList.add(locale.getVariant());
        }
        this.f9518a.c("setLocale", arrayList);
    }

    public void c(b bVar) {
        this.f9519b = bVar;
    }
}
