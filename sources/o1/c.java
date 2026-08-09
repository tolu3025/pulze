package O1;

import J1.AbstractC0399c;
import J1.AbstractC0407k;
import java.io.Serializable;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
final class c extends AbstractC0399c implements a, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Enum[] f2738b;

    public c(Enum[] entries) {
        m.e(entries, "entries");
        this.f2738b = entries;
    }

    @Override // J1.AbstractC0397a
    public int a() {
        return this.f2738b.length;
    }

    public boolean b(Enum element) {
        m.e(element, "element");
        return ((Enum) AbstractC0407k.s(this.f2738b, element.ordinal())) == element;
    }

    @Override // J1.AbstractC0397a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return b((Enum) obj);
        }
        return false;
    }

    @Override // J1.AbstractC0399c, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Enum get(int i3) {
        AbstractC0399c.f2538a.b(i3, this.f2738b.length);
        return this.f2738b[i3];
    }

    public int f(Enum element) {
        m.e(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) AbstractC0407k.s(this.f2738b, iOrdinal)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // J1.AbstractC0399c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return f((Enum) obj);
        }
        return -1;
    }

    public int l(Enum element) {
        m.e(element, "element");
        return indexOf(element);
    }

    @Override // J1.AbstractC0399c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return l((Enum) obj);
        }
        return -1;
    }
}
