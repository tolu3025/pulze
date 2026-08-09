package androidx.window.embedding;

import android.app.Activity;
import j.InterfaceC0980a;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface EmbeddingBackend {
    Set<EmbeddingRule> getSplitRules();

    boolean isSplitSupported();

    void registerRule(EmbeddingRule embeddingRule);

    void registerSplitListenerForActivity(Activity activity, Executor executor, InterfaceC0980a interfaceC0980a);

    void setSplitRules(Set<? extends EmbeddingRule> set);

    void unregisterRule(EmbeddingRule embeddingRule);

    void unregisterSplitListenerForActivity(InterfaceC0980a interfaceC0980a);
}
