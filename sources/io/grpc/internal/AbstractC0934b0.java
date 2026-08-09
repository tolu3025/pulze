package io.grpc.internal;

import e0.AbstractC0829j;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: io.grpc.internal.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0934b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f8844a = Logger.getLogger(AbstractC0934b0.class.getName());

    /* JADX INFO: renamed from: io.grpc.internal.b0$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8845a;

        static {
            int[] iArr = new int[X0.b.values().length];
            f8845a = iArr;
            try {
                iArr[X0.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8845a[X0.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8845a[X0.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8845a[X0.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8845a[X0.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8845a[X0.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static Object a(String str) {
        X0.a aVar = new X0.a(new StringReader(str));
        try {
            return e(aVar);
        } finally {
            try {
                aVar.close();
            } catch (IOException e3) {
                f8844a.log(Level.WARNING, "Failed to close", (Throwable) e3);
            }
        }
    }

    private static List b(X0.a aVar) throws IOException {
        aVar.b();
        ArrayList arrayList = new ArrayList();
        while (aVar.L()) {
            arrayList.add(e(aVar));
        }
        AbstractC0829j.u(aVar.c0() == X0.b.END_ARRAY, "Bad token: " + aVar.B());
        aVar.r();
        return Collections.unmodifiableList(arrayList);
    }

    private static Void c(X0.a aVar) throws IOException {
        aVar.Y();
        return null;
    }

    private static Map d(X0.a aVar) throws IOException {
        aVar.c();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (aVar.L()) {
            linkedHashMap.put(aVar.W(), e(aVar));
        }
        AbstractC0829j.u(aVar.c0() == X0.b.END_OBJECT, "Bad token: " + aVar.B());
        aVar.u();
        return Collections.unmodifiableMap(linkedHashMap);
    }

    private static Object e(X0.a aVar) {
        AbstractC0829j.u(aVar.L(), "unexpected end of JSON");
        switch (a.f8845a[aVar.c0().ordinal()]) {
            case 1:
                return b(aVar);
            case 2:
                return d(aVar);
            case 3:
                return aVar.a0();
            case 4:
                return Double.valueOf(aVar.V());
            case 5:
                return Boolean.valueOf(aVar.U());
            case 6:
                return c(aVar);
            default:
                throw new IllegalStateException("Bad token: " + aVar.B());
        }
    }
}
