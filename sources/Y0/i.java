package Y0;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
abstract class i {

    enum a {
        UTF_16,
        UTF_8
    }

    static class b extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        CharSequence f3315a;

        public b(CharSequence charSequence) {
            this.f3315a = charSequence;
        }

        @Override // Y0.i
        public byte[] a() {
            return this.f3315a.toString().getBytes(Charset.forName("UTF-16"));
        }

        @Override // Y0.i
        public CharSequence b() {
            return this.f3315a;
        }

        @Override // Y0.i
        public a c() {
            return a.UTF_16;
        }

        @Override // Y0.i
        public int d() {
            return this.f3315a.length();
        }
    }

    i() {
    }

    static i e(CharSequence charSequence) {
        return new b(charSequence);
    }

    abstract byte[] a();

    abstract CharSequence b();

    abstract a c();

    abstract int d();
}
