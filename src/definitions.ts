export interface CapHomeButtonPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
