package B1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f678a;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f679a = new ArrayList(20);

        private void d(String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("name == null");
            }
            if (str.isEmpty()) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i3 = 0; i3 < length; i3++) {
                char cCharAt = str.charAt(i3);
                if (cCharAt <= 31 || cCharAt >= 127) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i3), str));
                }
            }
            if (str2 == null) {
                throw new IllegalArgumentException("value == null");
            }
            int length2 = str2.length();
            for (int i4 = 0; i4 < length2; i4++) {
                char cCharAt2 = str2.charAt(i4);
                if (cCharAt2 <= 31 || cCharAt2 >= 127) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(cCharAt2), Integer.valueOf(i4), str2));
                }
            }
        }

        b b(String str, String str2) {
            this.f679a.add(str);
            this.f679a.add(str2.trim());
            return this;
        }

        public e c() {
            return new e(this);
        }

        public b e(String str) {
            int i3 = 0;
            while (i3 < this.f679a.size()) {
                if (str.equalsIgnoreCase((String) this.f679a.get(i3))) {
                    this.f679a.remove(i3);
                    this.f679a.remove(i3);
                    i3 -= 2;
                }
                i3 += 2;
            }
            return this;
        }

        public b f(String str, String str2) {
            d(str, str2);
            e(str);
            b(str, str2);
            return this;
        }
    }

    private e(b bVar) {
        this.f678a = (String[]) bVar.f679a.toArray(new String[bVar.f679a.size()]);
    }

    public String a(int i3) {
        int i4 = i3 * 2;
        if (i4 < 0) {
            return null;
        }
        String[] strArr = this.f678a;
        if (i4 >= strArr.length) {
            return null;
        }
        return strArr[i4];
    }

    public int b() {
        return this.f678a.length / 2;
    }

    public String c(int i3) {
        int i4 = (i3 * 2) + 1;
        if (i4 < 0) {
            return null;
        }
        String[] strArr = this.f678a;
        if (i4 >= strArr.length) {
            return null;
        }
        return strArr[i4];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int iB = b();
        for (int i3 = 0; i3 < iB; i3++) {
            sb.append(a(i3));
            sb.append(": ");
            sb.append(c(i3));
            sb.append("\n");
        }
        return sb.toString();
    }
}
