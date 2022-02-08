import { WebPlugin } from '@capacitor/core';

import type { CapHomeButtonPlugin } from './definitions';

export class CapHomeButtonWeb extends WebPlugin implements CapHomeButtonPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
