package j2;

import c2.S;

/* JADX INFO: loaded from: classes.dex */
final class i extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f9432c;

    public i(Runnable runnable, long j3, boolean z2) {
        super(j3, z2);
        this.f9432c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f9432c.run();
    }

    public String toString() {
        return "Task[" + S.a(this.f9432c) + '@' + S.b(this.f9432c) + ", " + this.f9430a + ", " + j.c(this.f9431b) + ']';
    }
}
