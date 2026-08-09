package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: renamed from: kotlin.jvm.internal.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1007a implements i, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Object f9727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f9728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f9729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f9730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f9731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f9732f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f9733l;

    public AbstractC1007a(int i3, Object obj, Class cls, String str, String str2, int i4) {
        this.f9727a = obj;
        this.f9728b = cls;
        this.f9729c = str;
        this.f9730d = str2;
        this.f9731e = (i4 & 1) == 1;
        this.f9732f = i3;
        this.f9733l = i4 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1007a)) {
            return false;
        }
        AbstractC1007a abstractC1007a = (AbstractC1007a) obj;
        return this.f9731e == abstractC1007a.f9731e && this.f9732f == abstractC1007a.f9732f && this.f9733l == abstractC1007a.f9733l && m.a(this.f9727a, abstractC1007a.f9727a) && m.a(this.f9728b, abstractC1007a.f9728b) && this.f9729c.equals(abstractC1007a.f9729c) && this.f9730d.equals(abstractC1007a.f9730d);
    }

    @Override // kotlin.jvm.internal.i
    public int getArity() {
        return this.f9732f;
    }

    public int hashCode() {
        Object obj = this.f9727a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f9728b;
        return ((((((((((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.f9729c.hashCode()) * 31) + this.f9730d.hashCode()) * 31) + (this.f9731e ? 1231 : 1237)) * 31) + this.f9732f) * 31) + this.f9733l;
    }

    public String toString() {
        return z.g(this);
    }
}
