package c2;

/* JADX INFO: renamed from: c2.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0574m extends M0 {

    /* JADX INFO: renamed from: c2.m$a */
    public static final class a implements InterfaceC0574m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final U1.l f5162a;

        public a(U1.l lVar) {
            this.f5162a = lVar;
        }

        @Override // c2.InterfaceC0574m
        public void a(Throwable th) {
            this.f5162a.invoke(th);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + S.a(this.f5162a) + '@' + S.b(this) + ']';
        }
    }

    void a(Throwable th);
}
