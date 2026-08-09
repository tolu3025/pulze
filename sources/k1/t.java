package k1;

import android.os.Build;
import android.util.DisplayMetrics;
import b1.AbstractC0525b;
import c1.C0543a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import l1.C1015a;

/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f9633b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1015a f9634a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ConcurrentLinkedQueue f9635a = new ConcurrentLinkedQueue();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f9636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b f9637c;

        /* JADX INFO: renamed from: k1.t$a$a, reason: collision with other inner class name */
        class C0143a implements C1015a.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f9638a;

            C0143a(b bVar) {
                this.f9638a = bVar;
            }

            @Override // l1.C1015a.e
            public void a(Object obj) {
                a.this.f9635a.remove(this.f9638a);
                if (a.this.f9635a.isEmpty()) {
                    return;
                }
                AbstractC0525b.b("SettingsChannel", "The queue becomes empty after removing config generation " + String.valueOf(this.f9638a.f9641a));
            }
        }

        public static class b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f9640c = Integer.MIN_VALUE;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f9641a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final DisplayMetrics f9642b;

            public b(DisplayMetrics displayMetrics) {
                int i3 = f9640c;
                f9640c = i3 + 1;
                this.f9641a = i3;
                this.f9642b = displayMetrics;
            }
        }

        public C1015a.e b(b bVar) {
            this.f9635a.add(bVar);
            b bVar2 = this.f9637c;
            this.f9637c = bVar;
            if (bVar2 == null) {
                return null;
            }
            return new C0143a(bVar2);
        }

        public b c(int i3) {
            b bVar;
            StringBuilder sb;
            String strValueOf;
            if (this.f9636b == null) {
                this.f9636b = (b) this.f9635a.poll();
            }
            while (true) {
                bVar = this.f9636b;
                if (bVar == null || bVar.f9641a >= i3) {
                    break;
                }
                this.f9636b = (b) this.f9635a.poll();
            }
            if (bVar == null) {
                sb = new StringBuilder();
                sb.append("Cannot find config with generation: ");
                sb.append(String.valueOf(i3));
                strValueOf = ", after exhausting the queue.";
            } else {
                if (bVar.f9641a == i3) {
                    return bVar;
                }
                sb = new StringBuilder();
                sb.append("Cannot find config with generation: ");
                sb.append(String.valueOf(i3));
                sb.append(", the oldest config is now: ");
                strValueOf = String.valueOf(this.f9636b.f9641a);
            }
            sb.append(strValueOf);
            AbstractC0525b.b("SettingsChannel", sb.toString());
            return null;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C1015a f9643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f9644b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private DisplayMetrics f9645c;

        b(C1015a c1015a) {
            this.f9643a = c1015a;
        }

        public void a() {
            AbstractC0525b.f("SettingsChannel", "Sending message: \ntextScaleFactor: " + this.f9644b.get("textScaleFactor") + "\nalwaysUse24HourFormat: " + this.f9644b.get("alwaysUse24HourFormat") + "\nplatformBrightness: " + this.f9644b.get("platformBrightness"));
            DisplayMetrics displayMetrics = this.f9645c;
            if (!t.c() || displayMetrics == null) {
                this.f9643a.c(this.f9644b);
                return;
            }
            a.b bVar = new a.b(displayMetrics);
            C1015a.e eVarB = t.f9633b.b(bVar);
            this.f9644b.put("configurationId", Integer.valueOf(bVar.f9641a));
            this.f9643a.d(this.f9644b, eVarB);
        }

        public b b(boolean z2) {
            this.f9644b.put("brieflyShowPassword", Boolean.valueOf(z2));
            return this;
        }

        public b c(DisplayMetrics displayMetrics) {
            this.f9645c = displayMetrics;
            return this;
        }

        public b d(boolean z2) {
            this.f9644b.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z2));
            return this;
        }

        public b e(c cVar) {
            this.f9644b.put("platformBrightness", cVar.f9649a);
            return this;
        }

        public b f(float f3) {
            this.f9644b.put("textScaleFactor", Float.valueOf(f3));
            return this;
        }

        public b g(boolean z2) {
            this.f9644b.put("alwaysUse24HourFormat", Boolean.valueOf(z2));
            return this;
        }
    }

    public enum c {
        light("light"),
        dark("dark");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f9649a;

        c(String str) {
            this.f9649a = str;
        }
    }

    public t(C0543a c0543a) {
        this.f9634a = new C1015a(c0543a, "flutter/settings", l1.f.f9776a);
    }

    public static DisplayMetrics b(int i3) {
        a.b bVarC = f9633b.c(i3);
        if (bVarC == null) {
            return null;
        }
        return bVarC.f9642b;
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public b d() {
        return new b(this.f9634a);
    }
}
