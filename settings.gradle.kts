pluginManagement {
	repositories {
		gradlePluginPortal()
		maven {
			name = "MinecraftForge"
			url = uri("https://maven.minecraftforge.net/")
		}
	}
}

rootProject.name = "na-pack"
include("mccore", "mcinterfaceforge1122", "mcinterfaceforge1165", "mcinterfaceforge1201")