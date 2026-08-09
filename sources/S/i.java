package s;

import I1.o;
import I1.u;
import U1.p;
import U1.q;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.m;
import r.C1194a;
import t.C1221c;
import t.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set f11237a = new LinkedHashSet();

    static final class a extends l implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f11238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f11239b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f11240c;

        a(M1.d dVar) {
            super(3, dVar);
        }

        @Override // U1.q
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object e(r.c cVar, t.f fVar, M1.d dVar) {
            a aVar = new a(dVar);
            aVar.f11239b = cVar;
            aVar.f11240c = fVar;
            return aVar.invokeSuspend(u.f2419a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            f.a aVarA;
            N1.d.e();
            if (this.f11238a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            r.c cVar = (r.c) this.f11239b;
            t.f fVar = (t.f) this.f11240c;
            Set setKeySet = fVar.a().keySet();
            ArrayList arrayList = new ArrayList(J1.q.n(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((f.a) it.next()).a());
            }
            Map mapA = cVar.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : mapA.entrySet()) {
                if (!arrayList.contains((String) entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            C1221c c1221cC = fVar.c();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (value instanceof Boolean) {
                    aVarA = t.i.a(str);
                } else if (value instanceof Float) {
                    aVarA = t.i.d(str);
                } else if (value instanceof Integer) {
                    aVarA = t.i.e(str);
                } else if (value instanceof Long) {
                    aVarA = t.i.f(str);
                } else if (value instanceof String) {
                    aVarA = t.i.g(str);
                } else if (value instanceof Set) {
                    aVarA = t.i.h(str);
                    m.c(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                    value = (Set) value;
                }
                c1221cC.j(aVarA, value);
            }
            return c1221cC.d();
        }
    }

    static final class b extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f11241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f11242b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Set f11243c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Set set, M1.d dVar) {
            super(2, dVar);
            this.f11243c = set;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(Object obj, M1.d dVar) {
            b bVar = new b(this.f11243c, dVar);
            bVar.f11242b = obj;
            return bVar;
        }

        @Override // U1.p
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(t.f fVar, M1.d dVar) {
            return ((b) create(fVar, dVar)).invokeSuspend(u.f2419a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            N1.d.e();
            if (this.f11241a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            Set setKeySet = ((t.f) this.f11242b).a().keySet();
            ArrayList arrayList = new ArrayList(J1.q.n(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((f.a) it.next()).a());
            }
            boolean z2 = true;
            if (this.f11243c != i.c()) {
                Set set = this.f11243c;
                if ((set instanceof Collection) && set.isEmpty()) {
                    z2 = false;
                } else {
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (!arrayList.contains((String) it2.next())) {
                            break;
                        }
                    }
                    z2 = false;
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(z2);
        }
    }

    public static final C1194a a(Context context, String sharedPreferencesName, Set keysToMigrate) {
        m.e(context, "context");
        m.e(sharedPreferencesName, "sharedPreferencesName");
        m.e(keysToMigrate, "keysToMigrate");
        return keysToMigrate == f11237a ? new C1194a(context, sharedPreferencesName, null, e(keysToMigrate), d(), 4, null) : new C1194a(context, sharedPreferencesName, keysToMigrate, e(keysToMigrate), d());
    }

    public static /* synthetic */ C1194a b(Context context, String str, Set set, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            set = f11237a;
        }
        return a(context, str, set);
    }

    public static final Set c() {
        return f11237a;
    }

    private static final q d() {
        return new a(null);
    }

    private static final p e(Set set) {
        return new b(set, null);
    }
}
