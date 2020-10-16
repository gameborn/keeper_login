package com.gameborn.keeperlogin.di;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UserLoginModule_ProvideContextFactory implements Factory<Context> {
  private final Provider<Context> appContextProvider;

  public UserLoginModule_ProvideContextFactory(Provider<Context> appContextProvider) {
    this.appContextProvider = appContextProvider;
  }

  @Override
  public Context get() {
    return provideContext(appContextProvider.get());
  }

  public static UserLoginModule_ProvideContextFactory create(Provider<Context> appContextProvider) {
    return new UserLoginModule_ProvideContextFactory(appContextProvider);
  }

  public static Context provideContext(Context appContext) {
    return Preconditions.checkNotNull(UserLoginModule.INSTANCE.provideContext(appContext), "Cannot return null from a non-@Nullable @Provides method");
  }
}
