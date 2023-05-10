# NoHitDelay
A Forge 1.8.9 client-side mod that can either eliminate or modify the hit delay when a hit is missed.
Right now, it should not be used, as it is still a work in progress.


## How to use

- Download the mod from the [releases page](https://github.com/qualk/NoHitDelay/releases), from Modrinth or Curseforge (SOON)
- Use the mod like however you would use any other 1.8.9 Forge mod.
- Done!

## Technical Information

The integer `leftClickCounter` is set to 10 whenever a hit is missed. This mod works by setting it to 0 with Sponge's various `Mixin` and `Inject` classes.


### Building from source

- Clone the repo with `git clone https://github.com/qualk/NoHitDelay.git`.
- Run `./gradlew shadowJar` in the root directory of the repo.
- Then run `./gradlew build` in the root directory of the repo.
- Boom, you have a jar file in `build/libs/`!