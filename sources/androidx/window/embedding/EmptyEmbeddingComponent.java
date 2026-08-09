package androidx.window.embedding;

import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
final class EmptyEmbeddingComponent implements ActivityEmbeddingComponent {
    public void setEmbeddingRules(Set<androidx.window.extensions.embedding.EmbeddingRule> splitRules) {
        m.e(splitRules, "splitRules");
    }

    public void setSplitInfoCallback(Consumer<List<androidx.window.extensions.embedding.SplitInfo>> consumer) {
        m.e(consumer, "consumer");
    }
}
