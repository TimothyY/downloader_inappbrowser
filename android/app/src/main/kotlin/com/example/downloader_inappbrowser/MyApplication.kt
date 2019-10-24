package com.example.downloader_inappbrowser

import io.flutter.app.FlutterApplication
import io.flutter.plugin.common.PluginRegistry
import io.flutter.plugins.GeneratedPluginRegistrant

// MyApplication.kt
class MyApplication : FlutterApplication(), PluginRegistry.PluginRegistrantCallback {
  override fun registerWith(registry: PluginRegistry) {
    GeneratedPluginRegistrant.registerWith(registry)
  }
}