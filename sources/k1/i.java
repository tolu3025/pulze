package k1;

import android.view.KeyEvent;
import b1.AbstractC0525b;
import java.util.HashMap;
import java.util.Map;
import l1.C1015a;
import l1.InterfaceC1017c;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1015a f9499a;

    public interface a {
        void a(boolean z2);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KeyEvent f9500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Character f9501b;

        public b(KeyEvent keyEvent, Character ch) {
            this.f9500a = keyEvent;
            this.f9501b = ch;
        }
    }

    public i(InterfaceC1017c interfaceC1017c) {
        this.f9499a = new C1015a(interfaceC1017c, "flutter/keyevent", l1.f.f9776a);
    }

    private static C1015a.e b(final a aVar) {
        return new C1015a.e() { // from class: k1.h
            @Override // l1.C1015a.e
            public final void a(Object obj) {
                i.d(aVar, obj);
            }
        };
    }

    private Map c(b bVar, boolean z2) {
        HashMap map = new HashMap();
        map.put("type", z2 ? "keyup" : "keydown");
        map.put("keymap", "android");
        map.put("flags", Integer.valueOf(bVar.f9500a.getFlags()));
        map.put("plainCodePoint", Integer.valueOf(bVar.f9500a.getUnicodeChar(0)));
        map.put("codePoint", Integer.valueOf(bVar.f9500a.getUnicodeChar()));
        map.put("keyCode", Integer.valueOf(bVar.f9500a.getKeyCode()));
        map.put("scanCode", Integer.valueOf(bVar.f9500a.getScanCode()));
        map.put("metaState", Integer.valueOf(bVar.f9500a.getMetaState()));
        Character ch = bVar.f9501b;
        if (ch != null) {
            map.put("character", ch.toString());
        }
        map.put("source", Integer.valueOf(bVar.f9500a.getSource()));
        map.put("deviceId", Integer.valueOf(bVar.f9500a.getDeviceId()));
        map.put("repeatCount", Integer.valueOf(bVar.f9500a.getRepeatCount()));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(a aVar, Object obj) {
        boolean z2 = false;
        if (obj != null) {
            try {
                z2 = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e3) {
                AbstractC0525b.b("KeyEventChannel", "Unable to unpack JSON message: " + e3);
            }
        }
        aVar.a(z2);
    }

    public void e(b bVar, boolean z2, a aVar) {
        this.f9499a.d(c(bVar, z2), b(aVar));
    }
}
