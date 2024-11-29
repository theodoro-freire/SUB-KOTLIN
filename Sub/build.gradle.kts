import org.gradle.internal.impldep.com.amazonaws.PredefinedClientConfigurations.defaultConfig

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false

}


dependencies {
    classpath 'com.google.gms:google-services:4.4.0'
    implementation 'com.google.firebase:firebase-auth-ktx:22.1.0'
    implementation 'com.google.firebase:firebase-firestore-ktx:24.9.0'
    implementation "androidx.room:room-runtime:2.5.2"
    kapt "androidx.room:room-compiler:2.5.2"
}

apply plugin: 'com.google.gms.google-services'


