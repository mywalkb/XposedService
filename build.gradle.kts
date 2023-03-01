tasks.register("Delete", Delete::class) {
    delete(rootProject.buildDir)
}

val androidCompileSdkVersion by extra(33)
val androidBuildToolsVersion by extra("33.0.1")
val androidTargetSdkVersion by extra(33)
val androidMinSdkVersion by extra(16)
val androidSourceCompatibility by extra(JavaVersion.VERSION_11)
val androidTargetCompatibility by extra(JavaVersion.VERSION_11)
