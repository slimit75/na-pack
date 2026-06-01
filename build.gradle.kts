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
var mcinterfaceforge1122 = project(":mcinterfaceforge1122")
var mcinterfaceforge1165 = project(":mcinterfaceforge1165")

tasks.register("buildCore") {
	dependsOn(mcCore.tasks.build)
}

tasks.register("buildForge1122") {
	dependsOn(mcinterfaceforge1122.tasks.build)
}

tasks.register("buildForge1165") {
	dependsOn(mcinterfaceforge1165.tasks.build)
}

tasks.register("buildForgeAll") {
	dependsOn(tasks.getByName("buildForge1122"))
	dependsOn(tasks.getByName("buildForge1165"))
}