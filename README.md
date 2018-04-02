# HABot

[![Build Status](https://travis-ci.org/ghys/habot.svg?branch=master)](https://travis-ci.org/ghys/habot)

HABot is a chatbot for [openHAB](https://openhab.org), running inside the [Eclipse SmartHome](https://eclipse.org/smarthome/) runtime with no dependency; it is offline and private by design, but can be added to the Android homescreen as a [Progressive Web App](https://developers.google.com/web/progressive-web-apps/) with resource caching (so it's very fast!) if served over HTTPS from an openHAB Cloud instance (like [myopenhab.org](https://www.myopenhab.org)) and used on the go.

__If you have feature requests or issues, please have a look at the (already quite full)  [roadmap](https://github.com/ghys/habot/projects) first! Thanks :)__

It consists in:

- a machine-learning natural language processor based on [Apache OpenNLP](https://opennlp.apache.org) for intent classification and entity extraction (thanks to [nlp-intent-toolkit](https://github.com/mlehman/nlp-intent-toolkit));
- a modular skill system with intent interpreters and learning data provision (can be injected as OSGi components);
- a mobile-first (but usable on a desktop too) web UI built with the [Quasar Framework](http://quasar-framework.org) and related REST API, to interact with the bot with messages and a full card designer
- the interpreter is also an Eclipse SmartHome [Human Language Interpreter](http://docs.openhab.org/configuration/multimedia.html#human-language-interpreter) - this means the natural language answers will eventually expand to more than "here's what I found" and "there you go", athen it will eventually be able to answer questions and execute orders without a visual UI, when coupled with speech-to-text and text-to-speech engines in ESH. It is another step to have a full, open source, privacy-focused, integrated natural language processing toolchain for your openHAB smart home.

## Screenshots

<img src="https://i.imgur.com/dTGNui3.png" width="350"> <img src="https://i.imgur.com/3vtnzfY.png" width="350"> <img src="https://i.imgur.com/rh5Tljq.png" width="350"> <img src="https://i.imgur.com/l4ktHGZ.png" width="350">

## Installation & Configuration

### Install the bundle

Grab the latest release from https://github.com/ghys/habot/releases and drop the .jar in openHAB's `addons` folder. The actual location of that folder depends on your installation and is documented in the installation instructions for [Linux](https://docs.openhab.org/installation/linux.html#file-locations) and [Windows](https://docs.openhab.org/installation/windows.html#file-locations).

To upgrade, just replace the .jar by the new version. Also go the web app's settings and hit _"Refresh the application"_ to make sure the old version doesn't remain cached. Verify the version by checking the build date under _About HABot_. You might encounter exceptions after upgrading (see https://github.com/ghys/habot/projects/5#card-8141287), this is known and will be fixed. Restarting openHAB should fix the problem.

### Tag your items

When chatting with HABot you'll likely mention some _object_ and a _location_.

HABot is only able to determine which items correspond to those entities recognized in the query by looking at certain tags applied to your items.

You can either apply these tags in your .items files, or with an (upcoming) screen inside the web app for things added from the inbox in Paper UI.

Tags recognized by HABot have this syntax (**use only lowercase**):

```
entity_type:value
```

For example:

- `object:temperature`
- `object:water consumption`
- `location:kitchen`
- `location:first floor`

If openHAB is set to another language supported by HABot, leave the `object:` and `location:` prefixes untranslated; examples: `object:beleuchtung` or `location:salle à manger`.

It is possible to have multiple tags of the same type for an item: for instance, lights can also be called "hue" or "lighting", and they can be both in the location "kitchen" and the location "ground floor".

To avoid tagging items one by one, tags can also be used on groups, this is useful because all members of the group will then inherit the tag, saving you from applying it individually. In the HABot web app settings, you will find an option to display all your items, their groups, tags directly applied to them, and tags inherited because they're members of a tagged group. You'll also be able (soon) to apply tags to items mapped to things in Paper UI from there.

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

### Build cards to replace the defaults

Once items are tagged, you can try chatting with HABot by asking questions and giving orders like _"what's the temperature in the kitchen?"_ or _"switch on the tv in the living room"_ (check the [training data](https://github.com/ghys/habot/tree/master/src/main/resources/train) for some clues about what it can do at the moment. It will reply with a natural language answer and present you with a card containing the matching items using their tags, but you can also alter those cards!

**If there is already a card with those same tags saved in your "card deck", HABot will display the saved card instead of generating one.** You can save an auto-generated card to the card deck with the _"Add to Card deck"_ option its context menu while chatting, and it will have the same tags as the items that matched the query. This means subsequent queries with the same recognized object and/or location will present the saved card from the card deck rather than generating a new one. This allows you to make the necessary changes to the card in the Card designer as you see fit, and bring it back by simply asking HABot about those tags. Only remember if the matching items evolve, they won't appear automatically in a saved card, it's now your responsibility to add them to it.

Using the card designer will eventually be properly documented but is quite easy to use; just remember the card is a tree of _components_, each having its own configuration and sometimes also _slots_, which are placeholder in certain locations within the component where other subcomponents may be added. Certain components can only be added to certain slots; when selecting a slot, the designer only lets you add components valid for that slot. The HABot components are mostly mapped to their [Quasar framework counterparts](http://quasar-framework.org/components/), often with the same property names, so their accepted values might also be found in the Quasar docs.

### Bookmarked cards & Suggestions

You can bookmark a card and it will appear in the "Bookmarks" section. This is useful for cards you find yourself needing all the time - don't bookmark too many cards, only those you really use daily! Others can always be accessed from the card deck.

Suggestions are a way to have quick access to cards that are relevant in certain contexts only. For example, you will likely need different cards depending on whether you're at home or not, or in certain parts of the day. If the temperature falls outside a certain range, you would want a card with the thermostat controls. If motion was detected while you're away, you will likely get a quick way of displaying the webcams and the sensor status. You decide when a card should be suggested with a formula you set up in the card designer. The expression syntax allows simple operations and lets you access items' statuses and (soon) the current time.

Examples of expressions include `items.Temperature.state < 16` and `items.Motion_Detected.state == "ON" && items.Presence.state == "OFF"`. The [jexl](https://github.com/TomFrost/Jexl) library (not Apache JEXL) is used to evaluate expressions. Stay tuned for a more complete description of what they can do.
Note: Some components also accept expressions in their config, for instance the HbCard title and subtitle, or the HbListItem label and sublabel. Simply prefix the expression with '=' (example: `=2+3` or `="Desired temperature: " + items.Temperature_Setpoing.state + "°C"` and it will be considered an expression/formula rather than literal text - much like Excel!


### How to add HABot as a home screen app (Android)

_Sorry iOS users, there is no support from Apple currently but [things might change eventually](https://m.phillydevshop.com/apples-refusal-to-support-progressive-web-apps-is-a-serious-detriment-to-future-of-the-web-e81b2be29676). You can still add the app to the home screen from Safari though, but there will no push notifications (when they're implemented) or caching._

If HABot is served over HTTPS (for example, if you've connected it with myopenhab.org, it will be accessible at https://home.myopenhab.org/habot/index.html after authenticating), when navigating to the HABot page for the first time a banner should appear asking you if you'd want HABot as an app (it is supported by the Chrome, Firefox and the Samsung Internet browser) - if not, use the browser's menu:

![](https://i.imgur.com/7fvD5vP.png)

Using HTTPS will also unlock features only available from "secure origins", including spoken input (either with the browser's built-in recognition or a cloud service) if the browser supports it.

Remember to cleanup the cache if you upgrade the app. If you're using Chrome, you can also make the browser retain your credentials with the option in the Settings.

## Roadmap

HABot is very much a work in progress.
You can check the roadmap in the [Projects](https://github.com/ghys/habot/projects) section. Contributions (PR) are welcome and appreciated!
