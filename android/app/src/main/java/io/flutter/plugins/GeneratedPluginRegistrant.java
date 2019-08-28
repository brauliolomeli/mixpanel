package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import io.flutuate.plugin.mixpanel.MixpanelPlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    MixpanelPlugin.registerWith(registry.registrarFor("io.flutuate.plugin.mixpanel.MixpanelPlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
