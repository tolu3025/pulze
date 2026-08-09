package k1;

import b1.AbstractC0525b;
import c1.C0543a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l1.k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1.k f9529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h f9530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final k.c f9531c;

    class a implements k.c {
        a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:56:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0147 A[Catch: JSONException -> 0x003f, TryCatch #6 {JSONException -> 0x003f, blocks: (B:6:0x002b, B:7:0x002f, B:59:0x00df, B:60:0x00e4, B:61:0x00ef, B:62:0x00f4, B:63:0x0108, B:64:0x010d, B:65:0x011d, B:67:0x0121, B:71:0x013b, B:73:0x0147, B:69:0x0126, B:74:0x0150, B:75:0x015a, B:84:0x018c, B:85:0x0197, B:113:0x0218, B:118:0x0232, B:82:0x0183, B:83:0x0187, B:92:0x01bb, B:99:0x01d9, B:104:0x01f5, B:111:0x0212, B:116:0x022c, B:121:0x0246, B:9:0x0034, B:14:0x0042, B:17:0x004d, B:20:0x0059, B:23:0x0065, B:26:0x0070, B:29:0x007b, B:32:0x0085, B:35:0x008f, B:38:0x0099, B:41:0x00a3, B:44:0x00ad, B:47:0x00b8, B:50:0x00c3, B:53:0x00ce, B:101:0x01de), top: B:131:0x002b, inners: #1, #4, #5, #9 }] */
        @Override // l1.k.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(l1.j r6, l1.k.d r7) {
            /*
                Method dump skipped, instruction units count: 710
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: k1.o.a.a(l1.j, l1.k$d):void");
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f9534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f9535c;

        static {
            int[] iArr = new int[k.values().length];
            f9535c = iArr;
            try {
                iArr[k.LEAN_BACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9535c[k.IMMERSIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9535c[k.IMMERSIVE_STICKY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9535c[k.EDGE_TO_EDGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[l.values().length];
            f9534b = iArr2;
            try {
                iArr2[l.TOP_OVERLAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9534b[l.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[f.values().length];
            f9533a = iArr3;
            try {
                iArr3[f.PORTRAIT_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9533a[f.PORTRAIT_DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9533a[f.LANDSCAPE_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9533a[f.LANDSCAPE_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f9537b;

        public c(int i3, String str) {
            this.f9536a = i3;
            this.f9537b = str;
        }
    }

    public enum d {
        LIGHT("Brightness.light"),
        DARK("Brightness.dark");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f9541a;

        d(String str) {
            this.f9541a = str;
        }

        static d e(String str) throws NoSuchFieldException {
            for (d dVar : values()) {
                if (dVar.f9541a.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such Brightness: " + str);
        }
    }

    public enum e {
        PLAIN_TEXT("text/plain");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f9544a;

        e(String str) {
            this.f9544a = str;
        }

        static e e(String str) throws NoSuchFieldException {
            for (e eVar : values()) {
                if (eVar.f9544a.equals(str)) {
                    return eVar;
                }
            }
            throw new NoSuchFieldException("No such ClipboardContentFormat: " + str);
        }
    }

    public enum f {
        PORTRAIT_UP("DeviceOrientation.portraitUp"),
        PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
        LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
        LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f9550a;

        f(String str) {
            this.f9550a = str;
        }

        static f e(String str) throws NoSuchFieldException {
            for (f fVar : values()) {
                if (fVar.f9550a.equals(str)) {
                    return fVar;
                }
            }
            throw new NoSuchFieldException("No such DeviceOrientation: " + str);
        }
    }

    public enum g {
        STANDARD(null),
        LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
        MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
        HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
        SELECTION_CLICK("HapticFeedbackType.selectionClick");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9557a;

        g(String str) {
            this.f9557a = str;
        }

        static g e(String str) throws NoSuchFieldException {
            for (g gVar : values()) {
                String str2 = gVar.f9557a;
                if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such HapticFeedbackType: " + str);
        }
    }

    public interface h {
        void a(List list);

        void b();

        void c(c cVar);

        void d();

        CharSequence e(e eVar);

        void f();

        void g(boolean z2);

        void h(String str);

        void i(k kVar);

        void j(g gVar);

        void k(int i3);

        void l(j jVar);

        void m(String str);

        void n(i iVar);

        boolean o();
    }

    public enum i {
        CLICK("SystemSoundType.click"),
        ALERT("SystemSoundType.alert");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9561a;

        i(String str) {
            this.f9561a = str;
        }

        static i e(String str) throws NoSuchFieldException {
            for (i iVar : values()) {
                if (iVar.f9561a.equals(str)) {
                    return iVar;
                }
            }
            throw new NoSuchFieldException("No such SoundType: " + str);
        }
    }

    public static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f9562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f9563b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Boolean f9564c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Integer f9565d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final d f9566e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Integer f9567f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Boolean f9568g;

        public j(Integer num, d dVar, Boolean bool, Integer num2, d dVar2, Integer num3, Boolean bool2) {
            this.f9562a = num;
            this.f9563b = dVar;
            this.f9564c = bool;
            this.f9565d = num2;
            this.f9566e = dVar2;
            this.f9567f = num3;
            this.f9568g = bool2;
        }
    }

    public enum k {
        LEAN_BACK("SystemUiMode.leanBack"),
        IMMERSIVE("SystemUiMode.immersive"),
        IMMERSIVE_STICKY("SystemUiMode.immersiveSticky"),
        EDGE_TO_EDGE("SystemUiMode.edgeToEdge");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f9574a;

        k(String str) {
            this.f9574a = str;
        }

        static k e(String str) throws NoSuchFieldException {
            for (k kVar : values()) {
                if (kVar.f9574a.equals(str)) {
                    return kVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiMode: " + str);
        }
    }

    public enum l {
        TOP_OVERLAYS("SystemUiOverlay.top"),
        BOTTOM_OVERLAYS("SystemUiOverlay.bottom");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f9578a;

        l(String str) {
            this.f9578a = str;
        }

        static l e(String str) throws NoSuchFieldException {
            for (l lVar : values()) {
                if (lVar.f9578a.equals(str)) {
                    return lVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiOverlay: " + str);
        }
    }

    public o(C0543a c0543a) {
        a aVar = new a();
        this.f9531c = aVar;
        l1.k kVar = new l1.k(c0543a, "flutter/platform", l1.g.f9777a);
        this.f9529a = kVar;
        kVar.e(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c g(JSONObject jSONObject) throws JSONException {
        int i3 = jSONObject.getInt("primaryColor");
        if (i3 != 0) {
            i3 |= -16777216;
        }
        return new c(i3, jSONObject.getString("label"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0053 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int h(org.json.JSONArray r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = r0
            r2 = r1
            r3 = r2
        L4:
            int r4 = r10.length()
            r5 = 4
            r6 = 2
            r7 = 1
            if (r1 >= r4) goto L38
            java.lang.String r4 = r10.getString(r1)
            k1.o$f r4 = k1.o.f.e(r4)
            int[] r8 = k1.o.b.f9533a
            int r4 = r4.ordinal()
            r4 = r8[r4]
            if (r4 == r7) goto L30
            if (r4 == r6) goto L2d
            r6 = 3
            if (r4 == r6) goto L2a
            if (r4 == r5) goto L27
            goto L32
        L27:
            r2 = r2 | 8
            goto L32
        L2a:
            r2 = r2 | 2
            goto L32
        L2d:
            r2 = r2 | 4
            goto L32
        L30:
            r2 = r2 | 1
        L32:
            if (r3 != 0) goto L35
            r3 = r2
        L35:
            int r1 = r1 + 1
            goto L4
        L38:
            if (r2 == 0) goto L57
            r10 = 9
            r1 = 8
            switch(r2) {
                case 2: goto L56;
                case 3: goto L4d;
                case 4: goto L4c;
                case 5: goto L4a;
                case 6: goto L4d;
                case 7: goto L4d;
                case 8: goto L49;
                case 9: goto L4d;
                case 10: goto L46;
                case 11: goto L45;
                case 12: goto L4d;
                case 13: goto L4d;
                case 14: goto L4d;
                case 15: goto L42;
                default: goto L41;
            }
        L41:
            goto L53
        L42:
            r10 = 13
            return r10
        L45:
            return r6
        L46:
            r10 = 11
            return r10
        L49:
            return r1
        L4a:
            r10 = 12
        L4c:
            return r10
        L4d:
            if (r3 == r6) goto L56
            if (r3 == r5) goto L55
            if (r3 == r1) goto L54
        L53:
            return r7
        L54:
            return r1
        L55:
            return r10
        L56:
            return r0
        L57:
            r10 = -1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.o.h(org.json.JSONArray):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public j i(JSONObject jSONObject) {
        return new j(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? d.e(jSONObject.getString("statusBarIconBrightness")) : null, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, !jSONObject.isNull("systemNavigationBarIconBrightness") ? d.e(jSONObject.getString("systemNavigationBarIconBrightness")) : null, !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public k j(String str) {
        int i3 = b.f9535c[k.e(str).ordinal()];
        return i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? k.EDGE_TO_EDGE : k.EDGE_TO_EDGE : k.IMMERSIVE_STICKY : k.IMMERSIVE : k.LEAN_BACK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List k(JSONArray jSONArray) throws NoSuchFieldException {
        l lVar;
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            int i4 = b.f9534b[l.e(jSONArray.getString(i3)).ordinal()];
            if (i4 == 1) {
                lVar = l.TOP_OVERLAYS;
            } else if (i4 == 2) {
                lVar = l.BOTTOM_OVERLAYS;
            }
            arrayList.add(lVar);
        }
        return arrayList;
    }

    public void l(h hVar) {
        this.f9530b = hVar;
    }

    public void m(boolean z2) {
        AbstractC0525b.f("PlatformChannel", "Sending 'systemUIChange' message.");
        this.f9529a.c("SystemChrome.systemUIChange", Arrays.asList(Boolean.valueOf(z2)));
    }
}
