package r0;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f11132a = new j() { // from class: r0.i
        @Override // r0.j
        public final List a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar.getComponents();
        }
    };

    List a(ComponentRegistrar componentRegistrar);
}
