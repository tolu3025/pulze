package D0;

import V0.I;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public interface i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Comparator f1261a = new Comparator() { // from class: D0.g
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((i) obj).getKey().compareTo(((i) obj2).getKey());
        }
    };

    t b();

    s c();

    boolean d();

    I e(r rVar);

    boolean f();

    boolean g();

    l getKey();

    boolean h();

    w i();

    boolean j();

    boolean k();

    w l();
}
