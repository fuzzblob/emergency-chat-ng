# Emergency Chat NG

A simple communication tool for local, on-device chat during situations of overwhelm, shutdowns, meltdowns and situational mutism

This repository aims to revive the legacy `Emergency chat` app (Also known as `Aspie Meltdown`). The app aims to be a tool that people can carry with them and have available in an emergency. A single phone should suffice to have communication with someone in person.

[<img src="https://github.com/user-attachments/assets/713d71c5-3dec-4ec4-a3f2-8d28d025a9c6" 
    alt="Get it on Obtainium" 
    height="80">](https://apps.obtainium.imranr.dev/redirect.html?r=obtainium://app/%7B%22id%22%3A%22com.fuzzblob.emergencychatng%22%2C%22url%22%3A%22https%3A%2F%2Fgithub.com%2Ffuzzblob%2Femergency-chat-ng%2Freleases%22%2C%22author%22%3A%22fuzzblob%22%2C%22name%22%3A%22Emergency%20Chat%20NG%22%2C%22preferredApkIndex%22%3A0%2C%22additionalSettings%22%3A%22%7B%5C%22includePrereleases%5C%22%3Afalse%2C%5C%22fallbackToOlderReleases%5C%22%3Atrue%2C%5C%22filterReleaseTitlesByRegEx%5C%22%3A%5C%22%5C%22%2C%5C%22filterReleaseNotesByRegEx%5C%22%3A%5C%22%5C%22%2C%5C%22verifyLatestTag%5C%22%3Afalse%2C%5C%22dontSortReleasesList%5C%22%3Afalse%2C%5C%22useLatestAssetDateAsReleaseDate%5C%22%3Afalse%2C%5C%22releaseTitleAsVersion%5C%22%3Atrue%2C%5C%22trackOnly%5C%22%3Afalse%2C%5C%22versionExtractionRegEx%5C%22%3A%5C%22%5C%22%2C%5C%22matchGroupToUse%5C%22%3A%5C%22%240%5C%22%2C%5C%22versionDetection%5C%22%3Atrue%2C%5C%22releaseDateAsVersion%5C%22%3Afalse%2C%5C%22useVersionCodeAsOSVersion%5C%22%3Afalse%2C%5C%22apkFilterRegEx%5C%22%3A%5C%22%5C%22%2C%5C%22invertAPKFilter%5C%22%3Afalse%2C%5C%22autoApkFilterByArch%5C%22%3Atrue%2C%5C%22appName%5C%22%3A%5C%22Emergency%20Chat%20NG%5C%22%2C%5C%22shizukuPretendToBeGooglePlay%5C%22%3Afalse%2C%5C%22allowInsecure%5C%22%3Afalse%2C%5C%22exemptFromBackgroundUpdates%5C%22%3Afalse%2C%5C%22skipUpdateNotifications%5C%22%3Afalse%2C%5C%22about%5C%22%3A%5C%22A%20simple%20communication%20tool%20for%20local%2C%20on-device%20chat%20during%20situations%20of%20overwhelm%2C%20shutdowns%2C%20meltdowns%20and%20situational%20mutism%5C%22%2C%5C%22refreshBeforeDownload%5C%22%3Atrue%7D%22%7D) 
[<img src="https://github.com/machiav3lli/oandbackupx/blob/034b226cea5c1b30eb4f6a6f313e4dadcbb0ece4/badge_github.png"
    alt="Get it on GitHub"
    height="80">](https://github.com/fuzzblob/emergency-chat-ng/releases)

## index

- [screenshots](https://github.com/fuzzblob/emergency-chat-ng/blob/main/README.md#screenshots)
- [about](https://github.com/fuzzblob/emergency-chat-ng/blob/main/README.md#about)
- [motivation](https://github.com/fuzzblob/emergency-chat-ng/blob/main/README.md#motivation)
- [compatibility](https://github.com/fuzzblob/emergency-chat-ng/blob/main/README.md#compatibility)
- [building](https://github.com/fuzzblob/emergency-chat-ng/blob/main/README.md#building)
- [origin / versions](https://github.com/fuzzblob/emergency-chat-ng/blob/main/README.md#origin-and-orther-versions)

## screenshots

screenshots taken of [version 3.0.0](https://github.com/fuzzblob/emergency-chat-ng/releases/tag/3.0.0) on 2025.06.19:

| Default Splash Screen | Chat View | Splash Screen Editor | Settings |
|:-------------------------:|:-------------------------:|:-------------------------:|:-------------------------:|
| <img src="https://github.com/user-attachments/assets/86c23e6f-1a5b-4d27-b74a-332aeff8e067"> | <img src="https://github.com/user-attachments/assets/41d09240-6afd-4c22-b539-82ff189f7edb"> | <img src="https://github.com/user-attachments/assets/c14745f3-8ef7-46b2-99d9-6d766091cdd2"> | <img src="https://github.com/user-attachments/assets/111c15fd-d5e0-4064-9f5f-88d02745d9f3"> |

## about

The original described itself as follows:

> About Emergency chat
> 
> A clutter-free single-device chat for situations where speech is impossible.
> 
> Emergency chat can be used in any situation where speech is impossible but communication is still necessary.
> 
> The splash screen has a base text that explains to the person you gave your phone to that you can't use speech and want to use this app to communicate. The default text is aimed at people experiencing an autistic meltdown, where their speech centres stay non-functional for a while even after they've recovered.
> 
> Both the title and text can be adjusted in the settings to be whatever you want the person you give your phone to to know.
> 
> You can then continue to the next screen which has a simple chat client.
> 
> Find us on facebook: ~~`http://facebook.com/emergencychatapp`~~
> 
> Icon copyright Kyo-Tux (http://kyo-tux.deviantart.com/)

## motivation

- The original version of `Emergency chat` only existing as an `armv7` 32 bit app targeting outdated and unsupported Android APIs 
- The lack of support/compatibility with 32 bit applications (armv7) with some modern Android based operating systems
- The original Playstore page having been removed and the only publically available versions being hosted on mirrors like ApkPure

I wanted access to the app on my own phone and make it available to more people. After contacting the original author she granted me access to the source code and gave permission to develop it further. My goal is not only to bring it to more modern versions of android, but also add functionality over time. The latest publically available version of the original is version `2.1`. This repositories pre-releases start with version `2.1.1` being the first time the app was able to compile and run on hardware. The first proper version recommended for daily use is version `3.0.0` or later, as that's when the app id was updated to not conflic with the original.

## compatibility

Due to the use of AndroidX I have set the minimum and target Android API levels/SDK levels to `19` (`Android 4.4` / `Kitkat`) and `24` (`Android 7` / `Android N`) respectively. This excludes very old hardware/software but my focus is making this app accessible into the future.

Builds are tested using a Pixel 9a running the latest release version of GrapheneOS on Android `15` / SDK level `35` / `VANILLA_ICE_CREAM` as well as emulators for the minimal supported SDL level.

## building

I am using the latest version of Android Studio (merecat at the time of writing). The project uses cradle 7.4 and JDK 11 to do builds. further instructions will be set up at a later point.

## origin and orther versions

- The original code is by [Seph De Busser](https://sephdb.github.io/about/) who provided the source code which this app is built upon
- An iOS version was written by Leonard Elezi ([github](https://github.com/LeonardElezi/emergencychat) & [AppStore](https://itunes.apple.com/be/app/emergency-chat/id1024194363))
- A windows app is availe courtesy of [Daniel Tan](https://novalistic.com/products/emergency-chat)

[back to the top](https://github.com/fuzzblob/emergency-chat-ng/blob/main/README.md#emergency-chat-ng)
