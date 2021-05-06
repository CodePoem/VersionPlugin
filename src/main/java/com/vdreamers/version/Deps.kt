package com.vdreamers.version

enum class Deps {
    ;

    object Kotlin {
        private const val KOTLIN_VERSION = "1.3.72"
        const val STDLIB = "org.jetbrains.kotlin:kotlin-stdlib:$KOTLIN_VERSION"
    }

    object AndroidX {
        private const val CORE_KTX_VERSION = "1.3.2"
        const val CORE_KTX = "androidx.core:core-ktx:$CORE_KTX_VERSION"

        private const val APPCOMPAT_VERSION = "1.2.0"
        const val APPCOMPAT = "androidx.appcompat:appcompat:$APPCOMPAT_VERSION"

        private const val CONSTRAINT_LAYOUT_VERSION = "2.0.4"
        const val CONSTRAINT_LAYOUT =
            "androidx.constraintlayout:constraintlayout:$CONSTRAINT_LAYOUT_VERSION"

    }

    object Google {
        private const val MATERIAL_VERSION = "1.3.0"
        const val MATERIAL = "com.google.android.material:material:$MATERIAL_VERSION"
    }

    object Test {
        private const val JUNIT_VERSION = "4.13.2"
        const val JUNIT = "junit:junit:$JUNIT_VERSION"
    }

    object AndroidTest {
        private const val JUNIT_VERSION = "1.1.2"
        const val JUNIT = "androidx.test.ext:junit:$JUNIT_VERSION"

        private const val ESPRESSO_CORE_VERSION = "3.3.0"
        const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:$ESPRESSO_CORE_VERSION"

    }
}