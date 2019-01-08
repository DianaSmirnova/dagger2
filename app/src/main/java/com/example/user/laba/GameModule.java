package com.example.user.laba;

import dagger.Module;
import dagger.Provides;

@Module
public class GameModule {

    @Provides
    GameData providesGameData() {
        return new GameData();
    }
}
