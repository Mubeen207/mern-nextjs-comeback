package android.content.pm;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.IntentFilter;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.DisplayMetrics;
import java.io.File;
import java.io.PrintWriter;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public class PackageParser {
    public static final NewPermissionInfo[] NEW_PERMISSIONS = {new NewPermissionInfo("android.permission.WRITE_EXTERNAL_STORAGE", 4, 0), new NewPermissionInfo("android.permission.READ_PHONE_STATE", 4, 0)};
    public static final int PARSE_CHATTY = 2;
    public static final int PARSE_COLLECT_CERTIFICATES = 256;
    public static final int PARSE_EXTERNAL_STORAGE = 32;
    public static final int PARSE_FORWARD_LOCK = 16;
    public static final int PARSE_IGNORE_PROCESSES = 8;
    public static final int PARSE_IS_PRIVILEGED = 128;
    public static final int PARSE_IS_SYSTEM = 1;
    public static final int PARSE_IS_SYSTEM_DIR = 64;
    public static final int PARSE_MUST_BE_APK = 4;
    public static final int PARSE_TRUSTED_OVERLAY = 512;
    public Callback mCallback;

    /* loaded from: classes.dex */
    public static final class Activity extends Component<ActivityIntentInfo> {
        public final ActivityInfo info;

        public Activity(ParseComponentArgs parseComponentArgs, ActivityInfo activityInfo) {
            super(parseComponentArgs, (ComponentInfo) activityInfo);
            throw new RuntimeException("Stub!");
        }

        @Override // android.content.pm.PackageParser.Component
        public void setPackageName(String str) {
            throw new RuntimeException("Stub!");
        }

        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }

    @SuppressLint({"ParcelCreator"})
    /* loaded from: classes.dex */
    public static final class ActivityIntentInfo extends IntentInfo {
        public final Activity activity;

        public ActivityIntentInfo(Activity activity) {
            throw new RuntimeException("Stub!");
        }

        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: classes.dex */
    public static class ApkLite {
        public final String codePath;
        public final boolean coreApp;
        public final boolean extractNativeLibs;
        public final int installLocation;
        public final boolean multiArch;
        public final String packageName;
        public final int revisionCode;
        public final Signature[] signatures;
        public final String splitName;
        public final VerifierInfo[] verifiers;
        public final int versionCode;

        public ApkLite(String str, String str2, String str3, int i, int i2, int i3, List<VerifierInfo> list, Signature[] signatureArr, boolean z, boolean z2, boolean z3) {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: classes.dex */
    public interface Callback {
        boolean hasFeature(String str);
    }

    /* loaded from: classes.dex */
    public static final class CallbackImpl implements Callback {
        private final PackageManager mPm;

        public CallbackImpl(PackageManager packageManager) {
            this.mPm = packageManager;
        }

        @Override // android.content.pm.PackageParser.Callback
        public boolean hasFeature(String str) {
            return this.mPm.hasSystemFeature(str);
        }
    }

    /* loaded from: classes.dex */
    public static final class Instrumentation extends Component<IntentInfo> {
        public final InstrumentationInfo info;

        public Instrumentation(ParsePackageItemArgs parsePackageItemArgs, InstrumentationInfo instrumentationInfo) {
            super(parsePackageItemArgs, instrumentationInfo);
            throw new RuntimeException("Stub!");
        }

        @Override // android.content.pm.PackageParser.Component
        public void setPackageName(String str) {
            throw new RuntimeException("Stub!");
        }

        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }

    @SuppressLint({"ParcelCreator"})
    /* loaded from: classes.dex */
    public static class IntentInfo extends IntentFilter {
        public int banner;
        public boolean hasDefault;
        public int icon;
        public int labelRes;
        public int logo;
        public CharSequence nonLocalizedLabel;
        public int preferred;
    }

    /* loaded from: classes.dex */
    public static class NewPermissionInfo {
        public final int fileVersion;
        public final String name;
        public final int sdkVersion;

        public NewPermissionInfo(String str, int i, int i2) {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: classes.dex */
    public static final class Package {
        public String baseCodePath;
        public boolean baseHardwareAccelerated;
        public int baseRevisionCode;
        public String codePath;
        public boolean coreApp;
        public String cpuAbiOverride;
        public int installLocation;
        public Certificate[][] mCertificates;
        public Object mExtras;
        public ArrayMap<String, ArraySet<PublicKey>> mKeySetMapping;
        public long mLastPackageUsageTimeInMills;
        public int mOverlayPriority;
        public String mOverlayTarget;
        public String mRequiredAccountType;
        public boolean mRequiredForAllUsers;
        public String mRestrictedAccountType;
        public String mSharedUserId;
        public int mSharedUserLabel;
        public Signature[] mSignatures;
        public SigningDetails mSigningDetails;
        public ArraySet<PublicKey> mSigningKeys;
        public boolean mTrustedOverlay;
        public ArraySet<String> mUpgradeKeySets;
        public int mVersionCode;
        public String mVersionName;
        public ManifestDigest manifestDigest;
        public String packageName;
        public ArrayList<String> protectedBroadcasts;
        public String[] splitCodePaths;
        public int[] splitFlags;
        public String[] splitNames;
        public int[] splitPrivateFlags;
        public int[] splitRevisionCodes;
        public String volumeUuid;
        public ApplicationInfo applicationInfo = new ApplicationInfo();
        public final ArrayList<Permission> permissions = new ArrayList<>(0);
        public final ArrayList<PermissionGroup> permissionGroups = new ArrayList<>(0);
        public final ArrayList<Activity> activities = new ArrayList<>(0);
        public final ArrayList<Activity> receivers = new ArrayList<>(0);
        public final ArrayList<Provider> providers = new ArrayList<>(0);
        public final ArrayList<Service> services = new ArrayList<>(0);
        public final ArrayList<Instrumentation> instrumentation = new ArrayList<>(0);
        public final ArrayList<String> requestedPermissions = new ArrayList<>();
        public ArrayList<String> libraryNames = null;
        public ArrayList<String> usesLibraries = null;
        public ArrayList<String> usesOptionalLibraries = null;
        public String[] usesLibraryFiles = null;
        public ArrayList<ActivityIntentInfo> preferredActivityFilters = null;
        public ArrayList<String> mOriginalPackages = null;
        public String mRealPackage = null;
        public ArrayList<String> mAdoptPermissions = null;
        public Bundle mAppMetaData = null;
        public int mPreferredOrder = 0;
        public ArrayList<ConfigurationInfo> configPreferences = null;
        public ArrayList<FeatureInfo> reqFeatures = null;
        public ArrayList<FeatureGroupInfo> featureGroups = null;

        public Package(String str) {
            throw new RuntimeException("Stub!");
        }

        public boolean canHaveOatDir() {
            throw new RuntimeException("Stub!");
        }

        public List<String> getAllCodePaths() {
            throw new RuntimeException("Stub!");
        }

        public List<String> getAllCodePathsExcludingResourceOnly() {
            throw new RuntimeException("Stub!");
        }

        public boolean hasComponentClassName(String str) {
            throw new RuntimeException("Stub!");
        }

        public boolean isForwardLocked() {
            throw new RuntimeException("Stub!");
        }

        public boolean isPrivilegedApp() {
            throw new RuntimeException("Stub!");
        }

        public boolean isSystemApp() {
            throw new RuntimeException("Stub!");
        }

        public boolean isUpdatedSystemApp() {
            throw new RuntimeException("Stub!");
        }

        public void setPackageName(String str) {
            throw new RuntimeException("Stub!");
        }

        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: classes.dex */
    public static class PackageLite {
        public final String baseCodePath;
        public final int baseRevisionCode;
        public final String codePath;
        public final boolean coreApp;
        public final boolean extractNativeLibs;
        public final int installLocation;
        public final boolean multiArch;
        public final String packageName;
        public final String[] splitCodePaths;
        public final String[] splitNames;
        public final int[] splitRevisionCodes;
        public final VerifierInfo[] verifiers;
        public final int versionCode;

        public PackageLite(String str, ApkLite apkLite, String[] strArr, String[] strArr2, int[] iArr) {
            throw new RuntimeException("Stub!");
        }

        public List<String> getAllCodePaths() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: classes.dex */
    public static class ParseComponentArgs extends ParsePackageItemArgs {
        final int descriptionRes;
        final int enabledRes;
        int flags;
        final int processRes;
        final String[] sepProcesses;

        public ParseComponentArgs(Package r1, String[] strArr, int i, int i2, int i3, int i4, int i5, String[] strArr2, int i6, int i7, int i8) {
            super(r1, strArr, i, i2, i3, i4, i5);
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: classes.dex */
    public static class ParsePackageItemArgs {
        final int bannerRes;
        final int iconRes;
        final int labelRes;
        final int logoRes;
        final int nameRes;
        final String[] outError;
        final Package owner;
        TypedArray sa;
        String tag;

        public ParsePackageItemArgs(Package r1, String[] strArr, int i, int i2, int i3, int i4, int i5) {
            throw new RuntimeException("Stub!");
        }
    }

    @SuppressLint({"ParcelCreator"})
    /* loaded from: classes.dex */
    public static final class ProviderIntentInfo extends IntentInfo {
        public final Provider provider;

        public ProviderIntentInfo(Provider provider) {
            throw new RuntimeException("Stub!");
        }

        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: classes.dex */
    public static final class Service extends Component<ServiceIntentInfo> {
        public final ServiceInfo info;

        public Service(ParseComponentArgs parseComponentArgs, ServiceInfo serviceInfo) {
            super(parseComponentArgs, (ComponentInfo) serviceInfo);
            throw new RuntimeException("Stub!");
        }

        @Override // android.content.pm.PackageParser.Component
        public void setPackageName(String str) {
            throw new RuntimeException("Stub!");
        }

        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }

    @SuppressLint({"ParcelCreator"})
    /* loaded from: classes.dex */
    public static final class ServiceIntentInfo extends IntentInfo {
        public final Service service;

        public ServiceIntentInfo(Service service) {
            throw new RuntimeException("Stub!");
        }

        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: classes.dex */
    public static class SigningDetails {
        public static final SigningDetails UNKNOWN = null;
        public Signature[] pastSigningCertificates;
        public Signature[] signatures;
    }

    /* loaded from: classes.dex */
    public static class SplitPermissionInfo {
        public final String[] newPerms;
        public final String rootPerm;
        public final int targetSdk;

        public SplitPermissionInfo(String str, String[] strArr, int i) {
            throw new RuntimeException("Stub!");
        }
    }

    public PackageParser() {
        throw new RuntimeException("Stub!");
    }

    public static PackageInfo generatePackageInfo(Package r0, int[] iArr, int i, long j, long j2, Set<String> set, PackageUserState packageUserState) {
        throw new RuntimeException("Stub!");
    }

    public static boolean isApkFile(File file) {
        throw new RuntimeException("Stub!");
    }

    public static boolean isAvailable(PackageUserState packageUserState) {
        throw new RuntimeException("Stub!");
    }

    public static ApkLite parseApkLite(File file, int i) {
        throw new RuntimeException("Stub!");
    }

    public static PackageLite parsePackageLite(File file, int i) {
        throw new RuntimeException("Stub!");
    }

    public void collectCertificates(Package r1, int i) {
        throw new RuntimeException("Stub!");
    }

    public void collectManifestDigest(Package r2) {
        throw new RuntimeException("Stub!");
    }

    public Package parsePackage(File file, int i) {
        throw new RuntimeException("Stub!");
    }

    public void setCallback(Callback callback) {
        this.mCallback = callback;
    }

    public void setDisplayMetrics(DisplayMetrics displayMetrics) {
        throw new RuntimeException("Stub!");
    }

    public void setOnlyCoreApps(boolean z) {
        throw new RuntimeException("Stub!");
    }

    public void setSeparateProcesses(String[] strArr) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: classes.dex */
    public static class Component<II extends IntentInfo> {
        public final String className;
        ComponentName componentName;
        String componentShortName;
        public final ArrayList<II> intents;
        public Bundle metaData;
        public final Package owner;

        public Component(Package r2) {
            throw new RuntimeException("Stub!");
        }

        public void appendComponentShortName(StringBuilder sb) {
            throw new RuntimeException("Stub!");
        }

        public ComponentName getComponentName() {
            throw new RuntimeException("Stub!");
        }

        public void printComponentShortName(PrintWriter printWriter) {
            throw new RuntimeException("Stub!");
        }

        public void setPackageName(String str) {
            throw new RuntimeException("Stub!");
        }

        public Component(ParsePackageItemArgs parsePackageItemArgs, PackageItemInfo packageItemInfo) {
            throw new RuntimeException("Stub!");
        }

        public Component(ParseComponentArgs parseComponentArgs, ComponentInfo componentInfo) {
            throw new RuntimeException("Stub!");
        }

        public Component(Component<II> component) {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: classes.dex */
    public static class PackageParserException extends Exception {
        public PackageParserException(int i, String str) {
            super(str);
            throw new RuntimeException("Stub!");
        }

        public PackageParserException(int i, String str, Throwable th) {
            super(str, th);
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: classes.dex */
    public static final class Permission extends Component<IntentInfo> {
        public PermissionGroup group;
        public final PermissionInfo info;
        public boolean tree;

        public Permission(Package r2) {
            super(r2);
            throw new RuntimeException("Stub!");
        }

        @Override // android.content.pm.PackageParser.Component
        public void setPackageName(String str) {
            throw new RuntimeException("Stub!");
        }

        public String toString() {
            throw new RuntimeException("Stub!");
        }

        public Permission(Package r1, PermissionInfo permissionInfo) {
            super(r1);
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: classes.dex */
    public static final class PermissionGroup extends Component<IntentInfo> {
        public final PermissionGroupInfo info;

        public PermissionGroup(Package r2) {
            super(r2);
            throw new RuntimeException("Stub!");
        }

        @Override // android.content.pm.PackageParser.Component
        public void setPackageName(String str) {
            throw new RuntimeException("Stub!");
        }

        public String toString() {
            throw new RuntimeException("Stub!");
        }

        public PermissionGroup(Package r1, PermissionGroupInfo permissionGroupInfo) {
            super(r1);
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: classes.dex */
    public static final class Provider extends Component<ProviderIntentInfo> {
        public final ProviderInfo info;
        public boolean syncable;

        public Provider(ParseComponentArgs parseComponentArgs, ProviderInfo providerInfo) {
            super(parseComponentArgs, (ComponentInfo) providerInfo);
            throw new RuntimeException("Stub!");
        }

        @Override // android.content.pm.PackageParser.Component
        public void setPackageName(String str) {
            throw new RuntimeException("Stub!");
        }

        public String toString() {
            throw new RuntimeException("Stub!");
        }

        public Provider(Provider provider) {
            super(provider);
            throw new RuntimeException("Stub!");
        }
    }

    public static PackageInfo generatePackageInfo(Package r0, int[] iArr, int i, long j, long j2, Set<String> set, PackageUserState packageUserState, int i2) {
        throw new RuntimeException("Stub!");
    }

    public Package parsePackage(File file, String str, DisplayMetrics displayMetrics, int i) {
        throw new RuntimeException("Stub!");
    }

    public PackageParser(String str) {
        throw new RuntimeException("Stub!");
    }
}
