package f0;

import e0.InterfaceC0823d;
import java.util.Comparator;

/* JADX INFO: renamed from: f0.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0859r implements Comparator {
    protected AbstractC0859r() {
    }

    public static AbstractC0859r a(Comparator comparator) {
        return comparator instanceof AbstractC0859r ? (AbstractC0859r) comparator : new C0846e(comparator);
    }

    public AbstractC0859r b(InterfaceC0823d interfaceC0823d) {
        return new C0843b(interfaceC0823d, this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);
}
