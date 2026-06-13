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

var mcCore = project(":mccore")
var mcinterfaceforge1165 = project(":mcinterfaceforge1165")
var mcinterfaceforge1201 = project(":mcinterfaceforge1201")
var mcinterfaceneoforge1211 = project(":mcinterfaceneoforge1211")

tasks.register("buildCore") {
	dependsOn(mcCore.tasks.build)
}

tasks.register("buildForge1165") {
	dependsOn(mcinterfaceforge1165.tasks.build)
}

tasks.register("buildForge11201") {
	dependsOn(mcinterfaceforge1201.tasks.build)
}

tasks.register("buildNeoForge1211") {
	dependsOn(mcinterfaceneoforge1211.tasks.build)
}

tasks.register("buildForgeAll") {
	dependsOn(tasks.getByName("buildForge1165"))
	dependsOn(tasks.getByName("buildForge1201"))
	dependsOn(tasks.getByName("buildNeoForge1211"))
}