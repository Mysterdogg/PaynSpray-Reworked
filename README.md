# Pay'n'Spray Reworked by Mysterdogg

Simple, necessary fixes and a few vanilla-friendly additions fo the Pay'n'Spray shops. Inspired by GTA IV & Chinatown Wars.

## Requirements

- GTA San Andreas US 1.0
- CLEO 4.4.4

### Fixes

| Vanilla | Reworked |
|---|---|
| You only pay when the car's health is under 970. A healthy car loses six stars for free *("Respray is complementary")*. | Every service is paid: new paint, each star cleared, and the repairs. |
| The shop turns you away with less than $100, even when the visit would be free. | The shop checks the real price of the service and tells you how much you are short. |
| The game can roll the same colors again, yet still says *"Cops won't recognize you!"*. | The new colors always differ from the old ones *(when the model has more than one choice)*. |
| Every message says $100. | The messages show the amount charged. |
| A car whose paint can't change *(paintjob)* loses its stars anyway, though the cops still know it. | The shop lets you lie low inside: the stars are cleared for the usual price, and 2 more hours pass per star *(`PaintjobStars`, `HideHoursPerStar`)*. |
| You reverse out onto the street. | The car is centered and turned to face the door *(`TurnCar`)*. |

### Additions

- **Price by service:** a price for repaint, damage repairs, stars cleared, and even for using the shop as a hideout spot.
- **Service time:** the screen fades and the clock moves on *(2 hours by default; as in Chinatown Wars)*.
- **"Lose the cops first":** with stars, if a cop see you drive in, the shop won't serve you *(as in GTA IV)*.
- **Opening hours:** The door stays closed and a message says when it opens.

### Kept as vanilla

- A random color from the car's `carcols.dat` line. Paintjobs are never repainted.
- The game's own rule for which vehicles are served: no emergency vehicles *("Whoa! I don't touch nothing THAT hot!")* and no bicycles *("I don't do toys!")*.
- The repair, the wash, the flip of an upside-down car, the stats, the door sounds, and the police waiting outside while you are in.
- Missions keep control: no resprays during some missions, free resprays early in the story, and the girlfriend's free garage.

## Install

1. Copy `PaynSprayReworked.cs` and `PaynSprayReworked.ini` into the game's `CLEO` folder.

## Settings (`PaynSprayReworked.ini`)

| Key | Default | What it does |
|---|---|---|
| `[General] AZ5` | 1 | Master switch. `Enabled` by default, use `0` to disable it. |
| `[General] ShowStatus` | 0 | Short status text when the game starts and when this file is reloaded. `Disabled` by default, use `1` to enable it. |
| `[General] ReloadKey` | 121 (F10) | Key for relaoding the INI in-game. `F10` *(121)* by default. Uses Windows virtual-key codes, in DECIMAL. Set key to `0` to disable it. |
| `[Price] Paint` | 100 | Cost of repaint ($), only when the colors can change. |
| `[Price] PerStar` | 50 | Cost of each wanted star cleared ($). |
| `[Price] RepairMax` | 400 | Cost of repairs ($). Scales with the damage. |
| `[Price] RepairBelow` | 970 | Repairs are charged only below this health (vanilla 970). |
| `[Price] PaintjobStars` | 2 | Cars whose paint can't change: 0 = cleared anyway (vanilla), 1 = kept., 2 = the shop lets you lie low inside: the stars are cleared. |
| `[Price] HideHoursPerStar` | 2 | With PaintjobStars=2: extra game hours per star, (0-8) |
| `[Service] Hours` | 2 | Game hours that pass while the car is in the shop (0-23; 0 = vanilla, 2 = Chinatown Wars, 3 = GTA IV). |
| `[Service] Fade` | 1 | Fade the screen while those hours pass. Enabled by default, use 0 to disable it. |
| `[Service] TurnCar` | 1 | Turn and center the car to face the door, so it drives out forwards. Enabled by default, use 0 to disable it. |
| `[Police] RefuseIfSeen` | 1 | With stars, if a cop see you drive in, the shop won't serve you (as in GTA IV), (vanilla 0). |
| `[Police] SeenDistance` | 40.0 | How far a cop can see you from, in meters. 40.0 by default. |
| `[Hours] OpenHour` / `CloseHour` | 0 / 24 | Opening hours in game time (0-24). Always open by default. |
| `[Messages] Style` | 1 | How the shop messages show:  0 = on the game's subtitle line. 1 = in the middle of the screen, like the vanilla Pay 'n' Spray messages. |
| `[Messages] Size` | 60 |  Text size in percent of the vanilla message size (vanilla 100). |
| `[Messages] X` / `Y` | 320 / 163 | Position (Position in 640 x 448 units). |
| `[Messages] Font` / `Edge` / `ColorR`, `ColorG`, `ColorB` / `Time` | 3 / 2 / 235, 165, 35 / 4000 | Font, outline, color and duration. |
| `[Map] LasVenturasEastBlip` | 1 | Radar icon for the Pay'n'Spray in east Las Venturas. **Needs Proper Fixes or another mod that restores that shop**. |

**Example:** a car at half health with 2 stars costs $100 *(repaint)* + $100 *($50 for each star)* + $200 *(repairs)* = **$400**. 

To get the vanilla price back, set `Paint=0`, `PerStar=0` and `RepairMax=100`. Then only damaged cars pay, as in the original game.

## How it works

In the game's EXE, the whole Pay'n'Spray system lives in `CGarage::Update` (garage type 5). It jumps through a table of 5 door states at `0x44C83C`:

| State | Address |
|---|---|
| closed | `0x44AEC0` |
| open | `0x44AC50` |
| closing | `0x44AE0C` |
| opening | `0x44B79C` |
| waiting | `0x44B40C` |

This mod points that table to 55 bytes of its own code that only slide the door: closing *(`0x44A750`)* and opening *(`0x44A660`)*. The script then runs the rest of the visit in CLEO, calling the game's own functions where they exist:

| Function | Address |
|---|---|
| Car stopped inside | `0x44A830` |
| Player outside | `0x448E50` |
| Center the car | `0x449220` |
| "Sprayable" rule | `0x4479A0` |
| Colors from `carcols.dat` | `0x4C8500` |
| The car's own repair: vtable | `+0xC8` |
| Police leaving the area | `0x566A60` |
| Stats | `0x55C180` |
| Clock | `0x52D150` |

## Changelog

- **1.0.0** (2026-11-26): first public version.
