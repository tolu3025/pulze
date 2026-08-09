package b2;

import J1.AbstractC0411o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f4968b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Pattern f4969a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(String pattern) {
        kotlin.jvm.internal.m.e(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        kotlin.jvm.internal.m.d(patternCompile, "compile(...)");
        this(patternCompile);
    }

    public final boolean a(CharSequence input) {
        kotlin.jvm.internal.m.e(input, "input");
        return this.f4969a.matcher(input).matches();
    }

    public final List b(CharSequence input, int i3) {
        kotlin.jvm.internal.m.e(input, "input");
        p.S(i3);
        Matcher matcher = this.f4969a.matcher(input);
        if (i3 == 1 || !matcher.find()) {
            return AbstractC0411o.d(input.toString());
        }
        ArrayList arrayList = new ArrayList(i3 > 0 ? Y1.i.c(i3, 10) : 10);
        int i4 = i3 - 1;
        int iEnd = 0;
        do {
            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i4 >= 0 && arrayList.size() == i4) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(iEnd, input.length()).toString());
        return arrayList;
    }

    public String toString() {
        String string = this.f4969a.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    public e(Pattern nativePattern) {
        kotlin.jvm.internal.m.e(nativePattern, "nativePattern");
        this.f4969a = nativePattern;
    }
}
