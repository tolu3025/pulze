package com.google.protobuf;

import com.google.protobuf.C;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class O extends LinkedHashMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final O f6717b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f6718a;

    static {
        O o2 = new O();
        f6717b = o2;
        o2.j();
    }

    private O() {
        this.f6718a = true;
    }

    static int a(Map map) {
        int iB = 0;
        for (Map.Entry entry : map.entrySet()) {
            iB += b(entry.getValue()) ^ b(entry.getKey());
        }
        return iB;
    }

    private static int b(Object obj) {
        if (obj instanceof byte[]) {
            return C.d((byte[]) obj);
        }
        if (obj instanceof C.a) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private static void c(Map map) {
        for (Object obj : map.keySet()) {
            C.a(obj);
            C.a(map.get(obj));
        }
    }

    public static O d() {
        return f6717b;
    }

    private void e() {
        if (!i()) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean g(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    static boolean h(Map map, Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !g(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        e();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && h(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return a(this);
    }

    public boolean i() {
        return this.f6718a;
    }

    public void j() {
        this.f6718a = false;
    }

    public void k(O o2) {
        e();
        if (o2.isEmpty()) {
            return;
        }
        putAll(o2);
    }

    public O l() {
        return isEmpty() ? new O() : new O(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        e();
        C.a(obj);
        C.a(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        e();
        c(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        e();
        return super.remove(obj);
    }

    private O(Map map) {
        super(map);
        this.f6718a = true;
    }
}
