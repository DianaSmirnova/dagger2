// Generated by Dagger (https://google.github.io/dagger).
package com.example.user.laba;

import dagger.internal.Preconditions;

public final class DaggerGameComponent implements GameComponent {
  private GameModule gameModule;

  private DaggerGameComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static GameComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.gameModule = builder.gameModule;
  }

  @Override
  public void inject(GameSession obj) {
    injectGameSession(obj);
  }

  private GameSession injectGameSession(GameSession instance) {
    GameSession_MembersInjector.injectData(
        instance, GameModule_ProvidesGameDataFactory.proxyProvidesGameData(gameModule));
    return instance;
  }

  public static final class Builder {
    private GameModule gameModule;

    private Builder() {}

    public GameComponent build() {
      if (gameModule == null) {
        this.gameModule = new GameModule();
      }
      return new DaggerGameComponent(this);
    }

    public Builder gameModule(GameModule gameModule) {
      this.gameModule = Preconditions.checkNotNull(gameModule);
      return this;
    }
  }
}
