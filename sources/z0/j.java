package z0;

import D0.w;

/* JADX INFO: loaded from: classes.dex */
public class j implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f12101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w f12102c;

    public j(String str, i iVar, w wVar) {
        this.f12100a = str;
        this.f12101b = iVar;
        this.f12102c = wVar;
    }

    public i a() {
        return this.f12101b;
    }

    public String b() {
        return this.f12100a;
    }

    public w c() {
        return this.f12102c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f12100a.equals(jVar.f12100a) && this.f12101b.equals(jVar.f12101b)) {
            return this.f12102c.equals(jVar.f12102c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f12100a.hashCode() * 31) + this.f12101b.hashCode()) * 31) + this.f12102c.hashCode();
    }
}
