package androidx.appcompat.view.menu;

import android.net.Uri;
import android.os.Process;
import android.os.storage.StorageVolume;
import androidx.appcompat.view.menu.jo0;
import androidx.appcompat.view.menu.s00;
import com.snake.helper.FileProvider;
import java.io.File;
/* loaded from: classes.dex */
public class b7 extends s00.a implements n30 {
    public static final b7 l = new b7();

    public static b7 h() {
        return l;
    }

    @Override // androidx.appcompat.view.menu.s00
    public StorageVolume[] D0(int i, String str, int i2, int i3) {
        jo0.e eVar = gx0.b;
        if (eVar == null) {
            return null;
        }
        try {
            StorageVolume[] storageVolumeArr = (StorageVolume[]) eVar.b(Integer.valueOf(d7.c(Process.myUid())), 0);
            if (storageVolumeArr == null) {
                return null;
            }
            for (StorageVolume storageVolume : storageVolumeArr) {
                ix0.c.e(storageVolume, ov0.n(i3));
                if (y8.e()) {
                    ix0.b.e(storageVolume, ov0.n(i3));
                }
            }
            return storageVolumeArr;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // androidx.appcompat.view.menu.n30
    public void j() {
    }

    @Override // androidx.appcompat.view.menu.s00
    public Uri x0(String str) {
        return FileProvider.f(bv0.m(), nl0.f(), new File(str));
    }
}
