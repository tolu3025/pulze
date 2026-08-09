package k1;

import V0.I;
import android.os.Build;
import android.os.Bundle;
import b1.AbstractC0525b;
import c1.C0543a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import l1.k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1.k f9655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f f9656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final k.c f9657c;

    class a implements k.c {
        a() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // l1.k.c
        public void a(l1.j jVar, k.d dVar) {
            Bundle bundle;
            if (w.this.f9656b == null) {
            }
            String str = jVar.f9778a;
            Object obj = jVar.f9779b;
            AbstractC0525b.f("TextInputChannel", "Received '" + str + "' message.");
            str.hashCode();
            byte b3 = -1;
            switch (str.hashCode()) {
                case -1779068172:
                    if (str.equals("TextInput.setPlatformViewClient")) {
                        b3 = 0;
                    }
                    break;
                case -1015421462:
                    if (str.equals("TextInput.setEditingState")) {
                        b3 = 1;
                    }
                    break;
                case -37561188:
                    if (str.equals("TextInput.setClient")) {
                        b3 = 2;
                    }
                    break;
                case 270476819:
                    if (str.equals("TextInput.hide")) {
                        b3 = 3;
                    }
                    break;
                case 270803918:
                    if (str.equals("TextInput.show")) {
                        b3 = 4;
                    }
                    break;
                case 649192816:
                    if (str.equals("TextInput.sendAppPrivateCommand")) {
                        b3 = 5;
                    }
                    break;
                case 1204752139:
                    if (str.equals("TextInput.setEditableSizeAndTransform")) {
                        b3 = 6;
                    }
                    break;
                case 1727570905:
                    if (str.equals("TextInput.finishAutofillContext")) {
                        b3 = 7;
                    }
                    break;
                case 1904427655:
                    if (str.equals("TextInput.clearClient")) {
                        b3 = 8;
                    }
                    break;
                case 2113369584:
                    if (str.equals("TextInput.requestAutofill")) {
                        b3 = 9;
                    }
                    break;
            }
            try {
                switch (b3) {
                    case 0:
                        JSONObject jSONObject = (JSONObject) obj;
                        w.this.f9656b.d(jSONObject.getInt("platformViewId"), jSONObject.optBoolean("usesVirtualDisplay", false));
                        dVar.a(null);
                        break;
                    case 1:
                        w.this.f9656b.h(e.a((JSONObject) obj));
                        dVar.a(null);
                        break;
                    case 2:
                        try {
                            JSONArray jSONArray = (JSONArray) obj;
                            w.this.f9656b.g(jSONArray.getInt(0), b.a(jSONArray.getJSONObject(1)));
                            dVar.a(null);
                        } catch (NoSuchFieldException e3) {
                            e = e3;
                            dVar.b("error", e.getMessage(), null);
                            return;
                        }
                        break;
                    case 3:
                        w.this.f9656b.j();
                        dVar.a(null);
                        break;
                    case 4:
                        w.this.f9656b.b();
                        dVar.a(null);
                        break;
                    case 5:
                        JSONObject jSONObject2 = (JSONObject) obj;
                        String string = jSONObject2.getString("action");
                        String string2 = jSONObject2.getString("data");
                        if (string2 == null || string2.isEmpty()) {
                            bundle = null;
                        } else {
                            bundle = new Bundle();
                            bundle.putString("data", string2);
                        }
                        w.this.f9656b.c(string, bundle);
                        dVar.a(null);
                        break;
                    case 6:
                        JSONObject jSONObject3 = (JSONObject) obj;
                        double d3 = jSONObject3.getDouble("width");
                        double d4 = jSONObject3.getDouble("height");
                        JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                        double[] dArr = new double[16];
                        for (int i3 = 0; i3 < 16; i3++) {
                            dArr[i3] = jSONArray2.getDouble(i3);
                        }
                        w.this.f9656b.e(d3, d4, dArr);
                        dVar.a(null);
                        break;
                    case 7:
                        w.this.f9656b.i(((Boolean) obj).booleanValue());
                        dVar.a(null);
                        break;
                    case 8:
                        w.this.f9656b.a();
                        dVar.a(null);
                        break;
                    case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                        w.this.f9656b.f();
                        dVar.a(null);
                        break;
                    default:
                        dVar.c();
                        break;
                }
            } catch (JSONException e4) {
                e = e4;
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f9659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f9660b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f9661c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f9662d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f9663e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final d f9664f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final c f9665g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Integer f9666h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f9667i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final a f9668j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final String[] f9669k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final b[] f9670l;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f9671a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String[] f9672b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final e f9673c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f9674d;

            public a(String str, String[] strArr, String str2, e eVar) {
                this.f9671a = str;
                this.f9672b = strArr;
                this.f9674d = str2;
                this.f9673c = eVar;
            }

            public static a a(JSONObject jSONObject) throws JSONException {
                String string = jSONObject.getString("uniqueIdentifier");
                JSONArray jSONArray = jSONObject.getJSONArray("hints");
                String string2 = jSONObject.isNull("hintText") ? null : jSONObject.getString("hintText");
                JSONObject jSONObject2 = jSONObject.getJSONObject("editingValue");
                String[] strArr = new String[jSONArray.length()];
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    strArr[i3] = b(jSONArray.getString(i3));
                }
                return new a(string, strArr, string2, e.a(jSONObject2));
            }

            private static String b(String str) {
                if (Build.VERSION.SDK_INT < 26) {
                    return str;
                }
                str.hashCode();
                switch (str) {
                }
                return str;
            }
        }

        public b(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, d dVar, c cVar, Integer num, String str, a aVar, String[] strArr, b[] bVarArr) {
            this.f9659a = z2;
            this.f9660b = z3;
            this.f9661c = z4;
            this.f9662d = z5;
            this.f9663e = z6;
            this.f9664f = dVar;
            this.f9665g = cVar;
            this.f9666h = num;
            this.f9667i = str;
            this.f9668j = aVar;
            this.f9669k = strArr;
            this.f9670l = bVarArr;
        }

        public static b a(JSONObject jSONObject) throws JSONException {
            b[] bVarArr;
            String string = jSONObject.getString("inputAction");
            if (string == null) {
                throw new JSONException("Configuration JSON missing 'inputAction' property.");
            }
            if (jSONObject.isNull("fields")) {
                bVarArr = null;
            } else {
                JSONArray jSONArray = jSONObject.getJSONArray("fields");
                int length = jSONArray.length();
                b[] bVarArr2 = new b[length];
                for (int i3 = 0; i3 < length; i3++) {
                    bVarArr2[i3] = a(jSONArray.getJSONObject(i3));
                }
                bVarArr = bVarArr2;
            }
            Integer numB = b(string);
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray2 = jSONObject.isNull("contentCommitMimeTypes") ? null : jSONObject.getJSONArray("contentCommitMimeTypes");
            if (jSONArray2 != null) {
                for (int i4 = 0; i4 < jSONArray2.length(); i4++) {
                    arrayList.add(jSONArray2.optString(i4));
                }
            }
            return new b(jSONObject.optBoolean("obscureText"), jSONObject.optBoolean("autocorrect", true), jSONObject.optBoolean("enableSuggestions"), jSONObject.optBoolean("enableIMEPersonalizedLearning"), jSONObject.optBoolean("enableDeltaModel"), d.e(jSONObject.getString("textCapitalization")), c.a(jSONObject.getJSONObject("inputType")), numB, jSONObject.isNull("actionLabel") ? null : jSONObject.getString("actionLabel"), jSONObject.isNull("autofill") ? null : a.a(jSONObject.getJSONObject("autofill")), (String[]) arrayList.toArray(new String[arrayList.size()]), bVarArr);
        }

        private static Integer b(String str) {
            str.hashCode();
            switch (str) {
                case "TextInputAction.unspecified":
                    return 0;
                case "TextInputAction.done":
                    return 6;
                case "TextInputAction.next":
                    return 5;
                case "TextInputAction.none":
                    return 1;
                case "TextInputAction.send":
                    return 4;
                case "TextInputAction.search":
                    return 3;
                case "TextInputAction.go":
                    return 2;
                case "TextInputAction.newline":
                    return 1;
                case "TextInputAction.previous":
                    return 7;
                default:
                    return 0;
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f9675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f9676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f9677c;

        public c(g gVar, boolean z2, boolean z3) {
            this.f9675a = gVar;
            this.f9676b = z2;
            this.f9677c = z3;
        }

        public static c a(JSONObject jSONObject) {
            return new c(g.e(jSONObject.getString("name")), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
        }
    }

    public enum d {
        CHARACTERS("TextCapitalization.characters"),
        WORDS("TextCapitalization.words"),
        SENTENCES("TextCapitalization.sentences"),
        NONE("TextCapitalization.none");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9683a;

        d(String str) {
            this.f9683a = str;
        }

        static d e(String str) throws NoSuchFieldException {
            for (d dVar : values()) {
                if (dVar.f9683a.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such TextCapitalization: " + str);
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f9684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f9686c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f9687d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f9688e;

        public e(String str, int i3, int i4, int i5, int i6) {
            if (!(i3 == -1 && i4 == -1) && (i3 < 0 || i4 < 0)) {
                throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i3) + ", " + String.valueOf(i4) + ")");
            }
            if (!(i5 == -1 && i6 == -1) && (i5 < 0 || i5 > i6)) {
                throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i5) + ", " + String.valueOf(i6) + ")");
            }
            if (i6 > str.length()) {
                throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i5));
            }
            if (i3 > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i3));
            }
            if (i4 > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i4));
            }
            this.f9684a = str;
            this.f9685b = i3;
            this.f9686c = i4;
            this.f9687d = i5;
            this.f9688e = i6;
        }

        public static e a(JSONObject jSONObject) {
            return new e(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
        }

        public boolean b() {
            int i3 = this.f9687d;
            return i3 >= 0 && this.f9688e > i3;
        }

        public boolean c() {
            return this.f9685b >= 0;
        }
    }

    public interface f {
        void a();

        void b();

        void c(String str, Bundle bundle);

        void d(int i3, boolean z2);

        void e(double d3, double d4, double[] dArr);

        void f();

        void g(int i3, b bVar);

        void h(e eVar);

        void i(boolean z2);

        void j();
    }

    public enum g {
        TEXT("TextInputType.text"),
        DATETIME("TextInputType.datetime"),
        NAME("TextInputType.name"),
        POSTAL_ADDRESS("TextInputType.address"),
        NUMBER("TextInputType.number"),
        PHONE("TextInputType.phone"),
        MULTILINE("TextInputType.multiline"),
        EMAIL_ADDRESS("TextInputType.emailAddress"),
        URL("TextInputType.url"),
        VISIBLE_PASSWORD("TextInputType.visiblePassword"),
        NONE("TextInputType.none");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9701a;

        g(String str) {
            this.f9701a = str;
        }

        static g e(String str) throws NoSuchFieldException {
            for (g gVar : values()) {
                if (gVar.f9701a.equals(str)) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such TextInputType: " + str);
        }
    }

    public w(C0543a c0543a) {
        a aVar = new a();
        this.f9657c = aVar;
        l1.k kVar = new l1.k(c0543a, "flutter/textinput", l1.g.f9777a);
        this.f9655a = kVar;
        kVar.e(aVar);
    }

    private static HashMap c(ArrayList arrayList) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(((io.flutter.plugin.editing.p) it.next()).b());
        }
        map.put("deltas", jSONArray);
        return map;
    }

    private static HashMap d(String str, int i3, int i4, int i5, int i6) {
        HashMap map = new HashMap();
        map.put("text", str);
        map.put("selectionBase", Integer.valueOf(i3));
        map.put("selectionExtent", Integer.valueOf(i4));
        map.put("composingBase", Integer.valueOf(i5));
        map.put("composingExtent", Integer.valueOf(i6));
        return map;
    }

    public void b(int i3, Map map) {
        AbstractC0525b.f("TextInputChannel", "Sending 'commitContent' message.");
        this.f9655a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.commitContent", map));
    }

    public void e(int i3) {
        AbstractC0525b.f("TextInputChannel", "Sending 'done' message.");
        this.f9655a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.done"));
    }

    public void f(int i3) {
        AbstractC0525b.f("TextInputChannel", "Sending 'go' message.");
        this.f9655a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.go"));
    }

    public void g(int i3) {
        AbstractC0525b.f("TextInputChannel", "Sending 'newline' message.");
        this.f9655a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.newline"));
    }

    public void h(int i3) {
        AbstractC0525b.f("TextInputChannel", "Sending 'next' message.");
        this.f9655a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.next"));
    }

    public void i(int i3, String str, Bundle bundle) {
        HashMap map = new HashMap();
        map.put("action", str);
        if (bundle != null) {
            HashMap map2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    map2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    map2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    map2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    map2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    map2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    map2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    map2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    map2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            map.put("data", map2);
        }
        this.f9655a.c("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(i3), map));
    }

    public void j(int i3) {
        AbstractC0525b.f("TextInputChannel", "Sending 'previous' message.");
        this.f9655a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.previous"));
    }

    public void k() {
        this.f9655a.c("TextInputClient.requestExistingInputState", null);
    }

    public void l(int i3) {
        AbstractC0525b.f("TextInputChannel", "Sending 'search' message.");
        this.f9655a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.search"));
    }

    public void m(int i3) {
        AbstractC0525b.f("TextInputChannel", "Sending 'send' message.");
        this.f9655a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.send"));
    }

    public void n(f fVar) {
        this.f9656b = fVar;
    }

    public void o(int i3) {
        AbstractC0525b.f("TextInputChannel", "Sending 'unspecified' message.");
        this.f9655a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.unspecified"));
    }

    public void p(int i3, String str, int i4, int i5, int i6, int i7) {
        AbstractC0525b.f("TextInputChannel", "Sending message to update editing state: \nText: " + str + "\nSelection start: " + i4 + "\nSelection end: " + i5 + "\nComposing start: " + i6 + "\nComposing end: " + i7);
        this.f9655a.c("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i3), d(str, i4, i5, i6, i7)));
    }

    public void q(int i3, ArrayList arrayList) {
        AbstractC0525b.f("TextInputChannel", "Sending message to update editing state with deltas: \nNumber of deltas: " + arrayList.size());
        this.f9655a.c("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i3), c(arrayList)));
    }

    public void r(int i3, HashMap map) {
        AbstractC0525b.f("TextInputChannel", "Sending message to update editing state for " + String.valueOf(map.size()) + " field(s).");
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            e eVar = (e) entry.getValue();
            map2.put((String) entry.getKey(), d(eVar.f9684a, eVar.f9685b, eVar.f9686c, -1, -1));
        }
        this.f9655a.c("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i3), map2));
    }
}
