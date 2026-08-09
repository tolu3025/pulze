package p;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

/* JADX INFO: renamed from: p.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1047a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1047a f10006a = new C1047a();

    private C1047a() {
    }

    public final boolean a(File srcFile, File dstFile) {
        kotlin.jvm.internal.m.e(srcFile, "srcFile");
        kotlin.jvm.internal.m.e(dstFile, "dstFile");
        try {
            Files.move(srcFile.toPath(), dstFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
