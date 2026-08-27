package io.flutter.view;

import android.graphics.SurfaceTexture;
import android.media.Image;
import android.view.Surface;
import androidx.annotation.Keep;
/* loaded from: classes.dex */
public interface TextureRegistry {

    @Keep
    /* loaded from: classes.dex */
    public interface GLTextureConsumer {
        SurfaceTexture getSurfaceTexture();
    }

    @Keep
    /* loaded from: classes.dex */
    public interface ImageConsumer {
        Image acquireLatestImage();
    }

    @Keep
    /* loaded from: classes.dex */
    public interface ImageTextureEntry {
        /* synthetic */ long id();

        void pushImage(Image image);

        /* synthetic */ void release();
    }

    @Keep
    /* loaded from: classes.dex */
    public interface SurfaceProducer {

        /* loaded from: classes.dex */
        public interface a {
        }

        int getHeight();

        Surface getSurface();

        int getWidth();

        /* synthetic */ long id();

        /* synthetic */ void release();

        void scheduleFrame();

        void setCallback(a aVar);

        void setSize(int i, int i2);
    }

    @Keep
    /* loaded from: classes.dex */
    public interface SurfaceTextureEntry {
        /* synthetic */ long id();

        /* synthetic */ void release();

        default void setOnFrameConsumedListener(a aVar) {
        }

        default void setOnTrimMemoryListener(b bVar) {
        }

        SurfaceTexture surfaceTexture();
    }

    /* loaded from: classes.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public interface b {
        void onTrimMemory(int i);
    }
}
