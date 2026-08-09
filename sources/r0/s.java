package r0;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class s extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f11161a;

    public s(List list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f11161a = list;
    }
}
