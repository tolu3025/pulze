package F0;

import com.google.firebase.firestore.C0760x;

/* JADX INFO: loaded from: classes.dex */
public abstract class K extends AbstractC0315t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f1452c = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final K a(Object o2) {
            kotlin.jvm.internal.m.e(o2, "o");
            if (o2 instanceof K) {
                return (K) o2;
            }
            if (o2 instanceof String) {
                return AbstractC0315t.f1490a.O((String) o2);
            }
            if (o2 instanceof C0760x) {
                return AbstractC0315t.f1490a.N((C0760x) o2);
            }
            throw new IllegalArgumentException("Unknown Selectable type: " + o2);
        }
    }

    public abstract String B0();

    public abstract AbstractC0315t C0();
}
