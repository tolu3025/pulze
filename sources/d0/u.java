package D0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f1301b = new u(Collections.emptyList());

    private u(List list) {
        super(list);
    }

    public static u A(List list) {
        return list.isEmpty() ? f1301b : new u(list);
    }

    public static u B(String str) {
        if (str.contains("//")) {
            throw new IllegalArgumentException("Invalid path (" + str + "). Paths must not contain // in them.");
        }
        String[] strArrSplit = str.split("/");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str2 : strArrSplit) {
            if (!str2.isEmpty()) {
                arrayList.add(str2);
            }
        }
        return new u(arrayList);
    }

    @Override // D0.e
    public String n() {
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < this.f1257a.size(); i3++) {
            if (i3 > 0) {
                sb.append("/");
            }
            sb.append((String) this.f1257a.get(i3));
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // D0.e
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public u q(List list) {
        return new u(list);
    }
}
