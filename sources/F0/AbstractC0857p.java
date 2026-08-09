package f0;

import e0.InterfaceC0823d;
import java.util.Map;

/* JADX INFO: renamed from: f0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0857p {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: f0.p$a */
    private static abstract class a implements InterfaceC0823d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f7217a = new C0123a("KEY", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f7218b = new b("VALUE", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ a[] f7219c = e();

        /* JADX INFO: renamed from: f0.p$a$a, reason: collision with other inner class name */
        enum C0123a extends a {
            C0123a(String str, int i3) {
                super(str, i3, null);
            }

            @Override // e0.InterfaceC0823d
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public Object c(Map.Entry entry) {
                return entry.getKey();
            }
        }

        /* JADX INFO: renamed from: f0.p$a$b */
        enum b extends a {
            b(String str, int i3) {
                super(str, i3, null);
            }

            @Override // e0.InterfaceC0823d
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public Object c(Map.Entry entry) {
                return entry.getValue();
            }
        }

        private a(String str, int i3) {
        }

        private static /* synthetic */ a[] e() {
            return new a[]{f7217a, f7218b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f7219c.clone();
        }

        /* synthetic */ a(String str, int i3, AbstractC0856o abstractC0856o) {
            this(str, i3);
        }
    }

    static boolean a(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    static String b(Map map) {
        StringBuilder sbA = AbstractC0845d.a(map.size());
        sbA.append('{');
        boolean z2 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z2) {
                sbA.append(", ");
            }
            sbA.append(entry.getKey());
            sbA.append('=');
            sbA.append(entry.getValue());
            z2 = false;
        }
        sbA.append('}');
        return sbA.toString();
    }

    static InterfaceC0823d c() {
        return a.f7218b;
    }
}
