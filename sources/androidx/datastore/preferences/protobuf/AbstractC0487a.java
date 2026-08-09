package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.J;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0487a implements J {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0085a implements J.a {
        protected static void e(Iterable iterable, List list) {
            AbstractC0506u.a(iterable);
            g(iterable, list);
        }

        private static void g(Iterable iterable, List list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
        }

        protected static e0 h(J j3) {
            return new e0(j3);
        }
    }

    protected static void e(Iterable iterable, List list) {
        AbstractC0085a.e(iterable, list);
    }

    abstract int g(Y y2);

    e0 h() {
        return new e0(this);
    }

    public void i(OutputStream outputStream) {
        AbstractC0495i abstractC0495iY = AbstractC0495i.Y(outputStream, AbstractC0495i.C(a()));
        d(abstractC0495iY);
        abstractC0495iY.V();
    }
}
