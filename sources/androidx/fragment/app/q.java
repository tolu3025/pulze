package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC0484k;
import androidx.core.view.AbstractC0486m;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC0481h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f4684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f4685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f4686c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f4687d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f4688e;

        a(int i3, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f4684a = i3;
            this.f4685b = arrayList;
            this.f4686c = arrayList2;
            this.f4687d = arrayList3;
            this.f4688e = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i3 = 0; i3 < this.f4684a; i3++) {
                AbstractC0484k.i((View) this.f4685b.get(i3), (String) this.f4686c.get(i3));
                AbstractC0484k.i((View) this.f4687d.get(i3), (String) this.f4688e.get(i3));
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f4690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f4691b;

        b(ArrayList arrayList, Map map) {
            this.f4690a = arrayList;
            this.f4691b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f4690a.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view = (View) this.f4690a.get(i3);
                String strE = AbstractC0484k.e(view);
                if (strE != null) {
                    AbstractC0484k.i(view, q.i(this.f4691b, strE));
                }
            }
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f4693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f4694b;

        c(ArrayList arrayList, Map map) {
            this.f4693a = arrayList;
            this.f4694b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f4693a.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view = (View) this.f4693a.get(i3);
                AbstractC0484k.i(view, (String) this.f4694b.get(AbstractC0484k.e(view)));
            }
        }
    }

    protected static void d(List list, View view) {
        int size = list.size();
        if (h(list, view, size)) {
            return;
        }
        list.add(view);
        for (int i3 = size; i3 < list.size(); i3++) {
            View view2 = (View) list.get(i3);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = viewGroup.getChildAt(i4);
                    if (!h(list, childAt, size)) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    private static boolean h(List list, View view, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (list.get(i4) == view) {
                return true;
            }
        }
        return false;
    }

    static String i(Map map, String str) {
        for (Map.Entry entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return (String) entry.getKey();
            }
        }
        return null;
    }

    protected static boolean l(List list) {
        return list == null || list.isEmpty();
    }

    public abstract Object A(Object obj);

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    void f(ArrayList arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z2 = view instanceof ViewGroup;
            Object obj = view;
            if (z2) {
                ViewGroup viewGroup = (ViewGroup) view;
                boolean zA = AbstractC0486m.a(viewGroup);
                obj = viewGroup;
                if (!zA) {
                    int childCount = viewGroup.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        f(arrayList, viewGroup.getChildAt(i3));
                    }
                    return;
                }
            }
            arrayList.add(obj);
        }
    }

    public abstract Object g(Object obj);

    void j(Map map, View view) {
        if (view.getVisibility() == 0) {
            String strE = AbstractC0484k.e(view);
            if (strE != null) {
                map.put(strE, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    j(map, viewGroup.getChildAt(i3));
                }
            }
        }
    }

    protected void k(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        rect.set(i3, iArr[1], view.getWidth() + i3, iArr[1] + view.getHeight());
    }

    public abstract Object m(Object obj, Object obj2, Object obj3);

    public abstract Object n(Object obj, Object obj2, Object obj3);

    ArrayList o(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            arrayList2.add(AbstractC0484k.e(view));
            AbstractC0484k.i(view, null);
        }
        return arrayList2;
    }

    public abstract void p(Object obj, View view);

    public abstract void q(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract void r(Object obj, View view, ArrayList arrayList);

    void s(ViewGroup viewGroup, ArrayList arrayList, Map map) {
        ViewTreeObserverOnPreDrawListenerC0481h.a(viewGroup, new c(arrayList, map));
    }

    public abstract void t(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    public abstract void u(Object obj, Rect rect);

    public abstract void v(Object obj, View view);

    void w(View view, ArrayList arrayList, Map map) {
        ViewTreeObserverOnPreDrawListenerC0481h.a(view, new b(arrayList, map));
    }

    void x(View view, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Map map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) arrayList.get(i3);
            String strE = AbstractC0484k.e(view2);
            arrayList4.add(strE);
            if (strE != null) {
                AbstractC0484k.i(view2, null);
                String str = (String) map.get(strE);
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i4))) {
                        AbstractC0484k.i((View) arrayList2.get(i4), strE);
                        break;
                    }
                    i4++;
                }
            }
        }
        ViewTreeObserverOnPreDrawListenerC0481h.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void y(Object obj, View view, ArrayList arrayList);

    public abstract void z(Object obj, ArrayList arrayList, ArrayList arrayList2);
}
