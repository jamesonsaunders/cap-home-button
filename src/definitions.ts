import { PluginListenerHandle } from '@capacitor/core';

export interface CapHomeButtonPlugin {
  /**
   * Listens to button presses.
   * @param eventName only homePress is supported
   * @param listenerFunc called on button press with a reason. Reason can be 'homekey', 'recentapps', 'dream', 'voiceinteraction', or similar.
   */
  addListener(
    eventName: 'homePress',
    listenerFunc: (reason: string) => void,
  ): Promise<PluginListenerHandle> & PluginListenerHandle;
}
