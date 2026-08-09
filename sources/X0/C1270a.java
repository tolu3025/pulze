package x0;

import r0.E;

/* JADX INFO: renamed from: x0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1270a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f11727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f11728b;

    public C1270a(Class cls, Object obj) {
        this.f11727a = (Class) E.b(cls);
        this.f11728b = E.b(obj);
    }

    public Class a() {
        return this.f11727a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f11727a, this.f11728b);
    }
}
