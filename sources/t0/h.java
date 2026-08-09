package t0;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public interface h {

    public enum a {
        RED,
        BLACK
    }

    h a();

    h b(Object obj, Object obj2, Comparator comparator);

    boolean c();

    h d(Object obj, Object obj2, a aVar, h hVar, h hVar2);

    h e();

    h f(Object obj, Comparator comparator);

    h g();

    Object getKey();

    Object getValue();

    h h();

    boolean isEmpty();

    int size();
}
