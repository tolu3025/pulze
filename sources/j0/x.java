package J0;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    private static class a {
        public static void a(File file) throws IOException {
            try {
                Files.deleteIfExists(file.toPath());
            } catch (IOException e3) {
                throw new IOException("Failed to delete file " + file + ": " + e3);
            }
        }
    }

    private static class b {
        public static void a(File file) throws IOException {
            if (file.delete() || !file.exists()) {
                return;
            }
            throw new IOException("Failed to delete file " + file);
        }
    }

    public static void a(File file) throws IOException {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(file);
        } else {
            b.a(file);
        }
    }
}
