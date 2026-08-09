package f0;

/* JADX INFO: renamed from: f0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0849h {
    static int a(int i3) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i3) * (-862048943)), 15)) * 461845907);
    }

    static int b(Object obj) {
        return a(obj == null ? 0 : obj.hashCode());
    }
}
