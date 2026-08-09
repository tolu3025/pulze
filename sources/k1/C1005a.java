package k1;

import b1.AbstractC0525b;
import c1.C0543a;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.j;
import java.util.HashMap;
import l1.C1015a;

/* JADX INFO: renamed from: k1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1005a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1015a f9486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlutterJNI f9487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f9488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1015a.d f9489d;

    /* JADX INFO: renamed from: k1.a$a, reason: collision with other inner class name */
    class C0142a implements C1015a.d {
        C0142a() {
        }

        @Override // l1.C1015a.d
        public void a(Object obj, C1015a.e eVar) {
            HashMap map;
            HashMap map2;
            if (C1005a.this.f9488c == null) {
                eVar.a(null);
                return;
            }
            map = (HashMap) obj;
            String str = (String) map.get("type");
            map2 = (HashMap) map.get("data");
            AbstractC0525b.f("AccessibilityChannel", "Received " + str + " message.");
            str.hashCode();
            switch (str) {
                case "tooltip":
                    String str2 = (String) map2.get("message");
                    if (str2 != null) {
                        C1005a.this.f9488c.d(str2);
                        break;
                    }
                    break;
                case "announce":
                    String str3 = (String) map2.get("message");
                    if (str3 != null) {
                        C1005a.this.f9488c.a(str3);
                        break;
                    }
                    break;
                case "tap":
                    Integer num = (Integer) map.get("nodeId");
                    if (num != null) {
                        C1005a.this.f9488c.g(num.intValue());
                        break;
                    }
                    break;
                case "focus":
                    Integer num2 = (Integer) map.get("nodeId");
                    if (num2 != null) {
                        C1005a.this.f9488c.e(num2.intValue());
                        break;
                    }
                    break;
                case "longPress":
                    Integer num3 = (Integer) map.get("nodeId");
                    if (num3 != null) {
                        C1005a.this.f9488c.f(num3.intValue());
                        break;
                    }
                    break;
            }
            eVar.a(null);
        }
    }

    /* JADX INFO: renamed from: k1.a$b */
    public interface b extends FlutterJNI.a {
        void a(String str);

        void d(String str);

        void e(int i3);

        void f(int i3);

        void g(int i3);
    }

    public C1005a(C0543a c0543a, FlutterJNI flutterJNI) {
        C0142a c0142a = new C0142a();
        this.f9489d = c0142a;
        C1015a c1015a = new C1015a(c0543a, "flutter/accessibility", l1.o.f9790a);
        this.f9486a = c1015a;
        c1015a.e(c0142a);
        this.f9487b = flutterJNI;
    }

    public void b(int i3, j.g gVar) {
        this.f9487b.dispatchSemanticsAction(i3, gVar);
    }

    public void c(int i3, j.g gVar, Object obj) {
        this.f9487b.dispatchSemanticsAction(i3, gVar, obj);
    }

    public void d() {
        this.f9487b.setSemanticsEnabled(false);
    }

    public void e() {
        this.f9487b.setSemanticsEnabled(true);
    }

    public void f(int i3) {
        this.f9487b.setAccessibilityFeatures(i3);
    }

    public void g(b bVar) {
        this.f9488c = bVar;
        this.f9487b.setAccessibilityDelegate(bVar);
    }
}
