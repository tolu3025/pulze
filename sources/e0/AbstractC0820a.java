package e0;

/* JADX INFO: renamed from: e0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0820a {

    /* JADX INFO: renamed from: e0.a$a, reason: collision with other inner class name */
    static abstract class AbstractC0119a extends AbstractC0820a {
        AbstractC0119a() {
        }
    }

    /* JADX INFO: renamed from: e0.a$b */
    private static final class b extends AbstractC0119a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char f7056a;

        b(char c3) {
            this.f7056a = c3;
        }

        @Override // e0.AbstractC0820a
        public boolean c(char c3) {
            return c3 == this.f7056a;
        }

        public String toString() {
            return "CharMatcher.is('" + AbstractC0820a.e(this.f7056a) + "')";
        }
    }

    /* JADX INFO: renamed from: e0.a$c */
    static abstract class c extends AbstractC0119a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f7057a;

        c(String str) {
            this.f7057a = (String) AbstractC0829j.n(str);
        }

        public final String toString() {
            return this.f7057a;
        }
    }

    /* JADX INFO: renamed from: e0.a$d */
    private static final class d extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f7058b = new d();

        private d() {
            super("CharMatcher.none()");
        }

        @Override // e0.AbstractC0820a
        public boolean c(char c3) {
            return false;
        }

        @Override // e0.AbstractC0820a
        public String f(CharSequence charSequence) {
            return charSequence.toString();
        }
    }

    /* JADX INFO: renamed from: e0.a$e */
    static final class e extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f7059b = Integer.numberOfLeadingZeros(31);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final e f7060c = new e();

        e() {
            super("CharMatcher.whitespace()");
        }

        @Override // e0.AbstractC0820a
        public boolean c(char c3) {
            return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c3) >>> f7059b) == c3;
        }
    }

    protected AbstractC0820a() {
    }

    public static AbstractC0820a b(char c3) {
        return new b(c3);
    }

    public static AbstractC0820a d() {
        return d.f7058b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String e(char c3) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i3 = 0; i3 < 4; i3++) {
            cArr[5 - i3] = "0123456789ABCDEF".charAt(c3 & 15);
            c3 = (char) (c3 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public static AbstractC0820a g() {
        return e.f7060c;
    }

    public abstract boolean c(char c3);

    public String f(CharSequence charSequence) {
        int length = charSequence.length();
        int i3 = 0;
        while (i3 < length && c(charSequence.charAt(i3))) {
            i3++;
        }
        int i4 = length - 1;
        while (i4 > i3 && c(charSequence.charAt(i4))) {
            i4--;
        }
        return charSequence.subSequence(i3, i4 + 1).toString();
    }
}
