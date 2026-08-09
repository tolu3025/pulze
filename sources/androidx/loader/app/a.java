package androidx.loader.app;

import android.os.Bundle;
import androidx.lifecycle.D;
import androidx.lifecycle.i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import w.AbstractC1259b;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: androidx.loader.app.a$a, reason: collision with other inner class name */
    public interface InterfaceC0097a {
        void a(AbstractC1259b abstractC1259b, Object obj);

        void b(AbstractC1259b abstractC1259b);

        AbstractC1259b c(int i3, Bundle bundle);
    }

    public static a b(i iVar) {
        return new b(iVar, ((D) iVar).e());
    }

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract AbstractC1259b c(int i3, Bundle bundle, InterfaceC0097a interfaceC0097a);

    public abstract void d();
}
