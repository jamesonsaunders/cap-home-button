# cap-home-button

A capacitor plugin with a listener for when the home button is pressed.

## Install

```bash
npm install cap-home-button
npx cap sync
```

## API

<docgen-index>

* [`addListener('homePress', ...)`](#addlistenerhomepress)
* [Interfaces](#interfaces)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### addListener('homePress', ...)

```typescript
addListener(eventName: 'homePress', listenerFunc: (result: CapHomeButtonResult) => void) => Promise<PluginListenerHandle> & PluginListenerHandle
```

Listens to button presses.

| Param              | Type                                                                                     | Description                                                                                                           |
| ------------------ | ---------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| **`eventName`**    | <code>'homePress'</code>                                                                 | only homePress is supported                                                                                           |
| **`listenerFunc`** | <code>(result: <a href="#caphomebuttonresult">CapHomeButtonResult</a>) =&gt; void</code> | called on button press with a reason. Reason can be 'homekey', 'recentapps', 'dream', 'voiceinteraction', or similar. |

**Returns:** <code>Promise&lt;<a href="#pluginlistenerhandle">PluginListenerHandle</a>&gt; & <a href="#pluginlistenerhandle">PluginListenerHandle</a></code>

--------------------


### Interfaces


#### PluginListenerHandle

| Prop         | Type                                      |
| ------------ | ----------------------------------------- |
| **`remove`** | <code>() =&gt; Promise&lt;void&gt;</code> |


#### CapHomeButtonResult

| Prop         | Type                |
| ------------ | ------------------- |
| **`reason`** | <code>string</code> |

</docgen-api>
