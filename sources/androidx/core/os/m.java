package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class m implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocaleList f3897a;

    m(Object obj) {
        this.f3897a = l.a(obj);
    }

    @Override // androidx.core.os.g
    public Object a() {
        return this.f3897a;
    }

    public boolean equals(Object obj) {
        return this.f3897a.equals(((g) obj).a());
    }

    @Override // androidx.core.os.g
    public Locale get(int i3) {
        return this.f3897a.get(i3);
    }

    public int hashCode() {
        return this.f3897a.hashCode();
    }

    public String toString() {
        return this.f3897a.toString();
    }
}
