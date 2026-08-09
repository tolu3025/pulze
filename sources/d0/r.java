package D0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f1277b = C("__name__");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f1278c = C("__update_time__");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f1279d = C("__create_time__");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f1280e = new r(Collections.emptyList());

    private r(List list) {
        super(list);
    }

    public static r A(List list) {
        return list.isEmpty() ? f1280e : new r(list);
    }

    public static r B(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        boolean z2 = false;
        while (i3 < str.length()) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '\\') {
                i3++;
                if (i3 == str.length()) {
                    throw new IllegalArgumentException("Trailing escape character is not allowed");
                }
                cCharAt = str.charAt(i3);
            } else {
                if (cCharAt == '.') {
                    if (!z2) {
                        String string = sb.toString();
                        if (string.isEmpty()) {
                            throw new IllegalArgumentException("Invalid field path (" + str + "). Paths must not be empty, begin with '.', end with '.', or contain '..'");
                        }
                        StringBuilder sb2 = new StringBuilder();
                        arrayList.add(string);
                        sb = sb2;
                    }
                } else if (cCharAt == '`') {
                    z2 = !z2;
                }
                i3++;
            }
            sb.append(cCharAt);
            i3++;
        }
        String string2 = sb.toString();
        if (!string2.isEmpty()) {
            arrayList.add(string2);
            return new r(arrayList);
        }
        throw new IllegalArgumentException("Invalid field path (" + str + "). Paths must not be empty, begin with '.', end with '.', or contain '..'");
    }

    public static r C(String str) {
        return new r(Collections.singletonList(str));
    }

    private static boolean E(String str) {
        if (str.isEmpty()) {
            return false;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt != '_' && ((cCharAt < 'a' || cCharAt > 'z') && (cCharAt < 'A' || cCharAt > 'Z'))) {
            return false;
        }
        for (int i3 = 1; i3 < str.length(); i3++) {
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 != '_' && ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < 'A' || cCharAt2 > 'Z') && (cCharAt2 < '0' || cCharAt2 > '9')))) {
                return false;
            }
        }
        return true;
    }

    public boolean D() {
        return equals(f1277b);
    }

    @Override // D0.e
    public String n() {
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < this.f1257a.size(); i3++) {
            if (i3 > 0) {
                sb.append(".");
            }
            String strReplace = ((String) this.f1257a.get(i3)).replace("\\", "\\\\").replace("`", "\\`");
            if (!E(strReplace)) {
                strReplace = '`' + strReplace + '`';
            }
            sb.append(strReplace);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // D0.e
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public r q(List list) {
        return new r(list);
    }
}
