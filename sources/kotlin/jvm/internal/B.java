package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f9725a;

    public B(int i3) {
        this.f9725a = new ArrayList(i3);
    }

    public void a(Object obj) {
        this.f9725a.add(obj);
    }

    public void b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList arrayList = this.f9725a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f9725a, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f9725a.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f9725a.add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                this.f9725a.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public int c() {
        return this.f9725a.size();
    }

    public Object[] d(Object[] objArr) {
        return this.f9725a.toArray(objArr);
    }
}
