plugins {
	java
	kotlin("jvm") version "1.7.20"
}

repositories {
	mavenCentral()
}

dependencies {
	implementation(kotlin("stdlib-jdk8"))
}

subprojects {
	apply(plugin = "java")
}

var modVersion: String = project.property("global_version").toString()

var mcCore = project(":mccore")
var mcOld = project(":mcold")
var mcNew = project(":mcnew")

tasks.register("buildCore") {
	dependsOn(mcCore.tasks.build)
}

tasks.register("buildForge1122") {
	dependsOn(mcOld.tasks.build)
}

tasks.register("buildForge1165") {
	dependsOn(mcNew.tasks.build)
}

tasks.register("buildForgeAll") {
	dependsOn(tasks.getByName("buildForge1122"))
	dependsOn(tasks.getByName("buildForge1165"))
}