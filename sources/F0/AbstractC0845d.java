package f0;

/* JADX INFO: renamed from: f0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0845d {
    static StringBuilder a(int i3) {
        AbstractC0844c.b(i3, "size");
        return new StringBuilder((int) Math.min(((long) i3) * 8, 1073741824L));
    }
}
