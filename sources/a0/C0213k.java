package A0;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: A0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0213k extends AbstractC0219q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f181c;

    /* JADX INFO: renamed from: A0.k$a */
    public enum a {
        AND("and"),
        OR("or");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f185a;

        a(String str) {
            this.f185a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f185a;
        }
    }

    public C0213k(List list, a aVar) {
        this.f179a = new ArrayList(list);
        this.f180b = aVar;
    }

    @Override // A0.AbstractC0219q
    public String a() {
        StringBuilder sb = new StringBuilder();
        if (i()) {
            Iterator it = this.f179a.iterator();
            while (it.hasNext()) {
                sb.append(((AbstractC0219q) it.next()).a());
            }
            return sb.toString();
        }
        sb.append(this.f180b.toString() + "(");
        sb.append(TextUtils.join(",", this.f179a));
        sb.append(")");
        return sb.toString();
    }

    @Override // A0.AbstractC0219q
    public List b() {
        return Collections.unmodifiableList(this.f179a);
    }

    @Override // A0.AbstractC0219q
    public List c() {
        List list = this.f181c;
        if (list != null) {
            return Collections.unmodifiableList(list);
        }
        this.f181c = new ArrayList();
        Iterator it = this.f179a.iterator();
        while (it.hasNext()) {
            this.f181c.addAll(((AbstractC0219q) it.next()).c());
        }
        return Collections.unmodifiableList(this.f181c);
    }

    @Override // A0.AbstractC0219q
    public boolean d(D0.i iVar) {
        if (f()) {
            Iterator it = this.f179a.iterator();
            while (it.hasNext()) {
                if (!((AbstractC0219q) it.next()).d(iVar)) {
                    return false;
                }
            }
            return true;
        }
        Iterator it2 = this.f179a.iterator();
        while (it2.hasNext()) {
            if (((AbstractC0219q) it2.next()).d(iVar)) {
                return true;
            }
        }
        return false;
    }

    public a e() {
        return this.f180b;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0213k)) {
            return false;
        }
        C0213k c0213k = (C0213k) obj;
        return this.f180b == c0213k.f180b && this.f179a.equals(c0213k.f179a);
    }

    public boolean f() {
        return this.f180b == a.AND;
    }

    public boolean g() {
        return this.f180b == a.OR;
    }

    public boolean h() {
        Iterator it = this.f179a.iterator();
        while (it.hasNext()) {
            if (((AbstractC0219q) it.next()) instanceof C0213k) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((1147 + this.f180b.hashCode()) * 31) + this.f179a.hashCode();
    }

    public boolean i() {
        return h() && f();
    }

    public C0213k j(List list) {
        ArrayList arrayList = new ArrayList(this.f179a);
        arrayList.addAll(list);
        return new C0213k(arrayList, this.f180b);
    }

    public String toString() {
        return a();
    }
}
