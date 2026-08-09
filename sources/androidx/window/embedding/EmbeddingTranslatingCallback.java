package androidx.window.embedding;

import androidx.window.embedding.EmbeddingInterfaceCompat;
import java.util.List;
import java.util.function.Consumer;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class EmbeddingTranslatingCallback implements Consumer<List<? extends androidx.window.extensions.embedding.SplitInfo>> {
    private final EmbeddingAdapter adapter;
    private final EmbeddingInterfaceCompat.EmbeddingCallbackInterface callback;

    public EmbeddingTranslatingCallback(EmbeddingInterfaceCompat.EmbeddingCallbackInterface callback, EmbeddingAdapter adapter) {
        m.e(callback, "callback");
        m.e(adapter, "adapter");
        this.callback = callback;
        this.adapter = adapter;
    }

    @Override // java.util.function.Consumer
    public void accept(List<? extends androidx.window.extensions.embedding.SplitInfo> splitInfoList) {
        m.e(splitInfoList, "splitInfoList");
        this.callback.onSplitInfoChanged(this.adapter.translate(splitInfoList));
    }
}
