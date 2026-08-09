package com.google.firebase.concurrent;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import l0.InterfaceC1013a;
import l0.InterfaceC1014b;
import r0.C1200c;
import r0.F;
import r0.InterfaceC1202e;
import r0.x;

/* JADX INFO: loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final x f6114a = new x(new L0.b() { // from class: s0.b
        @Override // L0.b
        public final Object get() {
            return ExecutorsRegistrar.p();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final x f6115b = new x(new L0.b() { // from class: s0.c
        @Override // L0.b
        public final Object get() {
            return ExecutorsRegistrar.q();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final x f6116c = new x(new L0.b() { // from class: s0.d
        @Override // L0.b
        public final Object get() {
            return ExecutorsRegistrar.r();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final x f6117d = new x(new L0.b() { // from class: s0.e
        @Override // L0.b
        public final Object get() {
            return ExecutorsRegistrar.s();
        }
    });

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i3 = Build.VERSION.SDK_INT;
        builderDetectNetwork.detectResourceMismatches();
        if (i3 >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return builderDetectNetwork.penaltyLog().build();
    }

    private static ThreadFactory j(String str, int i3) {
        return new b(str, i3, null);
    }

    private static ThreadFactory k(String str, int i3, StrictMode.ThreadPolicy threadPolicy) {
        return new b(str, i3, threadPolicy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService l(InterfaceC1202e interfaceC1202e) {
        return (ScheduledExecutorService) f6114a.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService m(InterfaceC1202e interfaceC1202e) {
        return (ScheduledExecutorService) f6116c.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService n(InterfaceC1202e interfaceC1202e) {
        return (ScheduledExecutorService) f6115b.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Executor o(InterfaceC1202e interfaceC1202e) {
        return s0.n.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService p() {
        return u(Executors.newFixedThreadPool(4, k("Firebase Background", 10, i())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService q() {
        return u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), k("Firebase Lite", 0, t())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService r() {
        return u(Executors.newCachedThreadPool(j("Firebase Blocking", 11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService s() {
        return Executors.newSingleThreadScheduledExecutor(j("Firebase Scheduler", 0));
    }

    private static StrictMode.ThreadPolicy t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    private static ScheduledExecutorService u(ExecutorService executorService) {
        return new o(executorService, (ScheduledExecutorService) f6117d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(C1200c.f(F.a(InterfaceC1013a.class, ScheduledExecutorService.class), F.a(InterfaceC1013a.class, ExecutorService.class), F.a(InterfaceC1013a.class, Executor.class)).e(new r0.h() { // from class: s0.f
            @Override // r0.h
            public final Object a(InterfaceC1202e interfaceC1202e) {
                return ExecutorsRegistrar.l(interfaceC1202e);
            }
        }).d(), C1200c.f(F.a(InterfaceC1014b.class, ScheduledExecutorService.class), F.a(InterfaceC1014b.class, ExecutorService.class), F.a(InterfaceC1014b.class, Executor.class)).e(new r0.h() { // from class: s0.g
            @Override // r0.h
            public final Object a(InterfaceC1202e interfaceC1202e) {
                return ExecutorsRegistrar.m(interfaceC1202e);
            }
        }).d(), C1200c.f(F.a(l0.c.class, ScheduledExecutorService.class), F.a(l0.c.class, ExecutorService.class), F.a(l0.c.class, Executor.class)).e(new r0.h() { // from class: s0.h
            @Override // r0.h
            public final Object a(InterfaceC1202e interfaceC1202e) {
                return ExecutorsRegistrar.n(interfaceC1202e);
            }
        }).d(), C1200c.e(F.a(l0.d.class, Executor.class)).e(new r0.h() { // from class: s0.i
            @Override // r0.h
            public final Object a(InterfaceC1202e interfaceC1202e) {
                return ExecutorsRegistrar.o(interfaceC1202e);
            }
        }).d());
    }
}
