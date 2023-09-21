import { registerPlugin } from '@capacitor/core';

import type { CapHomeButtonPlugin } from './definitions';

const CapHomeButton = registerPlugin<CapHomeButtonPlugin>('CapHomeButton', {
  web: () => import('./web').then(m => new m.CapHomeButtonWeb()),
});

export * from './definitions';
export { CapHomeButton };
