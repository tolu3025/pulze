package e1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import java.io.IOException;
import org.json.JSONArray;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: e1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0837a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f7092a = d.class.getName() + ".aot-shared-library-name";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f7093b = d.class.getName() + ".vm-snapshot-data";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f7094c = d.class.getName() + ".isolate-snapshot-data";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f7095d = d.class.getName() + ".flutter-assets-dir";

    private static ApplicationInfo a(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e3) {
            throw new RuntimeException(e3);
        }
    }

    private static boolean b(Bundle bundle, String str, boolean z2) {
        return bundle == null ? z2 : bundle.getBoolean(str, z2);
    }

    private static String c(ApplicationInfo applicationInfo, Context context) {
        int i3;
        Bundle bundle = applicationInfo.metaData;
        if (bundle == null || (i3 = bundle.getInt("io.flutter.network-policy", 0)) <= 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            XmlResourceParser xml = context.getResources().getXml(i3);
            xml.next();
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    if (xml.getName().equals("domain-config")) {
                        g(xml, jSONArray, false);
                    }
                }
            }
            return jSONArray.toString();
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    private static String d(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        return bundle.getString(str, null);
    }

    public static C0838b e(Context context) {
        ApplicationInfo applicationInfoA = a(context);
        return new C0838b(d(applicationInfoA.metaData, f7092a), d(applicationInfoA.metaData, f7093b), d(applicationInfoA.metaData, f7094c), d(applicationInfoA.metaData, f7095d), c(applicationInfoA, context), applicationInfoA.nativeLibraryDir, b(applicationInfoA.metaData, "io.flutter.automatically-register-plugins", true));
    }

    private static void f(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z2) throws XmlPullParserException, IOException {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "includeSubdomains", false);
        xmlResourceParser.next();
        if (xmlResourceParser.getEventType() != 4) {
            throw new IllegalStateException("Expected text");
        }
        String strTrim = xmlResourceParser.getText().trim();
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(strTrim);
        jSONArray2.put(attributeBooleanValue);
        jSONArray2.put(z2);
        jSONArray.put(jSONArray2);
        xmlResourceParser.next();
        if (xmlResourceParser.getEventType() != 3) {
            throw new IllegalStateException("Expected end of domain tag");
        }
    }

    private static void g(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z2) throws XmlPullParserException, IOException {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "cleartextTrafficPermitted", z2);
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                if (xmlResourceParser.getName().equals("domain")) {
                    f(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else if (xmlResourceParser.getName().equals("domain-config")) {
                    g(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else {
                    h(xmlResourceParser);
                }
            } else if (next == 3) {
                return;
            }
        }
    }

    private static void h(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        String name = xmlResourceParser.getName();
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlResourceParser.getName() == name) {
                return;
            } else {
                eventType = xmlResourceParser.next();
            }
        }
    }
}
