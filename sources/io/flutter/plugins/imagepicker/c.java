package io.flutter.plugins.imagepicker;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import io.flutter.plugins.imagepicker.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f8022a;

    public enum a {
        IMAGE,
        VIDEO
    }

    c(Context context) {
        this.f8022a = context;
    }

    private void h(String str) {
        this.f8022a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().putString("flutter_image_picker_type", str).apply();
    }

    void a() {
        this.f8022a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().clear().apply();
    }

    Map b() {
        Set<String> stringSet;
        HashMap map = new HashMap();
        boolean z2 = false;
        SharedPreferences sharedPreferences = this.f8022a.getSharedPreferences("flutter_image_picker_shared_preference", 0);
        if (sharedPreferences.contains("flutter_image_picker_image_path") && (stringSet = sharedPreferences.getStringSet("flutter_image_picker_image_path", null)) != null) {
            map.put("pathList", new ArrayList(stringSet));
            z2 = true;
        }
        if (!sharedPreferences.contains("flutter_image_picker_error_code")) {
            if (z2) {
            }
            return map;
        }
        p.a.C0132a c0132a = new p.a.C0132a();
        c0132a.b(sharedPreferences.getString("flutter_image_picker_error_code", ""));
        if (sharedPreferences.contains("flutter_image_picker_error_message")) {
            c0132a.c(sharedPreferences.getString("flutter_image_picker_error_message", ""));
        }
        map.put("error", c0132a.a());
        if (sharedPreferences.contains("flutter_image_picker_type")) {
            map.put("type", sharedPreferences.getString("flutter_image_picker_type", "").equals("video") ? p.c.VIDEO : p.c.IMAGE);
        }
        if (sharedPreferences.contains("flutter_image_picker_max_width")) {
            map.put("maxWidth", Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong("flutter_image_picker_max_width", 0L))));
        }
        if (sharedPreferences.contains("flutter_image_picker_max_height")) {
            map.put("maxHeight", Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong("flutter_image_picker_max_height", 0L))));
        }
        map.put("imageQuality", Integer.valueOf(sharedPreferences.getInt("flutter_image_picker_image_quality", 100)));
        return map;
    }

    String c() {
        return this.f8022a.getSharedPreferences("flutter_image_picker_shared_preference", 0).getString("flutter_image_picker_pending_image_uri", "");
    }

    void d(p.h hVar) {
        SharedPreferences.Editor editorEdit = this.f8022a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit();
        if (hVar.c() != null) {
            editorEdit.putLong("flutter_image_picker_max_width", Double.doubleToRawLongBits(hVar.c().doubleValue()));
        }
        if (hVar.b() != null) {
            editorEdit.putLong("flutter_image_picker_max_height", Double.doubleToRawLongBits(hVar.b().doubleValue()));
        }
        editorEdit.putInt("flutter_image_picker_image_quality", hVar.d().intValue());
        editorEdit.apply();
    }

    void e(Uri uri) {
        this.f8022a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().putString("flutter_image_picker_pending_image_uri", uri.getPath()).apply();
    }

    void f(ArrayList arrayList, String str, String str2) {
        SharedPreferences.Editor editorEdit = this.f8022a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit();
        if (arrayList != null) {
            editorEdit.putStringSet("flutter_image_picker_image_path", new HashSet(arrayList));
        }
        if (str != null) {
            editorEdit.putString("flutter_image_picker_error_code", str);
        }
        if (str2 != null) {
            editorEdit.putString("flutter_image_picker_error_message", str2);
        }
        editorEdit.apply();
    }

    void g(a aVar) {
        String str;
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            str = "image";
        } else if (iOrdinal != 1) {
            return;
        } else {
            str = "video";
        }
        h(str);
    }
}
