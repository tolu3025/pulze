package K0;

/* JADX INFO: loaded from: classes.dex */
public interface j {

    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f2594a;

        a(int i3) {
            this.f2594a = i3;
        }

        public int e() {
            return this.f2594a;
        }
    }

    a b(String str);
}
