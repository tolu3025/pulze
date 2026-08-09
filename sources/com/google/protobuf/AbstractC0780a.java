package com.google.protobuf;

import com.google.protobuf.V;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0780a implements V {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: com.google.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0116a implements V.a {
        protected static void k(Iterable iterable, List list) {
            C.a(iterable);
            if (!(iterable instanceof J)) {
                if (iterable instanceof g0) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    l(iterable, list);
                    return;
                }
            }
            List listK = ((J) iterable).k();
            J j3 = (J) list;
            int size = list.size();
            for (Object obj : listK) {
                if (obj == null) {
                    String str = "Element at index " + (j3.size() - size) + " is null.";
                    for (int size2 = j3.size() - 1; size2 >= size; size2--) {
                        j3.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC0791i) {
                    j3.h((AbstractC0791i) obj);
                } else {
                    j3.add((String) obj);
                }
            }
        }

        private static void l(Iterable iterable, List list) {
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

        protected static u0 m(V v2) {
            return new u0(v2);
        }
    }

    protected static void k(Iterable iterable, List list) {
        AbstractC0116a.k(iterable, list);
    }

    private String m(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // com.google.protobuf.V
    public void e(OutputStream outputStream) {
        AbstractC0794l abstractC0794lA0 = AbstractC0794l.a0(outputStream, AbstractC0794l.E(a()));
        h(abstractC0794lA0);
        abstractC0794lA0.X();
    }

    @Override // com.google.protobuf.V
    public byte[] i() {
        try {
            byte[] bArr = new byte[a()];
            AbstractC0794l abstractC0794lB0 = AbstractC0794l.b0(bArr);
            h(abstractC0794lB0);
            abstractC0794lB0.d();
            return bArr;
        } catch (IOException e3) {
            throw new RuntimeException(m("byte array"), e3);
        }
    }

    abstract int l(n0 n0Var);

    u0 n() {
        return new u0(this);
    }
}
