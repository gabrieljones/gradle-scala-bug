/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    // Apply the common convention plugin for shared build configuration between library and application projects.
    id("buildlogic.scala-common-conventions")

    // Apply the java-library plugin for API and implementation separation.
    `java-library`
}

dependencies {
    api("org.scala-lang:scala3-library_3:3.4.2")
}
