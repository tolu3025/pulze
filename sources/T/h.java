package t;

import I1.k;
import I1.u;
import J1.x;
import V0.I;
import androidx.datastore.preferences.protobuf.AbstractC0492f;
import androidx.datastore.preferences.protobuf.AbstractC0505t;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m;
import p.C1050d;
import p.InterfaceC1046A;
import s.f;
import s.g;
import s.h;
import t.f;

/* JADX INFO: loaded from: classes.dex */
public final class h implements InterfaceC1046A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f11285a = new h();

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11286a;

        static {
            int[] iArr = new int[h.b.values().length];
            try {
                iArr[h.b.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.b.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h.b.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[h.b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[h.b.STRING_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[h.b.BYTES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[h.b.VALUE_NOT_SET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f11286a = iArr;
        }
    }

    private h() {
    }

    private final void d(String str, s.h hVar, C1221c c1221c) throws C1050d {
        h.b bVarG0 = hVar.g0();
        switch (bVarG0 == null ? -1 : a.f11286a[bVarG0.ordinal()]) {
            case -1:
                throw new C1050d("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new k();
            case 1:
                c1221c.j(i.a(str), Boolean.valueOf(hVar.X()));
                return;
            case 2:
                c1221c.j(i.d(str), Float.valueOf(hVar.b0()));
                return;
            case 3:
                c1221c.j(i.c(str), Double.valueOf(hVar.a0()));
                return;
            case 4:
                c1221c.j(i.e(str), Integer.valueOf(hVar.c0()));
                return;
            case 5:
                c1221c.j(i.f(str), Long.valueOf(hVar.d0()));
                return;
            case 6:
                f.a aVarG = i.g(str);
                String strE0 = hVar.e0();
                m.d(strE0, "value.string");
                c1221c.j(aVarG, strE0);
                return;
            case 7:
                f.a aVarH = i.h(str);
                List listT = hVar.f0().T();
                m.d(listT, "value.stringSet.stringsList");
                c1221c.j(aVarH, x.a0(listT));
                return;
            case 8:
                f.a aVarB = i.b(str);
                byte[] bArrU = hVar.Y().u();
                m.d(bArrU, "value.bytes.toByteArray()");
                c1221c.j(aVarB, bArrU);
                return;
            case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                throw new C1050d("Value not set.", null, 2, null);
        }
    }

    private final s.h f(Object obj) {
        AbstractC0505t abstractC0505tI;
        String str;
        if (obj instanceof Boolean) {
            abstractC0505tI = s.h.h0().q(((Boolean) obj).booleanValue()).i();
            str = "newBuilder().setBoolean(value).build()";
        } else if (obj instanceof Float) {
            abstractC0505tI = s.h.h0().t(((Number) obj).floatValue()).i();
            str = "newBuilder().setFloat(value).build()";
        } else if (obj instanceof Double) {
            abstractC0505tI = s.h.h0().s(((Number) obj).doubleValue()).i();
            str = "newBuilder().setDouble(value).build()";
        } else if (obj instanceof Integer) {
            abstractC0505tI = s.h.h0().u(((Number) obj).intValue()).i();
            str = "newBuilder().setInteger(value).build()";
        } else if (obj instanceof Long) {
            abstractC0505tI = s.h.h0().v(((Number) obj).longValue()).i();
            str = "newBuilder().setLong(value).build()";
        } else if (obj instanceof String) {
            abstractC0505tI = s.h.h0().w((String) obj).i();
            str = "newBuilder().setString(value).build()";
        } else if (obj instanceof Set) {
            h.a aVarH0 = s.h.h0();
            g.a aVarU = s.g.U();
            m.c(obj, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            abstractC0505tI = aVarH0.x(aVarU.q((Set) obj)).i();
            str = "newBuilder()\n           …                 .build()";
        } else {
            if (!(obj instanceof byte[])) {
                throw new IllegalStateException("PreferencesSerializer does not support type: " + obj.getClass().getName());
            }
            abstractC0505tI = s.h.h0().r(AbstractC0492f.l((byte[]) obj)).i();
            str = "newBuilder().setBytes(By….copyFrom(value)).build()";
        }
        m.d(abstractC0505tI, str);
        return (s.h) abstractC0505tI;
    }

    @Override // p.InterfaceC1046A
    public Object a(InputStream inputStream, M1.d dVar) throws C1050d {
        s.f fVarA = s.d.f11223a.a(inputStream);
        C1221c c1221cB = g.b(new f.b[0]);
        Map mapR = fVarA.R();
        m.d(mapR, "preferencesProto.preferencesMap");
        for (Map.Entry entry : mapR.entrySet()) {
            String name = (String) entry.getKey();
            s.h value = (s.h) entry.getValue();
            h hVar = f11285a;
            m.d(name, "name");
            m.d(value, "value");
            hVar.d(name, value, c1221cB);
        }
        return c1221cB.d();
    }

    @Override // p.InterfaceC1046A
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public f b() {
        return g.a();
    }

    @Override // p.InterfaceC1046A
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Object c(f fVar, OutputStream outputStream, M1.d dVar) {
        Map mapA = fVar.a();
        f.a aVarU = s.f.U();
        for (Map.Entry entry : mapA.entrySet()) {
            aVarU.q(((f.a) entry.getKey()).a(), f(entry.getValue()));
        }
        ((s.f) aVarU.i()).i(outputStream);
        return u.f2419a;
    }
}
