package b2;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class r extends q {
    public static final String h0(String str, int i3) {
        kotlin.jvm.internal.m.e(str, "<this>");
        if (i3 >= 0) {
            String strSubstring = str.substring(Y1.i.c(i3, str.length()));
            kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i3 + " is less than zero.").toString());
    }

    public static char i0(CharSequence charSequence) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(p.u(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }
}
