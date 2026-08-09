package c;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: c.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0528c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b f4980h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f4981a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f4982b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f4983c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f4984d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient Map f4985e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f4986f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bundle f4987g = new Bundle();

    /* JADX INFO: renamed from: c.c$a */
    private static final class a {
    }

    /* JADX INFO: renamed from: c.c$b */
    private static final class b {
        private b() {
        }

        public /* synthetic */ b(h hVar) {
            this();
        }
    }

    private final void a(int i3, String str) {
        this.f4981a.put(Integer.valueOf(i3), str);
        this.f4982b.put(str, Integer.valueOf(i3));
    }

    private final void c(String str, int i3, Intent intent, a aVar) {
        this.f4986f.remove(str);
        this.f4987g.putParcelable(str, new C0526a(i3, intent));
    }

    public final boolean b(int i3, int i4, Intent intent) {
        String str = (String) this.f4981a.get(Integer.valueOf(i3));
        if (str == null) {
            return false;
        }
        AbstractC0527b.a(this.f4985e.get(str));
        c(str, i4, intent, null);
        return true;
    }

    public final void d(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (stringArrayList2 != null) {
            this.f4984d.addAll(stringArrayList2);
        }
        Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        if (bundle2 != null) {
            this.f4987g.putAll(bundle2);
        }
        int size = stringArrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            String str = stringArrayList.get(i3);
            if (this.f4982b.containsKey(str)) {
                Integer num = (Integer) this.f4982b.remove(str);
                if (!this.f4987g.containsKey(str)) {
                    D.a(this.f4981a).remove(num);
                }
            }
            Integer num2 = integerArrayList.get(i3);
            m.d(num2, "rcs[i]");
            int iIntValue = num2.intValue();
            String str2 = stringArrayList.get(i3);
            m.d(str2, "keys[i]");
            a(iIntValue, str2);
        }
    }

    public final void e(Bundle outState) {
        m.e(outState, "outState");
        outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f4982b.values()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f4982b.keySet()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f4984d));
        outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.f4987g));
    }
}
