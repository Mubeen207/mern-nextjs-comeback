# Snake Engine Reconstruction

This is a conservative Android reconstruction of the recovered `com.snake` APK.

## Verified APK facts

- Label: Snake Engine
- Version: 2.2.2
- Min SDK: 28
- Target/compile SDK: 35
- Framework: Flutter embedding v2 with ARM64 Flutter and native engine libraries

## Open in Android Studio

Open this directory as an existing Gradle project. Set `ANDROID_HOME` or `ANDROID_SDK_ROOT` to an Android SDK containing platform 35 and build-tools 35.0.0. Use JDK 17.

## Build

```powershell
$env:JAVA_HOME = 'C:\Program Files\Microsoft\jdk-17.0.20.101-hotspot'
$env:ANDROID_HOME = 'C:\Users\CD\AppData\Local\Android\Sdk'
.
\gradlew.bat assembleDebug
```

The Gradle wrapper is not checked in yet because wrapper generation requires the Android Gradle Plugin to configure successfully.

## What is reconstructed

The project keeps the original package ID, version, launcher activity, foreground daemon, notification behavior, VPN service declaration, SharedPreferences bridge, and JNI method declarations. It provides a visible fallback status screen so the shell can launch without the original Flutter runtime.

## Local debug entitlement

`com.snake.billing.DebugEntitlementManager` grants the reconstructed VPN feature only when `BuildConfig.DEBUG` is true. Release builds receive no entitlement from this provider and should use a real billing/entitlement implementation. This local provider does not bypass Android VPN consent: the activity calls `VpnService.prepare()`, and the service verifies consent again before establishing its interface.

## What remains unavailable

The original Dart source/UI, Firebase configuration, backend credentials/endpoints, and verified JNI integration are not present in the APK recovery workspace. The extracted native libraries remain preserved under `apk-recovery/extracted/lib/`. See `analysis/RECOVERY_REPORT.md` for the evidence and limitations.
