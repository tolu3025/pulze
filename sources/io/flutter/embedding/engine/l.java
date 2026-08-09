package io.flutter.embedding.engine;

import android.content.Intent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Set f7737a;

    public l(List list) {
        this.f7737a = new HashSet(list);
    }

    public static l a(Intent intent) {
        ArrayList arrayList = new ArrayList();
        if (intent.getBooleanExtra("trace-startup", false)) {
            arrayList.add("--trace-startup");
        }
        if (intent.getBooleanExtra("start-paused", false)) {
            arrayList.add("--start-paused");
        }
        int intExtra = intent.getIntExtra("vm-service-port", 0);
        if (intExtra > 0 || (intExtra = intent.getIntExtra("observatory-port", 0)) > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("--vm-service-port=");
            sb.append(Integer.toString(intExtra));
            arrayList.add(sb.toString());
        }
        if (intent.getBooleanExtra("disable-service-auth-codes", false)) {
            arrayList.add("--disable-service-auth-codes");
        }
        if (intent.getBooleanExtra("endless-trace-buffer", false)) {
            arrayList.add("--endless-trace-buffer");
        }
        if (intent.getBooleanExtra("use-test-fonts", false)) {
            arrayList.add("--use-test-fonts");
        }
        if (intent.getBooleanExtra("enable-dart-profiling", false)) {
            arrayList.add("--enable-dart-profiling");
        }
        if (intent.getBooleanExtra("enable-software-rendering", false)) {
            arrayList.add("--enable-software-rendering");
        }
        if (intent.getBooleanExtra("skia-deterministic-rendering", false)) {
            arrayList.add("--skia-deterministic-rendering");
        }
        if (intent.getBooleanExtra("trace-skia", false)) {
            arrayList.add("--trace-skia");
        }
        String stringExtra = intent.getStringExtra("trace-skia-allowlist");
        if (stringExtra != null) {
            arrayList.add("--trace-skia-allowlist=" + stringExtra);
        }
        if (intent.getBooleanExtra("trace-systrace", false)) {
            arrayList.add("--trace-systrace");
        }
        if (intent.hasExtra("trace-to-file")) {
            arrayList.add("--trace-to-file=" + intent.getStringExtra("trace-to-file"));
        }
        if (intent.getBooleanExtra("enable-impeller", false)) {
            arrayList.add("--enable-impeller");
        }
        if (intent.getBooleanExtra("enable-vulkan-validation", false)) {
            arrayList.add("--enable-vulkan-validation");
        }
        if (intent.getBooleanExtra("dump-skp-on-shader-compilation", false)) {
            arrayList.add("--dump-skp-on-shader-compilation");
        }
        if (intent.getBooleanExtra("cache-sksl", false)) {
            arrayList.add("--cache-sksl");
        }
        if (intent.getBooleanExtra("purge-persistent-cache", false)) {
            arrayList.add("--purge-persistent-cache");
        }
        if (intent.getBooleanExtra("verbose-logging", false)) {
            arrayList.add("--verbose-logging");
        }
        int intExtra2 = intent.getIntExtra("msaa-samples", 0);
        if (intExtra2 > 1) {
            arrayList.add("--msaa-samples=" + Integer.toString(intExtra2));
        }
        if (intent.hasExtra("dart-flags")) {
            arrayList.add("--dart-flags=" + intent.getStringExtra("dart-flags"));
        }
        return new l(arrayList);
    }

    public String[] b() {
        return (String[]) this.f7737a.toArray(new String[this.f7737a.size()]);
    }
}
