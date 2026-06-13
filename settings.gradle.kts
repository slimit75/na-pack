pluginManagement {
	repositories {
		gradlePluginPortal()
		maven {
			name = "MinecraftForge"
			url = uri("https://maven.minecraftforge.net/")
		}
	}
}
plugins {
	id("org.gradle.toolchains.foojay-resolver-convention") version "0.10.0"
}

rootProject.name = "na-pack"
include("mccore", "mcinterfaceforge1165", "mcinterfaceforge1201", "mcinterfaceneoforge1211")