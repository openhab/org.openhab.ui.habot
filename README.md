# HABot

HABot is a chatbot for openHAB, running inside the Eclipse SmartHome runtime with no dependency; it is offline and private by design, but can be added to the Android homescreen as a [Progressive Web App](https://developers.google.com/web/progressive-web-apps/) with resource caching (so it's very fast!) if served over HTTPS from an openHAB Cloud instance (like [myopenhab.org](https://www.myopenhab.org)) and used on the go.

**Very early! You're welcome to try it, but don't expect a fully functional product.**

_If you have feature requests or issues, please be gentle for now, the roadmap is already quite full! Thanks :)_

It consists in:

- a machine-learning natural language processor based on [Apache OpenNLP](https://opennlp.apache.org) for intent classification and entity extraction (thanks to [nlp-intent-toolkit](https://github.com/mlehman/nlp-intent-toolkit));
- a modular skill system with intent interpreters and learning data provision (can be injected as OSGi components);
- a mobile-first (but usable on a desktop too) web UI built with the [Quasar Framework](http://quasar-framework.org) and related REST API, to interact with the bot with messages and cards - as a side note, the interpreter is actually a Eclipse SmartHome [Human Language Interpreter](http://docs.openhab.org/configuration/multimedia.html#human-language-interpreter), this means once the natural language answers will expand to more than "here's what I found" and "there you go" it will eventually be able to answer questions and execute orders without a visual UI, when coupled with speech-to-text and text-to-speech engines in ESH. It is another step to have a full, open source integrated natural language processing toolchain for your openHAB smart home.

### Screenshots

<img src="https://i.imgur.com/dTGNui3.png" width="350"> <img src="https://i.imgur.com/3vtnzfY.png" width="350"> <img src="https://i.imgur.com/rh5Tljq.png" width="350"> <img src="https://i.imgur.com/l4ktHGZ.png" width="350">

### Item tagging rules

HABot is able to determine which items correspond to entities recognized in the query ("object" and "location" currently) with tagging.

You can either apply tags in your .items files, with the REST API for things added from the inbox, or with an upcoming screen inside the web app.

Tags recognized by HABot have this syntax:

```
entity_type:value
```

Use only lowercase.

Examples:
- `object:temperature`
- `object:water consumption`
- `location:kitchen`
- `location:first floor`

It is possible to have multiple tags of the same type for an item: for instance, it can be both in the location "kitchen" and the location "ground floor".

To avoid tagging items one by one, tags can also be used in groups, in that case, all members of the group will inherit the tag.

Complete example below:

```
Group gFF           "First Floor"   <firstfloor> ["location:first floor"]
Group gGF           "Ground Floor"  <groundfloor> ["location:ground floor"]
Group gC            "Cellar"        <cellar> ["location:cellar"]
Group Garden        "Garden"        <garden> ["location:garden"]

Group GF_Living     "Living Room"   <video>     (gGF) ["location:living room"]
Group GF_Kitchen    "Kitchen"       <kitchen>   (gGF) ["location:kitchen"]
Group GF_Toilet     "Toilet"        <bath>      (gGF) ["location:toilet"]
Group GF_Corridor   "Corridor"      <corridor>  (gGF) ["location:corridor"]

Group FF_Bath       "Bathroom"      <bath>      (gFF) ["location:bathroom"]
Group FF_Office     "Office"        <office>    (gFF) ["location:office"]
Group FF_Child      "Child's Room"  <boy_1>      (gFF) ["location:child's room"]
Group FF_Bed        "Bedroom"       <bedroom>   (gFF) ["location:bedroom"]
Group FF_Corridor   "Corridor"      <corridor>  (gFF) ["location:corridor"]

Group:Switch:OR(ON, OFF)        Lights      "All Lights [(%d)]"     ["object:light", "object:lights", "object:lighting"]
Group:Switch:OR(ON, OFF)        Heating     "No. of Active Heatings [(%d)]"     <heating>   ["object:heating", "object:radiator"]
Group:Number:AVG                Temperature "Avg. Room Temperature [%.1f °C]"   <temperature>   (Status)    ["object:temperature"]
Group:Contact:OR(OPEN, CLOSED)  Windows     "Open windows [(%d)]"               <contact>   ["object:window"]

Dimmer Light_GF_Living_Table        "Table"     (GF_Living, Lights)
Switch Light_GF_Corridor_Ceiling    "Ceiling"       (GF_Corridor, Lights)
Switch Light_GF_Kitchen_Ceiling     "Ceiling"       (GF_Kitchen, Lights)
Switch Light_GF_Kitchen_Table       "Table"         (GF_Kitchen, Lights)
Switch Light_GF_Corridor_Wardrobe   "Wardrobe"      (GF_Corridor, Lights)
Switch Light_GF_Toilet_Ceiling      "Ceiling"       (GF_Toilet, Lights)
Switch Light_GF_Toilet_Mirror       "Mirror"        (GF_Toilet, Lights)

Switch Light_FF_Bath_Ceiling        "Ceiling"       (FF_Bath, Lights)
Switch Light_FF_Bath_Mirror         "Mirror"        (FF_Bath, Lights)
Switch Light_FF_Corridor_Ceiling    "Corridor"      (FF_Corridor, Lights)
Switch Light_FF_Office_Ceiling      "Ceiling"       (FF_Office, Lights)
Switch Light_FF_Child_Ceiling       "Ceiling"       (FF_Child, Lights)
Switch Light_FF_Bed_Ceiling         "Ceiling"       (FF_Bed, Lights)

...

Number Temperature_GF_Corridor  "Temperature [%.1f °C]" <temperature>   (Temperature, GF_Corridor)
Number Temperature_GF_Toilet    "Temperature [%.1f °C]" <temperature>   (Temperature, GF_Toilet)
Number Temperature_GF_Living    "Temperature [%.1f °C]" <temperature>   (Temperature, GF_Living)
Number Temperature_GF_Kitchen   "Temperature [%.1f °C]" <temperature>   (Temperature, GF_Kitchen, Thermostat) ["CurrentTemperature"]
Number Temperature_FF_Bath      "Temperature [%.1f °C]" <temperature>   (Temperature, FF_Bath)
Number Temperature_FF_Office    "Temperature [%.1f °C]" <temperature>   (Temperature, FF_Office)
Number Temperature_FF_Child     "Temperature [%.1f °C]" <temperature>   (Temperature, FF_Child)
Number Temperature_FF_Bed       "Temperature [%.1f °C]" <temperature>   (Temperature, FF_Bed)

...

Contact Window_GF_Frontdoor     "Frontdoor [MAP(en.map):%s]"        (GF_Corridor, Windows) ["object:door", "object:frontdoor", "object:front door"]
Contact Window_GF_Kitchen       "Kitchen [MAP(en.map):%s]"          (GF_Kitchen, Windows)
Contact Window_GF_Living        "Terrace door [MAP(en.map):%s]"     (GF_Living, Windows)
Contact Window_GF_Toilet        "Toilet [MAP(en.map):%s]"           (GF_Toilet, Windows)

Contact Window_FF_Bath          "Bath [MAP(en.map):%s]"             (FF_Bath, Windows)
Contact Window_FF_Bed           "Bedroom [MAP(en.map):%s]"          (FF_Bed, Windows)
Contact Window_FF_Office_Window "Office Window [MAP(en.map):%s]"    (FF_Office, Windows)
Contact Window_FF_Office_Door   "Balcony Door [MAP(en.map):%s]"     (FF_Office, Windows) ["object:door"]

```

### How to add HABot as a home screen app (Android)

_Sorry iOS users, there is no support from Apple currently but [things might change eventually](https://m.phillydevshop.com/apples-refusal-to-support-progressive-web-apps-is-a-serious-detriment-to-future-of-the-web-e81b2be29676). You can still add the app to the home screen from Safari though, but there will no push notifications (when they're implemented) or caching._

If your openHAB is connected to myopenhab.org or another openHAB Cloud instance server over HTTPS, when navigating to the HABot page for the  first time a prompt should appear to ask if you'd want HABot as an app (it is supported by the Chrome and Samsung Internet browsers):

![](https://i.imgur.com/7fvD5vP.png) ![](https://i.imgur.com/LBpNFjr.gif)

It will then behave almost like a real app, however there is no upgrade functionality for now, so the cache might prevent you to see the latest changes if you upgrade the bundle... you'll have to clear the site storage in Chrome and uninstall the PWA to update it (this is temporary).

### What's missing / Known issues / Roadmap

In somewhat descreasing order of priority:

- [ ] Some basic skills are absent or not implemented (last changes in an item's state, weekly/monthly graphs, activate/deactivate objects, set/increase/decrease numerical values, send open/close commands, player control...);
- [ ] The ability to use item tags as training data to improve the entity extraction accuracy;
- [ ] More training data in general;
- [ ] Use a lemmitizer from OpenNLP to retrieve the dictionary form (i.e. singular) of entities;
- [x] Improve the tokenization (problems with _'s_ in English, _l'_ _d'_ in French, remove punctuation, lowercase);
- [ ] Authenticate to myopenhab.org without user interaction (OAuth2 or store the basic auth credentials securely?);
- [ ] Unregister the service worker and empty the resource cache to update the PWA;
- [ ] Debug mode to show raw intents and entities in the web app;
- [ ] Speech support - either using the browser's API or sending the audio stream to openHAB to process locally;
- [ ] Support for additional languages (English and French for now) - contributions welcome! Also, ability to force the language in the web app;
- [ ] Support for images in cards (like webcams - "show me the webcam in the garden");
- [ ] Use other metadata from things and items (like labels and the location for things) instead of relying only on item tagging;
- [ ] More settings in the web app;
- [ ] Replace chart images by interactive graphs, ability to change the period and date in the card;
- [ ] Cards are currently static, the goal is to make them interactive - render switches as actual switches, dimmer as sliders etc. Also consider the ability to use tags to alter the default control for an item;
- [ ] Ability to design custom cards as a JSON object and show them instead of simple controls (in the chat or in a separate web app page, for example to group complete thermostat controls);
- [ ] Use Web Push notifications to push rich notifications and cards when relevant (e.g. push a card or notification with a webcam image and action buttons when motion was detected, tbd.). If possible show those notifications as messages from HABot in the chat;
- [ ] Improve date/time entity extraction to pave the way for skill able to build rules on the fly ("activate the alarm tomorrow at 8", "show a graph of the power consumption last Wednesday", "I want to build a rule to run at 20 hours on weekdays" -> show a card)