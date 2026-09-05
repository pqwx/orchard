# Orchard Client

**Minecraft 1.21.11 · Fabric · 119 modules**

A PvP client aimed at crystal and anarchy play. The whole interface is custom
drawn, MSDF text, SDF panels and real background blur, with none of the vanilla
widget stack involved.

```
119 modules   67 mixins   30 themes   693 classes
```

---

## Getting it running

The jar is in [`dist/`](dist/). Drop it into `.minecraft/mods/` next to Fabric
API and launch a 1.21.11 Fabric profile. That's the whole install.

```
dist/orchard-1.21.11.jar        6.2 MB
sha256  f61360aca1bc2222e0207a7a930971200a51a8462f432a0674394c3a2ae23b4e
```

| Requirement | Version |
|---|---|
| Minecraft | 1.21.11 |
| Fabric Loader | 0.18.4+ |
| Fabric API | any |
| Java | 21+ |

Client side only, it does nothing when loaded on a server. The menu key binds
under **Controls → Orchard Client**.

---

## What's in it

119 modules across six categories, matching the click GUI. Descriptions below are
the in-client text.

<details>
<summary><b>Combat</b> (31)</summary>


Crystals, maces, anchors, bows. Most of the client lives here.


| Module | What it does |
|---|---|
| `Aim Optimizer` | Slows mouse movement near targets and releases speed on the hitbox |
| `AirAnchor` | Attempts to place another respawn anchor in the exploded anchor position. |
| `AntiBot` | Detects and ignores anti-cheat bots instantly across servers. |
| `Auto Crystal` | Automatically places & breaks crystals |
| `Auto Head Web` | Places a cobweb at an opponent head when a reachable support block is adjacent. |
| `Auto Inventory Totem` | Briefly opens inventory and moves a totem into your offhand |
| `Auto Totem` | Refills your offhand with a totem after it is missing or pops |
| `AutoCart` | Automatically places a rail and minecart at a flaming arrow impact point. |
| `Autoclicker` | Automatically clicks at a configurable rate. |
| `AutoDhand` | Moves a totem to the main hand after your offhand totem pops. |
| `AutoHitCrystal` | Places an obsidian & a crystal when hitting the ground |
| `AutoMace` | Aims and lands a mace smash on nearby opponents while falling. |
| `AutoSafeAnchor` | Places glowstone on the floor beside a newly placed anchor, toward the player. |
| `Backtrack` | Delays an attacked player's movement packets so their recent position remains hittable. |
| `BowSpam` | Rapidly releases and restarts a held bow at minimum charge. |
| `BreachSwap` | Automatically swaps to a Breach mace during sword attacks, then switches back. |
| `CartProtection` | Places a selected hotbar block between you and a foreign lethal TNT cart. |
| `Click Crystal` | Speeds up repeated block placement without changing attacks or crystal interactions. |
| `FastAnchor` | Automatically explodes interracted & placed anchors. |
| `FastCart` | Places a minecart after you place a rail. |
| `HitWeb` | Places a cobweb under players after you hit them. |
| `KeyXbow` | Automatically preforms a Xbow explosion when looking at the ground. |
| `KillAura` | aim +phit |
| `Knockback Displacement` | Silently displaces knockback direction on hit. |
| `LagRange` | Briefly chokes outbound packets while closing into opponent range. |
| `MaceSwap` | Swaps to your best mace before falling attacks. |
| `NoMissDelay` | Removes the missed-hit attack delay based on chance. |
| `PlayerFreeze` | After hitting a player, holds packets for a fixed time and then flushes them. |
| `PotAssist` | Automatically throws safe splash potions when looking down. |
| `ShieldBreaker` | Switches to an axe and breaks shields on click. |
| `Spear lunge` | Automatically preforms a spear lunge at a click of a button |

</details>

<details>
<summary><b>Movement</b> (17)</summary>


Sprint, speed, jumps, and keeping movement correct while rotations are silent.


| Module | What it does |
|---|---|
| `Auto Play` | Finds the nearest valid player, approaches safely and hands combat to Kill Aura. |
| `Auto Walk` | Automatically walks forward until toggled off or a menu is opened. |
| `CollisionSpeed` | Borrows the anticheat's per-entity collision lenience to move faster while pushable entities are near. |
| `Jump Reset` | Mitigates velocity by automatically jumping. |
| `KeepSprint` | Resets sprint after hits so follow-up hits keep momentum. |
| `Move Fix` | Keeps movement physics correct while modules use silent rotations |
| `No Push` | Prevents other entities from pushing you via collision. |
| `NoJumpDelay` | Removes the vanilla jump cooldown. |
| `Parkour` | Automatically jumps when you reach the edge of a block. |
| `PearlChase` | Throws an ender pearl to follow escaping opponents. |
| `Perfect Windcharge` | Automatically jumps when a wind charge is thrown at your feet. |
| `SnapTap` | Makes opposing movement inputs resolve to the most recent direction. |
| `Speed` | Legit speed with straight-line equalization or sprint + autojump. |
| `Sprint` | Keeps you sprinting like a vanilla toggle sprint. |
| `SprintReset` | Instantly resets sprint after successful hits. |
| `SprintReset` | Resets sprint on hit via W-Tap or S-Tap for extra knockback. |
| `VClip` | Clips you vertically through blocks. |

</details>

<details>
<summary><b>Player</b> (23)</summary>


Inventory and container automation.


| Module | What it does |
|---|---|
| `Auto Reconnect` | Reconnects to the last multiplayer server after a configurable delay. |
| `AutoArmor` | Automatically equips the best armor from your inventory. |
| `AutoDeposit` | Automatically deposits selected inventory items into an ender chest. |
| `AutoDrain` | Picks up nearby liquid sources with a bucket. |
| `AutoGG` | Automatically sends a message in chat when you kill someone. |
| `AutoTool` | Automatically switches to the best mining tool and optional weapon slot. |
| `ChestStealer` | Randomly quick-moves items from open chest containers into inventory. |
| `ElytraSwap` | Swaps an elytra or chestplate from the hotbar into your chest slot. |
| `Extinguish` | Auto-douses the player with a water bucket when on fire. |
| `FakePlayer` | Spawns a fake player for testing combat and render modules. |
| `FastPlace` | Removes the right click item-use delay. |
| `FastXP` | Automatically throws experience bottles to repair equipped gear. |
| `HoverTotem` | Instantly offhands a hovered totem. |
| `InventoryCleaner` | Drops junk and weak duplicate armor/tools while inventory is open or NoMove is stationary. |
| `Legit Scaffold` | Sneaks at the edges of blocks |
| `NoInteract` | Blocks right-click interactions with storage blocks. |
| `Opsec` | Your favourite opsec mod, just inside Orchard. |
| `PearlChase` | Automatically throws a counter pearl towards an opponent's thrown ender pearl trajectory. |
| `PingSpoof` | Spoofs network latency for manual or opponent-matched ping. |
| `Stray utils` | Utilities for stray FFA gamemodes. |
| `Teams` | Prevents modules from targeting players that look like teammates. |
| `WebAssist` | Allows you to place ONLY cobwebs through entities. |
| `XCarry` | Keeps your crafting inventory open server-side for extra storage. |

</details>

<details>
<summary><b>Render</b> (28)</summary>


ESP, nametags, and everything that makes the world easier to read.


| Module | What it does |
|---|---|
| `2D ESP` | Projects players as 2D boxes on the HUD. |
| `Animations` | Custom first-person item animations. |
| `Chinahat` | Draws a cone hat on player heads. |
| `Cosmetics` | Applies a cosmetic cape to your local player. |
| `DivebombESP` | Draws a three-block heatmap on the ground below every player. |
| `Fake Client` | Spoofs client brand and channels for Fabric, Feather, or Lunar. |
| `FakeHacker` | Makes a named player look at you and swing client-side. |
| `Freecam` | Lets the camera fly independently around the world. |
| `FullBright` | Keeps the world visually bright on the client. |
| `Glow` | Applies a glowing outline to players using the current client theme. |
| `HitMarker` | Plays a hitmarker sound and draws a marker on your crosshair after a hit. |
| `ItemESP` | Highlights dropped items through walls. |
| `JumpCircle` | Draws a theme-colored circle where you jumped. |
| `Nametags` | Renders detailed informative tags above players. |
| `Nick Switcher` | Replaces either your visible name or your tracked opponent's visible name and can copy another player's skin. |
| `No Bounce` | Removes the end crystal hand bounce |
| `NoEffectView` | Removes bad status-effect visuals from your camera. |
| `Player Hider` | Hides all other players from your local view. |
| `PlayerLocator` | Highlights selected players with outlines visible through walls. |
| `PopVisuals` | Renders a fading frozen player ghost when a charm pop is received. |
| `RangeFinder` | Draws a 3 block foot circle and warns when opponents enter it. |
| `Rotations` | Shows silent server head rotations on the local player model. |
| `StashFinder` | Logs nearby clusters of storage containers. |
| `Storage ESP` | Highlights storage containers with colored boxes. |
| `StreamerMode` | Moves HUD elements into an external overlay for streaming. |
| `TargetCircle` | Renders an animated circle moving up and down around your current target. |
| `Trajectories` | Renders predicted projectile paths for held and in-flight projectiles. |
| `Xray` | Highlights searby ore blocks through walls. |

</details>

<details>
<summary><b>HUD</b> (12)</summary>


On screen info, drawn with the client font and shader stack.


| Module | What it does |
|---|---|
| `BPS` | Shows movement speed in blocks per second in a small HUD cell. |
| `Effects` | Displays your active potion effects |
| `FPS` | Shows the current FPS in a small HUD cell. |
| `Inventory` | Shows a compact inventory item grid. |
| `KeybindsHUD` | Shows all bound modules and their assigned keys. |
| `Module List` | Liquid-style arraylist with scalable accents. |
| `Notifications` | Displays toggle and client notifications. |
| `Promo` | Displays custom promotional or watermark text on screen with`shadow and color shift. |
| `Radar` | Clean entity radar with player and mob dots. |
| `Spotify` | Shows the current Spotify song, album artwork, progress, and synced lyrics. |
| `TargetHUD` | Shows dynamic target info. |
| `Watermark` | Client logo watermark. |

</details>

<details>
<summary><b>Interface</b> (8)</summary>


Client level controls: theming, friends, and the panic button.


| Module | What it does |
|---|---|
| `Aim Helper` | Removed legacy helper |
| `Click Simulations` | Simulates mouse clicks for module actions. |
| `FakeLag` | Removed legacy helper |
| `Friends` | Keeps selected players out of module targeting. |
| `Interface` | Global theme color. |
| `Panic` | Disables all active modules. |
| `Unload Orchard` | Disables Orchard and releases its runtime hooks until Minecraft restarts. |
| `Visual Switch` | Visually switches hotbar slots during module actions. |

</details>

---

## How it's built

**The UI.** No vanilla widgets anywhere. Text is MSDF sampled from packed atlases,
so it stays sharp at any scale instead of smearing when scaled up. Panels are
signed distance fields (`sdf_round`, `sdf_ring_progress`) rather than textured
quads, which is why corners and rings come out actually round. The blur behind
everything is a dual Kawase pyramid (`kawase_down` into `kawase_up`) run through
`glass_composite` and `liquid_glass_surface`, with `soft_glow_panel` and
`prism_panel` layered over it.

**Themes.** 30 of them, each defining eight colors that work together: an accent,
two tints, three background depths and two text weights. Modules read from
whichever theme is active, so ESP, nametags and HUD elements all recolor together
rather than needing individual attention.

**Modules.** Everything extends `ModuleBase` with a name, category, description,
keybind and settings tree. Settings are typed (toggle, slider, mode, color,
keybind, item list) and serialize themselves to JSON, so profiles round trip
without per module save code.

**Config.** Profiles live under `%APPDATA%/cats/`, alongside inventory presets,
rolling backups, cloud sync with share links, and migration from the older config
format.

**Networking.** Mixins on `ClientConnection` (`send`, `channelActive`,
`channelInactive`) give modules control over outbound packet timing. The lag based
combat modules are built on top of that.

**Other bits.** A Spotify HUD that reads the Windows now playing session and pulls
synced lyrics, MSDF icon fonts for item and category glyphs, and enable/disable
sound cues.

---

## Where things are

```
src/orchard/
  core/       ModuleBase, Category, Theme, entrypoints
  net/        auth, cloud config, packet interceptor, spotify
  config/     config manager and old format migration
  mixin/      67 mixins, each named after the class it patches
  module/     the 119 modules, grouped by category
  internal/   GUI, rendering, math and everything else

reference/    module list, mixin map, theme list
MAPPING.tsv   class index
```

`core/ClientEntrypoint.java` covers startup and the tick hooks.
`core/ModuleBase.java` shows how a module is wired together.

`module/iface/` is the Interface category, renamed because `interface` is a
reserved word in Java and can't be used as a package name.

---

## About this source

This tree was recovered from a release build rather than exported from a source
folder, which has two consequences worth knowing up front.

**It won't compile.** This is decompiler output. Expect odd `while (true)`
wrappers and switch dispatch in spots where control flow was flattened during the
build. That's an artifact of the process, not how the code was written.

**Method and field names are gone.** They didn't survive the build and can't be
recovered, so `IIlIIl(...)` shows up inside otherwise readable classes. Class
names, Minecraft API calls, strings and overall structure all came through intact.

Classes under `internal/` keep their build names because their role wasn't pinned
down. Each file carries a header listing strings recovered from it, which usually
makes the purpose obvious at a glance. `MAPPING.tsv` maps every class both ways.
