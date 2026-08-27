# Snake Engine APK Recovery Report

## Original APK

- File: `apk-recovery/snake-engine-1776726062.apk`
- Package: `com.snake`
- App label: `Snake Engine`
- Version name: `2.2.2`
- Compile SDK: 35
- Minimum SDK: 28
- Target SDK: 35

## Framework

The APK is a Flutter application using Flutter embedding v2. Evidence includes `libflutter.so`, `libapp.so`, Flutter embedding classes, and the `flutterEmbedding` manifest metadata. It also contains a native ARM64 library named `libengine.so`. The Android Java layer is a host shell around the Flutter and native runtime.

## Recovered components

The decoded manifest and decompiled sources identify the launcher activity `com.Entry`, application class `com.snake.App`, daemon foreground services, a VPN service, Firebase messaging and analytics integration, proxy activities/providers/receivers, and Android notification setup. The extracted APK contains ARM64 `libapp.so`, `libflutter.so`, and `libengine.so`.

The original Flutter Dart kernel/source is not present as editable Dart source. The Android project therefore preserves the verified native surface and includes a standalone Java fallback activity. The original native binaries remain in `extracted/lib/` and are not relinked automatically because exact ABI/loading integration was not recoverable.

## APIs and storage

No definitive application REST endpoint, embedded SQLite database, or editable Firebase configuration was recovered from the extracted material. Firebase SDK resources and manifest registrations are present, but no `google-services.json` was found. The decompiled activity confirms package-scoped SharedPreferences operations and image picking/zip export behavior.

## Reconstruction status

- Recovered exactly from APK metadata/resources: approximately 35%
- Reconstructed from decompiled Android bytecode: approximately 25%
- Inferred/reimplemented standalone Android shell: approximately 25%
- Unavailable or not technically recoverable: approximately 15%

These are functional-surface estimates, not source-line estimates. The Flutter UI and Dart business logic cannot be claimed as recovered without the original Flutter assets/source or a working runtime snapshot.

## Current project

`reconstructed/snake-engine/` contains a clean Android application module with the original package/version identifiers, launcher activity, notification daemon, VPN service declaration, JNI method declarations, resources, and build configuration. External Flutter/Firebase artifacts were removed from the standalone shell because they were absent from the recovery workspace.

## Limitations and TODOs

- Restore the original Flutter SDK project or compatible Flutter engine artifacts to reproduce the UI and Dart behavior.
- Restore the original `libengine.so` under the appropriate ABI and verify its JNI contract before enabling native loading.
- Supply Firebase configuration and credentials if messaging/analytics must be enabled.
- Reconstruct the omitted proxy/provider components from decompiled sources only after their behavior and security boundaries are reviewed.
- Install Android SDK platform 35 and build-tools locally, then run `assembleDebug`; this environment had no usable SDK and the downloaded command-line-tools archive was truncated.
