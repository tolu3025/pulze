package w1;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import g1.InterfaceC0872a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l1.InterfaceC1017c;
import w1.k;

/* JADX INFO: renamed from: w1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1264a implements InterfaceC0872a, k.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SharedPreferences f11686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC1262B f11687d;

    /* JADX INFO: renamed from: w1.a$a, reason: collision with other inner class name */
    static class C0187a implements InterfaceC1262B {
        C0187a() {
        }

        @Override // w1.InterfaceC1262B
        public String a(List list) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(list);
                objectOutputStream.flush();
                return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            } catch (IOException e3) {
                throw new RuntimeException(e3);
            }
        }

        @Override // w1.InterfaceC1262B
        public List b(String str) {
            try {
                return (List) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str, 0))).readObject();
            } catch (IOException | ClassNotFoundException e3) {
                throw new RuntimeException(e3);
            }
        }
    }

    public C1264a() {
        this(new C0187a());
    }

    private Map i(String str, Set set) {
        Map<String, ?> all = this.f11686c.getAll();
        HashMap map = new HashMap();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (set == null || set.contains(str2))) {
                map.put(str2, k(str2, all.get(str2)));
            }
        }
        return map;
    }

    private void j(InterfaceC1017c interfaceC1017c, Context context) {
        this.f11686c = context.getSharedPreferences("FlutterSharedPreferences", 0);
        try {
            j.j(interfaceC1017c, this);
        } catch (Exception e3) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e3);
        }
    }

    private Object k(String str, Object obj) {
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                return this.f11687d.b(str2.substring(40));
            }
            if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                return new BigInteger(str2.substring(44), 36);
            }
            if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                return Double.valueOf(str2.substring(40));
            }
        } else if (obj instanceof Set) {
            ArrayList arrayList = new ArrayList((Set) obj);
            this.f11686c.edit().remove(str).putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + this.f11687d.a(arrayList)).apply();
            return arrayList;
        }
        return obj;
    }

    @Override // g1.InterfaceC0872a
    public void A(InterfaceC0872a.b bVar) {
        j(bVar.b(), bVar.a());
    }

    @Override // w1.k.a
    public Boolean a(String str) {
        return Boolean.valueOf(this.f11686c.edit().remove(str).commit());
    }

    @Override // w1.k.a
    public Boolean b(String str, Long l3) {
        return Boolean.valueOf(this.f11686c.edit().putLong(str, l3.longValue()).commit());
    }

    @Override // w1.k.a
    public Map c(String str, List list) {
        return i(str, list == null ? null : new HashSet(list));
    }

    @Override // w1.k.a
    public Boolean d(String str, String str2) {
        if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            throw new RuntimeException("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
        }
        return Boolean.valueOf(this.f11686c.edit().putString(str, str2).commit());
    }

    @Override // w1.k.a
    public Boolean e(String str, List list) {
        SharedPreferences.Editor editorEdit = this.f11686c.edit();
        Map<String, ?> all = this.f11686c.getAll();
        ArrayList arrayList = new ArrayList();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (list == null || list.contains(str2))) {
                arrayList.add(str2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            editorEdit.remove((String) it.next());
        }
        return Boolean.valueOf(editorEdit.commit());
    }

    @Override // w1.k.a
    public Boolean f(String str, List list) {
        return Boolean.valueOf(this.f11686c.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + this.f11687d.a(list)).commit());
    }

    @Override // w1.k.a
    public Boolean g(String str, Boolean bool) {
        return Boolean.valueOf(this.f11686c.edit().putBoolean(str, bool.booleanValue()).commit());
    }

    @Override // w1.k.a
    public Boolean h(String str, Double d3) {
        String string = Double.toString(d3.doubleValue());
        return Boolean.valueOf(this.f11686c.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit());
    }

    @Override // g1.InterfaceC0872a
    public void y(InterfaceC0872a.b bVar) {
        j.j(bVar.b(), null);
    }

    C1264a(InterfaceC1262B interfaceC1262B) {
        this.f11687d = interfaceC1262B;
    }
}
