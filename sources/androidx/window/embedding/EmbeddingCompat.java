package androidx.window.embedding;

import android.util.Log;
import androidx.window.embedding.EmbeddingInterfaceCompat;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.util.Set;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class EmbeddingCompat implements EmbeddingInterfaceCompat {
    public static final Companion Companion = new Companion(null);
    public static final boolean DEBUG = true;
    private static final String TAG = "EmbeddingCompat";
    private final EmbeddingAdapter adapter;
    private final ActivityEmbeddingComponent embeddingExtension;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final ActivityEmbeddingComponent embeddingComponent() {
            ActivityEmbeddingComponent activityEmbeddingComponent;
            if (isEmbeddingAvailable() && (activityEmbeddingComponent = WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent()) != null) {
                return activityEmbeddingComponent;
            }
            EmptyEmbeddingComponent emptyEmbeddingComponent = new EmptyEmbeddingComponent();
            return emptyEmbeddingComponent;
        }

        public final Integer getExtensionApiLevel() {
            String str;
            try {
                return Integer.valueOf(WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel());
            } catch (NoClassDefFoundError unused) {
                str = "Embedding extension version not found";
                Log.d(EmbeddingCompat.TAG, str);
                return null;
            } catch (UnsupportedOperationException unused2) {
                str = "Stub Extension";
                Log.d(EmbeddingCompat.TAG, str);
                return null;
            }
        }

        public final boolean isEmbeddingAvailable() {
            String str;
            try {
                return WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent() != null;
            } catch (NoClassDefFoundError unused) {
                str = "Embedding extension version not found";
                Log.d(EmbeddingCompat.TAG, str);
                return false;
            } catch (UnsupportedOperationException unused2) {
                str = "Stub Extension";
                Log.d(EmbeddingCompat.TAG, str);
                return false;
            }
        }
    }

    public EmbeddingCompat() {
        this(Companion.embeddingComponent(), new EmbeddingAdapter());
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public void setEmbeddingCallback(EmbeddingInterfaceCompat.EmbeddingCallbackInterface embeddingCallback) {
        m.e(embeddingCallback, "embeddingCallback");
        this.embeddingExtension.setSplitInfoCallback(g.a(new EmbeddingTranslatingCallback(embeddingCallback, this.adapter)));
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public void setSplitRules(Set<? extends EmbeddingRule> rules) {
        m.e(rules, "rules");
        this.embeddingExtension.setEmbeddingRules(this.adapter.translate(rules));
    }

    public EmbeddingCompat(ActivityEmbeddingComponent embeddingExtension, EmbeddingAdapter adapter) {
        m.e(embeddingExtension, "embeddingExtension");
        m.e(adapter, "adapter");
        this.embeddingExtension = embeddingExtension;
        this.adapter = adapter;
    }
}
