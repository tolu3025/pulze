package androidx.window.embedding;

import I1.u;
import J1.N;
import J1.x;
import android.app.Activity;
import android.content.Context;
import j.InterfaceC0980a;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class SplitController {
    private static volatile SplitController globalInstance = null;
    public static final boolean sDebug = false;
    private final EmbeddingBackend embeddingBackend;
    private Set<? extends EmbeddingRule> staticSplitRules;
    public static final Companion Companion = new Companion(null);
    private static final ReentrantLock globalLock = new ReentrantLock();

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final SplitController getInstance() {
            if (SplitController.globalInstance == null) {
                ReentrantLock reentrantLock = SplitController.globalLock;
                reentrantLock.lock();
                try {
                    if (SplitController.globalInstance == null) {
                        SplitController.globalInstance = new SplitController(null);
                    }
                    u uVar = u.f2419a;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            SplitController splitController = SplitController.globalInstance;
            m.b(splitController);
            return splitController;
        }

        public final void initialize(Context context, int i3) {
            m.e(context, "context");
            Set<EmbeddingRule> splitRules$window_release = new SplitRuleParser().parseSplitRules$window_release(context, i3);
            SplitController companion = getInstance();
            if (splitRules$window_release == null) {
                splitRules$window_release = N.b();
            }
            companion.setStaticSplitRules(splitRules$window_release);
        }
    }

    private SplitController() {
        this.embeddingBackend = ExtensionEmbeddingBackend.Companion.getInstance();
        this.staticSplitRules = N.b();
    }

    public static final SplitController getInstance() {
        return Companion.getInstance();
    }

    public static final void initialize(Context context, int i3) {
        Companion.initialize(context, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setStaticSplitRules(Set<? extends EmbeddingRule> set) {
        this.staticSplitRules = set;
        this.embeddingBackend.setSplitRules(set);
    }

    public final void addSplitListener(Activity activity, Executor executor, InterfaceC0980a consumer) {
        m.e(activity, "activity");
        m.e(executor, "executor");
        m.e(consumer, "consumer");
        this.embeddingBackend.registerSplitListenerForActivity(activity, executor, consumer);
    }

    public final void clearRegisteredRules() {
        this.embeddingBackend.setSplitRules(this.staticSplitRules);
    }

    public final Set<EmbeddingRule> getSplitRules() {
        return x.a0(this.embeddingBackend.getSplitRules());
    }

    public final boolean isSplitSupported() {
        return this.embeddingBackend.isSplitSupported();
    }

    public final void registerRule(EmbeddingRule rule) {
        m.e(rule, "rule");
        this.embeddingBackend.registerRule(rule);
    }

    public final void removeSplitListener(InterfaceC0980a consumer) {
        m.e(consumer, "consumer");
        this.embeddingBackend.unregisterSplitListenerForActivity(consumer);
    }

    public final void unregisterRule(EmbeddingRule rule) {
        m.e(rule, "rule");
        this.embeddingBackend.unregisterRule(rule);
    }

    public /* synthetic */ SplitController(kotlin.jvm.internal.h hVar) {
        this();
    }
}
